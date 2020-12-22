/**
  *Realiza un programa que, dado un día de la semana (de lunes a viernes) y una
  *hora (horas y minutos), calcule cuántos minutos faltan para el fin de semana.
  *Se considerará que el fin de semana comienza el viernes a las 15:00h. Se da
  *por hecho que el usuario introducirá un día y hora correctos, anterior al viernes
  *a las 15:00h.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio22MinutosFinSemana { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que calcula el tiempo que falta para el fin de semana en minutos. \n");
    
    System.out.print("Por favor, introduzca un día de la semana (de lunes a viernes): ");
    String diaSemana = System.console().readLine().toLowerCase();
    
    System.out.print("Por favor, introduzca la hora (0-23 h): ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    switch (diaSemana) {
      case ("lunes"):
        int horaFaltante1 = 6660 - (hora*60 + minutos);
        System.out.println("Para el fin de semana faltan " + horaFaltante1 + " minutos");
      break;
      
      case ("martes"):
        int horaFaltante2 = 5220 - (hora*60 + minutos);
        System.out.println("Para el fin de semana faltan " + horaFaltante2 + " minutos");
      break;
      
      case ("miércoles, miercoles"):
        int horaFaltante3 = 3780 - (hora*60 + minutos);
        System.out.println("Para el fin de semana faltan " + horaFaltante3 + " minutos");
      break;
      
      case ("jueves"):
        int horaFaltante4 = 2340 - (hora*60 + minutos);
        System.out.println("Para el fin de semana faltan " + horaFaltante4 + " minutos");
      break;
      
      case ("viernes"):
        int horaFaltante5 = 900 - (hora*60 + minutos);
        System.out.println("Para el fin de semana faltan " + horaFaltante5 + " minutos");
      break;
      
    default:
      System.out.println("No es un día de semana");
    }  
     
  }
}
