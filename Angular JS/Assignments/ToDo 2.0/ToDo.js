angular.module('toDoApp', [])
.controller('toDoController', ['$scope', function($scope) {
    $scope.id = 0;
    $scope.tasks =[];
    $scope.newTaskName = '';

    $scope.load = function () {
      for(var TaskMsg in window.localStorage) {
          if(window.localStorage.hasOwnProperty(TaskMsg)) {
              let taskTime =  localStorage.getItem(TaskMsg);
              $scope.displayTask(TaskMsg, taskTime);
          }
      }      
    }

    $scope.displayTask = function (taskMsg, time) {
      $scope.tasks.push({
          'id': $scope.id++,
          'TaskMsg': taskMsg,
          'Time': time
      });
    }

    $scope.addTask = function() {
        const time = moment().format('MM D YYYY hh:mm:ss');
        if ($scope.newTaskName && $scope.tasks.indexOf($scope.newTaskName) == -1) {
            $scope.tasks.push({id: $scope.id++, TaskMsg: $scope.newTaskName, Time: time});
            localStorage.setItem($scope.newTaskName, time);
            $scope.newTaskName = '';
        }
    };

    $scope.checkBoxClick = function(cheakbox, taskid) {

      if (cheakbox) {
          console.log("Checkbox checked");
          $('.'+taskid).text(moment().format('MM D YYYY hh:mm:ss'));
      }
    }

    $scope.delete = function(index,task){
        console.log(index, task);
        $scope.tasks.splice(index, 1);
        localStorage.removeItem(task);
    }
}]);