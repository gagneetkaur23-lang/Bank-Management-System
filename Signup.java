import java.awt.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;

public class Signup extends JFrame{

    Signup(){

        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(280,10);
        setVisible(true);

        Random no=new Random();
        long random =(Math.abs(no.nextLong() % 9000L) + 1000L);

        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("raleway",Font.BOLD,38));
        formno.setBounds(130,20,600,40);
        add(formno);

        JLabel personalDetails=new JLabel("Page 1. Personal Details");
        personalDetails.setFont(new Font("raleway",Font.BOLD,23));
        personalDetails.setBounds(290,80,600,30);
        add(personalDetails);

        JLabel name =new JLabel("Name:");
        name.setFont(new Font("raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);

JTextField nameTextField=new JTextField();
nameTextField.setFont(new Font("raleway",Font.BOLD,14));
nameTextField.setBounds(300,139,300,30);
add(nameTextField);

         JLabel f_name =new JLabel("Father's Name:");
        f_name.setFont(new Font("raleway",Font.BOLD,20));
        f_name.setBounds(100,185,200,30);
        add(f_name);

        JTextField f_nameTextField=new JTextField();
f_nameTextField.setFont(new Font("raleway",Font.BOLD,14));
f_nameTextField.setBounds(300,185,300,30);
add(f_nameTextField);

         JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("raleway",Font.BOLD,20));
        dob.setBounds(100,227,200,30);
        add(dob);

        JDateChooser datechooser = new JDateChooser();
        datechooser.setFont(new Font("raleway",Font.BOLD,14));
        datechooser.setBounds(300,230,300,30);
        add(datechooser);
        revalidate();
        repaint();
        

         JLabel gender =new JLabel("Gender");
        gender.setFont(new Font("raleway",Font.BOLD,20));
        gender.setBounds(100,269,600,30);
        add(gender);

        JLabel email =new JLabel("Email Address:");
        email.setFont(new Font("raleway",Font.BOLD,20));
        email.setBounds(100,310,600,30);
        add(email);

        JTextField emailTextField=new JTextField();
emailTextField.setFont(new Font("raleway",Font.BOLD,14));
emailTextField.setBounds(300,312,300,30);
add(emailTextField);

        JLabel marital_status=new JLabel("Marital Status:");
         marital_status.setFont(new Font("raleway",Font.BOLD,20));
         marital_status.setBounds(100,352,600,30);
        add( marital_status);

        JLabel address =new JLabel("Address:");
        address.setFont(new Font("raleway",Font.BOLD,20));
        address.setBounds(100,396,600,30);
        add(address);

        JTextField addressTextField=new JTextField();
addressTextField.setFont(new Font("raleway",Font.BOLD,14));
addressTextField.setBounds(300,400,300,30);
add(addressTextField);

        JLabel city =new JLabel("City:");
        city.setFont(new Font("raleway",Font.BOLD,20));
        city.setBounds(100,440,600,30);
        add(city);

        JTextField cityTextField=new JTextField();
        cityTextField.setFont(new Font("raleway",Font.BOLD,14));
        cityTextField.setBounds(300,440,300,30);
        add(cityTextField);

        JLabel pincode =new JLabel("Pin Code:");
        pincode.setFont(new Font("raleway",Font.BOLD,20));
        pincode.setBounds(100,480,600,30);
        add(pincode);

        JTextField pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,480,300,30);
        add(pincodeTextField);

        JLabel state =new JLabel("State:");
        state.setFont(new Font("raleway",Font.BOLD,20));
        state.setBounds(100,520,600,30);
        add(state);

        JTextField stateTextField=new JTextField();
        stateTextField.setFont(new Font("raleway",Font.BOLD,14));
        stateTextField.setBounds(300,530,300,30);
        add(stateTextField);

        
    }

    public static void main(String[] args){
        new Signup();

    }
}
