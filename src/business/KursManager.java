package business;

import core.logging.Logger;
import dataAccess.HibernateKursDao;
import dataAccess.IDao;
import dataAccess.JdbcKursDao;
import entities.Kurs;

import java.util.List;

public class KursManager {
    private IDao iDao;
    private Logger[] loggers;

    public KursManager(IDao iDao,Logger[] loggers) {
        this.iDao = iDao;
        this.loggers = loggers;
    }

    public void add(Kurs kurs) throws Exception {
        //iş kuralları
        if (!(kurs.getUnitPrice() >= 0 && kurs.getCategory() == kurs.getCategory() && kurs.getName() == kurs.getName())) {
            throw new Exception("Kurs fiyatı 0'dan küçük, kategori ismi ve kurs ismi aynı olamaz");
        }

        iDao.add(kurs);

        for (Logger logger: loggers) {
            logger.log(kurs.getName());
            
        }
    }



}
