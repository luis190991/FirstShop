'use strict';


// Declare app level module which depends on filters, and services
angular.module
        ('myApp',
                ['myApp.filters',
                    //'myApp.services', 
                    //'myApp.myServices', 
                    'myApp.directives',
                    'myApp.controllers'

                ]
                )
        .config
        (
                ['$routeProvider', function($routeProvider)
                    {
                        $routeProvider.when('/orders',
                                {
                                    templateUrl: 'public/partials/order.html',
                                    controller: 'OrderCtrl'
                                }
                        );

                        $routeProvider.otherwise
                                (
                                        {redirectTo: '/orders'}
                                );
                    }
                ]
                );
