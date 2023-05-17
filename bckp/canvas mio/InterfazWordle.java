
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.io.IOException;
import java.util.ArrayList;

public class InterfazWordle extends Canvas{

private Cuadrado tecladoVisual= new Cuadrado();

private Teclado letrasTeclado = new Teclado();

private char letra;

public InterfazWordle() {

  setBackground(Color.white);

  }

  public Graphics getGrafico() {

    return this.getGraphics();
  
  }

public void paint(Graphics grafico){

int posicionX=25;

int posicionY=15;

for(int i=0;i<6;i++){

 posicionX=0;

 for(int j=0;j<5;j++){

 grafico.setColor(Color.gray);

 grafico.fillRect(posicionX+215, posicionY, 60, 60); 

 grafico.setColor(Color.white);

 grafico.fillRect(posicionX+220, posicionY+5, 50, 50); 

  posicionX+=70;

    }

 posicionY+=70;
}

imprimirTeclado(grafico);

}

public void imprimirTeclado(Graphics grafico){
 
  int posicionX=60;

  int posicionY=450;
  
  int posicionLetra=0;

  for(int i=0;i<3;i++){

    posicionX=35;

    for(int j=0;j<=9;j++){
      
      letra=letrasTeclado.getLetra(posicionLetra);
      
      tecladoVisual.dibujarLetra(grafico,posicionX,posicionY,letra,Color.gray,Color.white);   
      
      posicionLetra++;

      posicionX+=70;

       }

       posicionY+=70;
   }
}

public void juegoVisual(Graphics grafico) throws IOException{

  int opcion;
  
  Cuadrado cuadro = new Cuadrado();
  
  ArrayList<Character> letrasPalabraUsuario=juego.getletrasPalabraUsuario();
   
  ArrayList<Character> letrasPalabraEscogida=juego.getletrasPalabraEscogida();
  
  ArrayList<Integer> Evaluacion = juego.getEvaluacion();
  
  System.out.println(letrasPalabraUsuario);
  
  System.out.println(letrasPalabraEscogida);
  
  System.out.println("evalaucion traspada="+Evaluacion);
  
  for(int i=0;i<Evaluacion.size();i++){
  
  opcion=Evaluacion.get(i);
  
  switch(opcion){
   
    case 0: cuadro.dibujarLetra(grafico,0,0,letrasPalabraUsuario.get(i),Color.black,Color.gray);
  
            break;
  
    case 1: cuadro.dibujarLetra(grafico,0,0,letrasPalabraUsuario.get(i),Color.black,Color.green);
    
            break;
  
    case 2: cuadro.dibujarLetra(grafico,0,0,letrasPalabraUsuario.get(i),Color.black,Color.yellow);
  
            break;
  
    default:System.out.println("Opcion no encontrada");
  
  }
  
  }
  
  }
  


}
