package Mobile_Shop;

public class Earphone extends Product {
    private String type;
    Boolean wireless;
    private String color;

    Earphone(int p, String b, boolean a, String t, Boolean w, String c) {
        super(p, b, a);
        type = t;
        wireless = w;
        color = c;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type == "Headphone" || type == "Earphone") {
            this.type = type;
        }
        this.color = null;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == "BLack" || color == "Blue" || color == "Red" || color == "White" || color == "Grey" || color == "Green") {
            this.color = color;
        }
    }

    void printInfo() {
        System.out.println("   Earphone type:" + type);
        if (wireless) {
            System.out.println("   Type : Wireless");
        } else System.out.println("   Type : Wired");
        System.out.println("   Color :" + getColor());
        super.printInfo();
    }
}


