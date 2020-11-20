var AcmeProductApp = angular.module('AcmeApp', ['ngRoute']);

AcmeProductApp.config(function($routeProvider) {
	$routeProvider
		.when('/welcome', {
			templateUrl: './Welcome.html',
			controller: 'welcomeController'
		})
		.when('/productlist', {
			templateUrl: './ProductList.html',
			controller: 'productlistController'
        })
        .when('/productdetails', {
            templateUrl: './ProductDetails.html',
            controller: 'productdetailsController'
        })
		.otherwise({
			redirectTo: '/welcome'
	    });
});

AcmeProductApp.value('url', '../Resource/products.jsonx');

AcmeProductApp.controller('welcomeController', ['$scope', function($scope) {
        console.log("Inside The Welcome Controller");
}]);

AcmeProductApp.controller('productlistController', ['$scope','$rootScope', '$location', '$http', 'url', function($scope, $rootScope, $location, $http, url) {
    console.log("Inside The Product List Controller");
    $scope.btnValue = 'Show Image';
    $scope.showImage = false;
    $scope.products = [];

    $http({
        method: 'get',
        url: url,
    })
    .then(function(response) {  
        console.log(response.data);

        for (var i = 0; i < response.data.length; i++) {
    
            $scope.products.push({
                'productId': response.data[i].productId,
                'productName': response.data[i].productName,
                'productCode': response.data[i].productCode,
                'releaseDate': response.data[i].releaseDate,
                'description': response.data[i].description,
                'price': response.data[i].price,
                'starRating': response.data[i].starRating,
                'imageUrl': response.data[i].imageUrl
            });
        }
    });

    $scope.showAllImage = function(){
        if ($scope.btnValue == 'Show Image') {
            $scope.showImage = true;
            $scope.btnValue = "Hide Image";
            console.log($scope.showImage);
        } else {
            $scope.showImage = false;
            $scope.btnValue = "Show Image";
            console.log($scope.showImage);
        }
    }

    $scope.productTransfer = function(productId){
        for (let product of $scope.products) {
            if (product.productId == productId) {
                console.log(product);     
                $rootScope.productId = product.productId;
                $rootScope.productName = product.productName;
                $rootScope.productCode = product.productCode;
                $rootScope.description = product.description;
                $rootScope.releaseDate = product.releaseDate;
                $rootScope.price = product.price;
                $rootScope.starRating = product.starRating;
                $rootScope.imageUrl = product.imageUrl;
            }
        }        
    }

}]);

AcmeProductApp.controller('productdetailsController', ['$scope','$rootScope', '$location', '$http', 'url', function($scope, $rootScope, $location, $http, url) {
    console.log("Inside The Product Details Controller");    

    $scope.product;

    $scope.product = {
        'productId': $rootScope.productId,
        'productName': $rootScope.productName,
        'productCode': $rootScope.productCode,
        'description': $rootScope.description,
        'releaseDate': $rootScope.releaseDate,
        'price': $rootScope.price,
        'starRating':$rootScope.starRating,
        'imageUrl': $rootScope.imageUrl
    }
}]);