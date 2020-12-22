/**
  *Realiza un conversor de Mb a Kb.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio10ConversorMbKb { // Clase principal
  public static void main(String[] args) {
  
    System.out.print("Introduce los Mb a convertir en Kb: " );
    int mb = Integer.parseInt(System.console().readLine());
             
    int kb = mb * 1000;
    
    System.out.print("Los Mb introducidos son: " + kb + " Kb");
    
  }
}

