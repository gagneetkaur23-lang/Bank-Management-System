
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin;
    FastCash(String pin){
        this.pin =pin;

       ImageIcon i1=new ImageIcon("images/atm.jpg");            //image set

Image i2= i1.getImage().getScaledInstance(850,770,Image.SCALE_DEFAULT) ;  //put image into JLable to visible
ImageIcon i3= new ImageIcon(i2);
JLabel image = new JLabel(i3);
image.setBounds(0,5,850,770);        //size and locaton of image
add(image);    

JLabel text= new JLabel("Please select your Transaction");
text.setFont(new Font("raleway",Font.BOLD,15));
text.setBounds(200,235,700,30);
text.setForeground(Color.WHITE);
image.add(text);

 b1 = new JButton("Rs 100");
b1.setBounds(160,325,130,25);
b1.addActionListener(this);
image.add(b1);

 b2 = new JButton("1000");
b2.setBounds(320,325,150,25);
b2.addActionListener(this);
image.add(b2);

 b3 = new JButton("FAST CASH");
b3.setBounds(160,355,130,25);
image.add(b3);

 b4 = new JButton("MINI STATEMENT ");
b4.setBounds(320,355,150,25);
image.add(b4);

 b5 = new JButton("PIN CHANGE");
b5.setBounds(160,385,130,25);
image.add(b5);

 b6 = new JButton("BALANCE ENQUIRY");
b6.setBounds(320,385,150,25);
image.add(b6);

 b7 = new JButton("EXIT");
b7.setBounds(320,414,150,25);
b7.addActionListener(this);
image.add(b7);



setSize(800,690);
 setLocation(270,0);
 setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b7) {
            setVisible(false);
            System.exit(0);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            connection c = new connection();
            Date date = new Date();
            try{
                ResultSet resultSet = c.s.executeQuery("select * from bank where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != b7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }

                c.s.executeUpdate("insert into bank values('"+pin+"','"+date+"', 'withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new FastCash(pin);
        }


    }

    public static void main(String[] args) {
        new FastCash("");
    }
}