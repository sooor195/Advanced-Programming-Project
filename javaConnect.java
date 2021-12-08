/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package A.P.P;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Reem ALonazi
 */
public class javaConnect {
      public static Connection connectdb(){
    Connection con=null;
    try {
     con =DriverManager.getConnection("jdbc:derby://localhost:1527/On_Care","Reem","0000");
             return con;
             
             } catch (SQLException ex) {
              Logger.getLogger(javaConnect.class.getName()).log(Level.SEVERE, null, ex);
          }
   
    return null;
}
}
