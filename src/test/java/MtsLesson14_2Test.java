import Lesson_14.PageBuilder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MtsLesson14_2Test {
    private static WebDriver driver = PageBuilder.createDriver("https://mts.by");
    private static final String errMsg = "Значения не совпадают";
    private static final String NUMBER = "297777777";
    private static final String SUM_PAY = "100";
    private static final String MAIL_USER = "tilted@gmail.com";
    private static WebDriverWait wait;

    @BeforeAll
    public static void init() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickPhoneField = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        clickPhoneField.click();
        clickPhoneField.sendKeys(NUMBER);
        WebElement clickSumField = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        clickSumField.click();
        clickSumField.sendKeys(SUM_PAY);
        WebElement clickMailField = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        clickMailField.click();
        clickMailField.sendKeys(MAIL_USER);
        WebElement clickContinueButton = driver.findElement(By.xpath("//*[@id=\"pay-connection\"]/button"));
        clickContinueButton.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/app-root/div/div")));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.switchTo().frame(0);
    }

    @Test
    @DisplayName("Проверка правильности входных данных на форме")
    void checkConfirmInputDataTest() {
        WebElement sumElem = driver.findElement(By.xpath("//*[@class='pay-description__cost']/span"));
        assertEquals(SUM_PAY + ".00 BYN", sumElem.getText(), errMsg);

        WebElement phoneNumbElem = driver.findElement(By.xpath("//*[@class='pay-description__text']"));
        assertEquals(NUMBER , phoneNumbElem.getText().replace("Оплата: Услуги связи Номер:375", ""), errMsg);

        WebElement sumBttnElem = driver.findElement(By.xpath("//*[@class='colored disabled']"));
        assertEquals("Оплатить " + SUM_PAY + ".00 BYN", sumBttnElem.getText(), errMsg);
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдеров на форме")
    @CsvSource({"Номер карты, Срок действия, CVC, Имя держателя (как на карте)"})
    void checkFramePlaceholdersTest(String cardNumber, String period, String cvc, String name) {
        WebElement cardNumberElem = driver.findElement(By.xpath("//label[starts-with(text(),\"Номер карты\")]"));
        assertEquals(cardNumber, cardNumberElem.getText(), errMsg);

        WebElement periodElem = driver.findElement(By.xpath("//label[starts-with(text(),\"Срок действия\")]"));
        assertEquals(period, periodElem.getText(), errMsg);

        WebElement cvcElem = driver.findElement(By.xpath("//label[starts-with(text(),\"CVC\")]"));
        assertEquals(cvc, cvcElem.getText(), errMsg);

        WebElement nameElem = driver.findElement(By.xpath("//label[starts-with(text(),\"Имя держателя (как на карте)\")]"));
        assertEquals(name, nameElem.getText(), errMsg);
    }

    @Test
    @DisplayName("Проверка лого на форме")
    void testMtsLes14_2() {
        WebElement labelMasterCard = driver.findElement(By.xpath("//img[contains(@src, 'types/mastercard')]"));
        WebElement labelVisa = driver.findElement(By.xpath("//img[contains(@src, 'types/visa')]"));
        WebElement labelBelkard = driver.findElement(By.xpath("//img[contains(@src, 'types/belkart')]"));
        WebElement labelMir = driver.findElement(By.xpath("//img[contains(@src, 'types/mir')]"));

        labelMasterCard.isDisplayed();
        labelVisa.isDisplayed();
        labelBelkard.isDisplayed();
        labelMir.isDisplayed();
    }

    @AfterAll
    public static void quit() {
        driver.quit();
    }
}