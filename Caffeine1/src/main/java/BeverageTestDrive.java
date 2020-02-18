

public class BeverageTestDrive {
    
    public static void main(String[] args) {
         TeaWithHook teaHook = new TeaWithHook();
         CoffeeWithHook coffeeHook = new CoffeeWithHook();
           System.out.println("\nMezclando los ingredientes del te...");
         teaHook.prepararReceta();
           System.out.println("\nMezclando los ingredientes del café...");
         coffeeHook.prepararReceta();
    }
    
}
