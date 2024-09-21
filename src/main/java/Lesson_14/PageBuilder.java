package Lesson_14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class PageBuilder {
    public static WebDriver createDriver(String url) {
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]")).click();
        return driver;
    }

    // переключатель форм оплаты
    public static WebDriver switchToFrame(String frame, WebDriver driver){
        String path = "//p[text()='" + frame + "']";
        driver.findElement(By.xpath("//*[@id=\"pay-section\"]//button")).click();
        driver.findElement(By.xpath(path)).click();
        return driver;
    }
}
