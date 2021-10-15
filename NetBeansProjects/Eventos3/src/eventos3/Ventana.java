
package eventos3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Ventana extends JFrame{
     private JTextField cajaTexto;
     private JTextArea areaTexto;
     private JPanel panel;
     
     Ventana(){
      setSize(500,500);
        setTitle("Eventos");
        iniciarComponentes();
       setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
     }
     private void iniciarComponentes(){
         colocarPanel();
         colocarCajaTexto();
         colocarAreasDeTexto();
     }
     private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
    }
    
     private void colocarCajaTexto(){
           cajaTexto = new JTextField();
           cajaTexto.setBounds(20,30,130,30);
         panel.add(cajaTexto);
         eventosDelTeclado();
     }
      private void colocarAreasDeTexto(){
        
         areaTexto = new JTextArea();
        areaTexto.setBounds(160,30,300,400);
        panel.add(areaTexto);
    }
      private void eventosDelTeclado(){
          KeyListener eventoTeclado = new KeyListener() {
              @Override
              public void keyTyped(KeyEvent e) {
                  //solo caracteres letras, numeros, signos ...
                  areaTexto.append("keyTyped\n");
              }

              @Override
              public void keyPressed(KeyEvent e) {
                 //presionar cualquier tecla del teclado, no hace falta soltarla, solo presionarla
                // areaTexto.append("keypressed\n");
              }

              @Override
              public void keyReleased(KeyEvent e) {
                  // PRESIONAR Y SOLTAR PARA QUE SE EJECUTE
                 // areaTexto.append("keyReleased\n");
                  if(e.getKeyChar() == 'p'){
                      areaTexto.append("Letra p");
                  }
                  if(e.getKeyChar() == '\n'){
                      areaTexto.append("enter");
                  }
                  if(e.getKeyChar() == ' '){
                      areaTexto.append("espacio");
                  }
              }
          };
          cajaTexto.addKeyListener(eventoTeclado);
      }
}
