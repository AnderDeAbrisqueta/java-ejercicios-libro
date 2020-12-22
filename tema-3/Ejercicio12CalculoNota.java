/**
  *Realiza un programa que calcule la nota que hace falta sacar en el segundo
  *examen de la asignatura Programación para obtener la media deseada. Hay
  *que tener en cuenta que la nota del primer examen cuenta el 40% y la del
  *segundo examen un 60%.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio12CalculoNota { // Clase principal
  public static void main(String[] args) {
  
    System.out.print("Inserte la del nota primer examen: " );
    double nota1Examen = Double.parseDouble(System.console().readLine());
    
    System.out.print("Inserte la media deseada: " );
    double mediaDeseada = Float.parseFloat(System.console().readLine());
             
    double nota2Examen = (mediaDeseada-nota1Examen*0.4) / 0.6;
    
    System.out.print("La nota que te hace falta sacar en el segundo examen de la "); 
    System.out.printf("asignatura Programación para obtener la media deseada es: %.2f", nota2Examen);
    
  }
}
