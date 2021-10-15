
package eventos2;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


public class Ventana extends JFrame{
    private JPanel panel;
     private JLabel saludo;
    private JTextArea areaTexto;
    private JButton boton;
    
    public Ventana(){
        setBounds(50,50,500,500);
        setTitle("Eventos");
        iniciarComponentes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarAreaTexto();
        colocarBoton();
    }
    
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
    private void colocarAreaTexto(){
        areaTexto = new JTextArea();
        areaTexto.setBounds(20,20,200,300);
        panel.add(areaTexto);
    }
    
    private void colocarBoton(){
         boton = new JButton("¡Pulsa aquí!");
        boton.setBounds(150,350,150,40);
        boton.setFont(new Font("arial",0,15));
        panel.add(boton);
        
         saludo = new JLabel();
        saludo.setBounds(50,200,300,40);
        saludo.setFont(new Font("arial",1,20));
        panel.add(saludo);
        //eventoOyenteDeAccion();
       eventoOyenteDeRaton();
    }
    
    private void eventoOyenteDeAccion(){
        
         ActionListener oyenteDeAccion = new ActionListener(){ //ActionListener es una interface, esta solo tiene un metodo disponible, el actionPerformed es un metodo abstracto del action listener 
            @Override
            public void actionPerformed(ActionEvent e) {
                saludo.setText("Hola "+areaTexto.getText());
            }
            
        };
        
        boton.addActionListener(oyenteDeAccion);
        
    }
    
    private void eventoOyenteDeRaton(){
        
        // agragando oyente de raton -MouseListener
        MouseListener oyenteDeRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) { //presionar y soltar dentro del boton
                areaTexto.append("Evento: mouseClicked\n\n");
            }

            @Override
            public void mousePressed(MouseEvent e) {
                //presionar, no hace falta que soltemos
                  areaTexto.append("Evento: mousePressed\n\n");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                //si presiono dentro y sulto fuero igual se ejecuta
                  areaTexto.append("Evento: mouseReleased\n\n");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                //cursor sobre el boton, no hace falta presionar
                  areaTexto.append("Evento: mouseEntered\n\n");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                //salir del boton
                  areaTexto.append("Evento: mouseExited\n");
            }
        };
        
       boton.addMouseListener(oyenteDeRaton);
   }
}
