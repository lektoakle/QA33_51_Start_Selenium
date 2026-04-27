import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Homework {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void cssLocators() throws InterruptedException {
        //by tagName

        WebElement link = wd.findElement(By.tagName("a"));
        WebElement input = wd.findElement(By.tagName("input"));
        WebElement button = wd.findElement(By.tagName("button"));
        List<WebElement> buttons = wd.findElements(By.tagName("button"));

        //by class
        WebElement login = wd.findElement(By.className("login_login__3EHKB"));
        WebElement login2 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement navbar = wd.findElement(By.className("navbar-component_nav__1X_4m"));


        //by id
        WebElement root = wd.findElement(By.id("root"));
        WebElement root2 = wd.findElement(By.cssSelector("#root"));


        //by attribute

        WebElement linkLogin1 = wd.findElement(By.cssSelector("a[href='/login']"));

        WebElement buttonRegistration = wd.findElement(By.cssSelector("button[name='registration']"));
        WebElement emailInput1 = wd.findElement(By.cssSelector("input[name='email']"));
        WebElement buttonLogin = wd.findElement(By.cssSelector("button[name=login]"));


        // one of elements find by attribute ==> start & end & contains value

        WebElement buttonLogin1 = wd.findElement(By.cssSelector("button[name^=log]"));
        WebElement buttonRegistration0 = wd.findElement(By.cssSelector("button[name*='reg']"));
        WebElement buttonRegistration1 = wd.findElement(By.cssSelector("button[name$=tion]"));

        Thread.sleep(5000);
        wd.quit();

    }

}