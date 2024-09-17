import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGCalcFactorial {
    @Test(description = "Проверка позитивного значения (5)")
    public void positiveSimpleTest() {
        Assert.assertEquals(120, CalcFactorial.factorial(5));
    }

    @Test(description = "Проверка нуля")
    public void positiveZeroTest() {
        Assert.assertEquals(1, CalcFactorial.factorial(0));
    }

    @Test(description = "Проверка отрицательного значения (-1)")
    public void negativeTest() {
        Assert.assertThrows(IllegalArgumentException.class, () -> CalcFactorial.factorial(-1));
    }
}
