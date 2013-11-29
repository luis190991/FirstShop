package models;

import javax.persistence.Entity;
import play.data.validation.Email;
import play.data.validation.Password;
import play.data.validation.Required;
import play.data.validation.URL;
import play.db.jpa.Model;

@Entity
public class Customer extends Model {

    @Required
    public String firstName;
    @Required
    public String lastName;
    @Required
    public String address;
    @Required
    public String city;
    @Required
    public String state;
    @Required
    public String zip;
    @Required
    public String phone;
    public String fax;
    @Required
    @Email
    public String email;
    @Required
    @Password
    public String password;
    @URL
    public String urlImage;
    

    public Customer() {
    }

    public Customer(String firstName, String lastName, String address, String city, 
                    String state, String zip, String phone, String fax, String email, String password, String urlImage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.password = password;
        this.urlImage = urlImage;
    }
    
    

}
