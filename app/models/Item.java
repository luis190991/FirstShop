package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Item extends Model {

    private String title;
    private String artist;
    private Double unit_price;

    public Item() {
    }

    public Item(String title, String artist, Double unit_price) {
        this.title = title;
        this.artist = artist;
        this.unit_price = unit_price;
    }

}
