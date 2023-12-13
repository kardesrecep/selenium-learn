package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q01GetTagName_GetAttribute {
    public static void main(String[] args) {

        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //amazona git
        drv.get("https://www.amazon.com.tr/");

        //searchbox locate et
        WebElement searchBox= drv.findElement(By.id("twotabsearchtextbox"));

        //searchbox tagname'inin input olduğunu test edelim
       String actualTagName= searchBox.getTagName();
       String expectedTagName="input";
        System.out.println(actualTagName.equals(expectedTagName) ? "test passed" : "test failed"+actualTagName );

        //arama kutusunun name attribute değerinin field-keywords olduğunu test ediniz
      String actualAttribute=searchBox.getAttribute("name");
      String expectedAttribute="field-keywords";
      if (actualAttribute.equals(expectedAttribute)){
          System.out.println("TEST PASSED");

      }else{
          System.out.println("TEST FAILED: "+actualAttribute);
      }

        //sayfayi kapat
        drv.close();




    }
}
