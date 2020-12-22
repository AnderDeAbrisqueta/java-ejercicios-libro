/**
  *Escribe un programa que diga cuál es la última cifra de un número entero
  *introducido por teclado. 
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio17UltimaCifra { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que permite conocer la última cifra de un número entero");
    System.out.println("");
       
    System.out.print("Introduce un número: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    int numero2 = numero1%10;
        
    System.out.printf("La última cifra del número es: " + numero2);
    
  }
}

