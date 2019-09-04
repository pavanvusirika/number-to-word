
import com.test.numbertoword.NumberToWord;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 *
 * @author pavanj
 */
public class NumberToWordTest {

    @Test
    public void testZero() {
        assertEquals(new NumberToWord().doWordConversion(0), "It's zero or -ve Number, Please enter a Valid number");
    }

    @Test
    public void testNegative() {
        assertEquals(new NumberToWord().doWordConversion(-1), "It's zero or -ve Number, Please enter a Valid number");
    }
    
    
    @Test
    public void testNumber() {
        assertEquals(new NumberToWord().doWordConversion(56945781).toLowerCase(), 
                "fifty six million nine hundred and forty five thousand seven hundred and eighty one");
                 
    }

}
