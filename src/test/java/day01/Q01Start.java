package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q01Start {
    public static void main(String[] args) {

         /*
            POM.xml dosyasına driver sürücüleri için yüklediğimiz webDriverManager dependency sayesinde
        yukarıdaki örnekteki bilgisayarımızda mevcut olan başka bir browser ile driver'imizi oluşturabiliriz
        Yine bu projede ki gibi pom.xml dosyasına yüklediğimiz selenium-java dependency sayesinde get() methodu
        ile string olarak belirtmiş olduğumuz istediğimiz bir url'e gidebiliriz.
         */
        WebDriver driver= new ChromeDriver();//chrome driver olusturuldu
        driver.get("https://google.com");

        //driver.get(String url)
        driver.get("https://www.technopat.net/");


    }
}
