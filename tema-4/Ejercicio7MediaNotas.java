/**
  *Realiza un programa que calcule la media de tres notas.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio7MediaNotas { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que resuelve media de tres notas");
    
    System.out.print("Por favor, introduzca el valor de la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor de la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor de la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    
    double notaMedia = (nota1 + nota2 + nota3) / 3;
    System.out.printf("La nota media es: " + "%.1f", notaMedia);
   
  }
}
