/* Controllers */
var app = angular.module('myApp.controllers', ['ngResource']);

var orderCtrl = function ($scope, itemsRest) {

    //Estos son todos los Productos
    $scope.items = [{
        "id": 1,
        "title": "Una Camcion X",
        "artist": "Una Artista X",
        "unitPrice": 3.14
    }, {
        "id": 2,
        "title": "Una Camcion Y",
        "artist": "Una Artista Y",
        "unitPrice": 3.14
    }, {
        "id": 3,
        "title": "Una Camcion Z",
        "artist": "Una Artista Z",
        "unitPrice": 3.14
    }];

    $scope.name = "John Smith";
    $scope.orderDetails = [{
        item: 'phone',
        quantity: 44.3
    }, {
        item: 'email',
        quantity: 14.3
    }];

    $scope.addOrderDetail = function () {
        this.orderDetails.push({
            item: 'email',
            quantity: 23.3
        });
    };

    $scope.removeOrderDetail = function (orderDetailToRemove) {
        var index = this.orderDetails.indexOf(orderDetailToRemove);
        this.orderDetails.splice(index, 1);
    };
    
    $scope.saveOrderDetail= function (orderDetailToRemove) {
        //TODO enviar a la Base de Datos
    };

    itemsRest.query(function (data) {
        $scope.items = data;
        console.log("Items");
        console.log(data);
    });

};

app.controller('orderCtrl', orderCtrl);