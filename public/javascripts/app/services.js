'use strict';

/* Services */


// Demonstrate how to register services
// In this case it is a simple value service.

angular.module('myApp.services', ['ngResource']).
        factory('items', function ($resource) {
            return $resource('/items', []);

        }).
        factory('customers', function ($resource) {
            return $resource('/customers/:id', {
                id: '@id'
            });

        }).
        factory('orders', function ($resource) {
            return $resource('/orders/:id', 
                {id: '@id'}, 
               {
                update: {
                    method: 'put',
                    isArray: false
                },
                delete: {
                    method: 'delete',
                    isArray: false
                }
            });
        }).
        factory('orderDetails', function ($resource) {
            return $resource('/orderDetails/:id', 
                {id: '@id'}, 
               {
                update: {
                    method: 'put',
                    isArray: false
                },
                delete: {
                    method: 'delete',
                    isArray: false
                }
            });
        }).
        value('version', '0.1');