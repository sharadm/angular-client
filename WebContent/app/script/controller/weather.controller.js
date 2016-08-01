(function () {
    'use strict';

    angular
        .module('app')
        .controller('WeatherController', WeatherController);

    WeatherController.$inject = ['$http','$scope','WeatherService', '$location', '$rootScope'];
    function WeatherController($http,$scope,WeatherService, $location, $rootScope) {

        $scope.weather = function() {       
            
			
		$http.get('api/weather/'+$scope.city).
			success(function(data) {
				$scope.data = data;
			});
        }
        
        $scope.forecast = function() {       
            
			
    		$http.get('api/forecast/'+$scope.city).
    			success(function(data) {
    				$scope.data = data;
    			});
            }
        
        
    }

})();