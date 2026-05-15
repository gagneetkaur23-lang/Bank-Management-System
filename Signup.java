import java.awt.*;
import java.util.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;


public class Signup extends JFrame implements ActionListener{
String random;
String formno;
JTextField nameTextField,f_nameTextField,emailTextField,genderTextField,marital_statusTextField,addressTextField,cityTextField,stateTextField,pincodeTextField;
JButton next;
JRadioButton male,female,married,unmarried,other;
JDateChooser datechooser;

    Signup(){

        setLayout(null);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(250,10);
        setVisible(true);

        Random ran=new Random();
         random =""+(Math.abs(ran.nextLong() % 9000L) + 1000L);


        //  long first4 = (no.nextLong() % 9000L) + 1000L;  
          //    first = "" + Math.abs(first4); 


        JLabel formno=new JLabel("APPLICATION FORM NO."+random);
        formno.setFont(new Font("raleway",Font.BOLD,38));
        formno.setBounds(130,20,600,40);
        add(formno);
        setVisible(true);

        JLabel personalDetails=new JLabel("Page 1. Personal Details");
        personalDetails.setFont(new Font("raleway",Font.BOLD,23));
        personalDetails.setBounds(290,80,600,30);
        add(personalDetails);
        setVisible(true);

        JLabel name =new JLabel("Name:");
        name.setFont(new Font("raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        setVisible(true);

 nameTextField=new JTextField();
nameTextField.setFont(new Font("raleway",Font.BOLD,14));
nameTextField.setBounds(300,139,300,30);
add(nameTextField);
setVisible(true);

         JLabel f_name =new JLabel("Father's Name:");
        f_name.setFont(new Font("raleway",Font.BOLD,20));
        f_name.setBounds(100,185,200,30);
        add(f_name);
        setVisible(true);

  f_nameTextField=new JTextField();
f_nameTextField.setFont(new Font("raleway",Font.BOLD,14));
f_nameTextField.setBounds(300,185,300,30);
add(f_nameTextField);
setVisible(true);

         JLabel dob=new JLabel("Date of Birth:");
        dob.setFont(new Font("raleway",Font.BOLD,20));
        dob.setBounds(100,227,200,30);
        add(dob);
        setVisible(true);

         datechooser = new JDateChooser();
        datechooser.setFont(new Font("raleway",Font.BOLD,14));
        datechooser.setBounds(300,230,300,30);
        add(datechooser);
        revalidate();
        repaint();
        setVisible(true);
        

        JLabel gender =new JLabel("Gender");
        gender.setFont(new Font("raleway",Font.BOLD,20));
        gender.setBounds(100,269,600,30);
        add(gender);
        setVisible(true);

         male = new JRadioButton("Male");
        male.setBounds(300,270,60,30);
        male.setBackground(Color.WHITE);
        add(male);
        setVisible(true);

         female = new JRadioButton("Female");
        female.setBounds(390,270,80,30);
        female.setBackground(Color.WHITE);
        add(female);
        setVisible(true);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
         genderGroup.add(female);
         setVisible(true);

        JLabel email =new JLabel("Email Address:");
        email.setFont(new Font("raleway",Font.BOLD,20));
        email.setBounds(100,310,600,30);
        add(email);
        setVisible(true);

         emailTextField=new JTextField();
emailTextField.setFont(new Font("raleway",Font.BOLD,14));
emailTextField.setBounds(300,312,300,30);
add(emailTextField);
setVisible(true);

        JLabel marital_status=new JLabel("Marital Status:");
         marital_status.setFont(new Font("raleway",Font.BOLD,20));
         marital_status.setBounds(100,352,600,30);
        add( marital_status);
        setVisible(true);

         married = new JRadioButton("Married");
        married.setBounds(300,350,80,30);
        married.setBackground(Color.WHITE);
        add(married);
        setVisible(true);

 unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(390,350,110,30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);
        setVisible(true);

         other= new JRadioButton("Other");
        other.setBounds(500,350,60,30);
        other.setBackground(Color.WHITE);
        add(other);
        setVisible(true);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
        setVisible(true);

        JLabel address =new JLabel("Address:");
        address.setFont(new Font("raleway",Font.BOLD,20));
        address.setBounds(100,396,600,30);
        add(address);
        setVisible(true);

         addressTextField=new JTextField();
addressTextField.setFont(new Font("raleway",Font.BOLD,14));
addressTextField.setBounds(300,400,300,30);
add(addressTextField);
setVisible(true);

        JLabel city =new JLabel("City:");
        city.setFont(new Font("raleway",Font.BOLD,20));
        city.setBounds(100,440,600,30);
        add(city);
        setVisible(true);

         cityTextField=new JTextField();
        cityTextField.setFont(new Font("raleway",Font.BOLD,14));
        cityTextField.setBounds(300,440,300,30);
        add(cityTextField);
        setVisible(true);

        JLabel pincode =new JLabel("Pin Code:");
        pincode.setFont(new Font("raleway",Font.BOLD,20));
        pincode.setBounds(100,480,600,30);
        add(pincode);
        setVisible(true);

         pincodeTextField=new JTextField();
        pincodeTextField.setFont(new Font("raleway",Font.BOLD,14));
        pincodeTextField.setBounds(300,480,300,30);
        add(pincodeTextField);
        setVisible(true);

        JLabel state =new JLabel("State:");
        state.setFont(new Font("raleway",Font.BOLD,20));
        state.setBounds(100,520,600,30);
        add(state);
        setVisible(true);

         stateTextField=new JTextField();
        stateTextField.setFont(new Font("raleway",Font.BOLD,14));
        stateTextField.setBounds(300,530,300,30);
        add(stateTextField);
        setVisible(true);

         next = new JButton("Next");
        next.setBounds(530,590,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        setVisible(true);

        
        revalidate();
        repaint();
        setVisible(true);
        
    }
    @Override
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==next){
    String formno=""+ random;
    String name= nameTextField.getText();
    String f_name=f_nameTextField.getText();
   String dob=((JTextField) datechooser.getDateEditor().getUiComponent()).getText();
   String gender = null;
   if (male.isSelected()){
    gender = "male";
   }
   else if (female.isSelected()){
gender = "female";
   }

String email= emailTextField.getText();
String marital_status= null;
if(married.isSelected()){
    marital_status= "married";
    }
    else if (unmarried.isSelected()){
        marital_status="unmarried";
    }
    else if (other.isSelected()){
        marital_status="other";
    }
    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String pincode= pincodeTextField.getText();
    String state= stateTextField.getText();

    try{
if (name.equals("")){
JOptionPane.showMessageDialog(null,"Add all details");
}
    
else{
    connection c = new connection();
    
    String query = "insert into signup values('"+formno+"','"+name+"','"+f_name+"','"+dob+"','"+gender+"','"+email+"','"+marital_status+"','"+address+"','"+state+"','"+pincode+"','"+city+"')";
    c.s.executeUpdate(query);

    JOptionPane.showMessageDialog(null,"Data is inserted");
    setVisible(false);
    new Signup_2(formno).setVisible(true);
}

}
    

    catch(Exception e){
System.out.println(e);
    }
}
}


    public static void main(String[] args){
        new Signup();

    }
}

