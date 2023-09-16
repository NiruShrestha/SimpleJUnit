
package UnitTestClass;

import org.junit.Test;
import static org.junit.Assert.*;


public class CalculationTest {
    
    public CalculationTest() {
    }

    @Test
    public void testaddEm() {
        Calculation test = new Calculation();
        int expected = 5;
        int actual;
        
        actual = test.addEm(2,3);
        
        assertEquals(expected, actual);
    }
    
}
