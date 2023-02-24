package core.logging;

public class UserLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("Kullanıcı girişi yapıldı"+ data);
    }
}
