package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import play.libs.Crypto;

@Entity
public class AgendaUser extends Model {
    
    public String userLogin;
    
    public String password;
    
    public void setPassword(final String password) {
        this.password = Crypto.encryptAES(password);
    }
    
    public String getPassword() {
        return Crypto.decryptAES(password);
    }

}
