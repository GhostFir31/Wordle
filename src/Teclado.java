import java.util.ArrayList;
import java.util.Arrays;

public class Teclado {

private ArrayList<Character> letrasTeclado;

public Teclado() {

    letrasTeclado = new ArrayList<Character>(Arrays.asList('Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Ñ', 'Z', 'X', 'C', 'V', 'B', 'N', 'M', '#', '#', '#'));
                                                                                        
}

 public ArrayList<Character> getTeclado() {

    return letrasTeclado;
    
}

public Character getLetra(int posicion){

    Character letra;
     
    letra = letrasTeclado.get(posicion);

    return letra;
}
}