/**
  *Escribe un programa que ordene tres números enteros introducidos por teclado.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio13OrdenNumeros { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que ordena tres números distintos");
    
        
    System.out.print("Por favor, introduzca un número: ");
    double numero1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca otro número distinto: ");
    double numero2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca un último número diferente: ");
    double numero3 = Double.parseDouble(System.console().readLine());
    
    if ((numero1 > numero2) && (numero2 > numero3)) {
      System.out.println(numero1 + " > " + numero2 + " > " + numero3);
      
      } else if ((numero1 > numero3) && (numero3 > numero2)) {
         System.out.println(numero1 + " > " + numero3 + " > " + numero2);
         }
      
    if ((numero2 > numero1) && (numero1 > numero3)) {
      System.out.println(numero2 + " > " + numero1 + " > " + numero3);
              
    } else if ((numero2 > numero3) && (numero3 > numero1)) {
      System.out.println(numero2 + " > " + numero3 + " > " + numero1);
      } 
         
    if ((numero3 > numero1) && (numero1 > numero2)) {
        System.out.println(numero3 + " > " + numero1 + " > " + numero2);
                 
    } else if ((numero3 > numero2) && (numero2 > numero1)) {
         System.out.println(numero3 + " > " + numero2 + " > " + numero1);
         }
  }
}
