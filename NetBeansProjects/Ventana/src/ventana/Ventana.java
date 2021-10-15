
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame; // javax.swing paqute de graficos, tiene diferentes interfaces y JFrame es una clase
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Ventana extends JFrame{
    public JPanel panel;
    // constructor
    public Ventana(){
                    // primero es el ancho y el otro es el largo
         this.setSize(500,500);// estableceremos el tamaño de la ventana, este metodo deriva de la clase windows. Estas medidas son en pixeles
         // centrar la ventana, por defecto, la ventana se coloca en el punto 0,0
       // this.setLocation(100,200);//cordenadas x,y. Estas medidas son en pixeles. Dejamos 100 pixeles de espacio en x y 200 en y
     
       //  this.setBounds(100,200,500,500); //nos permite unir setSize y setLocation.  x,y,ancho,alto
     
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // hacer que EL PROGRAMA FINALICE CUANDO CIERRE LA VENTANA, puede hacer diversas cosas (esconder, nada...)
        this.setTitle("El mejor titulo"); //establecer el titulo de la ventana
        
        //centrar la ventana sin importar el tamaño de la pantalla de cada dispositivo
        this.setLocationRelativeTo(null); // si le ponemos null, aparecerá en el centro de la pantalla
        
       // this.setResizable(false);// establecemos si la ventana puede cambiar de tamaño o no
       this.setMinimumSize(new Dimension(200,200)); // establecemos el tamaño minimo d ela ventrana
       
       //this.getContentPane().setBackground(Color.pink); // ESTABLECER EL COLOR D ELA VENTANA
       
       // metodo para crear el panel y encima el panel
       iniciarComponentes();
       
       
    }
    // metodo para crear el panel
    // paneles, sobre estos ponemos poner botones, cajas de texto.... Gracias a los paneles podemos tener organizados nuetra ventana
    
    private void iniciarComponentes(){
       
        colocarPaneles();
       // colocarEtiquetas();
       //colocarBotones();
      // colocarRadioBotones();
     // colocarCajasDeTexto();
      // colocarAreasDeTexto();
      colocarListasDesplegables();
    }
    
    
    private void colocarPaneles(){
         //instanciamos el panel
         panel = new JPanel(); //creamos el panel
       // panel.setBackground(Color.GREEN); // ESTABLECEMOS EL COLOR DEL PANEL
        //poner el panel sobre la ventana, this = ventana
        
        panel.setLayout(null); // estamos deshabilitando el diseño por defecto delcontenedor del panel, así podremos colocar lña etiqueta donde deseamos
        this.getContentPane().add(panel);
    }
    private void colocarEtiquetas(){
         // LAS ETIQUETAS: DE TEXTO O IMAGENES
        
        //ETIQUETA DE TEXTO                     //SwingConstants nos permite establecer la posicion del texto  CENTER, RIGHT, LEFT
        JLabel etiqueta = new JLabel(/*"Hola",SwingConstants.CENTER*/); //JLabel es una etiqueta En este caso es de texto
       etiqueta.setText("Nice Flower"); // podemos añadir el texto de esta forma o directamente en el metodo constructor
       etiqueta.setHorizontalAlignment(SwingConstants.CENTER); // tambien lo podemos ajustar la ubicaion horizontal de esta forma, y no directamente en el constructor
        etiqueta.setBounds(85,10,300,70); // posicion de la etiqueta
        etiqueta.setForeground(Color.CYAN); // cambiar el color de la letra de la etiqueta
        etiqueta.setOpaque(true); // quitamos el diseño por defecto de la etiqueta,así permitimos pintar el fondo de la etiqueta
        //etiqueta.setBackground(Color.BLACK);//EL FONDO DE LAS ETIQUETAS ES TRANPARENTE POR DEFECTO, LE CAMBIAMOS EL COLOR DEL FONDO
        etiqueta.setFont(new Font("cooper black",Font.PLAIN,40));//establecer la funete o letra Recibe tres parametros: el nombre del tipo de letra, el estilo (negrita, italica..) de la letra y el tamaño de la letra 
                                   //El tipo depende edel tipo de sistema oiperativo que estemos usando
                                   //Font.ITALIC TAMBIEN SE PUEDE CAMBIAR POR NUMEROS, SEGUN EL VALOR QUE REPRESENTA A CADA ESTILO DE FUENTE
        panel.add(etiqueta); // agregamos la etiqueta al panel
        
        
        //Etiqueta 2 - tipo imagen
        //la imagen es mejor guardarla en la misma carpeta del proyecto
         //----------------- OTRA OPCION
         //JLabel etiqueta2 = new JLabel();
        //etiqueta2.setIcon(new ImageIcon("flower.jpg"));
        
        //---------------- OTRA OPCION
        //JLabel etiqueta2 = new JLabel(new ImageIcon("flower.jpg")); // el nombre del archivo y su extension
        
        //----------------- OTRA OPCION
        ImageIcon imagen = new ImageIcon("flower.jpg");
        JLabel etiqueta2 = new JLabel(/*imagen*/); // el nombre del archivo y su extension
        
        etiqueta2.setBounds(80,90,300,300);//debemos posicionar la etiqueta, pues le habiamos quitado el diseño por defecto del panel
                                                                                //etiqueta2.getWidth() la imagn va a tener el mimo ancho y alto de la etiqueta
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));//getScaledInstance permite modificar el tamaño de la imagen
        panel.add(etiqueta2); // la agregamos al panel
    }
    
    private void  colocarBotones(){
        //Boton 1 - texto
        JButton boton1 = new JButton(/*"Click"*/);//le ponemos texto al boton
        boton1.setText("Click");//tambien podemos establecer texto de esta forma
        // indicarle la posicion, pues habiamos deshabilitado el layout del panel
        boton1.setBounds(100,100,100,40);
        boton1.setEnabled(true); //habilitar o deshabilitar la funcion/interaccion del boton
        boton1.setMnemonic('a'); // cuando presione alt + a es como si le dieramos click al boton; podemos definir la letra que deseemos
        boton1.setForeground(Color.blue);// cambiar color a la letra del boton
        boton1.setFont(new Font("cooper black",3,20));//establecer la fuente d ela letra
        panel.add(boton1);
        
        // Boton 2 - imagen
         JButton boton2 = new JButton();
         boton2.setBounds(100,200,100,40);
         ImageIcon clickAqui = new ImageIcon("boton.png");//crear la imagen
         boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
         //boton2.setBackground(Color.BLUE); // COLOR DE FONDO DEL BOTON
         panel.add(boton2);
         
         
    }
    
    private void colocarRadioBotones(){
        JRadioButton radioBoton1 = new JRadioButton("Opcion 1",true);
        radioBoton1.setBounds(50,100,200,50);
       // radioBoton1.setEnabled(false);//si va a estar disponinle o no, si se pued emarcar o no
        radioBoton1.setText("Programacion");//texto
        radioBoton1.setFont(new Font("cooper black",Font.BOLD,20));
        panel.add(radioBoton1);
        
        JRadioButton radioBoton2 = new JRadioButton("Opcion 2",false);
        radioBoton2.setBounds(50,150,100,50);
        panel.add(radioBoton2);
        
        JRadioButton radioBoton3 = new JRadioButton("Opcion 3",false);
        radioBoton3.setBounds(50,200,100,50);
        panel.add(radioBoton3);
        
        
        //crear grupo de botones 
        ButtonGroup grupoRadioBotones = new ButtonGroup();
        //Agragamos los botones
        grupoRadioBotones.add(radioBoton1);
        grupoRadioBotones.add(radioBoton2);
        grupoRadioBotones.add(radioBoton3);
    }
    
    private void colocarCajasDeTexto(){
        // cajas de texto de una sola linea
        JTextField cajaTexto = new JTextField(/*"Hola",20*/);// 20 REPRESENTA EL NUMERO DE COLUMNAS
       cajaTexto.setBounds(50,50,200,30);
        cajaTexto.setText("Hola...");
        System.out.println("El texto que hay en la caja es: "+cajaTexto.getText()); //cajaTexto.getText() obtenemos el texto que hay en la caja
        panel.add(cajaTexto);
    }
    
    private void colocarAreasDeTexto(){
        
        JTextArea  areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,300,200);
        areaTexto.setText("Escriba el texto aquí ");
        areaTexto.append(" Escribe por aquí\n");// este metodo añade mas texto al area de texto
        areaTexto.setEditable(false); //permitir o no editar todo el contenido que hay en el area de txto
        System.out.println("El texto es: "+areaTexto.getText()); //obtener el texto citado
        panel.add(areaTexto);
    }
    
    private void colocarListasDesplegables(){
        
        //arreglo de objetos String
        String [] paises = {"Peru","Colombia","Paraguay","Ecuador"};
        
        JComboBox listaDesplegable = new JComboBox(paises);
        
        listaDesplegable.setBounds(20,20,100,30);
        
        //agragar mas objetos a al array
        listaDesplegable.addItem("Argentina");
        
        //establecer el predeterminado
       listaDesplegable.setSelectedItem("Paraguay");
        
        panel.add(listaDesplegable);
    }
}
