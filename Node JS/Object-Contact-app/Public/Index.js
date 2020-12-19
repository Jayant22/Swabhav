angular.module('contactApp', ['ngRoute'])

    .controller('mainController', ['$scope', '$http', function($scope, $http) {
        console.log("Inside The Conatct Controller");

        $scope.Contacts = [];
        
        $http.get('/api/contacts')
            .then(function (response) {
                console.log(response);
                $scope.Contacts = response.data;
            },function (error) {
                $scope.status = 'Unable to load Conatct data: ' + error.message;
            });

        $scope.createContact = function() {
            let data = { 
                contact_id: parseInt("10" + ($scope.Contacts.length + 1)),
                name: $scope.name,
                contact_No: $scope.contact_No
            };
            console.log(data);

            $http.post('/api/contacts', data)
                .then(function (response) {
                    console.log(response);
                },function (error) {
                    $scope.status = 'Unable to load Add Conatct data: ' + error.message;
                });
        }
    }]);
