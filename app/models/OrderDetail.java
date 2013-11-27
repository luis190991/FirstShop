package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class OrderDetail extends Model {
    
    @ManyToOne
    public Order order;
    @ManyToOne
    public Item item;
    public Double quantity;

}
