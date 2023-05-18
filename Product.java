package Mobile_Shop;

public class Product {

    int price;

    String brand;
    boolean is_available;
private int quantity;

    Product(int p, String b, boolean a) {
        price = p;
        brand = b;
        is_available = a;
    }


    void printInfo() {
        System.out.println("   Price :" + price + "AMD");
        System.out.println("   Brand :" + brand);
        if (is_available) {
            System.out.println("   At this moment is available ");
        } else {
            System.out.println("   At this moment isn't available ");
        }
    }


}
