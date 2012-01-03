package controllers;

import java.util.List;

import models.Contact;
import play.data.validation.Valid;
import play.mvc.Controller;
import play.mvc.With;

import com.google.common.collect.Lists;

@With(Secure.class)
public class Agenda extends Controller {
    
    public static void newContact() {
        render();
    }
    
    public static void create(@Valid final Contact contact) {
        if (validation.hasErrors()) {
            validation.keep();
            params.flash();
            newContact();
        }
        contact.save();
        list();
    }
    
    public static void list() {
        List<Contact> contacts = Contact.findAll();
        render(contacts);
    }
    
    public static void search(final String q, final boolean first) {
        List<Contact> contacts = Lists.newArrayList();
        if (!q.isEmpty()) {
            contacts = Contact.find("byNameLike", "%" + q + "%").fetch();
        }
        params.flash("q");
        render(contacts, first);
    }

}
