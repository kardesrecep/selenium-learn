package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class Q02WELocators2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver drv=new ChromeDriver();
        drv.manage().window().maximize();
        Thread.sleep(2000);
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //amazona git
        drv.get("https://www.amazon.com.tr/");
        drv.navigate().refresh();
        drv.navigate().refresh();
        Thread.sleep(2000);
        //Search(ara) “city bike”(arama kutusunu xpath ile locate edelim)
        WebElement searchbox = drv.findElement(By.xpath("//*[@type='text']"));
       searchbox.sendKeys("city bike"+ Keys.ENTER);



         /*
            Xpath kullanımına // sembolleri ile başlarız. Bu sembollerden sonra tag name belirtmemiz gerekir.
        tag name yerine * sembolunü kullanabilirsiniz. Bu sembol tag name farketmeksizin anlamına gelir.
        sonra köşeli parantez açıp kullanacağımız attribüte'ten önce @ sembolu kullanmalıyız. Sonrasında da
        attribüte yazılıp = TEK TIRNAK içince atributün değeri yazılmalıdır ve köşeli parantez kapatılır.
        SYNTAX:
                //tagName[@attributeName='atributeDeğeri']
                //*[@*='atribüteDeğeri'] --> Eğer bu kullanımda birden fazla sonuç verirse * koyduğumuz yerlere
                                             tagName ve attributeName'i belirtmemiz gerekir. Buna rağmen birden fazla
                                             sonuç verirse o webelementin index'ini aşağıdaki şekilde belirtiriz.
                                             (//tagName[@attributeName='atributeDeğeri'])[index]
            Xpath kullanamadığız zaman bir webelementin locate'i ile alakalı birden fazla sonuç çıkarsa bütün sonuçları
        bir list'e atıp index ile o webelemnti handle etmen gerekecekti. Dolayısıyla yukarıdaki örnekteki gibi
        xpath kullanımında birden fazla sonuç alırsak direk xpath üzerinden index ile bunu çözebiliriz.
         */


        //Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        WebElement resultSearch = drv.findElement(By.xpath("//*[@class='sg-col-inner'][1]"));
        System.out.println(resultSearch.getText());

        //Sadece sonuc sayısını yazdırınız

       String [] strResultNumbers= resultSearch.getText().split(" ");
        System.out.println(strResultNumbers[0]);


        //Sonra karşınıza çıkan ilk sonucun resmine tıklayın.
        drv.findElement(By.xpath("//*[@*='s-image']")).click();
        Thread.sleep(2000);
        //sayfayi kapat
      drv.close();

    }
}
