import java.awt.Graphics;


public class Ficha  {
    
    private Square contorno;
    private Square fondo;
    private Canvas canvas;
    

    public Ficha(char letraChar, int posicionX, int posicionY, int size,String ColorFondo) {


        canvas=canvas.getCanvas();

   

        contorno=new Square(60, "gray", posicionX+40, posicionY);   

        fondo=new Square(50, "white", posicionX+45, posicionY+5); 

        canvas.dibujarLetra(letraChar, posicionX, posicionY);
    }



}