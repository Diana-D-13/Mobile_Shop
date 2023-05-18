package Mobile_Shop;

public class Case extends Product {
    String modelName;
    String color;
    String material;

    Case(int p, String b, boolean a, String n, String c, String m) {
        super(p, b, a);
        modelName = n;
        color = c;
        material = m;
    }

    void printInfo() {
        System.out.println("   Model Name :" + modelName);
        System.out.println("   Color :" + color);
        System.out.println("   Material :" + material);
        super.printInfo();

    }
}
