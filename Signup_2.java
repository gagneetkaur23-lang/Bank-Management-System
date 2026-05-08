import java.awt.*;
//import java.util.*;

import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import java.awt.event.*;


public class Signup_2 extends JFrame implements ActionListener{

 JLabel religion,category,income,education,qualification,occupation,pan,aadhar,senior_citizen,exist_account;
JTextField panTextField,aadharTextField;
JButton next;
JRadioButton yes,no,a_yes,a_no;
JComboBox<String> religion_,category_,income_,qualification_,occupation_;
String formno;

   public Signup_2(String formno){
        this.formno = formno;
 setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
setLayout(null);

        

        
        
        JLabel addDetails=new JLabel("Page 2. Additional Details");
        addDetails.setFont(new Font("raleway",Font.BOLD,23));
        addDetails.setBounds(290,65,600,30);
        add(addDetails);
        setVisible(true);

         religion =new JLabel("Religion:");
        religion.setFont(new Font("raleway",Font.BOLD,20));
        religion.setBounds(100,140,600,30);
        add(religion);
        
       // revalidate();
       // repaint();

        String religion_arr[]={"Select","Hindu","Sikh","Muslim"};
         religion_= new JComboBox<>(religion_arr);
religion_.setBounds(300,141,300,30);
add(religion_);

 

          category =new JLabel("Category:");
        category.setFont(new Font("raleway",Font.BOLD,20));
        category.setBounds(100,185,200,30);
        add(category);
       
        String category_arr[]= {"Select","General","OBC","SC","ST","Other"};
        category_= new JComboBox<>(category_arr);
    category_.setBounds(300,187,300,30);
add(category_);



          income=new JLabel("Income:");
        income.setFont(new Font("raleway",Font.BOLD,20));
        income.setBounds(100,227,200,30);
        add(income);
        

        String income_arr[]= {"Null","< 1,50,000","< 2,50,000","< 5,00,000","Upto 10,00,000"};
         income_= new JComboBox<>(income_arr);
    income_.setBounds(300,230,300,30);
add(income_);

 education =new JLabel("Educational:");
        education.setFont(new Font("raleway",Font.BOLD,20));
        education.setBounds(100,269,600,30);
        add(education);

         

         qualification =new JLabel(" Qualification:");
        qualification.setFont(new Font("raleway",Font.BOLD,20));
        qualification.setBounds(95,290,600,30);
        add(qualification);
        

         String qual_arr[]= {"Select","Non-Graduation","Graduate","Post-Graduate","Doctrate","Other"};
         qualification_= new JComboBox<>(qual_arr);
    qualification_.setBounds(300,274,300,30);
add(qualification_);


            occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("raleway",Font.BOLD,20));
        occupation.setBounds(100,331,600,30);
        add(occupation);
        

        String occupation_arr[]= {"Select","Salaried","Self-Employed","Business","Student","Retired","Other"};
         occupation_= new JComboBox<>(occupation_arr);
    occupation_.setBounds(300,331,300,30);
add(occupation_);



         

         pan=new JLabel("PAN number:");
         pan.setFont(new Font("raleway",Font.BOLD,20));
         pan.setBounds(100,373,600,30);
        add( pan);
       

        panTextField=new JTextField();
panTextField.setFont(new Font("raleway",Font.BOLD,14));
panTextField.setBounds(300,376,300,30);
add(panTextField);


         
       
         aadhar =new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("raleway",Font.BOLD,20));
        aadhar.setBounds(100,413,600,30);
        add(aadhar);
       

         aadharTextField=new JTextField();
aadharTextField.setFont(new Font("raleway",Font.BOLD,14));
aadharTextField.setBounds(300,418,300,30);
add(aadharTextField);


         

         senior_citizen =new JLabel("Senior Citizen:");
        senior_citizen.setFont(new Font("raleway",Font.BOLD,20));
        senior_citizen.setBounds(100,453,600,30);
        add(senior_citizen);
        

        yes = new JRadioButton("Yes");
        yes.setBounds(300,453,80,30);
        yes.setBackground(Color.WHITE);
        add(yes);
       


 no = new JRadioButton("No");
        no.setBounds(390,453,60,30);
  no.setBackground(Color.WHITE);
        add(no);
       
         ButtonGroup  senior_citizen = new ButtonGroup();
        senior_citizen.add(yes);
       senior_citizen.add(no);
         setVisible(true);


         

          exist_account=new JLabel("Existing Account:");
        exist_account.setFont(new Font("raleway",Font.BOLD,20));
        exist_account.setBounds(100,492,600,30);
        add(exist_account);
        

         a_yes = new JRadioButton("Yes");
        a_yes.setBounds(300,491,60,30);
  a_yes.setBackground(Color.WHITE);
        add(a_yes);
       

        a_no = new JRadioButton("No");
        a_no.setBounds(390,491,60,30);
  a_no.setBackground(Color.WHITE);
        add(a_no);
        setVisible(true);
       
  ButtonGroup exist_account = new ButtonGroup();
       exist_account.add(a_yes);
       exist_account.add(a_no);
         setVisible(true);

         

         
         next = new JButton("Next");
        next.setBounds(530,590,100,30);
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);
        setVisible(true);

         getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocation(280,10);
        setVisible(true);

        revalidate();
        repaint();
        setVisible(true);
        
    }

     @Override
public void actionPerformed(ActionEvent ae){
  
    String religion= (String) religion_.getSelectedItem();
  String category=(String) category_.getSelectedItem();
String income= (String) income_.getSelectedItem();
  String qualification= (String) qualification_.getSelectedItem();
String occupation =(String) occupation_.getSelectedItem();

  
String  senior_citizen= null;
if(yes.isSelected()){
     senior_citizen= "yes";
    }
    else if (no.isSelected()){
         senior_citizen="no";
    }

    String  exist_account= null;
if(a_yes.isSelected()){
     exist_account="yes";
}
    else if (a_no.isSelected()){
        exist_account ="no";
    
    }
   
    String aadhar = aadharTextField.getText();
    String pan = panTextField.getText();
    

    try{
       
    // Validation Check
    if (religion.equals("Select")) {
        JOptionPane.showMessageDialog(null, "Please select a Religion!");
    } else if (category.equals("Select")) {
        JOptionPane.showMessageDialog(null, "Please select a Category!");
    }
        else if (qualification.equals("Select")) {
        JOptionPane.showMessageDialog(null, "Please select a Educational Qualification!");
        }
         else if (occupation.equals("Select")) {
        JOptionPane.showMessageDialog(null, "Please select a Occupation!");

    } else if (pan.equals("")) {
        JOptionPane.showMessageDialog(null, "PAN Number is required!");
    } 
    else if (aadhar.equals("")) {
        JOptionPane.showMessageDialog(null, "Aadhar Number is required!");
    } 
    else{
    connection c = new connection();
    String query = "insert into signup_2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+qualification+"','"+occupation+"','"+pan+"','"+aadhar+"','"+senior_citizen+"','"+exist_account+"')";
    c.s.executeUpdate(query);


    JOptionPane.showMessageDialog(null,"Data is inserted");

    //setVisible(false);
    //new Signup_2(formno).setVisible(true);

    }

}

    catch(Exception e){
e.printStackTrace();
    }
}


   public static void main(String[] args) {
    new Signup_2("");
   }
}