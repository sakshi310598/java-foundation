package Exception;

public class Exceptions {

    public static void main() {
        WithoutExceptionHandeling();
        ExceptionHandeling();
    }

    public static void WithoutExceptionHandeling() {
        System.out.println("Program Started");
        int result = 10 / 0;
        System.out.println(result);
        System.out.println("Program Ended");
    }

    public static void ExceptionHandeling() {
        System.out.println("Program Started");
        try {
            int result = 10 / 0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero.");
        }
        System.out.println("Program Ended");
    }
}
