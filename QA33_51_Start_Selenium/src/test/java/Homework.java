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
        WebElement linkX = wd.findElement(By.xpath("//a"));

        WebElement input = wd.findElement(By.tagName("input"));
        WebElement inputX = wd.findElement(By.xpath("//input"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement buttonX = wd.findElement(By.xpath("//button"));
        List<WebElement> buttons = wd.findElements(By.tagName("button"));
        List<WebElement> buttonsX = wd.findElements(By.xpath("//button"));

        //by class
        WebElement login = wd.findElement(By.className("login_login__3EHKB"));
        WebElement login1 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement loginX = wd.findElement(By.xpath("//div/*[@class='login_login__3EHKB']"));


//        WebElement loginX = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']/[@href='login']"));


        WebElement container = wd.findElement(By.xpath("//div[@class='container']"));
        WebElement container1 = wd.findElement(By.xpath("//*[@class='container']"));
        WebElement container3 = wd.findElement(By.xpath("//*[@aria-current='page']"));

        WebElement navbar = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement navbarX = wd.findElement(By.xpath("//div[@class='navbar-component_nav__1X_4m']"));

        //by id
        WebElement root = wd.findElement(By.id("root"));
        WebElement root2 = wd.findElement(By.cssSelector("#root"));
        WebElement rootX = wd.findElement(By.xpath("//div[@id='root']"));



        //by attribute

        WebElement linkLogin1 = wd.findElement(By.cssSelector("a[href='/login']"));
        WebElement linkLogin2 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement linkLogin3 = wd.findElement(By.xpath("//a[@href='/login']"));
        WebElement linkHome = wd.findElement(By.cssSelector("a[href='/login']"));
        WebElement linkHomeX = wd.findElement(By.xpath("//a[@href='/home']"));
        WebElement linkAbout = wd.findElement(By.cssSelector("a[href='/about']"));
        WebElement linkAboutX = wd.findElement(By.xpath("//a[@href='/about']"));


        WebElement buttonRegistration = wd.findElement(By.cssSelector("button[name='registration']"));
        WebElement buttonRegistrationX = wd.findElement(By.xpath("//button[@name='registration']"));
        WebElement emailInput1 = wd.findElement(By.cssSelector("input[name='email']"));
        WebElement emailInputX = wd.findElement(By.xpath("//input[@name='email']"));
        WebElement buttonLogin = wd.findElement(By.cssSelector("button[name=login]"));
        WebElement buttonLoginX = wd.findElement(By.xpath("//button[@name='login']"));


        // one of elements find by attribute ==> start & end & contains value

        WebElement buttonLogin1 = wd.findElement(By.cssSelector("button[name^=log]"));
        WebElement buttonLogin1X = wd.findElement(By.xpath("//button[starts-with(@name,'log')]"));
        WebElement buttonRegistration0 = wd.findElement(By.cssSelector("button[name*='reg']"));
        WebElement buttonRegistration0X = wd.findElement(By.xpath("//button[contains(@name,'reg')]"));
        WebElement buttonRegistration1 = wd.findElement(By.cssSelector("button[name$=tion]"));
        WebElement buttonRegistration1X = wd.findElement(By.xpath("//button[contains(@name,'tion')]"));


        WebElement e1 = wd.findElement(By.xpath("//h1/parent::*"));
        WebElement e2 = wd.findElement(By.xpath("//h1/parent::div"));
        WebElement e3 = wd.findElement(By.xpath("//h1/.."));
        WebElement e4 = wd.findElement(By.xpath("//input/parent::form"));
        WebElement e5 = wd.findElement(By.xpath("//input[@name='email']"));
        WebElement e6 = wd.findElement(By.xpath("//input[@name='email']/parent::form"));
        

        List<WebElement>list = wd.findElements(By.xpath("//input/following-sibling::a"));

//        Thread.sleep(5000);
        wd.quit();

    }

}