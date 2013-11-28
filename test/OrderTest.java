
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import models.Customer;
import models.Item;
import models.Order;
import models.OrderDetail;
import org.junit.Test;
import play.test.UnitTest;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Henry
 */
public class OrderTest extends UnitTest {

    @Test
    public void createOrdersTest() {

        List<Customer> customers = Customer.findAll();
        List<Item> items = Item.findAll();
        List<OrderDetail> ods = new ArrayList<OrderDetail>();

        Order o = new Order();
        o.customer = customers.get(1);
        o.orderDate = new Date();
        o.shippedDate = new Date();

        OrderDetail od = new OrderDetail();

        od.item = items.get(1);
        od.quantity = 10.0;
        ods = new ArrayList<OrderDetail>();
        ods.add(od);
        o.orderDetails = ods;
        o.save();

        o = new Order();
        o.customer = customers.get(2);
        o.orderDate = new Date();
        o.shippedDate = new Date();

        od = new OrderDetail();
        od.item = items.get(2);
        od.quantity = 10.0;
        ods = new ArrayList<OrderDetail>();
        ods.add(od);
        o.orderDetails = ods;

        o.save();

        o = new Order();
        o.customer = customers.get(3);
        o.orderDate = new Date();
        o.shippedDate = new Date();

        od = new OrderDetail();
        od.item = items.get(2);
        od.quantity = 10.0;
        ods = new ArrayList<OrderDetail>();
        ods.add(od);
        o.orderDetails = ods;

        o.save();
    }

}
