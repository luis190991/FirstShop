package controllers;

import models.Customer;
import play.mvc.With;

/**
 *
 * @author Henry
 */
@With(Security.class)
public class Customers extends CRUD {
    
    public static void customers() {
        
        renderJSON(Customer.findAll());
        
    }
}
