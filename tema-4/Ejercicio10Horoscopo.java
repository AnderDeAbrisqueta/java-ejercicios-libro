/**
  *Escribe un programa que pida por teclado un día de la semana y que diga qué
  *asignatura toca a primera hora ese día.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio10Horoscopo { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Por favor, introduzca el mes de su nacimiento, ");
    System.out.print("para saber su signo del zodiaco: ");
    String mes = System.console().readLine().toLowerCase();
    
    System.out.print("Por favor, introduzca el día de su nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    
    switch (mes) {
      case "enero":
        if (dia > 20) {
          System.out.println("Eres Acuario");
        } else {
          System.out.println("Eres Capricornio");
          } 
        break;
        
      case "febrero":
        if (dia > 19) {
          System.out.println("Eres Piscis");
        } else {
          System.out.println("Eres Acuario");
          }
        break;
        
      case "marzo":
        if (dia > 20) {
          System.out.println("Eres Aries");
        } else {
          System.out.println("Eres Piscis");
          }
        break;
        
      case "abril":
        if (dia > 20) {
          System.out.println("Eres Tauro");
        } else {
          System.out.println("Eres Aries");
          }
        break;
        
      case "mayo":
        if (dia > 21) {
          System.out.println("Eres Géminis");
        } else {
          System.out.println("Eres Tauro");
          }
        break;
        
      case "junio":
        if (dia > 21) {
          System.out.println("Eres Cáncer");
        } else {
          System.out.println("Eres Géminis");
          }
        break;
        
      case "julio":
        if (dia > 23) {
          System.out.println("Eres Leo");
        } else {
          System.out.println("Eres Cáncer");
          }
        break;
        
      case "agosto":
        if (dia > 23) {
          System.out.println("Eres Virgo");
        } else {
          System.out.println("Eres Leo");
          }
        break;
        
      case "septiembre":
        if (dia > 23) {
          System.out.println("Eres Libra");
        } else {
          System.out.println("Eres Virgo");
          }
        break;
        
      case "octubre":
        if (dia > 23) {
          System.out.println("Eres Escorpio");
        } else {
          System.out.println("Eres Libra");
          }
        break;
        
      case "noviembre":
        if (dia > 22) {
          System.out.println("Eres Sagitario");
        } else {
          System.out.println("Eres Escorpio");
          }
        break;
        
      case "diciembre":
        if (dia > 21) {
          System.out.println("Eres Capricornio");
        } else {
          System.out.println("Eres Sagitario");
          }
        break;
         
      default:
        System.out.println("No existe ese mes del año");
    
    } 
             
  }
}
