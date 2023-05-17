
import java.util.ArrayList;
import java.util.Collections;

public class JuegoWordle {

  private String palabraAleatoria;

  private ArrayList<Integer> Evaluacion;

  private ArrayList<Character> letrasPalabraUsuario;

  private ArrayList<Character> letrasPalabraEscogida;

  private boolean victoria;

  public JuegoWordle() {

    palabraAleatoria = tomarPalabraAleatoria();

    letrasPalabraUsuario = new ArrayList<>();

    letrasPalabraEscogida = new ArrayList<>();

    Evaluacion = new ArrayList<>(Collections.nCopies(5, 5));

    victoria = false;

  }

  public String getPalabraAleatoria() {

    return palabraAleatoria.trim();

  }

  public void setVictoria(boolean victoria) {

    this.victoria = victoria;

  }

  public boolean getVictoria() {

    return victoria;

  }

  public ArrayList<Character> getletrasPalabraUsuario() {

    return letrasPalabraUsuario;

  }

  public ArrayList<Character> getletrasPalabraEscogida() {

    return letrasPalabraEscogida;

  }

  public ArrayList<Integer> getEvaluacion() {

    return Evaluacion;

  }

  public String tomarPalabraAleatoria() {

    BancoPalabras listaPalabras = new BancoPalabras();

    String palabraAleatoria;

    palabraAleatoria = listaPalabras.palabraAleatoria().trim().toUpperCase();

    return palabraAleatoria.trim();

  }

  public boolean comprobarPalabraValida(String palabra) {

    if (palabra.length() == 5) {

      return true;

    }
    return false;
  }

  public ArrayList<Character> sacarCaracteres(String palabra) {

    ArrayList<Character> caracteresPalabra = new ArrayList<>();

    for (int i = 0; i < palabra.length(); i++) {

      caracteresPalabra.add(palabra.charAt(i));

    }

    return caracteresPalabra;
  }

  public void compararString(String palabraUsuario, String palabraAleatoria) {

    char letraUsuario;
    char letraAleatoria;

    letrasPalabraUsuario = sacarCaracteres(palabraUsuario);
    letrasPalabraEscogida = sacarCaracteres(palabraAleatoria);

    for (int i = 0; i < letrasPalabraUsuario.size(); i++) {

      letraUsuario = letrasPalabraUsuario.get(i);
      letraAleatoria = letrasPalabraEscogida.get(i);

      if (letraUsuario == letraAleatoria) {

        Evaluacion.set(i, 1);

      } else if (letrasPalabraEscogida.contains(letraUsuario)) {

        Evaluacion.set(i, 2);

      } else {

        Evaluacion.set(i, 0);

      }
    }

    // System.out.println(Evaluacion);

  }

  public boolean comprobarVictoria() {

    int cantidadAciertos = 0;

    for (int i = 0; i < 5; i++) {

      if (Evaluacion.get(i) == 1) {

        cantidadAciertos++;
      }
    }

    if (cantidadAciertos == 5) {

      setVictoria(true);

      return true;

    } else {

      return false;

    }

  }

}
