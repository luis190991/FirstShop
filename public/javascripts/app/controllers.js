/* Controllers */
var app = angular.module('myApp.controllers', ['ngResource']);

var orderCtrl = function($scope, $resource) {
    
    //Estos son todos los Productos
    $scope.items = [
        {"id":1, "title":"Una Camcion X", "artist":"Una Artista X","unitPrice":3.14},
        {"id":2, "title":"Una Camcion Y", "artist":"Una Artista Y","unitPrice":3.14},
        {"id":3, "title":"Una Camcion Z", "artist":"Una Artista Z","unitPrice":3.14}
    ]

    $scope.name = "John Smith";
    $scope.orderDetails = [
        {type: 'phone', value: '408 555 1212'},
        {type: 'email', value: 'john.smith@example.org'}];

    $scope.addOrderDetail = function() {
        this.orderDetails.push({type: 'email', value: 'yourname@example.org'});
    };

    $scope.removeOrderDetail = function(contactToRemove) {
        var index = this.orderDetails.indexOf(contactToRemove);
        this.orderDetails.splice(index, 1);
    };


};

app.controller('orderCtrl', orderCtrl);
