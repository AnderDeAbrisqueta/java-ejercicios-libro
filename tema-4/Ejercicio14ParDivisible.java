/**
  *Realiza un programa que diga si un número introducido por teclado es par y/o
  *divisible entre 5.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio14ParDivisible { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que dice si un número es par y/o divisble entre 5.");
    
        
    System.out.print("Por favor, introduzca un número: ");
    int numero1 = Integer.parseInt(System.console().readLine());
    
    if ((numero1%2 == 0) && (numero1%5 == 0)) {
      System.out.println("El número es par y divisible entre 5");
      
      } else if ((numero1%2 == 0) && (!(numero1%5 == 0))) {
         System.out.println("El número es par pero no es divisible entre 5");
         
         } else  if ((!(numero1%2 == 0)) && (numero1%5 == 0)) {
            System.out.println("El número no es par pero es divisible entre 5");
      
    } else {
      System.out.println("El número no es par ni divisible entre 5");
     } 
    
   
  }
}
