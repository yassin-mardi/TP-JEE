package Dao;
import org.springframework.stereotype.Component;
@Component("Dao")


public class DaoImpl implements IDao{

    @Override
    public double getData() {
        System.out.println("version base de donnee");
        double temp = Math.random()*40;
        return temp;
    }
}
