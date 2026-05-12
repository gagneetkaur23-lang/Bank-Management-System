import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Signup_3 extends JFrame implements ActionListener{

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    long random;
    String formno;

    Signup_3(String formno) {
        this.formno=formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

        // Heading
        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        // Account Type
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway", Font.BOLD, 18));
        type.setBounds(100, 92, 200, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.WHITE);
         //r1.setForeground(Color.BLACK);
        r1.setBounds(100, 133, 250, 30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 133, 300, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 170, 250, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 170, 300, 20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        // Card Number
        JLabel card = new JLabel("Card Number:");
        card.setFont(new Font("Raleway", Font.BOLD, 18));
        card.setBounds(100, 227, 200, 30);
        add(card);

        JLabel card_number = new JLabel("XXXX-XXXX-XXXX-4184");
        card_number.setFont(new Font("Raleway", Font.BOLD, 18));
       card_number.setBounds(330, 229, 300, 30);
        add(card_number);

        JLabel carddetail = new JLabel("(Your 16-digit Card number)");
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12));
        carddetail.setBounds(100, 257, 300, 20);
        add(carddetail);

        // PIN
        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        pin.setBounds(100, 303, 200, 30);
        add(pin);

        JLabel pin_number = new JLabel("XXXX");
        pin_number.setFont(new Font("Raleway", Font.BOLD, 18));
        pin_number.setBounds(330, 303, 300, 30);
        add(pin_number);

        JLabel pindetail = new JLabel("(4-digit password)");
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12));
        pindetail.setBounds(100, 328, 300, 20);
        add(pindetail);

        // Services Required
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 18));
        services.setBounds(100, 370, 200, 30);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 413, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 413, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 450, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 450, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 486, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 486, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 540, 600, 20);
        add(c7);

        // Buttons
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.addActionListener(this);
        submit.setBounds(250, 585, 100, 30);
        
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420, 585, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        // Frame Settings
        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true); // Eh sab ton end vich hona chahida hai!
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){
String type=null;
if(r1.isSelected()){
type="saving account";
}
else if(r2.isSelected()){
type="Fixed deposit account";
}
else if(r3.isSelected()){
type="current account";
}
if(r4.isSelected()){
type="recurring deposit account";
}
 Random random = new Random();
 String card_number= ""+(Math.abs(random.nextLong() % 90000000L) + 40904300000000L);
String pin_number =""+(Math.abs(random.nextLong() % 9000L) + 1000L);

String services="";
if(c1.isSelected()){
    services = services+"ATM Card";
} else if (c2.isSelected()){
    services= services + "Internet Banking";
} else if (c3.isSelected()){
    services= services + "Mobile Banking";
} else if (c4.isSelected()){
    services= services + "EMAIL Alerts";
} else if (c5.isSelected()){
    services= services + "Cheque Book";
} else if (c6.isSelected()){
    services= services + "E-Statement";
}

try{
 if (type==null) {
        JOptionPane.showMessageDialog(null, "Please select a Account Type!");
    } else if (services.equals("")) {
        JOptionPane.showMessageDialog(null, "Please select a Services!");
    }

connection c = new connection();
    String query = "insert into signup_3 values('"+formno+"','"+ type+"','"+card_number+"','"+pin_number+"','"+services+"')";
    c.s.executeUpdate(query);



    setVisible(false);
    new Deposit(pin_number).setVisible(false);
}

catch(Exception e){
    System.out.println(e);
}

 }
        else if(ae.getSource()==cancel){
setVisible(false);
new Login().setVisible(true);
        }
    }


    public static void main(String[] args) {
        new Signup_3("");
    }
}