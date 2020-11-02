import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Sig extends JFrame {
    private JLabel texto3;
    JTextArea msgs;
    
    public Sig() {
        super();                    
        configurarVentana();       
        inicializarComponentes();   
    }
    private void configurarVentana() {
        this.setTitle("Bienvenido");                   
        this.setSize(400, 400);                                 
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
    private void inicializarComponentes() {
        texto3 = new JLabel();
        msgs= new JTextArea();
      
        texto3.setText("Usuarios En Linea: ");  
        texto3.setBounds(20, 10, 150, 25);  
        msgs = new JTextArea();
        msgs.setBounds(20, 40, 350, 300);
        this.add(msgs);
        this.add(texto3);  
    }
    public static void main(String[] args) {
        Sig i = new Sig();     
        i.setVisible(true);           
    }
}