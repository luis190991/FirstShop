package models;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class Order extends Model {

//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    public Customer customer;
    public Date orderDate;
    public Date shippedDate;

    public Order() {
    }

    public Order(Customer customer, Date orderDate, Date shippedDate) {
        //this.customer = customer;
        this.orderDate = orderDate;
        this.shippedDate = shippedDate;
    }

}
