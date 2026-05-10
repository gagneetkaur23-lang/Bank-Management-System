
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;


public class Transactions extends JFrame implements ActionListener{
    JButton balance,pin_change,mini_statement,deposit,cash_withdrawl,fast_cash,exit;
    Transactions(){

        setLayout(null);

        ImageIcon i1=new ImageIcon("images/atm.jpg");            //image set

Image i2= i1.getImage().getScaledInstance(850,720,Image.SCALE_DEFAULT) ;  //put image into JLable to visible
ImageIcon i3= new ImageIcon(i2);
JLabel image = new JLabel(i3);
image.setBounds(0,5,850,720);        //size and locaton of image
add(image);    

JLabel text= new JLabel("Please select your Transaction");
text.setFont(new Font("raleway",Font.BOLD,15));
text.setBounds(200,235,700,30);
text.setForeground(Color.WHITE);
image.add(text);

 deposit = new JButton("DEPOSIT");
deposit.setBounds(160,325,130,25);
image.add(deposit);

 cash_withdrawl = new JButton("CASH WITHDRAWL");
cash_withdrawl.setBounds(320,325,150,25);
image.add(cash_withdrawl);

 fast_cash = new JButton("FAST CASH");
fast_cash.setBounds(160,355,130,25);
image.add(fast_cash);

 mini_statement = new JButton("MINI STATEMENT ");
mini_statement.setBounds(320,355,150,25);
image.add(mini_statement);

 pin_change = new JButton("PIN CHANGE");
pin_change.setBounds(160,385,130,25);
image.add(pin_change);

 balance = new JButton("BALANCE ENQUIRY");
balance.setBounds(320,385,150,25);
image.add(balance);

 exit = new JButton("EXIT");
exit.setBounds(320,414,150,25);
exit.addActionListener(this);
image.add(exit);



setSize(800,690);
 setLocation(270,0);
 setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae){
if(ae.getSource()==exit){
    System.exit(0);
}
    }

    public static void main (String[] args){
new Transactions();


}
}
