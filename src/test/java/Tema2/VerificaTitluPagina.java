import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerificaTitluPagina {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://www.sephora.ro");

        driver.findElement(By.xpath("//*[text()='ACCEPTA TOATE']")).click();
    }

    @Test
    public void testTitluPagina() {
        String titlu = driver.getTitle();
        Assert.assertTrue(titlu.contains("SEPHORA ≡ Machiaj ⋅ Parfum ⋅ Ingrijire ⋅ Frumusete"));
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
