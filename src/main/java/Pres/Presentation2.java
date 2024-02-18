package Pres;

import Dao.IDao;
import Metier.IMetier;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String Firstline = scanner.nextLine();
        Class cDao = Class.forName(Firstline);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String classMetier = scanner.nextLine();
        Class cMetier = Class.forName(classMetier);
        IMetier metier = (IMetier) cMetier.newInstance();

        Method method = cMetier.getMethod("setDao",IDao.class);
        method.invoke(metier,dao);

        System.out.println("resultat = "+ metier.calcule());
    }
}
