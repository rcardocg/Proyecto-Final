package APP;
import APP.*;
import java.net.*;
import java.io.*;
import java.util.*;
public class ClT extends Thread{
    protected Scanner sc = new Scanner(System.in);
    private DataInputStream brrr;
    private DataOutputStream pow;
    private Socket serversock;
    protected String msn = "";
    protected String txt = "";

    public ClT(Socket mir){
        try {
            serversock = mir;
            brrr = new DataInputStream(serversock.getInputStream()); 
            pow = new DataOutputStream(serversock.getOutputStream());
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    @Override
    public void run(){
        try {
            System.out.println("Ingresa tu nombre");
            msn = sc.nextLine();
            pow.writeUTF(msn);
        } catch (Exception e) {
            //TODO: handle exception
        }
        
        while(true){
            try {
                System.out.println("Escribe un mensaje");
                msn = sc.nextLine();
                pow.writeUTF(msn);
                txt = brrr.readUTF();
                System.out.println(txt);
            } catch (Exception e) {
                //TODO: handle exception
            }
            
        }
        
    }
   

}