
public class InterfazWordle{


public InterfazWordle(){


mostrarTablero();
mostrarTeclado();


}



public void mostrarTablero(){

    int posicionX=0;

    int posicionY=15;
    
    for(int i=0;i<6;i++){
    
     posicionX=180;
    
     for(int j=0;j<5;j++){
    
        new Ficha(' ',posicionX,posicionY,40); 

      posicionX+=70;
    
        }
    
     posicionY+=70;
    }
    
}

public void mostrarTeclado(){

    int posicionX=60;

    int posicionY=450;
    
    int posicionLetra=0;
  
    for(int i=0;i<3;i++){
  
      posicionX=0;
  
      for(int j=0;j<=9;j++){
        
        new Ficha('X',posicionX,posicionY,40);
        
        posicionX+=70;
  
         }
  
         posicionY+=70;
        }

 }

}

 





