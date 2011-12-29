package models;

import javax.persistence.Entity;

import play.data.validation.Match;
import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Contact extends Model {
    
    @Required
    public String name;

    @Required
    @Match(value = "^[3456][0-9]{3}-?[0-9]{4}$")
    public String telephoneNumber;
    
}
