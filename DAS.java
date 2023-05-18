package Mobile_Shop;

public class DAS extends Product {   //direct-attached storage (DAS)
    String type;
    String model;
    int storageGB;

    DAS(int p, String b, boolean a, String m, String t, int s) {
        super(p, b, a);
        model = m;
        type = t;
        storageGB = s;
    }

    void printInfo() {
        System.out.println("   DAS :" + type);
        System.out.println("   Storage :" + storageGB + "GB");
        super.printInfo();


    }
}
