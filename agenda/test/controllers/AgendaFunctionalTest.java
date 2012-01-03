package controllers;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import junit.framework.Assert;
import models.Contact;

import org.junit.Before;
import org.junit.Test;

import play.mvc.Http.Cookie;
import play.mvc.Http.Request;
import play.mvc.Http.Response;
import play.test.Fixtures;
import play.test.FunctionalTest;

import com.google.common.collect.Maps;

public class AgendaFunctionalTest extends FunctionalTest {
    
    private static final String LOCATION_HEADER = "Location";
    private Map<String, Cookie> cookies;

    @Before
    public void setUp() {
        Fixtures.deleteDatabase();
        Fixtures.loadModels("data.yml");
    }
    
    @Test
    public void testAddContact() {
        LOGIN();
        Map<String, String> data = Maps.newHashMap();
        String name = "JonnyBoy";
        String telephoneNumber = "44444444";
        data.put("contact.name", name);
        data.put("contact.telephoneNumber", telephoneNumber );
        
        Assert.assertEquals(0, Contact.count());
        
        SECURED_POST("/agenda/create", data);
        
        Contact c = Contact.find("byNameAndTelephoneNumber", name, telephoneNumber).first();
        
        Assert.assertNotNull(c);
    }
    
    @Test
    public void testEditContact() {
        Fixtures.loadModels("contacts.yml");
        LOGIN();
        Assert.assertEquals(0, Contact.find("byName", "JonnyBoy").fetch().size());
        Map<String, String> data = Maps.newHashMap();
        String name = "JonnyBoy";
        String telephoneNumber = "44444444";
        data.put("contact.name", name);
        data.put("contact.telephoneNumber", telephoneNumber );
        data.put("contact.id", "2");
        
        SECURED_POST("/agenda/edit", data);
        
        Contact c = Contact.find("byNameAndTelephoneNumber", name, telephoneNumber).first();
        
        Assert.assertNotNull(c);
    }
    
    @Test
    public void testGetAddContact() {
        LOGIN();
        Response response = SECURED_GET("/agenda/new");
        
        assertContentType("text/html", response);
        assertStatus(200, response);
    }
    
    @Test
    public void testGetAddContactForbidden() {
        Response response = GET("/agenda/new");
        
        assertHeaderEquals(LOCATION_HEADER, "/secure/login", response);
    }
    
    @Test
    public void testGetIndex() {
        LOGIN();
        Response response = SECURED_GET("/");
        
        assertStatus(302, response);
    }

    private void LOGIN() {
        Map<String, String> loginUserParams = new HashMap<String, String>();
        loginUserParams.put("username", "gonto");
        loginUserParams.put("password", "gonto");
        Response loginResponse = POST("/secure/authenticate", loginUserParams);
        cookies = loginResponse.cookies;
    }
    
    private Response SECURED_GET(final String url) {
        Request request = newRequest();
        request.cookies = cookies;
        return GET(request, url);
    }

    private Response SECURED_POST(final String url, final Map<String, String> params) {
        Request request = newRequest();
        request.cookies = cookies; // this makes the request authenticated
        return POST(request, url, params, new HashMap<String, File>());
    }

}
