package paket;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        DBShow dbsho=new DBShow();
        //dbsho.getDBShow();

        yazdir y=new yazdir();
        y.Yazdir(dbsho.getDBShow());

        DBOperation dpop=new DBOperation();
        dpop.DBAdd();
        dpop.DBRemove();

    }
}
