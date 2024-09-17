import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGCalcFactorial {
    @Test(description = "Проверка позитивного значения (3)")
    public void positiveSimpleTest() {
        Assert.assertEquals(6, CalcFactorial.factorial(3));
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
