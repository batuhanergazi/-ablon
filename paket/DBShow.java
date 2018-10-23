package paket;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DBShow {
    public ArrayList<il> getDBShow(){
        DBConnection dbcon=new DBConnection();
        Connection con = dbcon.getDBConneciton();
        ArrayList<il> arraylist=new ArrayList<il>();
        try {
            Statement stmt = con.createStatement();
            ResultSet rs=stmt.executeQuery("select * from il");
            System.out.println("il ismi \til kodu  \t");
            while (rs.next()){
                System.out.println(rs.getString(2) + "    \t    " + rs.getInt(1));
                il i=new il();
                i.setIlNo(rs.getInt(1));
                i.setIsim(rs.getString(2));
                arraylist.add(i);
            }
            System.out.println("arraylist dolduruldu");
        } catch (SQLException e) {
            System.out.println("DBShow metodunda hata");        }
        finally {
            return arraylist;
        }




    }
}
