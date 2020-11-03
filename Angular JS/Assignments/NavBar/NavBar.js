var app = angular.module("myapp",[]);
    app.controller("cntrl",function($scope,$location,$window){

        $window.addEventListener('hashchange', function() {
                //$rootScope.$broadcast('message', e.data);
            
                if( $location.hash() === "/home" ){
                    console.log("Page loaded from "+location.hash());
                }
        
                if( $location.hash() === "/about" ){
                    console.log("Page loaded from "+$location.hash());
                }

                if( $location.hash() === "/contact" ){
                    console.log("Page loaded from "+$location.hash());
                }
        });
    });