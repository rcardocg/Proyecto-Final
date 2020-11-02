package APP.BD;
import APP.BD.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import APP.*;
import APP.BD.*;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class ig extends JFrame implements ActionListener {
    JPasswordField caja2;
    JLabel texto, texto2;           // etiqueta o texto no editable
    JTextField caja;        // caja de texto, para insertar datos
    JButton boton;          // boton con una determinada accion
    
    public ig() {
        super();                    // usamos el contructor de la clase padre JFrame
        configurarVentana();        // configuramos la ventana
        inicializarComponentes();   // inicializamos los atributos o componentes
        
    }

    private void configurarVentana() {
        this.setTitle("Bienvenido");                   // colocamos titulo a la ventana
        this.setSize(500, 500);                                 // colocamos tamanio a la ventana (ancho, alto)
        this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
        this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
        this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // hacemos que cuando se cierre la ventana termina todo proceso
       

    }
 


    private void inicializarComponentes() {
        // creamos los componentes
        texto = new JLabel();
        caja = new JTextField();
        texto2 = new JLabel();
        caja2 = new JPasswordField();
        boton = new JButton();
        
        // configuramos los componentes
        texto.setText("Inserte Nombre");    // colocamos un texto a la etiqueta
        texto.setBounds(45, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        caja.setBounds(200, 50, 150, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        texto2.setText("Inserte Contrasena");    // colocamos un texto a la etiqueta
        texto2.setBounds(45, 100, 150, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
        caja2.setBounds(200, 100, 150, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
        boton.setText("Login");   // colocamos un texto al boton
        boton.setBounds(50, 200, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
        boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
     
        // adicionamos los componentes a la ventana
        this.add(texto);
        this.add(texto2);
        this.add(caja2);
        this.add(caja);
        this.add(boton);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent i) {
    String usuario= caja.getText();
    String pass=caja2.getText();
    //System.out.println(usuario);
    System.out.println("LOGIN "+ " " + usuario + " " +caja2.getText());
    try{
		DB myDb = new DB("testDb.db");//create one DB connection object
		if(!myDb.connect()){//create actual connection to db
			System.out.println("Error en db"+myDb.getError());
			System.exit(0);
		}
		myDb.executeQuery("SELECT * FROM Users","rs1");
		while(myDb.next("rs1"))
        if(usuario.equals( myDb.getString("Correo","rs1"))&& pass.equals(myDb.getString("Contrasena","rs1"))){
            System.out.println("OK LOGIN");
            Cliente user = new Cliente();
            ig2 r = new ig2();
            r.setVisible(true);
        }
		
		myDb.close(); //close connection
	 }catch(Exception e){
             System.out.println(e.getClass());
             System.out.println(e.getMessage());}

    }

    public static void main(String[] args) {
        ig o=new ig();
        o.setVisible(true);
    }
}
