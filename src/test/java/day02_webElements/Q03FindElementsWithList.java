package day02_webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class Q03FindElementsWithList {
    public static void main(String[] args) throws InterruptedException {
        WebDriver drv= new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //amazona gittik
        drv.get("https://www.amazon.com/");
        Thread.sleep(2000);

        //Arama kutusunu locate edip gozluk aratalım
        WebElement searchBox= drv.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("gozluk"+ Keys.ENTER);
/*
            Eğer birden fazla webelementi handle etmek istiyorsak bu webelementleri bir list'e atmamız gerekir.
        List kullandığımız zaman birden fazla webelement olduğu için findElements() methodunu kullanırız.

           araba linktext'ine sahip tüm webelmentleri WebElement türünde oluşturmuş olduğum
        liste attım
            Bir webElemente sahip text'i yada bir webelement üzerindeki yazıyı alabilmek ve yazdırabilmek için getText()
        methodunu kullanırız.
         */

        //Small Business adetini yazdir
       List<WebElement> links= drv.findElements(By.linkText("Small Business"));
        System.out.println(links.size());
        for (WebElement w:links) {
            System.out.println(w.getText());

        }
        links.get(1).click();

    }
}
