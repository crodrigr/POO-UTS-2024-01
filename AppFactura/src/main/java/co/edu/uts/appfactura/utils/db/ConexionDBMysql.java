
package co.edu.uts.appfactura.utils.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexionDBMysql {
    
    private static String url="jdbc:mysql://localhost:3307/db_uts_factura";
    private static String username="root";
    private static String password="admin";
    private static Connection connection;
    
    public static Connection getConexion()throws SQLException{
        
      /* if(connection==null){
           connection=DriverManager.getConnection(url, username, password);
       } 
       return connection;*/
       
        return connection=DriverManager.getConnection(url, username, password);
    
    }
    
    
}
