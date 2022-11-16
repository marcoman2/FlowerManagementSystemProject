/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowershopmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MarcoMan
 * 
 * Channel: https://www.youtube.com/channel/UCPgcmw0LXToDn49akUEJBkQ
 */
public class database {
    
    public static Connection connectDb(){
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/flower", "root", ""); // root is the default username : ) 
            return connect;
        }catch(Exception e){e.printStackTrace();}
        return null;
    }
    
}
