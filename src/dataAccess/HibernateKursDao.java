package dataAccess;
import entities.Kurs;

public class HibernateKursDao implements IDao {
    public void add(Kurs kurs){
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
