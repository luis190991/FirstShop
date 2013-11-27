package models;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import play.db.jpa.Model;

@Entity
public class OrderDetail extends Model {
    
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    public Order order;
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    public Item item;
    public Double quantity;

}
