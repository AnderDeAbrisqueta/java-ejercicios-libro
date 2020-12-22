/**
  *Calcula la nota de un trimestre de la asignatura Programación. El programa
  *pedirá las dos notas que ha sacado el alumno en los dos primeros controles.
  *Si la media de los dos controles da un número mayor o igual a 5, el alumno
  *está aprobado y se mostrará la media. En caso de que la media sea un número
  *menor que 5, el alumno habrá tenido que hacer el examen de recuperación que
  *se califica como apto o no apto, por tanto se debe preguntar al usuario ¿Cuál
  *ha sido el resultado de la recuperación? (apto/no apto). Si el resultado
  *de la recuperación es apto, la nota será un 5; en caso contrario, se mantiene
  *la nota media anterior.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio21MediaNotasProgramacion { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que calcula la nota del trimestre de Programación");
    
    System.out.print("Por favor, introduzca la nota del primer control: ");
    double notaControl1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca la nota del segundo control: ");
    double notaControl2 = Double.parseDouble(System.console().readLine());
    
    double notaMedia = (notaControl1 + notaControl2) / 2;
        
    if (notaMedia >= 5) {
      System.out.printf("¡Enhorabuena! La nota media es: " + "%.2f", notaMedia);
      
    } else {
    
    System.out.print("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
    String resultadoRecuperacion = System.console().readLine().toLowerCase();
        
      if (resultadoRecuperacion.equals("apto") || resultadoRecuperacion.equals("apta")) {
        System.out.println("¡Enhorabuena! La nota media es 5" );
      
      } else {
        System.out.printf("La nota media es: " + "%.2f", notaMedia);
             
      }
   
    }
   
  }
}
