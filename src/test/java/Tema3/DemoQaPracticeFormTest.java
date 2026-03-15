package Tema3;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DemoQaPracticeFormTest {

    WebDriver driver;

    @BeforeMethod

    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");
    }

    //a.Gaseste campul First Name folosind Xpath, bazat pe placeholder

    @Test
    public void practiceForm() throws InterruptedException {

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));

        //b.Introdu in acel camp valoarea “Test”

        firstName.sendKeys("Test");

        //c.Gaseste campul Last Name folosing XPath bazat pe atributul id

        WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));

        //d.Introdu valoarea “User”

        lastName.sendKeys("User");

        //e.Gaseste campul Email folosing XPath bazat pe atributul id

        WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));

        //f.Introdu textul “test@email.com”

        email.sendKeys("test@email.com");

        //g.Apasa oricare din butoanele radio de la Gender

        WebElement genderRadio = driver.findElement(By.xpath("//input[@id='gender-radio-2']"));
        genderRadio.click();

        //h.Introdu un numar de telefon in campul pentru Mobile

        WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
        mobile.sendKeys("0732653683");

        //i.Introdu un text in campul pentru ‘Subjects’

        WebElement subjects = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
        subjects.sendKeys("Matematica");


        //j.Introdu un text in campul pentru ‘Current Address’

        WebElement currentAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
        currentAddress.sendKeys("Timisoara");

        //k.Gaseste butonul Submit dupa text si apasa folosind click
        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);

        // l.BONUS optional: verifica aparitia pop-up-ului de confirmare si apasa pe butonul Close


        WebElement popUp = driver.findElement(By.xpath("//div[@class='modal-content']"));
        Assert.assertTrue(popUp.isDisplayed());

        WebElement closeButton = driver.findElement(By.xpath("//button[text()='Close']"));
        closeButton.click();

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
