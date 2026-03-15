package Tema3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTables {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
    }

    @Test
    public void Test2() {
        WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addButton.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstName.sendKeys("Andreea");

        WebElement lastName = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastName.sendKeys("Ardeleanu");

        WebElement eMail = driver.findElement(By.xpath("//input[@placeholder='name@example.com']"));
        eMail.sendKeys("andreea.ardeleanu00@email.com");

        WebElement age = driver.findElement(By.xpath("//input[@placeholder='Age']"));
        age.sendKeys("26");

        WebElement salary = driver.findElement(By.xpath("//input[@placeholder='Salary']"));
        salary.sendKeys("1500");

        WebElement department = driver.findElement(By.xpath("//input[@placeholder='Department']"));
        department.sendKeys("Sales");


        WebElement submit = driver.findElement(By.xpath("//button[@id='submit']"));
        submit.click();
    }

    @AfterMethod
    public void cleanUp() {
        driver.quit();
    }

}

