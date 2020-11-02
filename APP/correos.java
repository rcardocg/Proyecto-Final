package APP;
import APP.*;
import java.util.*;
import java.net.*;
public class correos implements Runnable{
    private Server data;
    private Socket mansion;
    private Scanner sc = new Scanner(System.in);
    private String msn = ""; 
    public correos(Server sv,Socket so){
        this.data = sv;
        this.mansion = so; 
    }
    @Override
    public void run(){
        final Socket wukong = mansion;
        data.agree(wukong);
        while(true){
            data.pruebar(wukong);
            System.out.println("Escribe un mensaje");
            msn = sc.nextLine();
            data.pruebae(msn, wukong);
        }
    }
}