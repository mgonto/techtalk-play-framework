package controllers;

import java.util.List;

import models.Contact;
import play.mvc.Controller;

public class Agenda extends Controller {
    
    public static void newContact() {
        render();
    }
    
    public static void create(final Contact contact) {
        contact.save();
        list();
    }
    
    public static void list() {
        List<Contact> contacts = Contact.findAll();
        render(contacts);
    }

}
