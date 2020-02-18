import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;   


public class TeaWithHook extends BebidaCafeina {
     public void elaborarBebida() {
    System.out.println("Preparando el tea");
    }
    public void agregarAdiciones() {
    System.out.println("Agregando Limón");
    }
    public boolean clienteQuiereAdiciones() {
       String answer = getUserInput();
       if (answer.toLowerCase().startsWith("s")) {
       return true;
       } else {
       return false;

       }
    }
    private String getUserInput() {
       String answer = null;
       System.out.print("Quisieras agregar limón al te (s/n)? ");
       BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
          try {
            answer = in.readLine();
          } catch (IOException ioe) {
            System.err.println("IO error intentando leer tu respuesta");
          }
          if (answer == null) {
          return "no";
          }
    return answer;
    }
}
