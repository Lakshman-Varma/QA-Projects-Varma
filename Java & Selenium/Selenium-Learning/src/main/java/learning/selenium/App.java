
package learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class App {

    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();

        try {

            // Scenario 1: Standard User
            loginTest(driver, "standard_user",
                    "secret_sauce", true);

            // Scenario 2: Locked Out User
            loginTest(driver, "locked_out_user",
                    "secret_sauce", false);

            // Scenario 3: Problem User
            loginTest(driver, "problem_user",
                    "secret_sauce", true);

        } finally {
            driver.quit();
        }
    }

    // Reusable login method
    public static void loginTest(WebDriver driver,
                                 String username,
                                 String password,
                                 boolean expectedLoginSuccess) {

        // Open login page
        driver.get("https://www.saucedemo.com/");

        // Enter username
        driver.findElement(By.id("user-name"))
              .sendKeys(username);

        // Enter password
        driver.findElement(By.id("password"))
              .sendKeys(password);

        // Click login
        driver.findElement(By.id("login-button"))
              .click();

        // Get current URL
        String currentURL = driver.getCurrentUrl();

        // Verify login result
        if (currentURL.contains("inventory.html")) {

            if (expectedLoginSuccess) {
                System.out.println(username + " - TEST PASSED");
            } else {
                System.out.println(username + " - TEST FAILED");
                System.out.println("Expected login to fail, but it succeeded.");
            }

        } else {

            if (!expectedLoginSuccess) {

                String errorMessage = driver.findElement(
                        By.cssSelector("[data-test='error']")
                ).getText();

                if (errorMessage.contains("locked out")) {
                    System.out.println(username + " - TEST PASSED");
                    System.out.println("Error: " + errorMessage);
                } else {
                    System.out.println(username + " - TEST FAILED");
                    System.out.println("Actual error: " + errorMessage);
                }

            } else {
                System.out.println(username + " - TEST FAILED");
                System.out.println("Actual URL: " + currentURL);
            }
        }
    }
}
