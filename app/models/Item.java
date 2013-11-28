package models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Item extends Model {

    @Required
    public String title;
    @Required
    public String artist;
    @Required
    public Double unitPrice;

    @OneToMany(mappedBy = "item", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public List<OrderDetail> orderDetails;

    public Item() {
    }

    public Item(String title, String artist, Double unitPrice) {
        this.title = title;
        this.artist = artist;
        this.unitPrice = unitPrice;
    }

}
