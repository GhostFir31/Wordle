import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class BancoPalabras {

  private ArrayList<String> arregloPalabras;

  public BancoPalabras() {
    String linea;

    arregloPalabras = new ArrayList<>();

    try {
      File listaPalabras = new File("src/Palabras");

      FileReader lectorArchivo = new FileReader(listaPalabras);

      BufferedReader bufferLector = new BufferedReader(lectorArchivo);

      while ((linea = bufferLector.readLine()) != null) {
        arregloPalabras.add(linea);
      }

      bufferLector.close();
      lectorArchivo.close();

    } catch (IOException e) {

      System.out.println("Error al leer el archivo: " + e.getMessage());
    }
  }

  public boolean buscarPalabra(String palabra) {

    for (String i : arregloPalabras) {

      if (i.trim().equals(palabra.trim())) {

        return true;

      }
    }
    return false;
  }

  public String buscarPosicion(int posicion) {

    return arregloPalabras.get(posicion).trim();

  }

  public String palabraAleatoria() {

    Random numeroAleatorio = new Random();

    int posicionAleatoria;

    posicionAleatoria = numeroAleatorio.nextInt(arregloPalabras.size());

    return arregloPalabras.get(posicionAleatoria).trim();

  }

  public void mostrarArregloArchivo() {
    int numeroPalabra = 0;

    for (String palabra : arregloPalabras) {

      System.out.println(" " + numeroPalabra + " " + palabra);

      numeroPalabra++;
    }

  }

}
