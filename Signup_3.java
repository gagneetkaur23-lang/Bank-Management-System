import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

//import javax.swing.JOptionPane;
import java.awt.*;
//import java.util.*;

public class Signup_3 extends JFrame {
     JRadioButton saving_a,fixedDeposit_a,current_a,recurring_a;
    Signup_3(){

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
setLayout(null);


        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(280,10);
        setVisible(true);

JLabel acc_details= new JLabel("Page 3: Account Details");
 acc_details.setFont(new Font("raleway",Font.BOLD,23));
        acc_details.setBounds(290,65,600,30);
        add(acc_details);
        setVisible(true);

        JLabel acc_type= new JLabel("Account Type:");
 acc_type.setFont(new Font("raleway",Font.BOLD,20));
        acc_type.setBounds(100,120,600,40);
        add(acc_type);
       // setVisible(true);

        saving_a = new JRadioButton("Saving Account");
        saving_a.setBounds(100,165,230,30);
        saving_a.setBackground(Color.WHITE);
        add(saving_a);
       // setVisible(true);

        fixedDeposit_a = new JRadioButton("Fixed Deposit Account");
        fixedDeposit_a.setBounds(300,165,350,30);
        fixedDeposit_a.setBackground(Color.WHITE);
        add(fixedDeposit_a);
       // setVisible(true);

        current_a = new JRadioButton("Current Account");
        current_a.setBounds(100,200,260,30);
        current_a.setBackground(Color.WHITE);
        add(current_a);
       // setVisible(true);

        recurring_a = new JRadioButton("Recurring Deposit Account");
        recurring_a.setBounds(300,200,400,30);
        recurring_a.setBackground(Color.WHITE);
        add(recurring_a);
        setVisible(true);

         JLabel card_no= new JLabel("Card Number:");
 card_no.setFont(new Font("raleway",Font.BOLD,20));
        card_no.setBounds(100,260,600,40);
        add(card_no);

        JLabel card_digits= new JLabel("(Your 16-digit Card Number)");
 card_digits.setFont(new Font("raleway",Font.BOLD,12));
        card_digits.setBounds(100,287,600,40);
        add(card_digits);

         JLabel pin= new JLabel("PIN:");
 pin.setFont(new Font("raleway",Font.BOLD,20));
        pin.setBounds(100,340,600,40);
        add(pin);

        JLabel pin_digits= new JLabel("(4-digit password)");
 pin_digits.setFont(new Font("raleway",Font.BOLD,12));
        pin_digits.setBounds(100,365,600,40);
        add(pin_digits);

         JLabel services= new JLabel("Services Required:");
 services.setFont(new Font("raleway",Font.BOLD,20));
        services.setBounds(100,415,600,40);
        add(services);
    }

    public static void main(String[] args) {
        new Signup_3();
    }
}

