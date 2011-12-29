package controllers;

import models.AgendaUser;

public class Security extends controllers.Secure.Security {
    
    public static boolean authenticate(final String user, final String password) {
        AgendaUser u = AgendaUser.find("byUserLogin", user).first();
        return u != null && u.password.equals(password);
    }

}
