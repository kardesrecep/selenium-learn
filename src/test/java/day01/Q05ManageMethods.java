package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q05ManageMethods {
    public static void main(String[] args) {
        WebDriver drv=new ChromeDriver();
        //browser konumu
        System.out.println("posizyon "+drv.manage().window().getPosition());

        //browser boyutlarini
        System.out.println("boyut "+drv.manage().window().getSize());

        //browseri maximize yap
        drv.manage().window().maximize();

        //youtubeye git
        drv.navigate().to("https://www.youtube.com/");

        //browser konumu
        System.out.println("posizyon "+drv.manage().window().getPosition());

        //browser boyutlarini
        System.out.println("boyut "+drv.manage().window().getSize());

        //browseri minimize yap
        drv.manage().window().minimize();


        //browser fullscreen yap
        drv.manage().window().fullscreen();


        //browser boyutlarini
        System.out.println("boyut "+drv.manage().window().getSize());

        //position set et
        drv.manage().window().setPosition(new Point(50,50));

        //size set et
        drv.manage().window().setSize(new Dimension(300,500));


    }
}
