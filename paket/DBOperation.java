package paket;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBOperation {
    public void DBAdd(){
        DBConnection dbcon=new DBConnection();
        Connection con = dbcon.getDBConneciton();
        try {
            Statement stmt=con.createStatement();
            String sql="INSERT INTO new VALUES('VFDVD','DFV',28)";
            stmt.execute(sql);
            System.out.println("ekleme başarılı");
        } catch (SQLException e) {
            System.out.println("DBOperation insert into hatası");        }
    }
    public void DBRemove(){
        DBConnection dbcon=new DBConnection();
        Connection con = dbcon.getDBConneciton();
        try {
            Statement stmt=con.createStatement();
            stmt.execute("SET SQL_SAFE_UPDATES = 0");
            String sql="DELETE FROM new WHERE ad='asd'";
            stmt.execute(sql);
            System.out.println("silme başarılı");
        } catch (SQLException e) {
            System.out.println("DBOperation delete hatası");        }
    }

}
