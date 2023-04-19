package Refactore;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    @DisplayName("Testing addition")
    public void testCalculateAdd() {
        int a = 1;
        int b = 1;
        char o = '+';
        int expected = 2;
        int result = Calculator.calculator(a,b,o);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing subtraction")
    public void testCalculateSub(){
        int a = 2;
        int b = 1;
        char o ='-';
        int expected = 1;
        int result = Calculator.calculator(a,b,o);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing multiplication")
    public void testCalculateMul(){
        int a = 2;
        int b = 2;
        char o = '*';
        int expected = 4;
        int result = Calculator.calculator(a,b,o);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing division")
    public void testCalculateDiv(){
        int a = 4;
        int b = 2;
        char o = '/';
        int expected = 2;
        int result = Calculator.calculator(a,b,o);
        assertEquals(expected, result);
    }
    @Test
    @DisplayName("Testing division by zero")
    public void testCalculateDivByZero(){
        int a = 2;
        int b = 0;
        char o = '/';
        assertThrows(RuntimeException.class,()->{Calculator.calculator(a,b,o);});
    }
    @Test
    @DisplayName("Test wrong operator")
    public void testCalculateWrongOperator(){
        int a = 2;
        int b = 0;
        char o = '=';
        assertThrows(RuntimeException.class,() ->{Calculator.calculator(a,b,o);});

    }
}
