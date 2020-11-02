package APP.BD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import APP.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class ig2 extends JFrame implements ActionListener {

    private JLabel texto3;
    private JButton boton,boton2,boton3,boton4;          
    JTextField input;
    private Cliente cl;
    JTextArea msgs;
    protected JButton sendBtn;

    public ig2() {
        super();                    
        configurarVentana();        
        inicializarComponentes();  
     

    }

    private void configurarVentana() {
        this.setTitle("Bienvenido");                   
        this.setSize(700, 500);                                 
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }


    private void inicializarComponentes() {
        // creamos los componentes
        texto3 = new JLabel();
        boton = new JButton();
        boton2= new JButton();
        boton3= new JButton();
        boton4=new JButton();

      
        

        // configuramos los componentes
        /*texto3.setText("Redactar Correo");    // colocamos un texto a la etiqueta
        texto3.setBounds(45, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)\
        */
        boton.setText("Correo Nuevo");   // colocamos un texto al boton
        boton.setBounds(25, 25, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase

        boton2.setText("Bandeja de correos");   // colocamos un texto al boton
        boton2.setBounds(25, 75, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        ActionListener Bc= new Bc();
        boton2.addActionListener(Bc);      // hacemos que el boton tenga una accion y esa accion estara en esta clase

        
        boton3.setText("Lista De Contactos");   // colocamos un texto al boton
        boton3.setBounds(25, 125, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        ActionListener NCC= new NCC();
        boton3.addActionListener(NCC);      // hacemos que el boton tenga una accion y esa accion estara en esta clase

        boton4.setText("Salir");   // colocamos un texto al boton
        boton4.setBounds(25, 175, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        ActionListener Salir= new Salir();
        boton4.addActionListener(Salir);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
       this.add(texto3);
        this.add(boton);
        this.add(boton2);
        this.add(boton3);
        this.add(boton4);
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //String nombre = caja.getText();                                 // obtenemos el contenido de la caja de texto
      Nc j = new Nc();
      j.setVisible(true);
        
    }
   

    public void ans() {      // creamos una ventana
        setVisible(true);             // hacemos visible la ventana creada
    }
}