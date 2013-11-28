'use strict';

/* Services */


// Demonstrate how to register services
// In this case it is a simple value service.

angular.module('myApp.services', ['ngResource']).
        factory('itemsRest', function($resource) {
            return $resource('/items/:id',
                    {id: '@id'},
            {
                update: {method: 'put', isArray: false},
                delete: {method: 'delete', isArray: false}
            }
            );

        }
        ).value('version', '0.1');