package Mobile_Shop;

import javax.swing.*;
import java.awt.*;

public interface Indispensable {

    class MobileShopTest {
        public static void main(String[] args) {
            System.out.println();
            MobileShop xMobile = new MobileShop("SpaceMobile", "Armenia", 10, 17, "077000013", "SpaceMobile.am");
            xMobile.printInfo();


            System.out.println("   -----------------------");
            System.out.println();
            Earphone a1 = new Earphone(13000, "Remax", true, "Headphone", true, "Black");
            a1.printInfo();


            System.out.println("   -----------------------");
            System.out.println();
            Case case1 = new Case(3000, "Samsung", true, "Galaxy S23", "Gray", "Silicone");
            case1.printInfo();

            System.out.println("   -----------------------");
            System.out.println();
            DAS das1 = new DAS(7000, "REMAX", false, "A1", "usb flash drive", 32);
            das1.printInfo();


            System.out.println("   -----------------------");
            System.out.println();
            ScreenProtector protector1 = new ScreenProtector(3000, "REMAX", true, "Galaxy S23", "matte hydrogel film");
            protector1.printInfo();


            System.out.println("   -----------------------");
            System.out.println();
            Costumer costumer1 = new Costumer("SomeName1", "SomeMail13@gmail.com", "0746174145", "Silver");
            costumer1.printInfo();

            System.out.println("   -----------------------");
            System.out.println();
            Costumer costumer2 = new Costumer("SomeName2", "SomeMail@gmail.com", "0746174145", "Silver");
            costumer2.printInfo();
        }

    }

    class MobShop {
        public static void main(String[] args) {
            JButton refresh = new JButton("Mobile Shop");
            refresh.setBounds(45, 15, 300, 70);
            refresh.setBackground(new Color(71, 71, 71));
            refresh.setFont(new Font("Comic Sans", Font.ITALIC, 45));
            refresh.setForeground(Color.white);
            refresh.setBorderPainted(false);
            refresh.setFocusable(false);
            refresh.setVisible(true);



            JPanel panel1 = new JPanel();
            panel1.setBackground(new Color(71, 71, 71));
            panel1.setPreferredSize(new Dimension(1000, 1000));


            JScrollPane scrollPane = new JScrollPane(panel1);

            JFrame frame = new JFrame();
            frame.setTitle("Mobile Shop");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


            frame.setSize(1500, 1500);
            frame.getContentPane().setBackground(new Color(107, 107, 107));
            frame.setVisible(true);

            frame.setVisible(true);
            frame.add(scrollPane, BorderLayout.CENTER);
            frame.add(refresh, BorderLayout.NORTH);



        }
    }

    class Costumer {
        static int id = 0;
        private String userName;
        String mail;
        String phoneNumber;

        String status;
        Product[] wishlist;

        {
            id++;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            if (Character.isUpperCase(userName.charAt(0))) {
                this.userName = userName;
            } else this.userName = null;
        }

        Costumer(String u, String m, String p, String s) {

            userName = u;
            mail = m;

            status = s;
        }

        void printInfo() {
            System.out.println("   ID :" + id);
            System.out.println("   Name :" + getUserName());
            System.out.println("   Gmail :" + mail);
            System.out.println("   Phone number :" + phoneNumber);
            System.out.println("   Status :" + status);
        }
    }
}
