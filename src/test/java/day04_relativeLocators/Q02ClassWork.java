package day04_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02ClassWork {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //Signin buttonuna tiklayin
        WebElement signInBtn= driver.findElement(By.cssSelector("button#signin_button"));
        signInBtn.click();
        //Login alanine  “username” yazdirin
        // Password alanine “password” yazdirin
        //Sign in buttonuna tiklayin
        WebElement loginEl= driver.findElement(By.cssSelector("input#user_login"));
        //xpath ile =>  //*[@id="user_login"]
        loginEl.sendKeys("username", Keys.TAB,"password",Keys.ENTER);
        driver.navigate().back();//sayfaya geri geldik
        Thread.sleep(2000);
        //Online Banking altındaki Pay Bills sayfasina gidin
        driver.findElement(By.cssSelector("li[id='onlineBankingMenu']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("span[id='pay_bills_link']")).click();
        Thread.sleep(2000);

       WebElement amaountEl= driver.findElement(By.cssSelector("input[id='sp_amount']"));
amaountEl.sendKeys("1500",Keys.TAB,"2023-19-12",Keys.TAB,"money");
Thread.sleep(2000);
amaountEl.sendKeys(Keys.ENTER);
        //
        WebElement message= driver.findElement(By.cssSelector("div[id='alert_content']"));
        //XPATH ILE ===>"(//span)[1]")
        String actualMessage= message.getText();
        String expectedMessage="The payment was successfully submitted.";

       if (actualMessage.equals(expectedMessage)){
           System.out.println("TEST PASSED");
       }else{
           System.out.println("TEST FAILED");
       }
       driver.close();

    }
}
