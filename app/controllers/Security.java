/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import models.Customer;

/**
 *
 * @author Henry
 */
public class Security extends Secure.Security {

    static boolean authenticate(String userEmail, String password) {
        Customer user = Customer.find("byEmail", userEmail).first();
        return user != null && user.password.equals(password);
    }
}
