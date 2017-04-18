import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by Ramon on 4/18/17.
 */
public class CalculatorTest {
    @Test
    public void testAdd(){
        Calculator calc = new Calculator();

        int res = calc.add(7, 8);

        assertTrue(res == 15);
    }
}
