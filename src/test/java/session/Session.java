package session;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {

    private static Session session = null;
    private WebDriver browser;

    private Session(){
        //constructor privado
        browser = FactoryBrowser.make("proxy").create();  //----PARA PROBAR EN EL OWASP ZAP
      //  browser = FactoryBrowser.make("chrome").create();  // CUANDO SE PRUEBA SOLO CON EL NAVEGADOR
    }

    public static Session getSession(){
        if (session == null)
            session = new Session();
        return session;
    }


    public WebDriver getBrowser(){
        return browser;
    }


    public void closeSesion(){
        browser.quit();
        session = null;
    }


}
