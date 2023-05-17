import java.awt.Graphics;
import java.awt.Canvas;

public class Ficha extends Canvas {
    
    private Square contorno;
    private Square fondo;

    private GraphicString letra;

    public Ficha(char letraChar, int posicionX, int posicionY, int size) {

        contorno=new Square(60, "gray", posicionX+40, posicionY);   

        fondo=new Square(50, "white", posicionX+45, posicionY+5); 


    }



}