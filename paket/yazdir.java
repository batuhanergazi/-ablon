package paket;

import java.util.ArrayList;

public class yazdir {
    public void Yazdir(ArrayList<il> arrayList){
        for(il c: arrayList){
            System.out.println(c.getIlNo()+"  "+c.getIsim());
        }
        System.out.println("yazdir çalıştı");


    }
}