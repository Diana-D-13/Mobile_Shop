package Mobile_Shop;

public class ScreenProtector extends Product {
    String modelName;
    String material;

    ScreenProtector(int p, String b, boolean a, String model, String mat) {
        super(p, b, a);
        modelName = model;
        material = mat;

    }

    void printInfo() {
        System.out.println("   Model Name :" + modelName);
        System.out.println("   Material :" + material);
        super.printInfo();

    }
}
