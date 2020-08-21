$(document).ready(function(){

	var items = getFromLocal('memos');
	var times = getFromLocal('times');
	var index;

	loadList(items);
	
	$('button').prop('disabled', true);
	$('input').keyup(function(){
		if($(this).val().length !== 0) {
			$('button').prop('disabled', false);
		} else {
			$('button').prop('disabled', true);
		}
	});
	
	$('#main-input').keypress(function(e){
		if(e.which === 13) {
			if ($('#main-input').val().length !== 0)
				$('#main-button').click();
		}
	});
	
	$('#main-button').click(function(){
		var value = $('#main-input').val();
		const time = moment().format('MM D YYYY hh:mm:ss');

		items.push(value);
		times.push(time);

		//console.log(items[0]);
		$('#main-input').val('');
		loadList(items);
		storeToLocal('memos', items);
		storeToLocal('times', times);
		// set button to 
		$('button').prop('disabled', true);
	});
	
	$('ul').delegate("span", "click", function(event){
		event.stopPropagation();
		index = $('span').index(this);
		$('li').eq(index).remove();
		items.splice(index, 1);
		times.splice(index, 1);
		storeToLocal('memos', items);
		storeToLocal('times', times);
	});

	$('ul').delegate('li', 'click', function(){
		index = $('li').index(this);
		var content = items[index];
		console.log(content);
		$('#edit-input').val(content );
	});

	$('#edit-button').click(function(){
		items[index] = $('#edit-input').val();
		loadList(items);
		storeToLocal("memos", items);
	});

	function loadList(items){
		$('li').remove();
		if(items.length > 0) {
			for(var i = 0; i < items.length; i++) {

				let timeDifference = calculateTimeDifference(times[i]);

				$('ul').append('<li class= "list-group-item" data-toggle="modal" data-target="#editModal">' 
				+ items[i] + " " + times[i] + " " + timeDifference + 
				'<span class="glyphicon glyphicon-remove"></span</li>');
			}
		}
	};

	function calculateTimeDifference(time) {
        let taskAddedTime = moment(time);
        let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
        let compare = moment.duration(taskAddedTime.diff(currentTime));
        return compare.humanize(true);
	}
	
	function storeToLocal(key, items){
		localStorage[key] = JSON.stringify(items);
	}

	function getFromLocal(key){
		if(localStorage[key])
			return JSON.parse(localStorage[key]);
		else 
			return [];
	}

});
