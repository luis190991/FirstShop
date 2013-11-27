package controllers;

import com.google.gson.Gson;
import java.util.List;
import models.Order;
import play.mvc.Controller;

/**
 *
 * @author Henry
 */
public class Orders extends Controller {

    public static void orders() {

        List<Order> customers = Order.findAll();
        renderJSON(customers);

    }

    public static void deleteOrder(Long id) {

        Order o = Order.findById(id);

        if (o != null) {
            o.delete();
            renderJSON(id);
        } else {
            id *= -1;
        }

        renderJSON(id);
    }

    public static void saveOrder() {

        Gson g = new Gson();
        Order newOrder = g.fromJson(params.get("body"), Order.class);
        newOrder.save();
        renderJSON(newOrder);

    }

    public static void updateOrder(Long id) {

        Gson g = new Gson();

        Order newOrder = g.fromJson(params.get("body"), Order.class);
        Order dbOrder = Order.findById(id);

        dbOrder.customer = newOrder.customer;
        dbOrder.orderDate = newOrder.orderDate;
        dbOrder.shippedDate = newOrder.shippedDate;
        
        dbOrder.save();
        renderJSON(dbOrder);

    }

}
