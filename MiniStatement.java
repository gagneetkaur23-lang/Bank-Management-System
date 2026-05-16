import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {
String pin_number;
    MiniStatement(String pin_number) {
        this.pin_number=pin_number;
        setTitle("Mini Statement");
        setLayout(null);

        JLabel mini = new JLabel();
        mini.setBounds(20, 140, 400, 200);
        add(mini);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 100, 20);
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 80, 300, 20);
        add(card);

        JLabel balanceLabel = new JLabel();
        balanceLabel.setBounds(20, 400, 300, 20);
        add(balanceLabel);

        try {
            connection c = new connection();
            // ਕਾਰਡ ਨੰਬਰ ਕੱਢਣ ਲਈ (ਸੁਰੱਖਿਆ ਲਈ ਵਿਚਕਾਰਲੇ ਅੱਖਰ X ਕੀਤੇ ਗਏ ਹਨ)
            ResultSet rs = c.s.executeQuery("select * from login where pin_number = '"+pin_number+"'");
            while(rs.next()){
                card.setText("Card Number: " + rs.getString("card_number").substring(0, 4) + "XXXXXXXX" + rs.getString("card_number").substring(12));
            }
        } catch (Exception e) {
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

        JButton exit = new JButton("Exit");
        exit.setBounds(20, 500, 100, 25);
        exit.addActionListener(e -> setVisible(false));
        add(exit);

        getContentPane().setBackground(Color.WHITE);
        setSize(400, 600);
        setLocation(20, 20);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
