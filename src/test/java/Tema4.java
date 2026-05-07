import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class Tema4 {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod

    public void HomePage() {

        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://practicesoftwaretesting.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    //a.	Deschide aplicația https://practicesoftwaretesting.com/ .
    //b.	Verifică titlul paginii.
    //c.	Verifică dacă logo-ul aplicației este vizibil.


    @Test
    public void checkTitleAndLogo() {

       String expectedTitle =  "Practice Software Testing - Toolshop - v5.0";
       String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Title is not correct");

        WebElement logo = driver.findElement(By.xpath("//a[contains(@class,'navbar-brand')]"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");

        System.out.println("Logo is displayed");


    }


    //2.	Creează un test pentru căutarea unui produs
    //a.	Identifică search bar.
    //b.	Introdu textu “hammer”
    //c.	Apasă Enter sau butonul de căutare.
    //d.	Așteaptă afișarea rezultatelor.
    //e.	Verifică dacă apare cel puțin un produs în listă



    @Test
    public void searchBar() {

        WebElement searchBar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("search-query")));

        searchBar.click();
        searchBar.sendKeys("hammer");
        searchBar.sendKeys(Keys.ENTER);

        WebElement firstProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-9']")));

        Assert.assertTrue(firstProduct.isDisplayed(), "No product is visible");

        System.out.println("Products are visible");

        //3.	Creează un test pentru deschiderea unui produs
        //a.	Deschide pagina principală.
        //b.	Așteaptă încărcarea produselor.
        //c.	Apasă pe primul produs din listă.
        //d.	Verifică dacă:
        //i.	imaginea produsului este vizibilă
        //ii.	butonul Add to cart este vizibil.

    }
        @Test
        public void checkProducts() {

          WebElement listProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='card']")));
          listProduct.click();

          WebElement productImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@class='figure-img img-fluid']")));
          Assert.assertTrue(productImage.isDisplayed(), "Image is not visible");

          WebElement addToCart = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn-add-to-cart")));
          Assert.assertTrue(addToCart.isDisplayed(), "Add to cart button is not dispplayed");

          System.out.println("Image is visible");
            System.out.println("Add to cart button is visible");
        }


        //4.	Creează un test pentru filtrarea produselor
    //a.	Deschide pagina principală.
    //b.	Selectează un filtru (ex: brand sau categorie)
    //c.	Așteaptă actualizarea listei.
    //d.	Verifică dacă produsele afișate respectă filtrul.


    @Test
    public void filterCheck() {

        WebElement brandFilter = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[1][@name='brand_id' and @type='checkbox']")));
        brandFilter.click();

        WebElement listLoaded = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-test='filter_completed']")));

        List<WebElement> products = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("card-img-top")));

        Assert.assertTrue(products.size() > 0, "Nu exista produse afisate");

        for (WebElement product : products) {

         String text = product.getText().trim();

         Assert.assertTrue(text.contains("ForgeFlex Tools"), "Produsul nu respecta filtrul");


        }
    }





    }

