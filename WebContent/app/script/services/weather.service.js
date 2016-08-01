(function () {
    'use strict';

    angular
        .module('app')
        .factory('WeatherService', WeatherService);

    WeatherService.$inject = ['$http'];
    function WeatherService($http,$scope) {
        var service = {};
        service.getWeather = getWeather;      
		
        return service;

        function getWeather(city) {
            return $http.get('api/weather/'+city).then(handleSuccess, handleError('Error getting Weather'));
        }

        // private functions

        function handleError(error) {
            return function () {
                return { success: false, message: error };
            };
        }
    }

})();