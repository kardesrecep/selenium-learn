package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q02DriverMethods {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.mail.ru");
        //driver.getTitle()==>title alir string olarak

       driver.get("https://www.amazon.com.tr");

        System.out.println(driver.getTitle());

       // driver.getCurrentUrl(); ==o anlik urli verir
        System.out.println(driver.getCurrentUrl());
        //driver.getPageSource();==icinde bulunan sayfanin kaynak kodlarini verir
       // System.out.println(driver.getPageSource());


       // driver.getWindowHandle()==>sayfalarin handle degerlerini verir hashcode
        System.out.println(driver.getWindowHandle());
        String amazonHandle= driver.getWindowHandle();
      boolean esitMi= driver.getTitle().equals("amazon");
        System.out.println(esitMi);





    }
}
