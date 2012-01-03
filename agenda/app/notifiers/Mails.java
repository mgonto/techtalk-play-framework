package notifiers;

import models.Contact;
import play.mvc.Mailer;

public class Mails extends Mailer {

    public static void sendnewContact(final Contact c) {
        setFrom("zaubertest.test@gmail.com");
        addRecipient(c.mail);
        setSubject("Te he agregado como contacto");
        send(c);
    }
    
    public static void annoy(final Contact c) {
        setFrom("zaubertest.test@gmail.com");
        addRecipient(c.mail);
        setSubject("Te molesto, lala");
        send(c);
    }



}
