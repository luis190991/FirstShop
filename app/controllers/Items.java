package controllers;

import models.Item;
import play.mvc.With;

/**
 *
 * @author Henry
 */
@With(Security.class)
public class Items extends CRUD {
    
    public static void items() {
        renderJSON(Item.findAll());

    }

}
