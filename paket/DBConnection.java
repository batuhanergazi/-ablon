package paket;
import java.sql.DriverManager;
import java.sql.*;

public class DBConnection {

    private final String jdbcUrl = "jdbc:mysql://localhost:3306/test?useSSL=false";
    private final String user = "root";
    private final String pass = "root";
    private final String driver = "com.mysql.cj.jdbc.Driver";

    public Connection getDBConneciton() {
        //set up connection variable
        Connection myConn = null;
        try {
            java.lang.Class.forName(driver);

            myConn = DriverManager.getConnection(jdbcUrl, user, pass);

            System.out.println("DBConnection başarılı");
        } catch (Exception exc) {
            System.out.println("DBConnection başarısız");
            exc.printStackTrace();
        }
        return myConn;
    }
}