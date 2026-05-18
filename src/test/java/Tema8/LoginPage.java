package Tema8;

import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        System.out.println(" Introdu username: " + username);
        System.out.println(" Introdu password: " + password);
    }
}
