/**
  *Una pastelería nos ha pedido realizar un programa que haga presupuestos de
  *tartas. El programa preguntará primero de qué sabor quiere el usuario la tarta:
  *manzana, fresa o chocolate. La tarta de manzana vale 18 euros y la de fresa
  *16. En caso de seleccionar la tarta de chocolate, el programa debe preguntar
  *además si el chocolate es negro o blanco; la primera opción vale 14 euros y la
  *segunda 15. Por último se pregunta si se añade nata y si se personaliza con un
  *nombre; la nata suma 2.50 y la escritura del nombre 2.75.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio27PresupuestosTartas { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Presupuesto Tartas\n");
           
    System.out.print("Por favor, elija un sabor (manzana, fresa o chocolate): ");
    String saborTarta = System.console().readLine().toLowerCase();
       
    System.out.print("¿Quiere nata? (si o no): ");
    String nata = System.console().readLine().toLowerCase();
    
    System.out.print("¿Quiere ponerle un nombre? (s/n): ");
    String nombreTarta= System.console().readLine().toLowerCase();
    
    System.out.println("Gracias por su compra.\n");
    
    switch (saborTarta) {
      case "manzana":
      
        if (nata.equals("si") && nombreTarta.equals("s"))  {
          System.out.println("Tarta de manzana con nata y nombre");
          double precioTartaManzana = 18;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaManzana);
          double precioNata = 2.50;
          System.out.printf("Precio con nata: %8.2f€\n", precioNata);
          double precioNombre = 2.75;
          System.out.printf("Precio con nombre:%7.2f€\n", precioNombre);
          double total = precioTartaManzana + precioNata + precioNombre;
          System.out.printf("Total:%19.2f€\n", total);
                
        } else if (nata.equals("si") && nombreTarta.equals("n")) {
          System.out.println("Tarta de manzana con nata sin nombre");
          double precioTartaManzana = 18;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaManzana);
          double precioNata = 2.50;
          System.out.printf("Precio con nata: %8.2f€\n", precioNata);
          double total = precioTartaManzana + precioNata;
          System.out.printf("Total:%19.2f€\n", total);
          
        } else if (nata.equals("no") && nombreTarta.equals("s")) {
          System.out.println("Tarta de manzana con nombre");
          double precioTartaManzana = 18;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaManzana);
          double precioNombre = 2.75;
          System.out.printf("Precio con nombre:%7.2f€\n", precioNombre);
          double total = precioTartaManzana + precioNombre;
          System.out.printf("Total:%19.2f€\n", total);
          
        } else if (nata.equals("no") && nombreTarta.equals("n")) {
          System.out.println("Tarta de manzana");
          double precioTartaManzana = 18;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaManzana);
          double total = precioTartaManzana;
          System.out.printf("Total:%19.2f€\n", total);  
        }    
      break;
      
      case "fresa":
        if (nata.equals("si") && nombreTarta.equals("s"))  {
          System.out.println("Tarta de fresa con nata y nombre");
          double precioTartaFresa = 16;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaFresa);
          double precioNata = 2.50;
          System.out.printf("Precio con nata: %8.2f€\n", precioNata);
          double precioNombre = 2.75;
          System.out.printf("Precio con nombre:%7.2f€\n", precioNombre);
          double total = precioTartaFresa + precioNata + precioNombre;
          System.out.printf("Total:%19.2f€\n", total);
                
        } else if (nata.equals("si") && nombreTarta.equals("n")){
          System.out.println("Tarta de fresa con nata sin nombre");
          double precioTartaFresa = 16;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaFresa);
          double precioNata = 2.50;
          System.out.printf("Precio con nata: %8.2f€\n", precioNata);
          double total = precioTartaFresa + precioNata;
          System.out.printf("Total:%19.2f€\n", total);
          
        } else if (nata.equals("no") && nombreTarta.equals("s")) {
          System.out.println("Tarta de fresa con nombre");
          double precioTartaFresa = 16;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaFresa);
          double precioNombre = 2.75;
          System.out.printf("Precio con nombre:%7.2f€\n", precioNombre);
          double total = precioTartaFresa + precioNombre;
          System.out.printf("Total:%19.2f€\n", total);
          
        } else if (nata.equals("no") && nombreTarta.equals("n")) {
          System.out.println("Tarta de fresa");
          double precioTartaFresa = 16;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaFresa);
          double total = precioTartaFresa;
          System.out.printf("Total:%19.2f€\n", total);    
        }    
      break;
      
      case "chocolate":
        System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
        String tipoChocolate = System.console().readLine().toLowerCase();
        
        if (tipoChocolate.equals("negro") && nata.equals("si") && nombreTarta.equals("s"))  {
          System.out.println("Tarta de chocalate negro con nata y nombre");
          double precioTartaChocolateNegro = 14;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaChocolateNegro);
          double precioNata = 2.50;
          System.out.printf("Precio con nata: %8.2f€\n", precioNata);
          double precioNombre = 2.75;
          System.out.printf("Precio con nombre:%7.2f€\n", precioNombre);
          double total = precioTartaChocolateNegro + precioNata + precioNombre;
          System.out.printf("Total:%19.2f€\n", total);
                
        } else if (tipoChocolate.equals("negro") && nata.equals("si") && nombreTarta.equals("n")) {
          System.out.println("Tarta de chocalate negro con nata sin nombre");
          double precioTartaChocolateNegro = 14;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaChocolateNegro);
          double precioNata = 2.50;
          System.out.printf("Precio con nata: %8.2f€\n", precioNata);
          double total = precioTartaChocolateNegro + precioNata;
          System.out.printf("Total:%19.2f€\n", total);
          
        } else if (tipoChocolate.equals("negro") && nata.equals("no") && nombreTarta.equals("s")) {
          System.out.println("Tarta de chocolate negro con nombre");
          double precioTartaChocolateNegro = 14;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaChocolateNegro);
          double precioNombre = 2.75;
          System.out.printf("Precio con nombre:%7.2f€\n", precioNombre);
          double total = precioTartaChocolateNegro + precioNombre;
          System.out.printf("Total:%19.2f€\n", total);
          
        } else if (tipoChocolate.equals("negro") && nata.equals("no") && nombreTarta.equals("n")) {
          System.out.println("Tarta de chocolate negro con nombre");
          double precioTartaChocolateNegro = 14;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaChocolateNegro);
          double total = precioTartaChocolateNegro;
          System.out.printf("Total:%19.2f€\n", total); 
          
        } else if (tipoChocolate.equals("blanco") && nata.equals("si") && nombreTarta.equals("s"))  {
          System.out.println("Tarta de chocalate blanco con nata y nombre");
          double precioTartaChocolateBlanco = 15;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaChocolateBlanco);
          double precioNata = 2.50;
          System.out.printf("Precio con nata: %8.2f€\n", precioNata);
          double precioNombre = 2.75;
          System.out.printf("Precio con nombre:%7.2f€\n", precioNombre);
          double total = precioTartaChocolateBlanco + precioNata + precioNombre;
          System.out.printf("Total:%19.2f€\n", total);  
          
        } else if (tipoChocolate.equals("blanco") && nata.equals("si") && nombreTarta.equals("n")) {
          System.out.println("Tarta de chocalate blanco con nata sin nombre");
          double precioTartaChocolateBlanco = 115;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaChocolateBlanco);
          double precioNata = 2.50;
          System.out.printf("Precio con nata: %8.2f€\n", precioNata);
          double total = precioTartaChocolateBlanco + precioNata;
          System.out.printf("Total:%19.2f€\n", total);
          
        } else if (tipoChocolate.equals("blanco") && nata.equals("no") && nombreTarta.equals("s")) {
          System.out.println("Tarta de chocolate blanco con nombre");
          double precioTartaChocolateBlanco = 15;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaChocolateBlanco);
          double precioNombre = 2.75;
          System.out.printf("Precio con nombre:%7.2f€\n", precioNombre);
          double total = precioTartaChocolateBlanco + precioNombre;
          System.out.printf("Total:%19.2f€\n", total);
          
        } else if (tipoChocolate.equals("blanco") && nata.equals("no") && nombreTarta.equals("n")) {
          System.out.println("Tarta de chocolate blanco con nombre");
          double precioTartaChocolateBlanco = 15;
          System.out.printf("Precio de la tarta: %.2f€\n", precioTartaChocolateBlanco);
          double total = precioTartaChocolateBlanco;
          System.out.printf("Total:%19.2f€\n", total);    
        } 
      break;
              
    default:
      System.out.println("No es un tipo tarta");
    }  
            
  }
}
