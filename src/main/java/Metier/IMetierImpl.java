package Metier;

import Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("Metier")
public class IMetierImpl implements IMetier {

   // @Autowired
    private IDao dao;

    public IMetierImpl(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcule() {
        double temp  = dao.getData();
        double res = temp * Math.PI;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
