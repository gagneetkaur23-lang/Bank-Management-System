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
        cardno.setFont(new Font("raleway",Font.BOLD,15));
        cardno.setBounds(20,76,400,30);
        add(cardno);

        
        JLabel mini = new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);

         JLabel balanceLabel = new JLabel();
        balanceLabel.setBounds(20, 400, 300, 20);
        add(balanceLabel);
        
        try{

    connection c = new connection();

    ResultSet resultset = c.s.executeQuery(
            "select * from login where pin_number = '"+pin_number+"'"
    );

    while(resultset.next()){
            cardno.setText(("Card Number:   XXXX-XXXX-XXXX-")+resultset.getString("card_number").substring(12));
       
    }

}catch(Exception e){

    System.out.println(e);
}
 try {
            connection c = new connection ();
            int balance = 0;
            ResultSet rs = c.s.executeQuery("select * from bank where pin_number = '"+pin_number+"'");
            
            // HTML ਦੀ ਵਰਤੋਂ ਕਰਕੇ ਮਲਟੀਪਲ ਲਾਈਨਾਂ ਦਿਖਾਉਣ ਲਈ
            String transactions = "<html>"; 
            while(rs.next()){
                transactions += rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br><br>";
                
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
            transactions += "</html>";
            mini.setText(transactions);
            balanceLabel.setText("Your total Balance is Rs " + balance);
            
        } catch (Exception e) {
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