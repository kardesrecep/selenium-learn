package day01;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q07ClassWork {
    public static void main(String[] args) {
        WebDriver drv= new ChromeDriver();
        drv.navigate().to("https://www.amazon.com/");
        drv.manage().window().maximize();
        drv.manage().window().setPosition(new Point(70,60));
        drv.manage().window().setSize(new Dimension(45,78));
        drv.close();




    }
}
