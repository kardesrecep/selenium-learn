package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q03DriverMethodsClassWork {
    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();

        driver.get("https://www.amazon.com.tr/");
        //amazona gittik

        //sayfa basligi Amazon iceriyor mu?
      String actualTitle=  driver.getTitle();
      String expectedTitle="Amazon";
      if (actualTitle.contains(expectedTitle)){
          System.out.println("Test Passed");

      }else{
          System.out.println("Test Failed");
      }

      //amazon urlinin esit oldugunu test edelim
      String actualUrl=  driver.getCurrentUrl();
      String expectedUrl="https://www.amazon.com.tr/";

      if (actualUrl.equals(expectedUrl)){
          System.out.println("Test Passed");
      }else{
          System.out.println("Test Failed "+expectedUrl);
      }

        //Sayfa handle degerini yazdirin
        String amazonWindowHandleDegeri = driver.getWindowHandle();
        System.out.println("Handle Degeri : "+amazonWindowHandleDegeri);
       /*
            Bir sayfaya gittikten sonra yeni sekmede yada pencerede başka bir sayfaya gitmemiz istenebilir ve tekrar ilk
        açtığımız sayfaya dönmemiz istenirse, ilk sayfaya dönebilmek için ilk sayfanın handle değeri gerekir.
        Buna ilk sayfaya get() methodu ile gittikten sonra o sayfanın handle değerini getWindowHandle() methodu ile
        string bir değişken assign ederek çok rahat alabiliriz. Ve bu aldığız handle değeri ile switch() methodunu
        kullanarak pencereler arasında geçiş yapabiliriz.
         */

        //Sayfa HTML kodlarinda “Gateway” kelimesi gectigini test edin
        if (driver.getPageSource().contains("Gateway")){
            System.out.println("PASSED");
        }else System.out.println("FAILED");

        //Sayfayi kapatin.
        driver.close();//-->En son driver'ın olduğu sayfayı kapatır
        //driver.quit();-->Bizim otomasyon ile açtığımız birden fazla sekme ve pencereyi kapatmak için kullanırız
    }
}

