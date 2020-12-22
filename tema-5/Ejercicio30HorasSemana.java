package tema5;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio30HorasSemana {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    System.out.println("Programa que calcula las horas entre dos días de la semana\n"); 
    
    Scanner s = new Scanner(System.in);
    
    boolean comprobacionDatos;
    String primerDiaSemana;
    String segundoDiaSemana;
    String nombrePrimerDiaSemana = "";
    String nombreSegundoDiaSemana = "";
    int primerDia = 0;
    int segundoDia = 0;
    int horaPrimerDia;
    int horaSegundoDia;
    
    do {      
      System.out.println("Por favor, introduzca la primera hora.");
      System.out.print("Día: ");
      primerDiaSemana = s.nextLine().toLowerCase();
      System.out.println("");
    
      System.out.print("Hora: ");
      horaPrimerDia = Integer.parseInt(s.nextLine());
      System.out.println("");
      
      switch (primerDiaSemana) {
        case "lunes":
        case "1":
          primerDia = 1;
          nombrePrimerDiaSemana = "lunes";
          break;
          
        case "martes":
        case "2":
          primerDia = 2;
          nombrePrimerDiaSemana = "martes";
          break;
          
        case "miercoles", "miércoles":
        case "3":
          primerDia = 3;
          nombrePrimerDiaSemana = "miércoles";
          break;
          
        case "jueves":
        case "4":
          primerDia = 4;
          primerDiaSemana = "jueves";
          break;
          
        case "viernes":
        case "5":
          primerDia = 5;
          nombrePrimerDiaSemana = "viernes";
          break;
          
        case "sabado", "sábado":
        case "6":
          primerDia = 6;
          nombrePrimerDiaSemana = "sábado";
          break;
          
        case "domingo":
        case "7":
          primerDia = 7;
          nombrePrimerDiaSemana = "domingo";
          break;
        default:
          primerDia = 0;
      }
      
      System.out.println("Por favor, introduzca la segunda hora.");
      System.out.print("Día: ");
      segundoDiaSemana = s.nextLine().toLowerCase();
      System.out.println("");
    
      System.out.print("Hora: ");
      horaSegundoDia = Integer.parseInt(s.nextLine());
      System.out.println("");
      
      switch (segundoDiaSemana) {
        case "lunes":
        case "1":
          segundoDia = 1;
          nombreSegundoDiaSemana = "lunes";
          break;
          
        case "martes":
        case "2":
          segundoDia = 2;
          nombreSegundoDiaSemana = "martes";
          break;
          
        case "miercoles", "miércoles":
        case "3":
          segundoDia = 3;
          nombreSegundoDiaSemana = "miércoles";
          break;
          
        case "jueves":
        case "4":
          segundoDia = 4;
          nombreSegundoDiaSemana = "jueves";
          break;
          
        case "viernes":
        case "5":
          segundoDia = 5;
          nombreSegundoDiaSemana = "viernes";
          break;
          
        case "sabado", "sábado":
        case "6":
          segundoDia = 6;
          nombreSegundoDiaSemana = "sábado";
          break;
          
        case "domingo":
        case "7":
          segundoDia = 7;
          nombreSegundoDiaSemana = "domingo";
          break;
        default:
          segundoDia = 0;
      }
      
      comprobacionDatos = true;
      
      if (segundoDia <= primerDia) {
        System.out.println("El segundo día debe ser posterior al primero.");
        comprobacionDatos = false;
      }
      
      if ((primerDia == 0) || (segundoDia == 0)) {
        System.out.println("No se ha introducido correctamente el día de la semana.");
        System.out.println("Los días válidos son: lunes, martes, miércoles, jueves y viernes.");
        comprobacionDatos = false;
      }
      
      if ((horaPrimerDia < 0) || (horaPrimerDia > 23) || (horaSegundoDia < 0) || (horaSegundoDia > 23)) {
        System.out.println("No se ha introducido correctamente la hora del día.");
        System.out.println("Las horas válidas están entre 0 y 23.");
        comprobacionDatos = false;
      }
      
    } while (!comprobacionDatos);
    
    System.out.print("Entre las " + horaPrimerDia + ":00h del " + nombrePrimerDiaSemana);
    System.out.print(" y las " + horaSegundoDia + ":00h del " + nombreSegundoDiaSemana);
    System.out.println(" hay " + (((segundoDia * 24) + horaSegundoDia) - ((primerDia * 24) + horaPrimerDia)) + " horas.");
    
    
    
  }
}
