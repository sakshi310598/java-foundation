package Strings;

public class StringDemo {

    static void main() {

        //Immutable string
        String stringLiteral = "Sakshi"; //String Literal
        System.out.println(stringLiteral);
        String stringNew = new String("Sakshi"); //Using new Keyword
        System.out.println(stringNew);

        //Mutable string
        StringBuffer stringBuffer = new StringBuffer("Sakshi");
        System.out.println(stringBuffer);
        stringBuffer.append("s");
        System.out.println(stringBuffer);
        StringBuilder stringBuilder = new StringBuilder("Sakshi");


        xyz();
    }
    public static void xyz(){

         String str = "Hello World";
         System.out.println("Length of String:" + str.length());
    }

}
