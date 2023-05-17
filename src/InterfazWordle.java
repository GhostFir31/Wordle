import java.awt.Color;
import java.util.ArrayList;

public class InterfazWordle {

  private Canvas canvas;

  public InterfazWordle() {

    mostrarTablero();
    mostrarTeclado();
  }

  public void mostrarTablero() {

    canvas = Canvas.getCanvas();

    int posicionX = 0;

    int posicionY = 15;

    for (int i = 0; i < 6; i++) {

      posicionX = 180;

      for (int j = 0; j < 5; j++) {

        canvas.Ficha(' ', posicionX, posicionY, 40, Color.white);

        posicionX += 70;

      }

      posicionY += 70;
    }

  }

  public void mostrarTeclado() {

    char letra;

    Teclado letrasTeclado = new Teclado();

    canvas = Canvas.getCanvas();

    int posicionX = 60;

    int posicionY = 450;

    int posicionLetra = 0;

    for (int i = 0; i < 3; i++) {

      posicionX = 0;

      for (int j = 0; j <= 9; j++) {

        letra = letrasTeclado.getLetra(posicionLetra);

        canvas.Ficha(letra, posicionX, posicionY, 40, Color.white);

        posicionLetra++;

        posicionX += 70;

      }

      posicionY += 70;
    }

  }

  public int juegoVisual(JuegoWordle juego, int posicionY) {

    int compatibilidad;

    int posicionX = 180;

    ArrayList<Character> letrasPalabraUsuario = juego.getletrasPalabraUsuario();

    ArrayList<Integer> Evaluacion = juego.getEvaluacion();

    /*
     * System.out.println(letrasPalabraUsuario);
     * 
     * System.out.println(letrasPalabraEscogida);
     * 
     * System.out.println("evalaucion traspada="+Evaluacion);
     */

    for (int i = 0; i < Evaluacion.size(); i++) {

      compatibilidad = Evaluacion.get(i);

      switch (compatibilidad) {

        case 0:
          canvas.Ficha(letrasPalabraUsuario.get(i), posicionX, posicionY, 40, Color.gray);

          break;

        case 1:
          canvas.Ficha(letrasPalabraUsuario.get(i), posicionX, posicionY, 40, Color.green);

          break;

        case 2:
          canvas.Ficha(letrasPalabraUsuario.get(i), posicionX, posicionY, 40, Color.yellow);

          break;

        default:

          System.out.println("Opcion no encontrada");

      }

      posicionX += 70;

    }

    return posicionY += 70;

  }
  
  public Color compatibilidad(JuegoWordle juego){

    int compatibilidad;

    ArrayList<Integer> Evaluacion = juego.getEvaluacion();

    for (int i = 0; i < Evaluacion.size(); i++) {

      compatibilidad = Evaluacion.get(i);

      switch (compatibilidad) {

        case 0:
                
            return Color.gray;

          

        case 1:
               
            return Color.green;

          

        case 2:
          
           return Color.yellow;      

        default:

          System.out.println("Opcion no encontrada");

      }
    }
    return Color.blue;  
  }

  
  public int pintarLetraTeclado(JuegoWordle juego) {

   Teclado listaLetras=new Teclado();

   ArrayList<Character> letrasPalabraUsuario = juego.getletrasPalabraUsuario();


  for(int i=0;i<letrasPalabraUsuario.size();i++){

   switch(letrasPalabraUsuario.get(i)){

    case 'Q': canvas.Ficha(letrasPalabraUsuario.get(i), 0, 450, 40, compatibilidad(juego));
              
              break;
    case 'W': canvas.Ficha(letrasPalabraUsuario.get(i), 0+70, 450, 40, compatibilidad(juego));
              
              break;
    case 'E': canvas.Ficha(letrasPalabraUsuario.get(i), 0+140, 450, 40, compatibilidad(juego));
             
              break;
    case 'R': canvas.Ficha(letrasPalabraUsuario.get(i), 0+210, 450, 40, compatibilidad(juego));
              
              break;
    case 'T': canvas.Ficha(letrasPalabraUsuario.get(i), 0+280, 450, 40, compatibilidad(juego));
              
              break;
    case 'Y': canvas.Ficha(letrasPalabraUsuario.get(i), 0+350, 450, 40, compatibilidad(juego));
              
              break;
    case 'U': canvas.Ficha(letrasPalabraUsuario.get(i), 0+420, 450, 40, compatibilidad(juego));
              
              break;
    case 'I': canvas.Ficha(letrasPalabraUsuario.get(i), 0+490, 450, 40, compatibilidad(juego));
              
              break;
    case 'O': canvas.Ficha(letrasPalabraUsuario.get(i), 0+560, 450, 40, compatibilidad(juego));
              
              break;
    case 'P': canvas.Ficha(letrasPalabraUsuario.get(i), 0+630, 450, 40, compatibilidad(juego));
              
              break;
    case 'A': canvas.Ficha(letrasPalabraUsuario.get(i), 0, 450+70, 40, compatibilidad(juego));
              
              break;
    case 'S': canvas.Ficha(letrasPalabraUsuario.get(i), 0+70, 450+70, 40, compatibilidad(juego));
              
              break;
    case 'D': canvas.Ficha(letrasPalabraUsuario.get(i), 0+140, 450+70, 40, compatibilidad(juego));
              
              break;
    case 'F': canvas.Ficha(letrasPalabraUsuario.get(i), 0+210, 450+70, 40, compatibilidad(juego));
              
              break;
    case 'G': canvas.Ficha(letrasPalabraUsuario.get(i), 0+280, 450+70, 40, compatibilidad(juego));
              
              break;
    case 'H': canvas.Ficha(letrasPalabraUsuario.get(i), 0+350, 450+70, 40, compatibilidad(juego));
              
              break;
    case 'J': canvas.Ficha(letrasPalabraUsuario.get(i), 0+420, 450+70, 40, compatibilidad(juego));
              
              break;
    case 'K': canvas.Ficha(letrasPalabraUsuario.get(i), 0+490, 450+70, 40, compatibilidad(juego));
              
              break;
    case 'L': canvas.Ficha(letrasPalabraUsuario.get(i), 0+560, 450+70, 40, compatibilidad(juego));
             
              break;
    case 'Ñ': canvas.Ficha(letrasPalabraUsuario.get(i), 0+630, 450, 40, compatibilidad(juego));
              
              break;
    case 'Z': canvas.Ficha(letrasPalabraUsuario.get(i), 0, 450+140, 40, compatibilidad(juego));
              
              break;
    case 'X': canvas.Ficha(letrasPalabraUsuario.get(i), 0+70, 450+140, 40, compatibilidad(juego));
              
              break;
    case 'C': canvas.Ficha(letrasPalabraUsuario.get(i), 0+140, 450+140, 40, compatibilidad(juego));
              
              break;
    case 'V': canvas.Ficha(letrasPalabraUsuario.get(i), 0+210, 450+140, 40, compatibilidad(juego));
              
              break;
    case 'B': canvas.Ficha(letrasPalabraUsuario.get(i), 0+280, 450+140, 40, compatibilidad(juego));
              
              break;
    case 'N': canvas.Ficha(letrasPalabraUsuario.get(i), 0+350, 450+140, 40, compatibilidad(juego));
              
              break;
    case 'M': canvas.Ficha(letrasPalabraUsuario.get(i), 0+420, 450+140, 40, compatibilidad(juego));
              
              break;
    
    default: System.out.println("Fuera de lugar");
                          
}
 
}  
  return 0;
} 

}
