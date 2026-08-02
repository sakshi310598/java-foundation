package _02_Basics._02_Data_Types;

class primitive_data_types {

    public static void main(String[] args){

    // Data type --> Primitive Data Types --> Non-numeric data type
        boolean flag = true;
        System.out.println("boolean data type "+ flag);

        char c = 'a';
        System.out.println("byte data type "+c);

    // Data type --> Primitive Data Types --> Numeric data type --> Integer
       byte b =10;
        System.out.println("byte data type "+b); //values from -128 to 127. Its default value is 0.

        short s = 10000;
        System.out.println("short data type "+s); //values from -32,768 to 32,767. Its default value is 0.

        int i = 54;
        System.out.println("Int data type "+i); //values from  -2,147,483,648 to 2,147,483,647. Its default value is 0.

       long num = 15000000000L;
        System.out.println("long data type "+num); //values from  - 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807. Its default value is 0.0L or 0.0l..



    // Data type --> Primitive Data Types --> Numeric data type --> Floating number
        float f = 10.78F;
        System.out.println("float data type "+f); // Its default value is 0.0f or 0.0F.

        double d = 10.78;
        System.out.println("float data type "+f); // Its default value is 0.0.

    // Data type --> Non-Primitive Data Types --> Class
      /*
      * Classes
      * String
      * Arrays
      * Objects
      * Interface
      * */

    // Data type --> Non-Primitive Data Types --> Array
        /*
          1.Array is non-primitive data type
          2.Array is an homogenious data type (Same values contains)
         */
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] intArray = new int[5];
        System.out.println("get arrays value "+arr[2]);
        for(int j=0; j<arr.length;j++){
            System.out.println("Index at["+j+"] "+arr[j]);
        }
        System.out.println("printing array "+arr);

    // Data type --> Non-Primitive Data Types --> String
        String name1 = "Sakshi"; // String litral
        String name2 = new String("Sakshi"); // Using string class
        StringBuffer name3 = new StringBuffer("Sakshi"); //
        StringBuilder name4= new StringBuilder("Sakshi"); //
        System.out.println("printing name "+name1);

    // Data type --> Non-Primitive Data Types --> Object
        Address address = new Address();
        System.out.println("pin code "+address.pinCode);
        System.out.println("printing address "+address);

    // Data type --> Non-Primitive Data Types --> Enum
        enum Days {
            MONDAY,
            TUESDAY,
            WEDNESDAY,
            THURSDAY,
            FRIDAY,
            SATURDAY,
            SUNDAY
        }
        System.out.println(Days.THURSDAY);

    // Data type --> Non-Primitive Data Types --> Interfaces
    }
}

class Address {

    // Instance variables
    String houseNo;
    String street;
    String city;
    String state;
    String country;
    int pinCode;
}

interface Employee{

}

