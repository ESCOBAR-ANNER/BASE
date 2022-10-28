package Base_Datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConexion() {
        String conexionURL = "jdbc:sqlserver://localhost:1433;"
                + "database=BD_ProyectoFinal;"
                + "user=sa;"
                + "Password=12345;"
                + "loginTimeout=30;";
        try {
            Connection con = DriverManager.getConnection(conexionURL);
            return con;
        } catch (SQLException ex) {
            System.out.println(ex.toString());
            return null;
        }
    }
}



//    String hostname = "localhost";
//    String sqlInstanceName = "LAPTOP-D0I9NQGS"; //nombre de la computadora
//    String sqlDatabase = "BD_ProyectoFinal"; // nombre de la base de datos del servidor sql
//    String sqlUser = "sa";
//    String sqlPassword = "12345"; // contraseña de la cuenta
//    Connection conn;
//
//    public Conexion() {
//
//    }
//
//    public Connection getConexion() {
//        try {
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
//                    + ";instancia=" + sqlInstanceName + ";databaseName=" + sqlDatabase;
//            Connection conn = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
//            System.out.println("Conexión exitosa a la base de datos!!");
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            System.out.println("No se conecto a base de datos " + sqlInstanceName);
//        }
//        return conn;
//    }
//
//    public void CloseConexion(Connection conn) {
//        try {
//            conn.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
