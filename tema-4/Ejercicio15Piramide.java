/**
  *Rescribe un programa que pinte una pirámide rellena con un carácter introducido
  *por teclado que podrá ser una letra, un número o un símbolo como *, +, -, $, &,
  *etc. El programa debe permitir al usuario mediante un menú elegir si el vértice
  *de la pirámide está apuntando hacia arriba, hacia abajo, hacia la izquierda o
  *hacia la derecha.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio15Piramide { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que pinta una pirámide.");
    
        
    System.out.print("Por favor, introduzca un símbolo: ");
    String simbolo = System.console().readLine();
    System.out.println("");
   
    System.out.println("\t" + "   " + simbolo);
    System.out.println("\t" +  "  " + simbolo + simbolo + simbolo);
    System.out.println("\t" + " " + simbolo + simbolo + simbolo + simbolo + simbolo);
    System.out.println("\t" + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo);
    
    System.out.println("");
    System.out.println("Elija hacia donde quiere que apunte el vértice superior de la prirámide: \n");
    System.out.println("1. Hacia arriba");
    System.out.println("2. Hacia abajo");
    System.out.println("3. Hacia la izquierda");
    System.out.println("4. Hacia la derecha \n");
    
    System.out.print("Por favor, introduzca el número de su opción: ");
    int opcion = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    switch (opcion) {
      case 1:
        System.out.println("\t" + "   " + simbolo);
        System.out.println("\t" +  "  " + simbolo + simbolo + simbolo);
        System.out.println("\t" + " " + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println("\t" + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo);
            
      break;
      
      case 2:
        System.out.println("\t" + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println("\t" + " " + simbolo + simbolo + simbolo + simbolo + simbolo);
        System.out.println("\t" +  "  " + simbolo + simbolo + simbolo);
        System.out.println("\t" + "   " + simbolo);        
            
      break;
      
      case 3:
        System.out.println("\t" + "       " + simbolo);
        System.out.println("\t" + "      " + simbolo + simbolo);
        System.out.println("\t" + "     " + simbolo + simbolo + simbolo);
        System.out.println("\t" + "    " + simbolo + simbolo + simbolo + simbolo);
        System.out.println("\t" + "     " + simbolo + simbolo + simbolo); 
        System.out.println("\t" + "      " + simbolo + simbolo); 
        System.out.println("\t" + "       " + simbolo);         
            
      break;
      
      case 4:
        System.out.println("\t" + simbolo);
        System.out.println("\t" + simbolo + simbolo);
        System.out.println("\t" + simbolo + simbolo + simbolo);
        System.out.println("\t" + simbolo + simbolo + simbolo + simbolo);
        System.out.println("\t" + simbolo + simbolo + simbolo); 
        System.out.println("\t" + simbolo + simbolo); 
        System.out.println("\t" + simbolo);         
            
      break;
      
      default:
        System.out.println("No existe esa opción");
    }
       
  }
}
