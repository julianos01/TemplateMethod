
/*Clase abstracta que define la plantilla "Tenplate Method" */
public abstract class BebidaCafeina {
     final void prepararReceta() {
        hervirAgua();
        elaborarBebida();
        servir();
          if (clienteQuiereAdiciones()) {
            agregarAdiciones();
          }
     }
     
     //Métodos abstractos que serán implementados en las subclases 
     abstract void elaborarBebida();
     abstract void agregarAdiciones();
     
     //métodos concretos comunes en el proceso de preparar ambas bebidas
     void hervirAgua() {
        System.out.println("Hirviendo el agua");
     }
      void servir() {
       System.out.println("Sirviendo en taza");
     }
      boolean clienteQuiereAdiciones() {
      return true;
     }
    
}
