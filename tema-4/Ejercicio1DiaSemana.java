/**
  *Escribe un programa que pida por teclado un día de la semana y que diga qué
  *asignatura toca a primera hora ese día.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio1DiaSemana { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduzca un día de la semana, para saber que");
    System.out.print("asignatura te toca a primera hora: ");
    String diaSemana = System.console().readLine().toLowerCase();
    
    switch (diaSemana) {
      case "lunes":
        System.out.println("Te toca a primera hora Entornos de desarrollos");
        break;
    
      case "martes", "miércoles", "miercoles", "jueves":
        System.out.println("Te toca a primera hora Programación");
        break;
    
      case "viernes":
        System.out.println("Te toca a primera hora Fol");
        break;
      
      case "sábado", "sabado", "domingo":
        System.out.println("Es fin de semana");
        break;
      
      default:
        System.out.println("No existe ese día de la semana");
    
    } 
             
  }
}
