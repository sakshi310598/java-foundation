package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

   /*TOPIC 1 : .Introduction
      1.What is an Array?
          An array is a data structure that stores a collection of items of the same data type in a single variable.
          Each item is stored in a specific position called an index, which usually starts at 0.

       2.Why do we need Arrays?
          Arrays are used to store multiple values of the same data type in a single variable,
          making data management easier and more efficient.

       3.Features of Arrays
          Fixed Size – The size of an array is fixed once it is created.
          Same Data Type – An array stores elements of the same data type.
          Indexed – Elements are accessed using an index, starting from 0.
          Contiguous Memory – Elements are stored in continuous memory locations.
          Fast Access – Elements can be accessed quickly using their index.
          Single Variable – Stores multiple values under one variable name.
          Easy Iteration – Arrays can be easily traversed using loops.
          Supports Random Access – Any element can be accessed directly without traversing the array.

       4.Advantages of Arrays
            ✔ Stores multiple values in a single variable.
            ✔ Provides fast access using indexes.
            ✔ Reduces code duplication.
            ✔ Easy to traverse using loops.
            ✔ Efficient memory usage due to contiguous storage.

        5.Disadvantages of Arrays
            ✔ Fixed size (cannot be resized after creation).
            ✔ Stores only the same data type.
            ✔ Insertion and deletion are costly.
            ✔ May waste memory if the array is not fully used.
            ✔ Requires contiguous memory allocation.
    */


    /*TOPIC 2 : Array Declaration
        Syntax:
             dataType[] arrayName;
             dataType arrayName[];
             dataType []arrayName;
             dataType[] arrayName1, arrayName2, arrayName3;
        Rules:
            ✔ An array must have a data type.
            ✔ Array name must follow Java identifier rules.
            ✔ Square brackets [] indicate an array.
            ✔ An array declaration does not allocate memory.
            ✔ Memory is allocated only when using the new keyword.
     */
      public static void arrayDeclaration(){
          int[] array1;
          int []array2;
          int array3[];
          int[] array4, array5, array6;
          System.out.println("Array Declaration");
      }


     /*TOPIC 3 : Array Initialization
           Static Initialization:
                Values are assigned to the array at the time of declaration.
                dataType[] arrayName = {value1, value2, value3};
                int[] numbers = {10, 20, 30, 40, 50};
                String[] names = {"Alice", "Bob", "Charlie"};
           Dynamic Initialization:
                Memory is allocated using the new keyword, and values are assigned later.
                dataType[] arrayName = new dataType[size];
                int[] numbers = new int[5];

      */
     public static void arrayInitialization(){
         int []array ={10,20,30,40,50}; //static
         int[] numbers = new int[5];   //dynamic
         System.out.println(array[4]);
         System.out.println(numbers[4]);
     }

    /* TOPIC 4 : Creating Arrays
       1. Using new Keyword:
           The new keyword is used to create an array object and allocate memory for the specified number of elements.
           dataType[] arrayName = new dataType[size];
           int[] numbers = new int[5];
       2. Memory Allocation:
          When an array is created using the new keyword:
            ✔ Memory is allocated in the Heap Memory.
            ✔ The array reference variable is stored in the Stack Memory (if it's a local variable).
            ✔ All elements are automatically initialized with default values.
        3. JVM Memory Representation

             Stack Memory                 Heap Memory
             numbers  -----------------> [0][0][0][0][0]
                                           ↑
                                          int array (size = 5)
             Explanation:
                ❖numbers is a reference variable stored in the Stack.
                ❖The actual array object is stored in the Heap.
                ❖The reference variable holds the memory address of the array object.
                ❖Each element is initialized with its default value (0 for int arrays).
     */
    public static void creatingArrays(){
        int[] numbers = new int[5];
        System.out.println(numbers[0]);
        System.out.println(numbers[4]);

        String[] names = new String[5];
        System.out.println(names[0]);
        System.out.println(names[4]);
    }

    /*TOPIC 5 : Default Values in Arrays
        ❖When an array is created using the new keyword, Java automatically initializes
          all elements with default values based on their data type.
     */
    public static void defaultValuesArrays(){
        int[] numbers = new int[3];
        System.out.println(numbers[0]); // 0
        double[] prices = new double[3];
        System.out.println(prices[0]); // 0.0
        float[] marks = new float[3];
        System.out.println(marks[0]); // 0.0
        char[] grades = new char[3];
        System.out.println((int) grades[0]); // 0
        boolean[] flags = new boolean[3];
        System.out.println(flags[0]); // false
        String[] names = new String[3];
        System.out.println(names[0]); // null
        Object[] objects = new Object[3];
        System.out.println(objects[0]); // null
    }

    /* TOPIC 6 : Accessing Array Elements
       Accessed array element using their index, which starts from 0.
        1. Index: An index is the position of an element in an array. In Java, array indexing starts from 0.
        2. Reading Values: Use the index to retrieve (read) an element from the array.
        3. Updating Values: Use the index with the assignment operator (=) to change an existing element.
     */
    public static void acccessingArrayElements(){
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Reading");
        System.out.println(numbers[1]); // 20

        System.out.println("Updating");
        numbers[1] = 200;

        System.out.println("Reading updated value");
        System.out.println(numbers[1]); // 200
    }

    /*TOPIC 7 : Traversing Arrays
       Definition: Array Traversing is the process of visiting and accessing each element of an array one by one.
       1.Using for Loop
       2.Using while Loop
       3.Using do-while Loop
       4.Using Enhanced for Loop (for-each)
     */
    public static void traversingArrays(){

        System.out.println("Using for Loop");
        int[] numbers = {10, 20, 30, 40, 50};
        for(int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

        System.out.println("Using while Loop");
        int i=0;
        while (i<numbers.length){
            System.out.println(numbers[i]);
            i++;
        }

        System.out.println("Using do-while Loop");
        int j=0;
        do{
            System.out.println(numbers[j]);
            j++;
        }while (j<numbers.length);

        System.out.println("Using for-each Loop");
        for(int data : numbers){
            System.out.println(data);
        }
    }

    /*TOPIC 8 : Types of Arrays
       Java supports different types of arrays based on their dimensions and structure.
         ❖One-Dimensional(1D) Array
         ❖Two-Dimensional(2D) Array
         ❖Three-Dimensional(3D) Array
         ❖Jagged Array(Multidimentinal)
         ❖Anonymous Array
     */

    /*TOPIC 9 : One-Dimensional(1D) Array
      Definition: One-Dimensional Array stores elements in a single row and is accessed using one index.
      1. Declaration: dataType[] arrayName;
      2. Initialization:
            A. Static Initialization: dataType[] arrayName = {value1, value2, value3};
            B. Dynamic Initialization: dataType[] arrayName = new dataType[size];
      3. Example: Find the Sum of Array Elements
     */
    public static void oneDimensionalArray(){
        System.out.println("declaration Array");
        int[] declarationArray;

        System.out.println("Static Initialization");
        int[] staticInitialization = {10, 20, 30, 40, 50};

        System.out.println("Dynamic Initialization");
        int[] dynamicInitialization = new int[5];

        System.out.println("Example: Find the Sum of Array Elements");
        int[] numbers = {10, 20, 30, 40, 50};
        int sum =0;
        for (int i=0; i<numbers.length;i++){
            sum = sum + numbers[i];
        }
        System.out.println("Total sum: "+sum);

    }

    /*TOPIC 10 : Two-Dimensional(2D) Array
        Definition: Two-Dimensional (2D) Array is an array of arrays that stores data in rows and columns (matrix form).
                    Each element is accessed using two indexes: row and column.
        1. Declaration: dataType[][] arrayName;
        2. Initialization:
            A. Static Initialization: dataType[][] arrayName = {{value1, value2},{value3, value4}};
            B. Dynamic Initialization: dataType[][] arrayName = new dataType[rows][columns];
        3. Example: Calculate the Sum of All Elements
     */
    public static void twoDimensionalArray(){
        System.out.println("declaration Array");
        int[][] declarationArray;

        System.out.println("Static Initialization");
        int[][] staticInitialization = {{1, 2, 3}, {4, 5, 6}};

        System.out.println("Dynamic Initialization");
        int[][] dynamicInitialization = new int[2][3];

        System.out.println("Example: Calculate the Sum of All Elements");
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int matrixSum =0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrixSum += matrix[i][j];
            }
        }
        System.out.println("Matrix Sum: "+matrixSum);
    }


    /*TOPIC 11 : Three-Dimensional(3D) Array
        Definition: Three-Dimensional (3D) Array is an array of two-dimensional arrays that stores data in layers, rows, and columns.
                    Each element is accessed using three indexes: layer, row, and column.
        1. Declaration: dataType[][][] arrayName;
        2. Initialization:
            A. Static Initialization: dataType[][] arrayName = {{{value1, value2},{value3, value4}}, {{value5, value6},{value7, value8}}};
            B. Dynamic Initialization: dataType[][][] arrayName = new dataType[layers][rows][columns];
        3. Example: Calculate the Sum of All Elements
     */
    public static void threeDimensionalArray(){
        System.out.println("declaration Array");
        int[][] declarationArray;

        System.out.println("Static Initialization");
        int[][][] staticInitialization = {{ {1, 2},{3, 4}}, {{5, 6}},{{7, 8}}};

        System.out.println("Dynamic Initialization");
        int[][][] dynamicInitialization = new int[2][3][4];

        System.out.println("Example: Calculate the Sum of All Elements");
        int[][][] cube = {
                {{1, 2},{3, 4}},
                {{5, 6},{7, 8}}
        };

        int cubeSum =0;
        for (int i = 0; i < cube.length; i++) {
            for (int j = 0; j < cube[i].length; j++) {
                for (int k = 0; k < cube[i][j].length; k++) {
                    cubeSum += cube[i][j][k];
                }
            }
        }
        System.out.println("Cube Sum: "+cubeSum);
    }

    /*TOPIC 12 : Jagged Array
        Definition: Jagged Array is a 2D array in which each row can have a different number of columns.
        1. Declaration: dataType[][] arrayName;
        2. Initialization:
            A. Static Initialization: dataType[][] arrayName = dataType[][] arrayName = {{value1, value2},{value3, value4, value5},{value6}};
            B. Dynamic Initialization: dataType[][] arrayName = new dataType[rows][];
        3. Example: Calculate the Sum of All Elements
     */

    public static void jaggedArray(){
        System.out.println("declaration Array");
        int[][] declarationArray;

        System.out.println("Static Initialization");
        int[][] staticInitialization = {{1, 2},{3, 4, 5},{6}};

        System.out.println("Dynamic Initialization");
        int[][] dynamicInitialization = new int[2][];

        System.out.println("Example: Calculate the Sum of All Elements");
        int[][] jagged = {
                {10, 20},
                {30, 40, 50},
                {60}
        };

        int sum = 0;
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                sum += jagged[i][j];
            }
        }
        System.out.println("Sum = " + sum);
    }

     /*TOPIC 13 : Anonymous Array
        Definition: Anonymous Array is an array created without assigning it to a reference variable and mainly for one-time use.
        General Syntax: new dataType[]{value1, value2, value3};
        Advantages:
            ✔ No need to create a separate reference variable.
            ✔ Saves memory for one-time use.
            ✔ Makes method calls shorter and cleaner.
            ✔ Useful for passing temporary data to methods.
        Disadvantages:
            ✔ Cannot be reused because no reference variable exists.
            ✔ Not suitable when the same array is needed multiple times.
            ✔ Can reduce readability if too many values are passed.
     */
     public static void anonymousArray(int[] array){
         for (int num : array) {
             System.out.println(num);
         }
     }

     /*TOPIC 14: Array Class (java.util.Arrays)
       Definition: The java.util.Arrays class is a utility class that provides built-in methods
                   to perform common operations on arrays, such as sorting, searching, comparing,
                   filling, copying, and converting arrays to strings.
                   Note: The Arrays class belongs to the java.util package, so it must be imported before use.
       Important Array Methods:
                    ✔ sort(): Sorts the elements of an array in ascending order.
                    ✔ binarySearch(): Searches a sorted array for a specified element and returns its index.
                    ✔ equals(): Compares two arrays and returns true if they contain the same elements in the same order.
                    ✔ fill(): Fills all elements of an array with the specified value.
                    ✔ copyOf(): Creates a new array by copying elements from an existing array.
                    ✔ copyOfRange(): Copies a specified range of elements into a new array.
                    ✔ toString(): Returns a readable string representation of a one-dimensional array.
                    ✔ deepToString(): Returns a readable string representation of a multidimensional array.
      */
      public static void ArrayClassMethods(){
          int[] numbers = {10, 30, 20, 50, 40};
          Arrays.sort(numbers);
          System.out.println(Arrays.toString(numbers));

          System.out.println("Note: The array must be sorted before using binarySearch() method");
          int index = Arrays.binarySearch(numbers, 30);
          System.out.println(index);

          int[] array1 = {10, 20, 30};
          int[] array2 = {10, 20, 30};
          System.out.println(Arrays.equals(array1, array2));

          int[] number = new int[5];
          System.out.println(Arrays.toString(numbers));
          Arrays.fill(number, 100);
          System.out.println(Arrays.toString(numbers));

          int[] copy = Arrays.copyOf(numbers, 5);
          System.out.println(Arrays.toString(copy));

          int[] copys = Arrays.copyOfRange(numbers, 1, 4);
          System.out.println(Arrays.toString(copys));

          int[][] matrix = {
                  {1, 2},
                  {3, 4}
          };
          System.out.println(Arrays.deepToString(matrix));

      }

      /* TOPIC 15 : Copying Arrays
         Definition: Array Copying is the process of creating a new array and copying elements from an existing array.
         Different ways to copy:
            1. Manual Copy: Elements are copied one by one using a loop.
            2. clone(): Creates a shallow copy of the array.
            3. System.arraycopy(): Copies elements from one array to another efficiently.
            4. Arrays.copyOf(): Copies an array into a new array of the specified length.
       */
      public static void copyingArrays(){

          System.out.println("Manual Copy");
          int[] source = {10, 20, 30, 40, 50};
          int[] destination = new int[source.length];
          for (int i = 0; i < source.length; i++) {
              destination[i] = source[i];
          }

          System.out.println("Using Clone Method");
          int[] copy = source.clone();
          System.out.println(copy[2]);

          System.out.println("Using arraycopy Method");
          int[] source1 = {10, 20, 30, 40, 50};
          int[] destination1 = new int[5];
          System.arraycopy(source1, 0, destination1, 0, source.length);
          System.out.println(Arrays.toString(destination1));

          System.out.println("Using copyOf Method");
          int[] source2 = {10, 20, 30};
          int[] copy2 = Arrays.copyOf(source2, 5);
          System.out.println(Arrays.toString(copy2));
      }

      /* TOPIC 16 : Array Operations
            ✔ Insert
            ✔ Delete
            ✔ Update
            ✔ Search
            ✔ Reverse
            ✔ Rotate
            ✔ Merge
            ✔ Split
       */

       /* TOPIC 17 : Common Array Programs
            ✔ Largest Number
            ✔ Smallest Number
            ✔ Second Largest
            ✔ Second Smallest
            ✔ Sum
            ✔ Average
            ✔ Even/Odd
            ✔ Prime Numbers
            ✔ Duplicate Elements
            ✔ Remove Duplicates
            ✔ Frequency Count
            ✔ Reverse Array
            ✔ Palindrome
            ✔ Sorting
            ✔ Linear Search
            ✔ Binary Search
        */

    /*TOPIC 18 : User Input Programs
      Write a Java program to accept the size of an array and its elements from the user, then display all the elements.
     */
     public static void userInputPrograms(){

         System.out.println("Used to take input from the user through the keyboard.");
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter array size");
         int size = sc.nextInt();

         System.out.println("Create an array");
         int[] numbers = new int[size];

         System.out.println("Enter array element");
         for (int i = 0; i < numbers.length; i++) {
             numbers[i] = sc.nextInt();
         }
         System.out.println("Print array element");
         for (int i = 0; i < numbers.length; i++) {
             System.out.print(numbers[i] + " ");
         }

         sc.close();
    }



    public static void main() {
//        arrayDeclaration();
//        arrayInitialization();
//        creatingArrays();
//        defaultValuesArrays();
//        acccessingArrayElements();
//        traversingArrays();
//        oneDimensionalArray();
//        twoDimensionalArray();
//        threeDimensionalArray();
//        jaggedArray();
//        anonymousArray(new int[]{10, 20, 30, 40, 50});
//        ArrayClassMethods();
//        copyingArrays();
//        userInputPrograms();

    }

}
