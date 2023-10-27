package BuySweaterTest;

import BuySweater.LoginPage;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BuySweaterLogin {

    private static WebDriver driver;

    @Before
    public void enteringpage() {
        this.driver = new ChromeDriver();
        driver.get("https://mystore-testlab.coderslab.pl/index.php");
    }

    @Test
    public void clicknologin() {
        LoginPage loginpage = new LoginPage(driver);
        loginpage.clicklogin();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.signin();
    }
}