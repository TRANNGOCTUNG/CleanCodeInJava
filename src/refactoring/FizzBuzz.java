package refactoring;

public class FizzBuzz {


    public static String fizzBuzz(int number) {
       boolean isFizz = number % 4 == 2;
       boolean isBuzz = number % 8 == 0;
        if(isFizz && isBuzz){
            return "fizzBuzz";
        }
        if(isBuzz){
            return "isBuzz";
        }
        if(isFizz){
            return "isFizz";
        }
        return number + " ";
    }
    public static boolean sum(int a){
        if(a % 4 == 0){
            return true;
        }
        return false;
    }
}
