package Lesson_14;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MtsTestPayForm extends BaseTest {

    public static PageBuilder payForm;

    @BeforeEach
    public void before() {
        super.before();
        payForm = new PageBuilder(driver);
        payForm.discardCookie();
    }

    @Test
    public void testCheckBlockTitle() {
        payForm.scrollToPaymentForm();
        assertEquals("Онлайн пополнение\nбез комиссии", payForm.getPaymentFormTitle());
    }

    @Test
    public void testPaymentsLogo() {
        payForm.scrollToPaymentForm();
        assertAll("Payments Logo check",
                () -> assertEquals(5, payForm.getPayPartnersCount()),
                () -> assertEquals("Visa", payForm.getPayPartnersImgAlt(0)),
                () -> assertEquals("Verified By Visa", payForm.getPayPartnersImgAlt(1)),
                () -> assertEquals("MasterCard", payForm.getPayPartnersImgAlt(2)),
                () -> assertEquals("MasterCard Secure Code", payForm.getPayPartnersImgAlt(3)),
                () -> assertEquals("Белкарт", payForm.getPayPartnersImgAlt(4))
        );
    }

    @Test
    public void testCheckAboutLink() {
        payForm.scrollToPaymentForm();
        payForm.clickAboutLinc();
        assertEquals("https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/", driver.getCurrentUrl());
    }

    @Test
    public void testCheckPayments() {
        payForm.scrollToPaymentForm();
        payForm.completeForm("297777777", "10", "email@email.com");
        assertAll("Check Payments",
                () -> assertTrue(payForm.isPaidAppShow()),
                () -> assertTrue(payForm.isPaidAppFormContain("10", "297777777"))
        );
    }
}
