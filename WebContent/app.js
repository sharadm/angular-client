(function () {
    'use strict';

    angular
        .module('app', ['ngRoute', 'ngCookies'])
        .config(config)
        .run(run);

    config.$inject = ['$routeProvider', '$locationProvider'];
    function config($routeProvider, $locationProvider) {
        $routeProvider         

            .when('/weather', {
                controller: 'WeatherController',
                templateUrl: 'app/views/weather.html',
                controllerAs: 'vm'
            })

            .otherwise({ redirectTo: '/technotsav' });
    }

    
 })();