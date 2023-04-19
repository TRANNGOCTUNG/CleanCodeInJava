package Calclator;

import Refactore.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class CalculatorTest {
    @Test
    @DisplayName("Test addition:")
    public void testAdd() {
        int a = 5;
        int b = 10;
        char o = '+';
        int expected = 15;
        int result = Calculators.calculator(a, b, o);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test subtraction:")
    public void testSubtract() {
        int a = 5;
        int b = 2;
        char o = '-';
        int expected = 3;
        int result = Calculators.calculator(a, b, o);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Test multiplication:")
    public void testMultiply() {
        int a = 4;
        int b = 2;
        char o = '*';
        int expected = 8;
        int result = Calculators.calculator(a, b, o);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test Division")
    public void testDivision() {
        int a = 4;
        int b = 2;
        char o = '/';
        int expected = 2;
        int result = Calculators.calculator(a, b, o);
        assertEquals(result, expected);

    }
    @Test
    @DisplayName("Test vision by zero")
    public void testVision() {
        int a = 2;
        int b = 0;
        char o = '/';
        assertThrows(RuntimeException.class,() ->{Calculators.calculator(a,b,o);});
    }
    @Test
    @DisplayName("Test wrong")
    public void testWrong(){
        int a = 2;
        int b = 0;
        char o ='=';
        assertThrows(RuntimeException.class,() ->{Calculators.calculator(a,b,o);});
    }
}
