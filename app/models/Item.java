package models;

import javax.persistence.Entity;
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

    public Item() {
    }

    public Item(String title, String artist, Double unitPrice) {
        this.title = title;
        this.artist = artist;
        this.unitPrice = unitPrice;
    }

}
