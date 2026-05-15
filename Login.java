import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener {

JButton login,clear,signup;
JTextField card_number;              // for clear written data
JPasswordField pin_number;              //for hidden pin like black dots
String formno;
Login(String formno){
    this.formno= formno;
    setTitle("AUTOMATED TELLER MACHINE");              //set title

    setLayout(null);

setSize(800,480);        //sizevof frame
setVisible(true);                    //show frame
setLocation(220,120);                //locaton of frame

ImageIcon i1=new ImageIcon("images/logo.jpg");            //image set
Image img=i1.getImage();
Image scaled=img.getScaledInstance(100,100,Image.SCALE_SMOOTH);
ImageIcon i2=new ImageIcon(scaled);
JLabel label= new JLabel(i2);                          //put image into JLable to visible
label.setBounds(70,10,100,100);        //size and locaton of image
add(label);                                              //show image

JLabel text= new JLabel("WELCOME TO ATM");            //add text to frame
text.setFont(new Font("osward",Font.BOLD,38));       //change font
text.setBounds(200,40,400,40);                //set size and location 
add(text);                                                       //show text

JLabel cardno= new JLabel("CARD NO:");                     
cardno.setFont(new Font("raleway",Font.BOLD,28));
cardno.setBounds(120,150,400,40);
add(cardno);

card_number=new JTextField();
card_number.setBounds(300,150,250,30);
card_number.setFont(new Font("Arial",Font.BOLD,14));
add(card_number);

 JLabel pin= new JLabel("PIN:");
pin.setFont(new Font("raleway",Font.BOLD,28));
pin.setBounds(120,220,250,30);
add(pin);

 pin_number=new JPasswordField();
pin_number.setBounds(300,220,250,30);
pin_number.setFont(new Font("Arial",Font.BOLD,14));
add(pin_number);

login= new JButton("SIGN IN");                    //create login button
login.setBounds(300,300,100,30);              //set size and location
login.setBackground(Color.BLACK);                                //set button background 
login.setForeground(Color.WHITE);                                  //set button foreground
login.addActionListener(this);
add(login);                                                     //show button

clear= new JButton("CLEAR");
clear.setBounds(450,300,100,30);
clear.setBackground(Color.BLACK);
clear.setForeground(Color.WHITE);
clear.addActionListener(this);
add(clear);

signup= new JButton("SIGN UP");
signup.setBounds(300,350,230,30);
signup.setBackground(Color.BLACK);
signup.setForeground(Color.WHITE);
signup.addActionListener(this);
add(signup);

getContentPane().setBackground(Color.WHITE);   //change frame background



}
@Override
public void actionPerformed(ActionEvent ae){


    if(ae.getSource()==login){


        try{
connection c= new connection();
        String cardno= card_number.getText();
        String pin_no= pin_number.getText();
        String query= "select * from login where card_number= '"+cardno+"' and pin_number ='"+pin_no+"'";
ResultSet rs=c.s.executeQuery(query);
if(rs.next()){
setVisible(false);
new Transactions(pin_no).setVisible(true);

}
else{
    JOptionPane.showMessageDialog(null, "Incorrect Card Number or Pin!");
}
        }


        catch(Exception e){

        }
    }
    else if(ae.getSource()==clear){
card_number.setText("");
pin_number.setText("");
    }
    else if(ae.getSource()==signup){
setVisible(false);
new Signup().setVisible(true);
    }
}

    public static void main(String[] args){
        new Login("");
    }
}