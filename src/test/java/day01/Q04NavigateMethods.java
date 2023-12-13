package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q04NavigateMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        //youtube git
        driver.navigate().to("https://www.youtube.com/");//-->get() methodu gibi string olaran girilen url'e gider
       Thread.sleep(3000);//-->Java dan gelen bekleme

        //Amazon soyfasina gidelim. https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");
        Thread.sleep(3000);
        //amazon sayfasinin basligini yazdir
        System.out.println("amazon "+driver.getTitle());
        //youtubeye geri donelim
        driver.navigate().back();
        Thread.sleep(3000);
        //youtube sayfa basligini yazdir
        System.out.println("youtube "+driver.getTitle());
        //amazona tekrar  git url yazdir
        driver.navigate().forward();
        Thread.sleep(3000);
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl: "+currentUrl);

        //amazondayken sayfayi yenile
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
        //driver.close();

    }
}
