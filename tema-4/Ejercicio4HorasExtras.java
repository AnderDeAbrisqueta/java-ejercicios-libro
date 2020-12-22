/**
  *Vamos a ampliar uno de los ejercicios de la relación anterior para considerar
  *las horas extras. Escribe un programa que calcule el salario semanal de un
  *trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de
  *trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros
  *la hora.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio4HorasExtras { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca las horas que ha trabajado esta semana: ");
    int horasTrabajadas = Integer.parseInt(System.console().readLine());
    
    int salarioSemanal;
    int salarioSemanalExtra;
    
    if (horasTrabajadas <= 40) {
      
      salarioSemanal = horasTrabajadas * 12;
      System.out.println("Esta semana te corresponden " + salarioSemanal + "€");
            
    } else {
      
      salarioSemanalExtra = (horasTrabajadas-40) * 16 + 40 * 12;
      System.out.println("Esta semana te corresponden " + salarioSemanalExtra + "€");
        
    } 
    
  }
}

