package APP;
import java.io.*;
import java.net.*;
import java.util.*;
public class Cliente{
    private Socket serversock;
    protected String name;
    private LinkedList<Cliente> contacts = new LinkedList<Cliente>();
    private ClT io;

    public void Clienteconnect(){
        try{
            this.serversock  = new Socket("localhost", 1500);
            this.name = "";
            this.io = new ClT(serversock);
            this.serversock = null;
            io.start();
        }catch(Exception e){
            e.printStackTrace();
        }
        
    }
    public void enviarmsj(String envio, String title, String msj, String yo){
        
    }
    public void recibirmsj(String sujeto, String title, String msj){

    }

    public void mclients(){
        for(int u = 0; u<contacts.size(); u++){
            Cliente contact = contacts.get(u);
            contact.callagan();
        }
    }

    public void callagan(){
       System.out.println("CLIST " + name);;
    }

    public Cliente(){
        try {
            Clienteconnect();
        } catch (Exception e) {
            //TODO: handle exception
        }
       
    } 
}
