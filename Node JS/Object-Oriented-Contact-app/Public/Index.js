class ContactDialogModel {
    constructor() {
        this.visible=false;
    }
    open(contact) {
        this.contact=contact;
        this.visible=true;
    }
    close() {
        this.visible=false;
    }
};

angular.module('contactApp', ['ngRoute', 'contactModule'])
    .config(function($routeProvider) {
        $routeProvider
            .when('/contactlist', {
                templateUrl: './contactList.html',
                controller: 'contactListController'
            })
            .when('/contactForm', {
                templateUrl: './contactForm.html',
                controller: 'contactFormController'
            })
            .when('/searchForm', {
                templateUrl: './searchForm.html',
                controller: 'contactListController'
            })
            .when('/contactDetails/:contact_id', {
                templateUrl: './contactDetails.html',
                controller: 'contactDetailsController'
            })
            .otherwise({
                redirectTo: '/contactlist'
            });
    })
    
    .value('url', '/api/contacts')

    .factory('getContactList', ['$http', 'url', function($http, url) {

        var getContactList = {};

        getContactList.contactList = function() {
            
            return $http.get(url);
        }
        return getContactList;
    }])

    .factory('deleteContactInfo', ['$location', '$http', 'url', function(_$location, $http, _url) {

        var deleteInfo = {};
        
        deleteInfo.deleteDetails = function(contact) {
            let config = {  params: contact   }
            return $http.delete('/api/contacts/delete', config);
        }
        return deleteInfo;
    }])

    .factory('searchContactInfo', ['$location', '$http', 'url', function(_$location, $http, _url) {

        var searchInfo = {};
        searchInfo.searchDetails = function(contact) {
            let config = {  params: contact   }
            return $http.get('/api/contact', config);
        }
        return searchInfo;
    }])

    .factory('stateService', function () {
        let stateObject = {};
        stateObject.states = [
          "Andhra Pradesh",
          "Arunachal Pradesh",
          "Assam",
          "Bihar",
          "Chhattisgarh",
          "Goa",
          "Gujarat",
          "Haryana",
          "Himachal Pradesh",
          "Jammu and Kashmir",
          "Jharkhand",
          "Karnataka",
          "Kerala",
          "Madhya Pradesh",
          "Maharashtra",
          "Manipur",
          "Meghalaya",
          "Mizoram",
          "Nagaland",
          "Odisha",
          "Punjab",
          "Rajasthan",
          "Sikkim",
          "Tamil Nadu",
          "Telangana",
          "Tripura",
          "Uttarakhand",
          "Uttar Pradesh",
          "West Bengal",
          "Andaman and Nicobar Islands",
          "Chandigarh",
          "Dadra and Nagar Haveli",
          "Daman and Diu",
          "Delhi",
          "Lakshadweep",
          "Puducherry",
        ];
        return stateObject;
    })

    .directive('updateContactDialog', [function() {
        return {
            restrict: 'E',
            controller: 'updateTemplateController',
            scope: {
                model: '=',
            },
            link: function(scope, element, _attributes) {
                scope.$watch('model.visible', function(newValue) {
                    var modalElement = element.find('.modal');
                    modalElement.modal(newValue ? 'show' : 'hide');
                });
                
                element.on('shown.bs.modal', function() {
                    scope.$apply(function() {
                        scope.model.visible = true;
                    });
                });
        
                element.on('hidden.bs.modal', function() {
                    scope.$apply(function() {
                        scope.model.visible = false;
                    });
                });
                
            },
            templateUrl: 'updateTemplate.html',
        };
    }])

angular.module('contactModule',[])

    .controller('contactListController', ['$scope', '$rootScope', 'getContactList', 'deleteContactInfo', 'searchContactInfo', 'stateService', '$http', function($scope, $rootScope, getContactList, deleteContactInfo, searchContactInfo, stateService) {
        $scope.Contacts = [];
        $scope.headers = [];
        $scope.searchedContact = [];
        $scope.states = stateService.states;
        $scope.isLoaded = false;
        $scope.updateDialog = new ContactDialogModel();

        // $scope.imgToString = function(imgSrc){
        //     return btoa(String.fromCharCode.apply(null, (new Uint8Array(imgSrc))));
        // }

        getContactList.contactList().then(function (response) {
            $scope.Contacts = response.data;   
            $rootScope.contactLength = $scope.Contacts.length;
            if ($scope.contactLength != 0) 
                $scope.headers = Object.keys($scope.Contacts[0]);     
            console.log($scope.Contacts);
            },function (error) {
                $scope.status = 'Unable to load Conatct data: ' + error.message;   
            });
        
        $scope.deleteContact = function(contact_id){
            console.log(contact_id);
            let delete_contact = {
                _id: contact_id
            }
            if(confirm("Are you sure you want to delete data")) {
                deleteContactInfo.deleteDetails(delete_contact).then(function(response) {
                    console.log(response.data);
                    alert("Student data successfully deleted");
                    window.location.reload();  
                },function (error) {
                    $scope.status = 'Unable to load Delete Conatct data: ' + error.message;
                });
            }     
        }

        $scope.searchContact = function(){
            searchContactInfo.searchDetails($scope.search).then(function (response){
                console.log(response.data[0]);
                $scope.searchedContact = response.data[0];
                $scope.isLoaded = true;
            },function(_error){
                console.log("Unable to Find Contact");
            });
        }

        $scope.imgToString = function(imgSrc){
            return btoa(String.fromCharCode.apply(null, (new Uint8Array(imgSrc))));
        }
    }])

    .controller('contactFormController', ['$scope', 'stateService', function($scope, stateService) {

        $scope.states = stateService.states;

        $scope.click = function(){    
            if($scope.sameasabove){
                $scope.address.correspondence = angular.copy($scope.address.permanent);
                console.log('C',$scope.address.correspondence,'P',$scope.address.permanent);
            } else {
                $scope.address.correspondence = {};
            }
        };

    }])

    .controller('contactDetailsController', ['$scope', '$routeParams', 'searchContactInfo', function($scope, $routeParams, searchContactInfo) {
       
        $scope.contact_id = $routeParams.contact_id;
        $scope.isLoaded = false;

        $scope.updateDialog = new ContactDialogModel();

        $scope.getcontact = { _id: $scope.contact_id };

        searchContactInfo.searchDetails($scope.getcontact).then(function (response){
            $scope.searchedContact = response.data[0];
            $scope.isLoaded = true;
        },function(_error){
            console.log("Unable to Find Contact");
        });

        $scope.imgToString = function(imgSrc){
            return btoa(String.fromCharCode.apply(null, (new Uint8Array(imgSrc))));
        }
    }])

    .controller('updateTemplateController',['$scope', 'stateService', function($scope, stateService){
        $scope.states = stateService.states;
        $scope.isreadOnly = true;
        $scope.updateDialog = new ContactDialogModel();
    
        $scope.click = function(){    
            if($scope.sameasabove){
                $scope.model.contact.address.correspondence = angular.copy($scope.model.contact.address.permanent);
                console.log('C',$scope.model.contact.address.correspondence,'P',$scope.model.contact.address.permanent);
            } else {
                $scope.model.contact.address.correspondence = {};
            }
        };

        $scope.imgToString = function(imgSrc){
            return btoa(String.fromCharCode.apply(null, (new Uint8Array(imgSrc))));
        }
    }]);

    