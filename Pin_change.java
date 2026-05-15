import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//import javax.swing.JTextField;
import javax.swing.JTextField;

//import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
//import java.awt.event.*;
//import java.sql.ResultSet;
import java.awt.event.ActionListener;


public class Pin_change extends JFrame implements ActionListener{
    JTextField pin,repin;
    String pin_number;
    JButton change,back;
   Pin_change(String pin_number){
this.pin_number = pin_number;
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

 pin= new JTextField();
pin.setFont(new Font("raleway",Font.BOLD,8));
pin.setBounds(300,284,129,23);
image.add(pin);

JLabel repintext= new JLabel(" Re-Enter Pin :");
repintext.setFont(new Font("system",Font.BOLD,15));
repintext.setBounds(160,307,700,30);
repintext.setForeground(Color.WHITE);
image.add(repintext);

repin = new JTextField();
repin.setFont(new Font("raleway",Font.BOLD,8));
repin.setBounds(300,311,129,21);
image.add(repin);

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
         String npin = pin.getText();
         String rpin= repin.getText();

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
         String q1="update bank set pin_number='"+rpin+"' where pin_number= '"+pin_number+"'";
          String q2="update login set pin_number='"+rpin+"' where pin_number = '"+pin_number+"'";
 String q3="update signup_3 set pin_number='"+rpin+"' where pin_number= '"+pin_number+"'";

 c.s.executeUpdate(q1);
  c.s.executeUpdate(q2);
   c.s.executeUpdate(q3);

   JOptionPane.showMessageDialog(null, "PIN changed Successfully");
   setVisible(false);
   new Transactions(pin_number).setVisible(true);
      }
   
   catch(Exception e){
      System.out.println(e);
   }
}
      
      else if(ae.getSource()==back){
setVisible(false);
   new Transactions(pin_number).setVisible(true);
      }
      
   }
public static void main(String[] args){
new Pin_change("");
}
   }