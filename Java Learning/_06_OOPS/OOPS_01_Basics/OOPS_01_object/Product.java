package OOPS_01_Basics.OOPS_01_object;

import java.util.Objects;

public class Product {

    // Instance Variables
    private int productId;
    private String productName;
    private double price;
    private int quantity;

    // Default Constructor
    public Product() {
    }

    // Parameterized Constructor
    public Product(int productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getters
    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setters
    public void setProductId(int productId) {
        this.productId = productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Business Method
    public double calculateTotalValue() {
        return price * quantity;
    }

    // Display Method
    public void displayProduct() {
        System.out.println("Product ID   : " + productId);
        System.out.println("Product Name : " + productName);
        System.out.println("Price        : ₹" + price);
        System.out.println("Quantity     : " + quantity);
        System.out.println("Total Value  : ₹" + calculateTotalValue());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return productId == product.productId && Double.compare(price, product.price) == 0 && quantity == product.quantity && Objects.equals(productName, product.productName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, productName, price, quantity);
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }


    //Main Method
    public static void main(String[] args) throws CloneNotSupportedException {

        //Example for Named Object
        Product product1 = new Product(101, "Laptop", 55000.0, 2);
        Product product3 = new Product();
        product1.displayProduct();

        //Example for Anonymous Object
        new Product(102, "Mobile", 5000.0, 5).displayProduct();

        //Example for Immutable Object
        String firstName = "Sakshi";
        String LastName = " Kumari";
        firstName.concat(LastName);
        System.out.println(firstName);

        //Example for Mutable Object
        StringBuffer stringBuffer = new StringBuffer("Sakshi");
        stringBuffer.append(" Kumari");
        System.out.println(stringBuffer);


        //Example for Singleton Object
        Database database1 = Database.getInstance();
        Database database2 = Database.getInstance();
        System.out.println(database1);
        System.out.println(database2);
        System.out.println(database1 == database2);

        //Example for Wrapper Objects
        Integer integer = Integer.valueOf(100);
        Character character = Character.valueOf('c');
        Double doubles = Double.valueOf(23.67);
        Float floats = Float.valueOf(23.5f);

        //Example for Array Objects
        Product[] products = new Product[2];
        products[0] = new Product(102, "Mobile", 5000.0, 5);
        products[1] = new Product(101, "Laptop", 55000.0, 2);
        System.out.println(products[0].productName);

        // Example for String Object
        String emailId1 = "sakshi@gamil.com";
        String emailId2 = new String("saurabh@gamil.com");



        //Ways to Create Objects
        Product product = new Product(109, "Washing Machine", 21000.0, 1);
        //Product product2 = Product.class.getDeclaredConstructor(Product).newInstance();
        //Product product4 = (Product) product.clone();
        //product4.displayProduct();


        Product p1 = new Product(109, "Washing Machine", 21000.0, 1);
        Product p2 = new Product(109, "Washing Machine", 21000.0, 1);
        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1);


    }
}