/**
  *Realiza un programa que pida dos números y que luego muestre el resultado
  *de su multiplicación.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio1IntroduccionPorTeclado { // Clase principal
  public static void main(String[] args) {
    String linea;
    
    System.out.print("Introduce un número: " );
    linea = System.console().readLine();
    float primerNumero;
    primerNumero = Float.parseFloat(linea);
    
    System.out.print("Introduce otro número: " );
    linea = System.console().readLine();
    float segundoNumero;
    segundoNumero = Float.parseFloat(linea);
    
    float operacionDeMultiplicacion;
    
    operacionDeMultiplicacion = primerNumero * segundoNumero;
    
    System.out.print("Operación: " + primerNumero + " * " + segundoNumero);
    System.out.println(" = " + operacionDeMultiplicacion);
  
  }
}
