/**
  *
  *Escribe un programa que dada una hora determinada (horas y minutos), calcule
  *los segundos que faltan para llegar a la medianoche.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio11Medianoche { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que calcula los segundos que faltan para llegar a medianoche");
    
    System.out.print("Por favor, introduzca el valor de la hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor de los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundos = (24 * 60 * 60) - (hora * 60 * 60 + minutos * 60);
    System.out.println("Faltan " + segundos + " s para medianoche");
   
  }
}
