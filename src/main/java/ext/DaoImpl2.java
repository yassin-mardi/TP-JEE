package ext;

import Dao.IDao;

public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("version capteur");
        double temp = 2000;
        return temp;
    }
}
