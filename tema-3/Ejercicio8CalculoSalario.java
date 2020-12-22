/**
  *Escribe un programa que calcule el salario semanal de un empleado en base a
  *las horas trabajadas, a razón de 12 euros la hora.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio8CalculoSalario { // Clase principal
  public static void main(String[] args) {
        
    System.out.print("Introduce las horas trabajadas esta semana: " );
    double hotrasTrabajadas = Double.parseDouble(System.console().readLine());
    System.out.println(" h");
        
    double salarioSemanal = hotrasTrabajadas*12;
    
    System.out.printf("El salario semanal es de %.2f", salarioSemanal);
    System.out.println(" €");
  
  }
}
