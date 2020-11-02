package APP;
public class EncenderServer{
    public static void main(String[] args){
        SRVT srt = new SRVT();
        Thread madonna = new Thread(srt);
        madonna.start();
    }
}