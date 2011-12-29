package models;

import javax.persistence.Entity;

import play.db.jpa.Model;
import play.libs.Crypto;

@Entity
public class User extends Model {
    
    public String username;
    
    public String password;
    
    public void setPassword(final String password) {
        this.password = Crypto.encryptAES(password);
    }
    
    public String getPassword() {
        return Crypto.decryptAES(password);
    }

}
