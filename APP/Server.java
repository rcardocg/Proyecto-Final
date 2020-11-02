package APP;
import APP.BD.*;
import java.io.*;
import java.net.*;
import java.util.*;
import APP.*;

public class Server{
    static int PUERTO = 1500;
    protected ServerSocket sc;
    protected String mensajeRecibido = "";
    protected Socket so;
    protected String msn = "";
    private Sig gserver; 
    protected LinkedList<String> conectados; 
    protected LinkedList<Socket> ports;
    // private DB apk;

    public Server(){
        try{
            sc = new ServerSocket(PUERTO);
            // apk = new DB("D:\\Documentos\\Proyecto2-CC2\\APP\\BD\\testDb.db");
            // apk.connect();
            gserver = new Sig();
            gserver.inicialize();
            // apk.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    } 

    public void access(){
        try{
            so = new Socket();
            System.out.println("Esperando conexion...");
            so = sc.accept();
            System.out.println("Se conecto ha conectado un usuario...");
            //this.so = null;      
        }catch(Exception e){
            e.printStackTrace();
        } 
    }


    public void pruebae(String jamon, Socket se){
        DataOutputStream salida;
        try{
            salida = new DataOutputStream(se.getOutputStream());
            msn = jamon;
            salida.writeUTF(msn);//enviamos mensaje
        }catch(Exception e){
            e.printStackTrace();
        }
    } 

    public void pruebar(Socket si){
        DataInputStream entrada;
        try{
            entrada = new DataInputStream(si.getInputStream());
            mensajeRecibido = entrada.readUTF();//Leemos respuesta
            System.out.println(mensajeRecibido);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public void agree(Socket siu){
        try {
            DataInputStream entrada = new DataInputStream(siu.getInputStream());
            mensajeRecibido = entrada.readUTF();
            gserver.agreement(mensajeRecibido);
            conectados.add(mensajeRecibido);
            ports.add(siu);  
        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
}