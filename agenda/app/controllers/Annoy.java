package controllers;

import models.Contact;
import play.mvc.Controller;
import play.mvc.With;

@With(Secure.class)
public class Annoy extends Controller {
    
    public static void start(final Long id) {
        annoy(id, true);
    }
    
    public static void stop(final Long id) {
        annoy(id, false);
    }
    
    private static void annoy(final Long id, final boolean annoy) {
        Contact contact = Contact.findById(id);
        notFoundIfNull(contact);
        contact.annoyed = annoy;
        contact.save();
        flash.success((annoy ? "Comenzaste a" : "Terminaste de") + " molestar a tu amigo correctamente");
        Agenda.list();
    }

}
