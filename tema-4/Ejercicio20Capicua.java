/**
  *Realiza un programa que diga si un número entero positivo introducido por
  *teclado es capicúa. Se permiten números de hasta 5 cifras.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio20Capicua { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que permite saber si un número es capicúa");
    System.out.println("");
       
    System.out.print("Por favor, introduce un número: ");
    String numero = System.console().readLine();
    System.out.println("");
    
    int longitudNumero = numero.length();
    int numeroInt = Integer.parseInt(numero);
          
    switch (longitudNumero) { 
      
      case 1:
          System.out.printf("Es capicúa");
    break;
      
      case 2:
        double decenaNumero = numeroInt / Math.pow(10, longitudNumero - 1);
        int unidadNumero = numeroInt%10;
        
        if ((int)decenaNumero == unidadNumero) {
          System.out.println("El número es capicúa");
          
        } else { 
            System.out.println("El número no es capicúa");
                
        } 
      break;
        
      case 3:
        double centenaNumero = numeroInt / Math.pow(10, longitudNumero - 1);
        int unidadNumero1 = numeroInt%10;
          
        if ((int)centenaNumero == unidadNumero1) {
            System.out.println("El número es capicúa");
          
        } else { 
            System.out.println("El número no es capicúa");
                
        } 
      break;
        
      case 4:
        double unidadesMillarNumero = numeroInt / Math.pow(10, longitudNumero - 1);
        double centenasNumero1 = numeroInt / Math.pow(10, longitudNumero - 2);
        double decenasNumero1 = numeroInt / Math.pow(10, longitudNumero - 3);
        int unidadNumero2 = numeroInt%10;
                    
          if (((int)unidadesMillarNumero == unidadNumero2) && ((int)centenasNumero1%10 == (int)decenasNumero1%10)) {
            System.out.println("El número es capicúa");
          
          } else { 
            System.out.println("El número no es capicúa");
                
          } 
      break;
        
      case 5:
        double decenasMillarNumero = numeroInt / Math.pow(10, longitudNumero - 1);
        double unidadesMillarNumero1 = numeroInt / Math.pow(10, longitudNumero - 2);
        double decenasNumero2 = numeroInt / Math.pow(10, longitudNumero - 4);
        int unidadNumero3 = numeroInt%10;
                    
          if (((int)decenasMillarNumero == unidadNumero3) && ((int)unidadesMillarNumero1%10 == (int)decenasNumero2%10)) {
           System.out.println("El número es capicúa");
          
          } else { 
              System.out.println("El número no es capicúa");
                
          } 
      break;
      
      default:
        System.out.printf("El número introducido no es un entero");
      
    } 
    
  }
}
