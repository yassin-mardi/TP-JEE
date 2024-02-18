package Pres;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresentationAvecSpringXml {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("Res = "+metier.calcule());


    }
}
