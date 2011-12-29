package controllers;

import models.User;

public class Security extends controllers.Secure.Security {
    
    public static boolean authenticate(final String user, final String password) {
        User u = User.find("byUsername", user).first();
        return u != null && u.password.equals(password);
    }

}
