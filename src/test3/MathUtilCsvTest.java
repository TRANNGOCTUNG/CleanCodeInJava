package test3;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilCsvTest {
    MathUtil math = new MathUtil();
    @ParameterizedTest
    @CsvFileSource(files = "D:\\C0223G1\\Java\\CleanCode\\src\\test3\\csv", numLinesToSkip = 1)
    public void test1(int a, int b, int result){
        assertEquals(math.sum(a,b),result);
    }
    @ParameterizedTest
    @CsvFileSource(files = "D:\\C0223G1\\Java\\CleanCode\\src\\test3\\cvs", numLinesToSkip = 1)
    public void test2(int a, int b, int result){
        assertEquals(math.sub(a,b),result);
    }
}