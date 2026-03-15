import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class testExampleTitle {

    WebDriver driver;

    @Test
    public void testExampleTitle() {
        driver = new ChromeDriver();
        driver.get("https://www.apple.com");
        String title = driver.getTitle();
        Assertions.assertNotNull(title, "Titlul paginii este null");

        Assertions.assertTrue(title.contains("Samsung"),
                "Titlul nu contine 'Samsung'");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
