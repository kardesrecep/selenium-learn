package day02_webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q02Submit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver drv= new ChromeDriver();
        drv.manage().window().maximize();
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        drv.get("https://www.amazon.com/");
        Thread.sleep(2000);

        //locator almak icin
        // Tanimladigimiz web elementin yerini driver’in bulabilmesi icin findElement (Locator)method’unu kullaniriz.
        // driver.findElement(Locator);

        //arama kutusunu locate et ayakkabi arat ve entere bas
        //1.yol
       WebElement textBox=  drv.findElement(By.id("twotabsearchtextbox"));
        Thread.sleep(2000);
     textBox.sendKeys("ayakkabi");
     textBox.submit();
        //2.yol
        drv.findElement(By.id("twotabsearchtextbox")).sendKeys("mavi elbise"+Keys.ENTER);
        //Eğer bir webelementin locate'ini birden fazla kullanacakcak bir webElemente aşağıdaki gibi assing edebiliriz.

        //WebElement aramaKutusuWebElementi = driver.findElement(By.id("twotabsearchtextbox"));
        //aramaKutusuWebElementi.sendKeys("iphone", Keys.ENTER);
        //aramaKutusuWebElementi.submit();//-->ENTER TUŞUNA BASAR

        //Eğer bir locate'i tek bir kere kullanacaksak;
        // driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);

        /*
            Bir sayfada herhangi bir webelementi locate etmek için sayfa üzerinde veya locate etmek istediğimiz
        webelement üzerinde sağ klik yapıp incele deriz. Locate almak istediğimiz element, id attribütune sahip ise
        id locator'ı ile id atribute değerini kullanarak yukarıdaki örnekteki gibi locate edebiliriz.
            Locate ettiğimiz webelementi <input> tag'ına sahip ise o webelemente sendKeys() methodu ile
        istediğimiz text'i gönderebiliriz.
            Eğer bir arama kutusunu lacate edip bir text gönderirsek 2 şekilde enter tuşuna bastırabiliriz.

        1.si submit()
        2.si tanımlanmış bir değer kümesi olan (enum) Keys.ENTER

        /driver elementi bulamazsa NoSuchElementException hatasi verir
         */

        //drv.findElement(By.id("twotabsearchtextbox")).sendKeys("telefon");
        drv.close();

    }

}
