package Mobile_Shop;

public class MobileShop {
    String name;
    String address;
    int openingTime;
    int closingTime;
    String phoneNumber;
    String website;

    MobileShop(String n, String a, int o, int c, String p, String w) {
        name = n;
        address = a;
        openingTime = o;
        closingTime = c;
        phoneNumber = p;
        website = w;
    }

    public void printInfo() {
        System.out.println("   This MobileShop: " + name);
        System.out.println("   MobileShop's address: " + address);
        System.out.println("   Open from " + openingTime + ":00 to " + closingTime + ":00");
        System.out.println("   Fore more information call " + phoneNumber + " or visit to " + website);

    }

}
