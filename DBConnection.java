/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login_register_design;
import java.sql.*;
/**
 *
 * @author sakes
 */
public class DBConnection {
     static String url="jdbc:mysql://localhost:3306/user_internship";
     static String user="root";
     static String pwd="root";
     static Connection con;
     
    
    public static Connection connectDB(){
      try{
         Class.forName("com.mysql.jdbc.Driver"); 
         con=DriverManager.getConnection(url, user,pwd);
         System.out.println("connecyion");
         return con;
      } catch(Exception ex){
      System.out.println("Error occured during the connection");
      return null;
      }
    }
}


