
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhavesh
 */
public class MyConn {
    public static Connection getConnection() {
    Connection conn= null;
    try{
    conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/Airlines", "root", "");
    
    }catch(SQLException ex){
    System.out.println(ex.getMessage());
    }
    return conn;
    }
}
