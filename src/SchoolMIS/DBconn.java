/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SchoolMIS;

/**
 *
 * @author makana
 */
import java.sql.*;
public class DBconn {
    public static void main(String[] args) {
        // TODO code application logic here
        
            String host="jdbc:mysql://localhost:3306/SchoolMIS?useTimezone=true&serverTimezone=UTC";
        String username ="schoolmis";
        String password="schoolmis";
        String driver ="com.msql.cj.jdbc.Driver";
        try{
            Connection con =DriverManager.getConnection(host,username,password);
            Statement stmt = con.createStatement();
        }
        catch(Exception e){
            
        }
    
        
    
    }
    
           
}
