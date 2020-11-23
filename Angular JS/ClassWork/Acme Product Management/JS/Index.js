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

AcmeProductApp.factory('getProductList', ['$http', 'url', function($http, url) {

    var getProductList = {};

    getProductList.productList = function() {
        
        return $http.get(url);
    }
    return getProductList;
}]);

AcmeProductApp.directive('getWidth', function () {
    return {
        restrict: "A",
        scope: {
            "rowHeight": '='
        },
        link: function (scope, element) {
            scope.$watch("rowHeight", function (value) {
                (element).css('width', (14 * scope.rowHeight) + "px");
            }, false);
        }
    }
});

AcmeProductApp.controller('welcomeController', ['$scope', function($scope) {
        console.log("Inside The Welcome Controller");
}]);

AcmeProductApp.controller('productlistController', ['$scope','$rootScope', 'getProductList', function($scope, $rootScope, getProductList) {
    console.log("Inside The Product List Controller");
    $scope.btnValue = 'Show Image';
    $scope.showImage = false;
    $scope.products = [];

    getProductList.productList()
        .then(function (response) {
            $scope.products = response.data;
            console.log($scope.products);
        },function (error) {
            $scope.status = 'Unable to load customer data: ' + error.message;
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
    $scope.rate = 0;

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

    $scope.rate = $scope.product.starRating;
    console.log($scope.rate, $scope.product);
}]);