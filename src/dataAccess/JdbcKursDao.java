package dataAccess;

import entities.Kurs;

public class JdbcKursDao implements IDao{
    public void add(Kurs kurs){
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
