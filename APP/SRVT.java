package APP;
import APP.*;
import java.util.*;
public class SRVT extends Thread{
    protected Server dota = new Server(); 
    protected Scanner sc = new Scanner(System.in);
    protected String msn = "";
    @Override
    public void run(){
        while (true) {
            dota.access();   
            correos ykro = new correos(dota, dota.so);
            Thread nacion = new Thread(ykro);
            nacion.start();
        }
    }
}