package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q08ClassWork2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver drv=new ChromeDriver();
        drv.get(("https://www.facebook.com/"));
        Thread.sleep(2000);
        drv.manage().window().maximize();
        Thread.sleep(2000);
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        String currentTitle= drv.getTitle();
        System.out.println(currentTitle.equals("facebook") ? "test Passed" : "test failed "+currentTitle);
        String currentUrl=drv.getCurrentUrl();
        System.out.println(currentUrl.contains("facebook") ? "test passed":"test failed "+currentUrl);
        drv.navigate().to("https://www.wallmart.com/");
        Thread.sleep(2000);

        String currentTitleW= drv.getTitle();
        System.out.println(currentTitleW.contains("Walmart.com") ? "test Passed" : "test failed "+currentTitleW);
        Thread.sleep(2000);
        drv.navigate().back();
        drv.navigate().refresh();
        Thread.sleep(2000);
        drv.manage().window().maximize();
        drv.close();

    }
}
