import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener {
Login(){
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

JTextField box=new JTextField();
box.setBounds(300,150,250,30);
add(box);

JLabel pin= new JLabel("PIN:");
pin.setFont(new Font("raleway",Font.BOLD,28));
pin.setBounds(120,220,250,30);
add(pin);

JTextField box2=new JTextField();
box2.setBounds(300,220,250,30);
add(box2);

JButton login= new JButton("SIGN IN");                    //create login button
login.setBounds(300,300,100,30);              //set size and location
login.setBackground(Color.BLACK);                                //set button background 
login.setForeground(Color.WHITE);                                //set button foreground
add(login);                                                     //show button

JButton clear= new JButton("CLEAR");
clear.setBounds(450,300,100,30);
clear.setBackground(Color.BLACK);
clear.setForeground(Color.WHITE);

add(clear);

JButton signup= new JButton("SIGN UP");

signup.setBounds(300,350,230,30);
signup.setBackground(Color.BLACK);
signup.setForeground(Color.WHITE);

add(signup);

getContentPane().setBackground(Color.WHITE);               //change frame background


}

    public static void main(String[] args){
        new Login();
    }
}
