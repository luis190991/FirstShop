package models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import play.data.validation.Email;
import play.data.validation.Password;
import play.data.validation.Required;
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
    
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    public List<Order> orders;

    public Customer() {
    }


}
