package models;

import javax.persistence.Entity;
import play.db.jpa.Model;

@Entity
public class Customer extends Model {

    public String firstName;
    public String lastName;
    public String address;
    public String city;
    public String state;
    public String zip;
    public String phone;
    public String fax;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String address, String city, String state, String zip, String phone, String fax) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.fax = fax;
    }

}
