package Mobile_Shop;

public class Mobile_Phone extends Product {
    static final int warranty_year = 1;

    String model_name;
    String color;
    int front_camera;
    int main_camera;

    int storage;
    String operation_system;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == "BLack" || color == "Blue" || color == "Red" || color == "White" || color == "Gold" || color == "RoseGold" || color == "Space-Gray") {
            this.color = color;
        }
        this.color = null;
    }


    Mobile_Phone(int p, String b, boolean a, String n, String c, int f, int main, int s, String op) {
        super(p, b, a);
        model_name = n;
        color = c;
        front_camera = f;
        main_camera = main;
        storage = s;
        operation_system = op;


    }

    void printInfo() {

        System.out.println("   Model_name  :" + model_name);
        System.out.println("   Color :" + color);
        System.out.println("   Front_camera :" + front_camera + "MP");
        System.out.println("   Main_camera :" + main_camera + "MP");
        System.out.println("   Storage :" + storage + "GB");
        System.out.println("   Operation_system  :" + operation_system);

        super.printInfo();

    }


}
