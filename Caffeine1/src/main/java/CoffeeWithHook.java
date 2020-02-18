
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// clase CoffeeWithHook que extiende de la clase abstracta Bebida Cafeina
public class CoffeeWithHook extends BebidaCafeina {
    
    public void elaborarBebida() {
    System.out.println("Goteando café a través del filtro");
    }
   
/*    Si intentaramos redefinir el template method tenemos un error en la aplicación, 
      dado que el método de plantilla no puede ser sobreescrito en las subclases. 
   public void prepararReceta()
   {
       
   }
*/
    
    public void agregarAdiciones() {
    System.out.println("Agregando leche y azúcar");
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
       System.out.print("Quisieras agregar leche y azúcar al café (s/n)? ");
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
        