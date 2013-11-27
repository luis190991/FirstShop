package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class OrderDetail extends Model {

    public Order order;
    public Item item;
    public Double quantity;

}
