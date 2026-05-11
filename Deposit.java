import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class Deposit extends JFrame implements ActionListener{
    JButton deposit,back;
    JTextField textTextField;
    String pin;
    Deposit(String pin){
        this.pin=pin;
        setLayout(null);
 ImageIcon i1=new ImageIcon("images/atm.jpg");            //image set

Image i2= i1.getImage().getScaledInstance(850,770,Image.SCALE_DEFAULT) ;  //put image into JLable to visible
ImageIcon i3= new ImageIcon(i2);
JLabel image = new JLabel(i3);
image.setBounds(0,5,850,770);        //size and locaton of image
add(image);    

JLabel text= new JLabel("Enter Amount you want to Deposit");
text.setFont(new Font("raleway",Font.BOLD,15));
text.setBounds(190,252,700,30);
text.setForeground(Color.WHITE);
image.add(text);

 textTextField = new JTextField();
textTextField.setFont(new Font("raleway",Font.BOLD,10));
textTextField.setBounds(190,287,254,23);
image.add(textTextField);

deposit = new JButton("DEPOSIT ");
deposit.setBounds(320,365,130,25);
deposit.addActionListener(this);
image.add(deposit);

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
        if(ae.getSource()==deposit){
String amount = textTextField.getText();
Date date = new Date();
        


try{

    
if(amount.equals("")){
     JOptionPane.showMessageDialog(null, "Please enter a Amount to Deposit!");
     return;
}

connection c = new connection();
String data = "insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')";
c.s.executeUpdate(data);
JOptionPane.showMessageDialog(null, "RS"+" "+amount+" "+"Deposited Successfully");
setVisible(false);
new Transactions(pin).setVisible(true);
}
catch(Exception e ){
    System.out.println(e);
}

}

        if (ae.getSource()==back){
            setVisible(false);
new Transactions(pin).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
