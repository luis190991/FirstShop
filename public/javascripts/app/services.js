'use strict';

/* Services */


// Demonstrate how to register services
// In this case it is a simple value service.

angular.module('myApp.services', ['ngResource']).
        factory('itemsRest', function($resource) {
            return $resource('/items',[]
            );

        }
        ).
        factory('customers', function($resource) {
            return $resource('/customers/:id',
                    {id: '@id'}
            );

        })
        .value('version', '0.1');