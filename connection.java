import java.sql.*;
    import java.sql.Connection;
public class connection {

    
    Connection c;
    Statement s;
    public connection(){
        
        try{
            //register jdbc driver
Class.forName("com.mysql.cj.jdbc.Driver");
         //create connection
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankmanagementsystem","root","MySql@12345@");
         //create statement 
s=c.createStatement();
        }
        catch(Exception e){
System.out.println(e);
        }
    }
}
