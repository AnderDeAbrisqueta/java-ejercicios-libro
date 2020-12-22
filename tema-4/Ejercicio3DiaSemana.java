/**
  *Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente
  *nombre del día de la semana.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio3DiaSemana { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número del 1 al 7 para saber el día de la semana: ");
    int diaSemana = Integer.parseInt(System.console().readLine());
    
    switch (diaSemana) {
      case 1:
        System.out.println("Lunes");
        break;
    
      case 2:
        System.out.println("Martes");
        break;
      
      case 3:
        System.out.println("Miércoles");
        break;
   
      case 4:
        System.out.println("Jueves");
        break;
    
      case 5:
        System.out.println("Viernes");
        break;
      
      case 6:
        System.out.println("Sábado");
        break;
        
      case 7:
        System.out.println("Domingo");
        break;
      
      default:
        System.out.println("No existe ese día de la semana");
    
    } 
             
  }
}


