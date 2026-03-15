package Tema2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeschidereSiteTest {

    @Test
    public void deschideSite() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sephora.ro");

        driver.quit();
    }
}