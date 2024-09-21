import Lesson_14.PageBuilder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MtsLesson14_1Test {
    private static WebDriver driver = PageBuilder.createDriver("https://mts.by");
    private static String errMsg = "Значения не совпадают";

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдеров 'Услуги связи'")
    @CsvSource({"Номер телефона, Сумма, E-mail для отправки чека"})
    void checkFrameCommServTest(String number, String sum, String email) {
        PageBuilder.switchToFrame("Услуги связи", driver);

        WebElement phoneNumberElem = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        assertEquals(phoneNumberElem.getAttribute("placeholder"), number, errMsg);

        WebElement sumElem = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        assertEquals(sumElem.getAttribute("placeholder"), sum, errMsg);

        WebElement mailElem = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        assertEquals(mailElem.getAttribute("placeholder"), email, errMsg);
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдеров 'Домашний интернет'")
    @CsvSource({"Номер абонента, Сумма, E-mail для отправки чека"})
    void checkFrameHomeInetTest(String number, String sum, String email) {
        PageBuilder.switchToFrame("Домашний интернет", driver);

        WebElement phoneNumberElem = driver.findElement(By.xpath("//*[@id=\"internet-phone\"]"));
        assertEquals(phoneNumberElem.getAttribute("placeholder"), number, errMsg);

        WebElement sumElem = driver.findElement(By.xpath("//*[@id=\"internet-sum\"]"));
        assertEquals(sumElem.getAttribute("placeholder"), sum, errMsg);

        WebElement mailElem = driver.findElement(By.xpath("//*[@id=\"internet-email\"]"));
        assertEquals(mailElem.getAttribute("placeholder"), email, errMsg);
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдеров 'Рассрочка'")
    @CsvSource({"Номер счета на 44, Сумма, E-mail для отправки чека"})
    void checkFrameDefPayTest(String number, String sum, String email) {
        PageBuilder.switchToFrame("Рассрочка", driver);

        WebElement phoneNumberElem = driver.findElement(By.xpath("//*[@id=\"score-instalment\"]"));
        assertEquals(phoneNumberElem.getAttribute("placeholder"), number, errMsg);

        WebElement sumElem = driver.findElement(By.xpath("//*[@id=\"instalment-sum\"]"));
        assertEquals(sumElem.getAttribute("placeholder"), sum, errMsg);

        WebElement mailElem = driver.findElement(By.xpath("//*[@id=\"instalment-email\"]"));
        assertEquals(mailElem.getAttribute("placeholder"), email, errMsg);
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдеров 'Задолженность'")
    @CsvSource({"Номер счета на 2073, Сумма, E-mail для отправки чека"})
    void checkFrameDebtTest(String number, String sum, String email) {
        PageBuilder.switchToFrame("Задолженность", driver);

        WebElement phoneNumberElem = driver.findElement(By.xpath("//*[@id=\"score-arrears\"]"));
        assertEquals(phoneNumberElem.getAttribute("placeholder"), number, errMsg);

        WebElement sumElem = driver.findElement(By.xpath("//*[@id=\"arrears-sum\"]"));
        assertEquals(sumElem.getAttribute("placeholder"), sum, errMsg);

        WebElement mailElem = driver.findElement(By.xpath("//*[@id=\"arrears-email\"]"));
        assertEquals(mailElem.getAttribute("placeholder"), email, errMsg);
    }


    @AfterAll
    public static void quit() {
        driver.quit();
    }
}
