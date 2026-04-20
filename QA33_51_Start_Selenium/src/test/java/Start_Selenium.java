import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.Test;

public class Start_Selenium {

    WebDriver wd;

    @Test
    public void test() {
        wd = new ChromeDriver();
//        wd.get("https://www.google.com/");
        wd.navigate().to("https://www.google.com/");
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();
        wd.quit();

    }
}
