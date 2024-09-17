import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class JunitTestCalcFactorial {

    @Test
    @DisplayName("Проверка позитивного значения (3)")
    public void positiveSimpleTest() {
        assertEquals(6, CalcFactorial.factorial(3));
    }

    @Test
    @DisplayName("Проверка нуля")
    public void positiveZeroTest() {
        assertEquals(1, CalcFactorial.factorial(0));
    }

    @Test
    @DisplayName("Проверка отрицательного значения (-1)")
    public void negativeTest() {
        assertThrows(IllegalArgumentException.class, () -> CalcFactorial.factorial(-1));
    }
}
