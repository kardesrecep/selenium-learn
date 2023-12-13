package day02_webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q04LoginTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        drv.get("https://www.saucedemo.com/");
        Thread.sleep(2000);
      WebElement userNameInp= drv.findElement(By.id("user-name"));
      userNameInp.sendKeys("standard_user");
        Thread.sleep(2000);
        drv.findElement(By.id("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        drv.findElement(By.id("login-button")).click();
        Thread.sleep(2000);


        //standard_user
        //secret_sauce
        drv.close();
    }
}
