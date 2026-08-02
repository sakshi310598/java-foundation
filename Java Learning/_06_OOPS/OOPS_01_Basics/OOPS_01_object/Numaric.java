package OOPS_01_Basics.OOPS_01_object;

public class Numaric {

    public static void main(String[] args) {

        try {
            int a = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
