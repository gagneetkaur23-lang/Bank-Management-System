import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
//import javax.swing.JOptionPane;
//import javax.swing.JTextField;
//import java.util.Date;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;

public class Balance_enquiry extends JFrame implements ActionListener{
    JButton back;
    
    String pin_number;
    
    Balance_enquiry(String pin_number){
        this.pin_number=pin_number;
        setLayout(null);
 ImageIcon i1=new ImageIcon("images/atm.jpg");            //image set

Image i2= i1.getImage().getScaledInstance(850,730,Image.SCALE_DEFAULT) ;  //put image into JLable to visible
ImageIcon i3= new ImageIcon(i2);
JLabel image = new JLabel(i3);
image.setBounds(0,5,850,730);        //size and locaton of image
add(image);    


 


 back = new JButton("BACK");
back.setBounds(340,415,130,25);
back.addActionListener(this);
image.add(back);

 int balance =0;
connection c = new connection();
try{
            
           
            
                ResultSet resultSet = c.s.executeQuery("select * from bank where pin = '"+pin_number+"'");
               
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
            
    
        JLabel text= new JLabel("Your Current Account Balance is Rs"+" "+balance);
text.setFont(new Font("raleway",Font.BOLD,15));
text.setBounds(150,249,700,30);
text.setForeground(Color.WHITE);
image.add(text);

setSize(800,690);
 setLocation(270,0);
 setUndecorated(true);
        setVisible(true);


}

    @Override
    public void actionPerformed(ActionEvent ae){
        


        if (ae.getSource()==back){
            setVisible(false);
new Transactions(pin_number).setVisible(true);
        }
    }
        

    public static void main(String[] args) {
        new Balance_enquiry("");
    }


}
