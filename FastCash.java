
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {

    JButton b1,b2,b3,b4,b5,b6,b7;
    String pin_number;
    FastCash(String pin_number){
        this.pin_number =pin_number;

       ImageIcon i1=new ImageIcon("images/atm.jpg");            //image set

Image i2= i1.getImage().getScaledInstance(850,770,Image.SCALE_DEFAULT) ;  //put image into JLable to visible
ImageIcon i3= new ImageIcon(i2);
JLabel image = new JLabel(i3);
image.setBounds(0,5,850,770);        //size and locaton of image
add(image);    

JLabel text= new JLabel("Please select your Transaction");
text.setFont(new Font("raleway",Font.BOLD,15));
text.setBounds(190,232,700,30);
text.setForeground(Color.WHITE);
image.add(text);

 b1 = new JButton("Rs 100");
b1.setBounds(130,318,130,25);
b1.addActionListener(this);
image.add(b1);

 b2 = new JButton("Rs 500");
b2.setBounds(305,318,150,25);
b2.addActionListener(this);
image.add(b2);

 b3 = new JButton("Rs 1000");
b3.setBounds(130,348,130,25);
b3.addActionListener(this);
image.add(b3);

 b4 = new JButton("Rs 2000");
b4.setBounds(305,348,150,25);
b4.addActionListener(this);
image.add(b4);

 b5 = new JButton("Rs 5000");
b5.setBounds(130,378,130,25);
b5.addActionListener(this);
image.add(b5);

 b6 = new JButton("Rs 10000");
b6.setBounds(305,378,150,25);
b6.addActionListener(this);
image.add(b6);

 b7 = new JButton("EXIT");
b7.setBounds(305,409,150,25);
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
            String amount = ((JButton)e.getSource()).getText().substring(3);
            try{
            connection c = new connection();
            Date date = new Date();
            
                ResultSet resultSet = c.s.executeQuery("select * from bank where pin = '"+pin_number+"'");
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

                String query =("insert into bank values('"+pin_number+"','"+date+"', 'withdrawl', '"+amount+"')");
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                setVisible(false);
                new Transactions(pin_number).setVisible(true);
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new FastCash(pin_number);
        }


    }

    public static void main(String[] args) {
        new FastCash("");
    }
}