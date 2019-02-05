package edu.kit.informatik.task;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArithmeticParserTest {
    
    private ArithmeticParser arithmeticParser;
    
    private static final String CORRECT_FORMATED_BRACKETS = "()";
    private static final String INCORRECT_FORMATED_BRACKETS = ")";
    private static final String CORRECT_OPERATION = "4+5";
    private static final String INCORRECT_OPERATION = "45454mnf3r2245";
    private static final int EXPECTED_RESULT = 9;

    @BeforeEach
    void setUp() throws Exception {
        arithmeticParser = new ArithmeticParser();
    }


    @Test
    void testCheckBracketsCorrect() {
        arithmeticParser.setString(CORRECT_FORMATED_BRACKETS);
        assertTrue(arithmeticParser.checkBrackets());
    }
    
    @Test
    void testCheckBracketsIncorrect() {
        arithmeticParser.setString(INCORRECT_FORMATED_BRACKETS);
        assertFalse(arithmeticParser.checkBrackets());
    }
    
    @Test
    void testParseArithmeticCorrect() {
        arithmeticParser.setString(CORRECT_OPERATION);
        try {
            assertEquals(EXPECTED_RESULT, arithmeticParser.parseArithmetic());
        } catch (ParseException e) {
            fail("Test failes");
        }
    }
    
    @Test
    void testParseArithmeticIncorrect() {
        arithmeticParser.setString(INCORRECT_OPERATION);
        assertThrows(ParseException.class, () -> {arithmeticParser.parseArithmetic();});
    }

}
