import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class JunitTestCalcFactorial {
    @Test
    void myTest (){
        Assertions.assertEquals(CalcFactorial.factorial(3),3);
    }
}
