$(document).ready(function() {
    let inputAndTimer = [];
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
            inputAndTimer = [inputValue, time];
            
            fetch("http://numbersapi.com/" + inputValue + "/trivia")
            .then(response => response.text())
            .then(trivia => {
                $('.results').append("<p class='trivia'>" + trivia.split('.').join('') + "<span> searched at " +
                time + " " + timeDiff + "</span></p>");
                localStorage.setItem(inputAndTimer, trivia);
            });
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