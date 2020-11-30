angular.module('AcmeApp', ['ngRoute','welcomeModule','productModule'])
    .config(function($routeProvider) {
	$routeProvider
		.when('/welcome', {
			templateUrl: './HTML/Welcome.html',
			controller: 'welcomeController'
		})
		.when('/productlist', {
			templateUrl: './HTML/ProductList.html',
			controller: 'productlistController'
        })
        .when('/productdetails', {
            templateUrl: './HTML/ProductDetails.html',
            controller: 'productdetailsController'
        })
		.otherwise({
			redirectTo: '/welcome'
	    });
    })

    .value('url', '../Resource/products.jsonx')

    .factory('getProductList', ['$http', 'url', function($http, url) {

        var getProductList = {};

        getProductList.productList = function() {
            
            return $http.get(url);
        }
        return getProductList;
    }])

    .directive('getWidth', function () {
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

angular.module('welcomeModule',[])

    .controller('welcomeController', ['$scope', function($scope) {
        console.log("Inside The Welcome Controller");
    }]);

angular.module('productModule',[])
    
    .controller('productlistController', ['$scope','$rootScope', 'getProductList', function($scope, $rootScope, getProductList) {
        console.log("Inside The Product List Controller");
        $scope.productVM = {
            btnValue : 'Show Image',
            showImage : false,
            products: []
        };
        $rootScope.globalProductVM = {  };
        
        getProductList.productList().then(function (response) {
                $scope.productVM.products = response.data;
                console.log($scope.productVM.products);
            },function (error) {
                $scope.status = 'Unable to load customer data: ' + error.message;
            });

        $scope.showAllImage = function(){
            if ($scope.productVM.btnValue == 'Show Image') {
                $scope.productVM.showImage = true;
                $scope.productVM.btnValue = "Hide Image";
                console.log($scope.productVM.showImage);
            } else {
                $scope.productVM.showImage = false;
                $scope.productVM.btnValue = "Show Image";
                console.log($scope.productVM.showImage);
            }
        }

        $scope.productTransfer = function(productId){
            for (let product of $scope.productVM.products) {
                if (product.productId == productId) {
                    console.log(product);     
                    $rootScope.globalProductVM.productId = product.productId;
                    $rootScope.globalProductVM.productName = product.productName;
                    $rootScope.globalProductVM.productCode = product.productCode;
                    $rootScope.globalProductVM.description = product.description;
                    $rootScope.globalProductVM.releaseDate = product.releaseDate;
                    $rootScope.globalProductVM.price = product.price;
                    $rootScope.globalProductVM.starRating = product.starRating;
                    $rootScope.globalProductVM.imageUrl = product.imageUrl;
                }
            }        
        }
    }])

    .controller('productdetailsController', ['$scope','$rootScope', '$location', '$http', 'url', function($scope, $rootScope, $location, $http, url) {
        console.log("Inside The Product Details Controller");    

        $scope.productDetailsVM = {
            product: [],
        }
        
        $scope.product = {
            'productId': $rootScope.globalProductVM.productId,
            'productName': $rootScope.globalProductVM.productName,
            'productCode': $rootScope.globalProductVM.productCode,
            'description': $rootScope.globalProductVM.description,
            'releaseDate': $rootScope.globalProductVM.releaseDate,
            'price': $rootScope.globalProductVM.price,
            'starRating':$rootScope.globalProductVM.starRating,
            'imageUrl': $rootScope.globalProductVM.imageUrl
        }
    }]);