package TaskCheckConfig;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AssertDemo {

    @Test
    public void testujDodawanie() {
        assertEquals(4, 2+2);
        System.out.println("Czy to się drukuje");
        assertEquals(0.3, 0.1+0.2, 0.1);
    }

    @Test
    public void testujOdejmowanie() {
        assertTrue(true);
    }
}
