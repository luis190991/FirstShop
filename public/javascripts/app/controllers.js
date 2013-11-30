/* Controllers */
var app = angular.module('myApp.controllers', ['ngResource']);

var orderCtrl = function($scope, Item, Customer, Order, OrderDetail) {

    $scope.order = new Order();
    $scope.items = [];
    $scope.customers = [];
    $scope.orders = [];
    $scope.allOrderDetails = [];
    $scope.orderDetails = [new OrderDetail()];

    $scope.addOrderDetail = function() {
        this.orderDetails.push(new OrderDetail());
    };

    $scope.removeOrderDetail = function(orderDetailToRemove) {
        var index = this.orderDetails.indexOf(orderDetailToRemove);
        this.orderDetails.splice(index, 1);
    };

    $scope.findOrderDetails = function(order) {

        $scope.filtered = [];
        angular.forEach(this.allOrderDetails, function(orderDetail) {
            if (orderDetail.order.id === order.id) {
                $scope.filtered.push(orderDetail);
            }
            ;
        });
    };

    $scope.saveOrder = function() {
        $scope.order.$save(function(data) {

            $scope.orders.push(data);

            angular.forEach($scope.orderDetails, function(orderDetail) {

                orderDetail.order = $scope.order;
                orderDetail.$save(function(data) {
                    $scope.allOrderDetails.push(data);
                });
            });

            $scope.order = new Order();
            $scope.orderDetails = [];
        });
    };

    $scope.deleteOrder = function(order, i) {

        angular.forEach($scope.allOrderDetails, function(od) {
            if (od.order.id === order.id) {
                od.$delete(function() {
                    
                    $scope.allOrderDetails.splice($scope.allOrderDetails.indexOf(order), 1);
                    $scope.filtered.splice($scope.allOrderDetails.indexOf(order), 1);
                    
                    order.$delete(function() {
                        $scope.orders.splice(i, 1);
                    });
                });
            }
        });


    };

    Item.query(function(data) {
        $scope.items = data;
    });

    Customer.query(function(data) {
        $scope.customers = data;
    });

    Order.query(function(data) {
        $scope.orders = data;
    });

    OrderDetail.query(function(data) {
        $scope.allOrderDetails = data;
    });

    $scope.fecha = Date.now();
};

app.controller('orderCtrl', orderCtrl);