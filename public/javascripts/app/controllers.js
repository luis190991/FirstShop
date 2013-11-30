/* Controllers */
var app = angular.module('myApp.controllers', ['ngResource']);

var orderCtrl = function($scope, Item, Customer, Order, OrderDetail) {

    //Estos son todos los Productos
    $scope.order = new Order();
    $scope.orderDetail = new OrderDetail();
    $scope.items = [];
    $scope.customers = [];
    $scope.orders = [];
    $scope.allOrderDetails = [];
    $scope.orderDetails = [];

    $scope.addOrderDetail = function() {
        this.orderDetails.push(new OrderDetail());
    };

    $scope.removeOrderDetail = function(orderDetailToRemove) {
        var index = this.orderDetails.indexOf(orderDetailToRemove);
        this.orderDetails.splice(index, 1);
    };

    $scope.saveOrderDetail = function(orderDetailToRemove) {
        //TODO enviar a la Base de Datos
    };

    $scope.saveOrder = function() {
        $scope.order.$save(function(data) {

            $scope.orders.push($scope.order);
            console.log(data);

            angular.forEach($scope.orderDetails, function(orderDetail) {

                orderDetail.order = $scope.order;
                orderDetail.$save(function(data) {
                    console.log(data);
                });
            });

            $scope.order = new Order();
            $scope.orderDetails = [];
        });
    };

    Item.query(function(data) {
        $scope.items = data;
        console.log("Items");
        console.log(data);
    });

    Customer.query(function(data) {
        $scope.customers = data;
        console.log("customers");
        console.log(data);
    });

    Order.query(function(data) {
        $scope.orders = data;
        console.log("orders");
        console.log(data);
    });

    OrderDetail.query(function(data) {
        $scope.allOrderDetails = data;
        console.log("OrdersDetails");
        console.log(data);
    });

};

app.controller('orderCtrl', orderCtrl);