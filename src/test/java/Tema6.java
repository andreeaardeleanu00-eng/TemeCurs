import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Tema6 {

    //1.	Creează un test care:
    //■	deschide un site
    //■	deschide un tab nou (WindowType.TAB)
    //■	accesează alt site în noul tab
    //■	Afișează titlul ambelor taburi

    WebDriver driver;
    WebDriverWait wait;


    @Test
    public void multipleTabs() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        String firstTab = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wikipedia.org");


        System.out.println("Title second tab is " +driver.getTitle());

        driver.switchTo().window(firstTab);
        System.out.println("Title first tab is " + driver.getTitle());
    }


    //Creează un test care:
    //●	deschide 2 taburi
    //●	salvează windowHandles
    //●	navighează între ele
    //●	Verifică titlul fiecărui tab folosind Assert


    @Test
    public void navigateTabs() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com");

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wikipedia.org");

        List <String> tabs = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(0));
        String firstTitle = driver.getTitle();
        Assert.assertEquals(firstTitle, "Google");

        driver.switchTo().window((tabs.get(1)));
        String secondTitle = driver.getTitle();
        Assert.assertEquals(secondTitle, "Wikipedia");
    }


    //Creează un test care:
    //●	deschide 2 taburi
    //●	închide unul cu driver.close()
    //●	revine pe tabul principal
    //●	 Verifică dacă încă ești pe pagina corectă
    //●	Ruleaza testul folosing fisier .xml


    @Test
    public void closeSecondTabAndReturn() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.google.com");
        String mainTab = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.wikipedia.org");
        driver.close();

        driver.switchTo().window(mainTab);
        Assert.assertEquals(driver.getTitle(), "Google");
    }

}
