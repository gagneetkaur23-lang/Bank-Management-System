//import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.*;
public class Mini_statement extends JFrame implements ActionListener{
    String pin_number;
Mini_statement(String pin_number){
    this.pin_number= pin_number;
    setLayout(null);
    setTitle("Mini Statement");

 JLabel bank=new JLabel("Indian Bank");
        bank.setFont(new Font("raleway",Font.BOLD,19));
        bank.setBounds(130,18,600,40);
        add(bank);


         JLabel cardno = new JLabel();
        //cardno.setFont(new Font("raleway",Font.BOLD,19));
        cardno.setBounds(20,36,300,40);
        add(cardno);
        
        try{

    connection c = new connection();

    ResultSet resultset = c.s.executeQuery(
            "select * from login where pin = '"+pin_number+"'"
    );

    while(resultset.next()){
            cardno.setText(("Card Number: XXXX-XXXX-XXXX-")+resultset.getString("card_number").substring(12));
       
    }

}catch(Exception e){

    System.out.println(e);
}
       
getContentPane().setBackground(Color.WHITE);
    setSize(400,600);
 setLocation(20,20);
 
 //setUndecorated(true);
        setVisible(true);
        revalidate();
        repaint();
}
public void actionPerformed(ActionEvent ae){

}

    public static void main(String[] args) {
        new Mini_statement("");
    }
}