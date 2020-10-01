angular.module('gameApp', [])
.controller('gameController', ['$scope', function($scope) {
    $scope.attemptsLeft = 4;
    $scope.count = 0;
    $scope.randNumber = Math.floor(Math.random()  * 50) + 1;
    $scope.isWin = false;

    console.log($scope.randNumber);

    $scope.range = function(startBall,endBall) {
        var input = []; 
            for (var i = startBall; i <= endBall; i += 1) { 
                input.push(i); 
            } 
        return input;
    }

    $scope.buttonClicked =  function(event){

        if ($scope.count == 3) {
            $scope.changeButtonColor(event);
            if (event.currentTarget.id != $scope.randNumber) {
                $scope.cheakResultForWinner();
            }
        } else if ($scope.count < 4) {
            $scope.changeButtonColor(event);
        } 
        $scope.attemptsLeft = (4 - $scope.count);
    }

    $scope.changeButtonColor = function(event){

        if (event.currentTarget.id == $scope.randNumber){
            event.currentTarget.style.backgroundColor = "#0074FF";
            $scope.isWin = true;
            $scope.cheakResultForWinner();
        }
        else if (event.currentTarget.id < $scope.randNumber) {
            event.currentTarget.style.backgroundColor = "#FF0000";
            $scope.count++;
        } else if (event.currentTarget.id > $scope.randNumber) {
            event.currentTarget.style.backgroundColor = "#17FF00";
            $scope.count++;
        }
    }

    $scope.cheakResultForWinner = function(){

        if($scope.isWin) {
            $('body').append('<p>You won the game!!!!!</p>');
        } else {
            $('body').append('<p>Sorry, you lost the game!!!!!</p>');
        }
        $('body').append('<button id="start" onclick="startAgain()">Start Again</button>');
    
    }
}]);

function startAgain(){
    setTimeout(function(){
        location.reload();
    },100);
}