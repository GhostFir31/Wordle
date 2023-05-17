
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        App app= new App();

        app.Wordle();

    }

    public void Wordle() {
     
      Scanner leer = new Scanner(System.in);
       
      JuegoWordle juego;

      InterfazWordle visualWordle;

      int posicionY=15;
       
      int opcion;

      do{
        
     System.out.println("*********Menu*********");   
     System.out.println("1.Jugar");
     System.out.println("2.Banco de Palabras");
     System.out.println("3.Salir");
          
       opcion=leer.nextInt();
       leer.nextLine();

      switch(opcion){

        case 1: 
                String palabraUsuario;
                
                int intentos=0;

                juego = new JuegoWordle();

                visualWordle=new InterfazWordle();

               do{
                System.out.println("Intenta Adivinar La Palabra! "+juego.getPalabraAleatoria());
                
                palabraUsuario=leer.nextLine();

                if(!juego.comprobarPalabraValida(palabraUsuario)){
                  
                  System.out.println("Recuerda que son palabras de 5 letras solamente y sin espacios.");
            
                }
                else{

                 juego.compararString(palabraUsuario,juego.getPalabraAleatoria().trim());

                 posicionY=visualWordle.juegoVisual(juego,posicionY);

                intentos++;

              }
                
                System.out.println("intentos="+intentos);

                 }while(intentos!=6 && !juego.comprobarVictoria());
                   
                 if(juego.getVictoria()){
                    
                  System.out.println("Felicidades Ganaste!");
                  System.out.println("Adivinaste la palabra correcta: " + juego.getPalabraAleatoria());
                 
                }else{
 
                  System.out.println("Perdiste no pudiste adivinar la palabra en menos de 6 intentos:[");

                 }

              break;

       case 2: menuBancoLetras();
              break;

      case 3: System.out.println("Saliendo:D");
               break;      
      
      }

    }while(opcion!=3);
          
    }

    void menuBancoLetras() {
     
      Scanner leer = new Scanner(System.in);

      BancoPalabras extraerPalabra = new BancoPalabras();

      String palabra,palabraBuscar;
      
      int opcion;

      do{
        
     System.out.println("1.Escoger una palabra por su posicion");
     System.out.println("2.Escoger una palabra aleatoria");
     System.out.println("3.Mostrar todas las palabras junto su posicion");
     System.out.println("4.Buscar si una palabra esta en el banco");
     System.out.println("5.Salir");
          
       opcion=leer.nextInt();
            leer.nextLine();
      switch(opcion){

        case 1: System.out.println("dame una posicion para leer del archivo");
      
              int posicion=leer.nextInt();
              leer.nextLine();
              palabra=extraerPalabra.buscarPosicion(posicion-1);

              System.out.println(""+palabra);
              break;

      case 2:  System.out.println(""+extraerPalabra.palabraAleatoria());
                  break;
      case 3: extraerPalabra.mostrarArregloArchivo();
                 break;
             
      case 4:  System.out.println("Cual palabra busca");

                palabraBuscar=leer.nextLine();

               System.out.println(""+extraerPalabra.buscarPalabra(palabraBuscar));
               break;

      case 5: System.out.println("Salir");
               break;      
      
      }

    }while(opcion!=5);


    }
    
}
