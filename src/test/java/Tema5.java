import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tema5 {

    //1.	Folosind pagina https://practicesoftwaretesting.com/
    //a.	Accesează o categorie de produse.
    //b.	Folosește filtrele disponibile.
    //c.	Selectează un filtru (ex: brand).
    //d.	Verifică faptul că cel puțin două produse conțin numele categoriei selectate.

    WebDriver driver;
    WebDriverWait wait;

    @Test
    public void Exercitiu1() {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");

        WebElement category = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[contains(text(), 'Hammer')]/input")));
        category.click();


    }


}
