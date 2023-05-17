import java.awt.Color;
import java.util.ArrayList;

public class InterfazWordle{

private Canvas canvas;


public InterfazWordle(){


mostrarTablero();
mostrarTeclado();


}



public void mostrarTablero(){
  
canvas=Canvas.getCanvas();

    int posicionX=0;

    int posicionY=15;
    
    for(int i=0;i<6;i++){
    
     posicionX=180;
    
     for(int j=0;j<5;j++){
    
      canvas.Ficha(' ', posicionX, posicionY, 40,Color.white);
      

      posicionX+=70;
    
        }
    
     posicionY+=70;
    }
    
}

public void mostrarTeclado(){

char letra;

Teclado letrasTeclado= new Teclado();

canvas=Canvas.getCanvas();

    int posicionX=60;

    int posicionY=450;
    
    int posicionLetra=0;
  
    for(int i=0;i<3;i++){
  
      posicionX=0;
  
      for(int j=0;j<=9;j++){
        
        letra=letrasTeclado.getLetra(posicionLetra);

        canvas.Ficha(letra, posicionX, posicionY, 40,Color.white);
       
        posicionLetra++;

        posicionX+=70;
  
         }
  
         posicionY+=70;
        }

 }

 public void juegoVisual(JuegoWordle juego) {

  int compatibilidad;
  
  ArrayList<Character> letrasPalabraUsuario=juego.getletrasPalabraUsuario();
   
  ArrayList<Character> letrasPalabraEscogida=juego.getletrasPalabraEscogida();
  
  ArrayList<Integer> Evaluacion = juego.getEvaluacion();
  
  System.out.println(letrasPalabraUsuario);
  
  System.out.println(letrasPalabraEscogida);
  
  System.out.println("evalaucion traspada="+Evaluacion);
  
  for(int i=0;i<Evaluacion.size();i++){
  
  compatibilidad=Evaluacion.get(i);
  
  switch(posicionCuadro){
   
    case 0: canvas.Ficha(letrasPalabraUsuario.get(i), posicionX, posicionY, 40,Color.gray);
  
            break;
  
    case 1: canvas.Ficha(letrasPalabraUsuario.get(i), posicionX, posicionY, 40,Color.green);
    
            break;
  
    case 2: canvas.Ficha(letrasPalabraUsuario.get(i), posicionX, posicionY, 40,Color.yellow);
  
            break;
  
    default:System.out.println("Opcion no encontrada");
  
  
  
  }
}
 }


}

 





