
package sistema.empleadosDAL;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PONTEC
 */
public class conexion {
  
    String strConexionDB="jdbc:sqlite:C:/Users/PONTEC/Documents/DB_Sistema/BD.s3db";
    Connection conn = null;
    
    public conexion () {
        try {
            Class.forName("org.sqlite.JDBC");
            conn= DriverManager.getConnection(strConexionDB);
            
            System.out.println("Conexion establecida");
            
        } catch (Exception e) {
            System.out.println("Error de conexion" +e.getMessage());
            e.printStackTrace();
        }
}
}
