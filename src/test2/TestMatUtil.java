package test2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class TestMatUtil {
    MathUil mathUil = new MathUil();
    @Test
    @DisplayName("Test1:")
    void test1(){
        assertEquals(mathUil.sum(1,1),2);
    }
    @Test
    @DisplayName("Test2:")
    void test2(){
        assertEquals(mathUil.sum(2,2),4);
    }
}
