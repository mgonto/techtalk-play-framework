package controllers;

import models.User;
import play.jobs.Job;
import play.jobs.OnApplicationStart;

@OnApplicationStart
public class Bootstrap extends Job {
    
    @Override
    public void doJob() throws Exception {
        if (User.count() == 0) {
            User u = new User();
            u.username = "gonto";
            u.password = "gonto";
            u.save();
        }
    }

}
