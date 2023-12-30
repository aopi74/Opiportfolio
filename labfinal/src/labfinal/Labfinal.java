
package labfinal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Labfinal {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver",
                "/home/student_user/op/chromedriver-linux64/chromedriver");
        WebDriver driver = new ChromeDriver();
       
        driver.get("https://demo.openmrs.org/openmrs/");

      
       
    }

    private static void performLogin(String username, String password, WebDriver driver, String testCase) {
       
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("Inpatient Ward"));
        
//        usernameField.click();
//        usernameField.sendKeys("admin");
        
        WebElement usernameButton = driver.findElement(By.id("Admin"));
        WebElement passwordButton = driver.findElement(By.id("Admin123"));

//        usernameField.id("Admin");
//        passwordField.id();

        loginButton.click();

       
        if (driver.getCurrentUrl().contains("home.page")) {
            System.out.println("Test Case " + testCase + ": Login successful");
        } else {
            System.out.println("Test Case " + testCase + ": Login failed");
        }

        driver.navigate().back();
    }
}
