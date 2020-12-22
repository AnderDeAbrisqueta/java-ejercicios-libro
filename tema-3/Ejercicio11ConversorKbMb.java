/**
  *Realiza un conversor de Kb a Mb.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio11ConversorKbMb { // Clase principal
  public static void main(String[] args) {
  
    System.out.print("Introduce los Kb a convertir en Mb: " );
    int kb = Integer.parseInt(System.console().readLine());
             
    int mb = kb / 1000;
    
    System.out.print("Los Kb introducidos son: " + mb + " Mb");
    
  }
}

