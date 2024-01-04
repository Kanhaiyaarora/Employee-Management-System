// JDBC
//1. Register the Driver class
//2. Creating the Connection String 
//3. Creating statement 
//4. Executing mysql queries
//5. Closing the connections        

package employee.management.system;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
public Conn(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver"); // first step register the driver class
        c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root","7505200946"); //2nd step creating the connection string
        s = c.createStatement(); // 3rd step creating statement 
    
    } catch (Exception e){
    e.printStackTrace();
    }
    
}

}
