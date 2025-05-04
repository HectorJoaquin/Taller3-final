package factoryBrowser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeProxy implements  IBrowser{
    @Override
    public WebDriver create() {
        Proxy proxy =  new Proxy();
        proxy.setHttpProxy("localhost:9091"); //<---HOST Y PUERTO DE OWASP ZAP
        proxy.setSslProxy("localhost:9091");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setProxy(proxy);


        chromeOptions.addArguments("--ignore-certificate-errors");  //<---INGONRA EL CERTIFICADO DEL HTTPS
        ChromeDriver chrome = new ChromeDriver(chromeOptions);

        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        chrome.manage().window().maximize();
        return chrome;
    }
}
