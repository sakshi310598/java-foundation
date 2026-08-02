package _02_Basics._05_Operators;

public class Operators {

    public static void main(String[] args){

        System.out.println("01. Unary Operator");
        /*Unary Operator
                1. Unary Plus operator(+)  -->
                2. Unary Minus operator(-) -->
                3. Not operator (!)        -->
                4. Increment operator (++) -->
                5. Decrement operator (--) -->
            */
        int a = 1;
        int b = 2;
        boolean flag = true;
        System.out.println("Unary Plus operator "+ (+a));
        System.out.println("Unary Minus operator "+ (-a));
        System.out.println("Not operator "+ (!flag));
        System.out.println("Increment operator "+ (++a));
        System.out.println("Decrement operator "+ (--b));


        System.out.println("02. Arithmetic operators");
        /*Arithmetic operators
                1. Addition(+) -> Adds two numbers.
                2. Subtraction(-) -> Subtracts one number from another number.
                3. Multiplication(*) -> Multiplies two numbers.
                4. Division(/) -> Divides one number by another number.
                5. Modulus(%) -> Divides and returns the remainder of two numbers.
            */
            int x = 5;
            int y = 8;
            System.out.println("Addition= "+ (x+y));
            System.out.println("Subtraction= "+ (x-y));
            System.out.println("Multiplication= "+ (x*y));
            System.out.println("Division= "+ (x/y));
            System.out.println("Modulus= "+ (x%y));


        System.out.println("03. Relational _02_Basics._05_Operators.Operators");
        /*Relational _02_Basics._05_Operators.Operators
            1. Less Than(<)
            2. Greater Than(>)
            3. Less Than or Equal to(<=)
            4. Greater Than or Equal to(>=)
            5. Equal to(==)
            6. Not Equal to(!=)
            */
            int i =10;
            int j =20;
            System.out.println("Less Than "+(i<j));
            System.out.println("Greater Than "+(i>j));
            System.out.println("Less Than or Equal to "+(i<=j));
            System.out.println("Greater Than or Equal to "+(i>=j));
            System.out.println("Equal to "+(i==j));
            System.out.println("Not Equal to "+(i!=j));


        System.out.println("04. Ternary Operator");
        /*Ternary Operator*/
             /*variable = expression1 : expression2 ? expression3*/
             int m = 10;
             int n =5;
             int min = (m>n) ? n : m;
             System.out.println("Minimum value= "+min);


        System.out.println("05. Assignment Operator");
        /*Assignment Operator
            1. Single Assignment Operator
            2. Compound Assignment Operator
            */
            int p = 10;
                p += 12;
            int q = 2;
                q *= 2;
            System.out.println(p);
            System.out.println(q);



        System.out.println("06. Bitwise _02_Basics._05_Operators.Operators");
        /*Bitwise _02_Basics._05_Operators.Operators
            1. Bitwise OR(|)
            2. Bitwise AND(&)
            3. Bitwise XOR(^)
            4. Bitwise Complement(~)
            */
            int g = 2;
            int h = 3;


        System.out.println("07. Logical _02_Basics._05_Operators.Operators");
        /*Logical _02_Basics._05_Operators.Operators
            1. AND Operator(&&)
            2. OR Operator(||)
            3. Complement Operator(!)
            */


        System.out.println("08. Shift _02_Basics._05_Operators.Operators");
        /*Shift _02_Basics._05_Operators.Operators
        1. Left Shift Operator(Signed <<)
        2. Right Shift Operator(Signed >>)
        3. Unsigned Right Shift Operator(>>>)
        */

    }
}
