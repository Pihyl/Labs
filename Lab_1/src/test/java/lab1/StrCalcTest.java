package lab1;

import static org.junit.jupiter.api.Assertions.*;
import StrCal.StringCalculator;
import org.junit.jupiter.api.Test;

public class StrCalcTest {
    private StringCalculator calculator = new StringCalculator();

    @Test
    void sum() {
        assertEquals(0, calculator.add(""));

        assertEquals(1, calculator.add("1"));

        assertEquals(3, calculator.add("1,2"));

    }
}
