import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MtsTest {
    public static WebDriver driver;

     @BeforeAll
    public static void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Никита\\IdeaProjects\\HomeworkAston\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://mts.by");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        WebElement click = driver.findElement(By.xpath("/html/body/div[6]/main/div/div[2]/div/div[2]/button[2]"));
        click.click();
    }

    @Test
    @Order(1)
    @DisplayName("Проверка названия блока")
    public void checkNameTest() {
        WebElement blockTitle = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/h2"));
        assertEquals(blockTitle.getText(), "Онлайн пополнение\nбез комиссии",
                "Название блока не соответствует заданному");
    }

    @Test
    @Order(1)
    @DisplayName("Проверка логотипов платежных систем")
    public void checkLogoTest() {
        WebElement blockLogo1 = driver.findElement(By.xpath("//*[@id=\"pay-section\"]" +
                "/div/div/div[2]/section/div/div[2]/ul/li[1]/img"));
        assertTrue(blockLogo1.isDisplayed(), "Лого VISA не показано");

        WebElement blockLogo2 = driver.findElement(By.xpath("//*[@id=\"pay-section\"]" +
                "/div/div/div[2]/section/div/div[2]/ul/li[2]/img"));
        assertTrue(blockLogo2.isDisplayed(), "Лого Verified by VISA не показано");

        WebElement blockLogo3 = driver.findElement(By.xpath("//*[@id=\"pay-section\"]" +
                "/div/div/div[2]/section/div/div[2]/ul/li[3]/img"));
        assertTrue(blockLogo3.isDisplayed(), "Лого MasterCard не показано");

        WebElement blockLogo4 = driver.findElement(By.xpath("//*[@id=\"pay-section\"]" +
                "/div/div/div[2]/section/div/div[2]/ul/li[4]/img"));
        assertTrue(blockLogo4.isDisplayed(), "Лого MasterCard Secure Code не показано");

        WebElement blockLogo5 = driver.findElement(By.xpath("//*[@id=\"pay-section\"]" +
                "/div/div/div[2]/section/div/div[2]/ul/li[5]/img"));
        assertTrue(blockLogo5.isDisplayed(), "Лого Белкарт не показано");
    }

    @Test
    @Order(1)
    @DisplayName("Проверка ссылки «Подробнее о сервисе»")
    public void checkLinkTest() {
        WebElement clickDetailsLink = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/" +
                "div[2]/section/div/a"));
        clickDetailsLink.click();
        assertEquals(driver.getCurrentUrl(),
                "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/",
                "Ссылка неисправна");
        driver.get("http://mts.by");
    }

    @Test
    @Order(2)
    @DisplayName("Проверка заполняемости полей")
    public void checkFieldsTest() {
        WebElement clickPhoneField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        clickPhoneField.click();
        clickPhoneField.sendKeys("297777777");
        WebElement clickSumField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        clickSumField.click();
        clickSumField.sendKeys("100");
        WebElement clickMailField = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        clickMailField.click();
        clickMailField.sendKeys("tilted@gmail.com");
        WebElement clickContinueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        clickContinueButton.click();
    }

    @AfterAll
    public static void close() {
        driver.close();
    }
}