package APP.BD;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Nc extends JFrame implements ActionListener {

    private JLabel texto3, texto4;
    private JButton boton,boton2,boton3,boton4;          // boton con una determinada accion
    JTextField input;
    protected JButton sendBtn;
    JTextField caja, caja2;  

    public Nc() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes

    }

    private void configurarVentana() {
        this.setTitle("Bienvenido");                   // colocamos titulo a la ventana
        this.setSize(700, 500);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
    }


    private void inicializarComponentes() {
        // creamos los componentes
        texto3 = new JLabel();
        texto4 = new JLabel();
        boton = new JButton();
        boton2= new JButton();
        boton3= new JButton();
        boton4=new JButton();

        texto3= new JLabel();
        texto3.setText("Para: ");
        texto3.setBounds(250, 25, 50, 25); 
        this.add(texto3);

        caja = new JTextField();
        caja.setBounds(320, 25, 150, 25);
        this.add(caja);


        texto4= new JLabel();
        texto4.setText("Asunto: ");
        texto4.setBounds(250, 75, 100, 25); 
        this.add(texto4);

        caja2 = new JTextField();
        caja2.setBounds(320,75, 150, 25);
        this.add(caja2);
      
        input = new JTextField();
        input.setBounds(250, 120, 420, 300);
        this.add(input);
        
        sendBtn = new JButton("enviar");
        sendBtn.setBounds(590, 430, 80, 20);
        ActionListener Enviar= new Enviar();
        sendBtn.addActionListener(Enviar);
        this.add(sendBtn);

        

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

        
        boton3.setText("Nuevo Contacto");   // colocamos un texto al boton
        boton3.setBounds(25, 125, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        ActionListener NCC= new NCC();
        boton3.addActionListener(NCC);      // hacemos que el boton tenga una accion y esa accion estara en esta clase

        boton4.setText("Salir");   // colocamos un texto al boton
        boton4.setBounds(25, 175, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        ActionListener Salir= new Salir();
        boton4.addActionListener(Salir);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
        // adicionamos los componentes a la ventana
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
   

    public static void main(String[] args) {
        Nc i = new Nc();      // creamos una ventana
        i.setVisible(true);             // hacemos visible la ventana creada
    }
}
