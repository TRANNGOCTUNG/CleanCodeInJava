package refactoring;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class TestFizzBuzz {
//    @ParameterizedTest
//    @CsvFileSource(files = "src/refactoring/cvs", numLinesToSkip = 1)
//    public void testFizzBuzz(int a,int result){
//        FizzBuzz f = new FizzBuzz();
//        assertEquals(f.fizzBuzz(a),result);
//    }
    @Test
    public void testFizz(){
        int number = 8;
        int expected = 0;
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected, result);
    }
    @Test
    public void testFizzBuzz(){
        int a = 4;
        assertThrows(RuntimeException.class,()->{FizzBuzz.sum(a);});
    }
}
