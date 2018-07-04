import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppTest {
    @Test
    public void AppTest() {
        FirefoxDriver browser = new FirefoxDriver();
        browser.get("http://uiautomation.96.lt/");
        browser.manage().window().maximize();

        browser.findElementByLinkText("Cameras").getAttribute("href");
        browser.findElementByLinkText("Cameras").click();

        browser.findElementById("currency").click();
        browser.findElementByName("USD").click();

        browser.findElementById("currency").click();
        browser.findElementByName("EUR").click();

        browser.findElementById("currency").click();
        browser.findElementByName("GBP").click();

        browser.findElementByLinkText("My Account").click();
        browser.findElementByLinkText("Wish List (0)").click();
        browser.findElementByLinkText("Shopping Cart").click();

        browser.findElementByLinkText("My Account").click();
        browser.findElementByLinkText("Register").click();
        browser.findElementById("input-firstname").sendKeys("Vardas");
        browser.findElementById("input-lastname").sendKeys("Pavarde");
        browser.findElementById("input-email").sendKeys("Mailas");
        browser.findElementById("input-telephone").sendKeys("Telefonas");
        browser.findElementById("input-fax").sendKeys("Faxas");
        browser.findElementById("input-company").sendKeys("Kompanija");
        browser.findElementById("input-address-1").sendKeys("Adresas 123");
        browser.findElementById("input-address-2").sendKeys("Adresas 321");
        browser.findElementById("input-city").sendKeys("Miestas");
        browser.findElementById("input-postcode").sendKeys("Pasto kodas 32154");
        browser.findElementById("input-country").click();



        // browser.findElementByLinkText("Cameras").getText();
        // browser.findElementById("search").click();
        // browser.findElementById("search").sendKeys("Input Text");

        // System.out.print(browser.findElementById("search").getText());
        // System.out.println(browser.findElementByLinkText("Cameras").getText());


        // browser.close();
    }
}
