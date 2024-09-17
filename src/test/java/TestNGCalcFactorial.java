import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestNGCalcFactorial {
    @Test
    void myTest (){
        assertEquals(CalcFactorial.factorial(3),
                3);
    }
}
