angular.module('factApp',[])
.controller('factController', ['$scope', function($scope) {

    $scope.inputAndTimer = [];
    $scope.localStorageIndex = 0;
    $scope.userInput='';

    $scope.load = function () {
        for(var key in localStorage) {
            if(window.localStorage.hasOwnProperty(key)) {
                const arr = localStorage.key($scope.localStorageIndex).split(',');
                let time = arr[1];
                let trivia = localStorage.getItem(key).split('.').join('');
                const timeDiff = $scope.calculateTimeDifference(time);
    
                $('.results').append("<p class='trivia'>" + trivia + 
                "<span> searched at " + time + " " + timeDiff + "</span></p>");
            }
        }
    }    

    $scope.getFact = function(){
        const time = moment().format('D MM YYYY hh:mm:ss');
        const timeDiff = $scope.calculateTimeDifference(time);

        if($scope.userInput != null) {
            inputAndTimer = [$scope.userInput, time];
            
            fetch("http://numbersapi.com/" + $scope.userInput + "/trivia")
            .then(response => response.text())
            .then(trivia => {
                $('.results').append("<p class='trivia'>" + trivia.split('.').join('') 
                + "<span> searched at " + time + " " + timeDiff + "</span></p>");
                localStorage.setItem(inputAndTimer, trivia);
            });
        } else {
            alert("Please enter a number to find it's trivia.");
        }
    }

    $scope.calculateTimeDifference = function (time) {
        let taskAddedTime = moment(time);
        let currentTime = moment(moment().format('D MM YYYY hh:mm:ss'));
        let compare = moment.duration(taskAddedTime.diff(currentTime));
        return compare.humanize(true);
    }

}]);