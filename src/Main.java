import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import dataAccess.HibernateKursDao;
import dataAccess.JdbcKursDao;
import entities.Kurs;
import business.KursManager;
public class Main {
    public static void main(String[] args) throws Exception {

        Kurs kurs1 = new Kurs(1,"Alpy",20,"Messi");
        Kurs kurs11 = new Kurs(2,"Java",10,"Yazılım");

        Logger[] loggers = {new DatabaseLogger(), new FileLogger()};
        KursManager kursManager = new KursManager(new JdbcKursDao(),loggers);
        kursManager.add(kurs1);
        kursManager.add(kurs11);

    }
}