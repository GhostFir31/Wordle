
import javax.swing.JFrame;


public class VentanaWordle extends JFrame{

 public VentanaWordle(){
 
 setTitle("WORDLE");   

 setSize(770,700);

 add(new InterfazWordle());

 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 setLocationRelativeTo(null);

 setVisible(true);

 }
   
}
