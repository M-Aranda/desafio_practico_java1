
package model;


import java.sql.Connection;    
import java.sql.ResultSet;

import java.sql.DriverManager;         
import java.sql.SQLException;
import java.sql.Statement;      
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private Statement sen;
    private ResultSet rs;
    private Connection con; 
    
    public Conexion( String server,  String bd, String user, String pass) throws ClassNotFoundException, SQLException{
        String protocolo = "jdbc:mysql://";
        String lineaUser = "user="+user;
        String lineaPass = "password="+pass;
       
        String url = protocolo +
                server + "/" +
                bd + "?" +
                lineaUser + "&" +
                lineaPass;
       
        System.out.println(url);
        
        Class.forName("com.mysql.jdbc.Driver"); 
        con = DriverManager.getConnection(url);
    }
    
    public static void main(String[] args) {
        try {
            Conexion c = new Conexion(
                "localhost",
                "bd_criminales_java",
                "root",
                ""
            );
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
