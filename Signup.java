import java.awt.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Signup extends JFrame{

    Signup(){

        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        setSize(700,650);
        setLocation(290,12);
        setVisible(true);

        Random no=new Random();
        long random =(Math.abs(no.nextLong() % 9000L) + 1000L);

        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("raleway",Font.BOLD,38));
        formno.setBounds(100,20,600,40);
        add(formno);

        JLabel personalDetails=new JLabel("Page 1. Personal Details");
        personalDetails.setFont(new Font("raleway",Font.BOLD,23));
        personalDetails.setBounds(200,80,600,30);
        add(personalDetails);
    }

    public static void main(String[] args){
        new Signup();

    }
}
