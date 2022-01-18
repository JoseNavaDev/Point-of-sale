package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionMySQL {
    
    private final String Servidor = "localhost";
    private final String Database = "profesores";
    private final String Usuario = "root";
    private final String Password = "";
    
    private final String Puerto = "3306";
    private final String Url = "jdbc:mysql://"+Servidor+":"+Puerto+"/"+Database;
    
    private static Connection Con;
    
    public ConexionMySQL(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Con = (Connection) DriverManager.getConnection(Url,Usuario,Password);
            System.out.println("Conexión establecida con la base de datos:"+Database);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
    }
}
