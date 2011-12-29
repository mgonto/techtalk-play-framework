package controllers;

import models.AgendaUser;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Bootstrap extends Job {
    
    @Override
    public void doJob() throws Exception {
        if (AgendaUser.count() == 0) {
            AgendaUser u = new AgendaUser();
            u.userLogin = "gonto";
            u.password = "gonto";
            u.save();
        }
    }

}
