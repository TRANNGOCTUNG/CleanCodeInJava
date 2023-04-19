package Calclator;

public class Calculators {
    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPLICATION = '*';
    public static final char DIVISION = '/';

    public static int calculator(int first, int second, char character) {
        switch (character) {
            case ADDITION :
                return (first + second);
            case SUBTRACTION :
                return (first - second);

            case MULTIPLICATION :
                return (first * second);
            case DIVISION :
                if (first != 0)
                    return (first / second);
                else
                    throw new RuntimeException("Can not divide by 0:");
            default : throw new RuntimeException("Can not divide by 0:");
        }
    }
}
