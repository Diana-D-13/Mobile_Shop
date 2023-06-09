package Mobile_Shop;

import javax.swing.*;
import java.awt.*;

public class UI {
    public static void main(String[] args) {
        JButton refresh = new JButton("Mobile Shop");
        refresh.setBounds(150, 15, 400, 70);
        refresh.setBackground(new Color(62,64,64,174));
        refresh.setFont(new Font("Comic Sans", Font.ITALIC, 45));
        refresh.setForeground(Color.lightGray);
        refresh.setBorderPainted(false);
        refresh.setFocusable(false);
        refresh.setVisible(true);


        JButton singIn = new JButton(" Sing in");
        singIn.setBounds(1700, 15, 100, 50);
        singIn.setBackground(new Color(62,64,64,174));
        ImageIcon singInLogo = new ImageIcon("Logo.png");
        singIn.setVisible(true);
        singIn.setFont(new Font("Comic Sans", Font.ITALIC, 15));
        singIn.setForeground(Color.lightGray);
        singIn.setBorderPainted(false);
        singIn.setFocusable(false);
        singIn.setVisible(true);


        ImageIcon logo=new ImageIcon("Logo.png");
        JButton mode=new JButton("Light mode");;
        mode.setBounds(1800,15,100,50);
        mode.setBackground(new Color(65,65,65));

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        JLabel logoLabel=new JLabel();
        logoLabel.setIcon(logo);
        logoLabel.setBounds(15, 15, 100, 100);
        logoLabel.setVisible(true);

        JPanel panelTop = new JPanel();
        panelTop.setBackground(new Color(62,64,64,174));
        panelTop.setBounds(0, 0, 2000, 100);
        panelTop.add(logoLabel);


        JPanel panelBottom = new JPanel();
        panelBottom.setBackground(new Color(62,64,64,174));
        panelBottom.setBounds(0, 900, 2000, 100);

        JPanel panelSlide = new JPanel();
        panelSlide.setBounds(0, 150, dimension.width, 350);
        panelSlide.setBackground(new Color(62,64,64,174));



        JPanel categories1=new JPanel();
        categories1.setBounds(90,550,dimension.width/6,250);
        categories1.setBackground(new Color(62,64,64,174));

        JPanel categories2=new JPanel();
        categories2.setBounds(categories1.getX()+140+dimension.width/6,550,dimension.width/6,250);
        categories2.setBackground(new Color(62,64,64,174));

        JPanel categories3=new JPanel();
        categories3.setBounds(categories2.getX()+140+dimension.width/6,550,dimension.width/6,250);
        categories3.setBackground(new Color(62,64,64,174));

        JPanel categories4=new JPanel();
        categories4.setBounds(categories3.getX()+140+dimension.width/6,550,dimension.width/6,250);

        categories4.setBackground(new Color(62,64,64,174));

        JPanel categories5=new JPanel();
        categories5.setBounds(90,800,dimension.width/6,250);
        categories5.setBackground(new Color(62,64,64,174));

        JPanel categories6=new JPanel();
        categories6.setBounds(90,800,dimension.width/6,250);
        categories6.setBackground(new Color(62,64,64,174));







        JFrame frame = new JFrame("Mobile Shop");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(dimension.width,3000);
        frame.getContentPane().setBackground(new Color(39,39,40));

        frame.setIconImage(singInLogo.getImage());
        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(UI.class.getResource("Logo.png")));
        JScrollPane scrollableTextArea = new JScrollPane();
        scrollableTextArea.setBounds(dimension.width,150,15,300);

        JTextField searchField = new JTextField("search");
        searchField.setBounds(600, 30, 300, 30);
        frame.add(searchField);
        frame.add(logoLabel);
        frame.add(singIn);
        frame.add(refresh);
        frame.add(panelTop);
        frame.add(panelSlide);
        frame.add(panelBottom);
        frame.add(categories1);
        frame.add(categories2);
        frame.add(categories3);
        frame.add(categories4);
        frame.add(scrollableTextArea);
//        frame.add(categories5);
//        frame.add(categories6);
        frame.add(mode);

        frame.setVisible(true);
        frame.update(frame.getGraphics());
    }
}




