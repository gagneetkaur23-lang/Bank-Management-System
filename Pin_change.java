import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
//import javax.swing.JTextField;

import javax.swing.JOptionPane;
import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.*;
//import java.sql.ResultSet;
import java.awt.event.ActionListener;


public class Pin_change extends JFrame implements ActionListener{
    JPasswordField pinTextField,repinTextField;
    String pin;
    JButton change,back;
   Pin_change(String pin){
this.pin = pin;
        setLayout(null);

        ImageIcon i1=new ImageIcon("images/atm.jpg");            //image set

Image i2= i1.getImage().getScaledInstance(850,720,Image.SCALE_DEFAULT) ;  //put image into JLable to visible
ImageIcon i3= new ImageIcon(i2);
JLabel image = new JLabel(i3);
image.setBounds(0,5,850,720);        //size and locaton of image
add(image);    

JLabel text= new JLabel("Change Your Pin");
text.setFont(new Font("raleway",Font.BOLD,16));
text.setBounds(250,235,700,30);
text.setForeground(Color.WHITE);
image.add(text);

JLabel pintext= new JLabel(" New Pin :");
pintext.setFont(new Font("system",Font.BOLD,15));
pintext.setBounds(160,280,700,30);
pintext.setForeground(Color.WHITE);
image.add(pintext);

pinTextField = new JPasswordField();
pinTextField.setFont(new Font("raleway",Font.BOLD,8));
pinTextField.setBounds(300,284,129,23);
image.add(pinTextField);

JLabel repintext= new JLabel(" Re-Enter Pin :");
repintext.setFont(new Font("system",Font.BOLD,15));
repintext.setBounds(160,307,700,30);
repintext.setForeground(Color.WHITE);
image.add(repintext);

repinTextField = new JPasswordField();
repinTextField.setFont(new Font("raleway",Font.BOLD,8));
repinTextField.setBounds(300,311,129,21);
image.add(repinTextField);

change = new JButton("CHANGE ");
change.setBounds(320,365,130,25);
change.addActionListener(this);
image.add(change);



 back = new JButton("BACK");
back.setBounds(320,395,130,25);
back.addActionListener(this);
image.add(back);


setSize(800,690);
 setLocation(270,0);
 setUndecorated(true);
        setVisible(true);
   }
   @Override
   public void actionPerformed(ActionEvent ae){

      

      if(ae.getSource()==change){
         try{
         String npin = pinTextField.getText();
         String rpin= repinTextField.getText();

         if (!npin.equals(rpin)){
            JOptionPane.showMessageDialog(null, "Entered Pin does not match");
            return;
         }
          if (npin.equals("")){
            JOptionPane.showMessageDialog(null, "Please enter new PIN");
            return;
            
         }
         if (rpin.equals("")){
            JOptionPane.showMessageDialog(null, "Please Re-enter new PIN");
            return;
            
         }
         connection c = new connection();
         String q1="update bank set pin='"+rpin+"' where pinTextField= '"+pinTextField+"'";
          String q2="update login set pin='"+rpin+"' where pinTextField = '"+pinTextField+"'";
 String q3="update signup_3 set pin='"+rpin+"' where pinTextField = '"+pinTextField+"'";

 c.s.executeUpdate(q1);
  c.s.executeUpdate(q2);
   c.s.executeUpdate(q3);

   JOptionPane.showMessageDialog(null, "PIN changed Successfully");
   setVisible(false);
   new Transactions(pin).setVisible(true);
      }
   
   catch(Exception e){
      System.out.println(e);
   }
}
      
      else if(ae.getSource()==back){
setVisible(false);
   new Transactions(pin).setVisible(true);
      }
      
   }
public static void main(String[] args){
new Pin_change("");
}
   }