package example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SimpleMathTest {
    
    private SimpleMath s;
    
    private static final int testX = 45;
    private static final int testY = 23;

    @BeforeEach
    void setUp() throws Exception {
        s = new SimpleMath(testX, testY);
    }

    @AfterEach
    void tearDown() throws Exception {
        s = null;
    }

    @Test
    void addTest() {
        assertEquals(s.add(), testX + testY);
        assertNotEquals(s.add(), testX - testY);
    }
    
    @Test
    void getTest() {
        assertNotEquals(s.getX(), testX);
    }

}
