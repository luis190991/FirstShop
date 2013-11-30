'use strict';

/* Services */


// Demonstrate how to register services
// In this case it is a simple value service.

angular.module('myApp.services', ['ngResource']).
        factory('Item', function ($resource) {
            return $resource('/items/:id', {id: '@id'});

        }).
        factory('Customer', function ($resource) {
            return $resource('/customers/:id', {
                id: '@id'
            });

        }).
        factory('Order', function ($resource) {
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
        factory('OrderDetail', function ($resource) {
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