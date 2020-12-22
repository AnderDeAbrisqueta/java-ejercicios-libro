/**
  *Escribe un programa que diga cuál es la primera cifra de un número entero
  *introducido por teclado. Se permiten números de hasta 5 cifras.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio18PrimeraCifra { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que permite conocer la primera cifra de un número entero");
    System.out.println("");
       
    System.out.print("Por favor, introduce un número: ");
    String numero = System.console().readLine();
    System.out.println("");
    
    int longitudNumero = numero.length();
    int numeroInt = Integer.parseInt(numero);
    
    if (numeroInt < 0) {
     double primeraCifra = numeroInt / Math.pow(10, longitudNumero - 2); 
     
     System.out.println("La primera cifra del número " + numero + " es " + (int)primeraCifra); 
     
    } else {
        double primeraCifra = numeroInt / Math.pow(10, longitudNumero - 1);
    
        System.out.println("La primera cifra del número " + numero + " es " + (int)primeraCifra);    
    }
        
  }
}
