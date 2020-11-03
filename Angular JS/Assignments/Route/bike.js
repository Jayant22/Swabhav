var app = angular.module("myapp", ['ngRoute']);

app.config(function($routeProvider) {
    $routeProvider
    
    .when("/bike", {
        templateUrl : "./bike.html",
        controller : "cntrlBike"
    })
    .when("/bajaj", {
      templateUrl : "./bajaj.html",
      controller : "cntrlBajaj"
    })
    .when("/yamaha", {
      templateUrl : "./yamaha.html",
      controller : "cntrlYamaha"
    })
    .when("/honda", {
      templateUrl : "./Honda.html",
      controller : "cntrlHonda"
    })
    .otherwise({
      redirectTo: './bike.html'
    })
  });

app.controller("cntrlBike",function($scope,$location) {
    console.log($location.path());
});
app.controller("cntrlBajaj",function($scope,$location) {
  $scope.Bajaj = "Bajaj"
  console.log($location.path());
});
app.controller("cntrlYamaha",function($scope,$location) {
  $scope.Yamaha = "Yamaha"
  console.log($location.path());
});
app.controller("cntrlHonda",function($scope,$location) {
  $scope.Honda = "Honda"
  console.log($location.path());
});
