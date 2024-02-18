package Pres;
import Metier.IMetierImpl;
import Dao.DaoImpl;
import ext.DaoImpl2;

public class Presentation {
    public static void main(String[] args) {
        IMetierImpl metier = new IMetierImpl(null);
        DaoImpl2 d = new DaoImpl2();
        metier.setDao(d);
        System.out.println("RES = "+metier.calcule());
    }
}
