package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q03XpathEX {
    public static void main(String[] args) {
        WebDriver drv = new ChromeDriver();
        drv.manage().window().maximize();
        //  Thread.sleep(2000);
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        // 1. https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        drv.get("https://the-internet.herokuapp.com/add_remove_elements/");

        // 2. Add Element butonuna basin
        WebElement btnEl = drv.findElement(By.xpath("//*[text()='Add Element']"));
        btnEl.click();

        //3. Delete butonu’nun gorunur oldugunu test edin
        WebElement deleteBtn = drv.findElement(By.xpath("//*[@id='elements']"));
        //drv.findElement(By.xpath("//*[.='Delete']"));
        //drv.findElement(By.xpath("//*[text()='Delete']"));
        if (deleteBtn.isDisplayed()) {
            System.out.println("test Passed");
        } else {
            System.out.println("Test failed");
        }

        // 4. Delete tusuna basin
        deleteBtn.click();

        // 5. “Add/Remove Elements” yazisinin gorunur oldugunu test edin
        WebElement addRemoveElement = drv.findElement(By.xpath("//h3"));
        if (addRemoveElement.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAILED");

        drv.close();
    }
}
