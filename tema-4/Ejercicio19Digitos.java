/**
  *Realiza un programa que nos diga cuántos dígitos tiene un número entero que
  *puede ser positivo o negativo. Se permiten números de hasta 5 dígitos.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio19Digitos { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que permite saber cuantos digitos tiene de un número entero");
    System.out.println("");
       
    System.out.print("Por favor, introduce un número: ");
    String numero = System.console().readLine();
    System.out.println("");
    
    int longitudNumero = numero.length();
    int numeroInt = Integer.parseInt(numero);
    
    if (numeroInt < 0) { 
                         
      System.out.println("El número " + numero + " tiene " + (longitudNumero - 1) + " cifras");
      
    } else { 
      
      System.out.println("El número " + numero + " tiene " + longitudNumero + " cifras"); 
    
    }
  }
}
