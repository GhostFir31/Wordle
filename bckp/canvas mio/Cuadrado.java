import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Cuadrado {
    
public Cuadrado(){


}

public void dibujarLetra(Graphics grafico,int posicionX, int posicionY,char cadena,Color colorContorno,Color colorFondo) {
    
    grafico.setColor(colorContorno);

    grafico.fillRect(posicionX, posicionY, 60, 60); 
   
    grafico.setColor(colorFondo);
   
    grafico.fillRect(posicionX+5, posicionY+5, 50, 50); 
    
    int letraX = posicionX+15;

    int letraY = posicionY+43;
    
    grafico.setColor(Color.black);

    grafico.setFont(new Font("Arial",Font.PLAIN,40));
  
    String textoString = String.valueOf(cadena);
  
    grafico.drawString(textoString,letraX, letraY);

}

}
