package day04_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Q03ClickBtn {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.manage().window().maximize();



        // Go to the URL
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // Find and click the "Add Element" button 100 times
        for (int i = 0; i < 100; i++) {
            WebElement addButton = driver.findElement(By.cssSelector("button[onclick='addElement()']"));
            addButton.click();
           // wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("button[class='added-manually']")));
        }

        // Find and click the "Delete" button 90 times
        for (int i = 0; i < 90; i++) {
            WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually']"));
            deleteButton.click();
           // wait.until(ExpectedConditions.invisibilityOf(deleteButton));
        }

        // Verify that the "Delete" button was clicked 90 times
        List<WebElement> deleteButtons = driver.findElements(By.cssSelector("button[class='added-manually']"));
        if (deleteButtons.isEmpty()) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

        // Close the browser
        driver.quit();
    }
}
