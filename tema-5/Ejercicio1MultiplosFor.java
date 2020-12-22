/**
  *Muestra los números múltiplos de 5 de 0 a 100 utilizando un bucle for.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio1MultiplosFor { // Clase principal
  public static void main(String[] args) {
    
    for (int numero = 0; numero < 101; numero++) {
      
      if (numero%5 == 0) { 
      
      System.out.println(numero);
      
      } 
    }         
  }
}
