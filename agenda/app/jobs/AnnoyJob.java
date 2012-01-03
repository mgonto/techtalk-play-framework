package jobs;

import java.util.List;

import models.Contact;
import notifiers.Mails;
import play.jobs.Every;
import play.jobs.Job;

@Every("10s")
public class AnnoyJob extends Job {

    @Override
    public void doJob() throws Exception {
        List<Contact> contacts = Contact.find("byAnnoyed", true).fetch();
        for(Contact c : contacts) {
            Mails.annoy(c);
        }
    }
}
