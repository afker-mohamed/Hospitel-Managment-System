/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
/**
 *
 * @author Intel
 */
public class ConnectionProvider {
    @SuppressWarnings("UseSpecificCatch")
    public static Connection getcon()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/client?zeroDateTimeBehavior=convertToNull [root on Default schema]","root","");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }

    public static Connection getCon() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
