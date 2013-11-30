package controllers;

import com.google.gson.Gson;
import java.util.Date;
import java.util.List;
import models.Order;
import play.mvc.Controller;
import play.mvc.With;

/**
 *
 * @author Henry
 */
@With(Security.class)
public class Orders extends Controller {

    public static void orders() {

        List<Order> orders = Order.findAll();
        renderJSON(orders);

    }

    public static void deleteOrder(Long id) {

        Order p = Order.findById(id);

        if (p != null) {
            p.delete();
            renderJSON(id);
        } else {
            id *= -1;
        }

        renderJSON(id);
    }

    public static void saveOrder() {

        Gson g = new Gson();
        Order newOrder = new Order();

        newOrder = g.fromJson(params.get("body"), Order.class);
        newOrder.orderDate = new Date();
        newOrder.shippedDate = new Date();
        newOrder.save();
        renderJSON(newOrder);

    }

    public static void updateOrder(Long id) {

        Gson g = new Gson();

        Order newOrder = g.fromJson(params.get("body"), Order.class);
        Order dbOrder = Order.findById(id);

//        dbOrder.customer = newOrder.customer;
        dbOrder.orderDate = newOrder.orderDate;
        dbOrder.shippedDate = newOrder.shippedDate;

        dbOrder.save();
        renderJSON(dbOrder);

    }

}
