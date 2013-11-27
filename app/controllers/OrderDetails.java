package controllers;

import com.google.gson.Gson;
import java.util.List;
import models.OrderDetail;
import play.mvc.Controller;
import play.mvc.With;

/**
 *
 * @author Henry
 */
@With(Security.class)
public class OrderDetails extends Controller {

    public static void OrderDetails() {

        List<OrderDetail> orderDetails = OrderDetail.findAll();
        renderJSON(orderDetails);

    }

    public static void deleteOrderDetail(Long id) {

        OrderDetail o = OrderDetail.findById(id);

        if (o != null) {
            o.delete();
            renderJSON(id);
        } else {
            id *= -1;
        }

        renderJSON(id);
    }

    public static void saveOrderDetail() {

        Gson g = new Gson();
        OrderDetail newOrderDetail = g.fromJson(params.get("body"), OrderDetail.class);
        newOrderDetail.save();
        renderJSON(newOrderDetail);

    }

    public static void updateOrderDetail(Long id) {

        Gson g = new Gson();

        OrderDetail newOrderDetail = g.fromJson(params.get("body"), OrderDetail.class);
        OrderDetail dbOrderDetail = OrderDetail.findById(id);
//
//        dbOrderDetail.item = newOrderDetail.item;
//        dbOrderDetail.order = newOrderDetail.order;
        dbOrderDetail.quantity = newOrderDetail.quantity;
        dbOrderDetail.save();
        renderJSON(dbOrderDetail);

    }

}
