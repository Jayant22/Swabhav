$(document).ready(function() {
    let inputAndTimeArr = [];
    let localStorageIndex = 0;
    for(var key in localStorage) {
        if(window.localStorage.hasOwnProperty(key)) {
            const arr = localStorage.key(localStorageIndex).split(',');
            let time = arr[1];
            let trivia = localStorage.getItem(key).split('.').join('');
            const timeDiff = calculateTimeDifference(time);

            $('.results').append("<p class='trivia'>" + trivia + "<span> searched at " +
            time + " " + timeDiff + "</span></p>");
        }
    }

    $('#btn').on('click', function() {
        let inputValue = $('#userInput').val();
        const time = moment().format('MM D YYYY hh:mm:ss');

        const timeDiff = calculateTimeDifference(time);

        if(inputValue != null) {
            inputAndTimeArr = [inputValue, time];
            
            $.ajax({url:"http://numbersapi.com/" + inputValue + "/trivia", success: function(trivia){
                $('.results').append("<p class='trivia'>" + trivia.split('.').join('') + "<span> searched at " +
                time + " " + timeDiff + "</span></p>");
                localStorage.setItem(inputAndTimeArr, trivia);
              }});

        } else {
            alert("Please enter a number to find it's trivia.");
        }

    });

    function calculateTimeDifference(time) {
        let taskAddedTime = moment(time);
        let currentTime = moment(moment().format('MM D YYYY hh:mm:ss'));
        let compare = moment.duration(taskAddedTime.diff(currentTime));
        return compare.humanize(true);
	}

});