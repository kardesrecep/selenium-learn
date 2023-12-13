package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Q06ManageMethods2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver drv=new ChromeDriver();
        //maximize
        drv.manage().window().maximize();


        //!!istenen sayfa acilincaya kadar max bekleme suresi belirtilir
        //domun tam olusmasi surecinde testi bekltir ve
        drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));//-->Max. 15 saniye sayfadaki tüm
        // elementlerin oluşması için bekler
        /*
            Manuel olarak bir sayfayı açtığımızda nasıl maximize yapıyorsak, otomosyon ilede yukarıdaki örnekteki gibi
         sayfayı maximize yapabiliriz. Driver'ın tüm elementleri net bir şekilde görebilmesi için bunu yapmamız testleri-
         mizin daha sağlıklı çalışması için önemlidir. Maximize yaptıktan sonra tüm elementlerin oluşmasını beklemek
         için yine manage() methodu, timeouts().implicitlyWait() methodu ile bekleme yapmamız gerekir.
            Bir sayfaya gittiğimizde internetten kaynaklı yada sayfaya çok fazla aynı anda giriş yapılmasından kaynaklı
         web elementler hemen oluşmayabilir. Dolayısıyla müdahale etmek istediğimiz bir element oluşmaz ve o elementi
         handle etmek istediğimde kodlarım seri bir şekilde çalışmaya devam ettiği diğer satirdaki koda geçip hata alırız.
         Bu yüzden implcitlyWait bekleme konusunda bizim işimizi yüzde 80 çözer. Geri yüzde 20 lik kızmı ise daha sonra
         wait konusunda explicit wait olarak göreceğiz.
         */

        //browseri istenen koordinata getirir
        drv.manage().window().setPosition(new Point(67,23));
        Thread.sleep(3000);

        //browseri istenen boyuta getirir
        drv.manage().window().setSize(new Dimension(600,600));

        //youtube sayfasına gidiniz
        drv.get("https://www.youtube.com/");

        //sayfa başlığının youtube  olduğunu test ediniz
       String currentTitle= drv.getTitle();
       String expectedTitle="YouTube";

        System.out.println(currentTitle);
        System.out.println(currentTitle.equals(expectedTitle) ?
                "Test Passed "+currentTitle: "test failed "+expectedTitle);


        Thread.sleep(2000);

        //facebook sayfasına gidiniz
        drv.navigate().to("https://facebook.com/");


        //sayfa url'inin facebook içerdiğini test ediniz
      String currentUrl=  drv.getCurrentUrl();
      String expectedUrl="facebook";
      if (currentUrl.contains(expectedUrl)){
          System.out.println("TEST PASSED: "+currentUrl);
      }else{
          System.out.println("TEST FAILED: "+expectedUrl);
      }


        //youtube sayfasına geri dönününüz
        drv.navigate().back();
      Thread.sleep(2000);


        //Geri döndüğünüzü test ediniz
        System.out.println(currentTitle.equals(expectedTitle) ?
                "Test Passed "+currentTitle: "test failed "+expectedTitle);

//        Thread.sleep(3000);
//        //tekrar youtube git
//        drv.navigate().forward();

        //sayfayı kapatınız
        //drv.close();
        drv.quit();




    }
}

