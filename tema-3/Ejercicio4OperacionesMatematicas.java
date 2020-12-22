/**
  *Escribe un programa que sume, reste, multiplique y divida dos números
  *introducidos por teclado.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio4OperacionesMatematicas { // Clase principal
  public static void main(String[] args) {
        
    System.out.print("Introduce un número: " );
    double primerNumero = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce otro número: " );
    double segundoNumero = Double.parseDouble(System.console().readLine());
    System.out.println("");
    
    double suma = primerNumero + segundoNumero;
    
    System.out.print("Suma: " + primerNumero + " + " + segundoNumero);
    System.out.printf(" = %.2f", suma);
    System.out.println("");
    
    double resta = primerNumero - segundoNumero;
    
    System.out.print("Resta: " + primerNumero + " - " + segundoNumero);
    System.out.printf(" = %.2f", resta);
    System.out.println("");
    
    double multiplicacion = primerNumero * segundoNumero;
    
    System.out.print("Multiplicación: " + primerNumero + " * " + segundoNumero);
    System.out.printf(" = %.2f", multiplicacion);
    System.out.println("");
    
    double division = primerNumero / segundoNumero;
    
    System.out.print("División: " + primerNumero + "/" + segundoNumero);
    System.out.printf(" = %.2f", division);
  
  }
}
