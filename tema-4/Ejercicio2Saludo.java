/**
  *Realiza un programa que pida una hora por teclado y que muestre luego buenos
  *días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de
  *6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las
  *horas, los minutos no se deben introducir por teclado.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio2Saludo { // Clase principal
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la hora para saludarlo: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora < 13)) {
      
      System.out.print("Buenos días");
        
    } 
     
    if ((hora >= 13) && (hora < 21)) {
      
      System.out.print("Buenas tardes");
        
    } 
    
    if ((hora >= 21) && (hora < 24)) {
      
      System.out.print("Buenas noches");
        
    } 
    
    if ((hora >= 0) && (hora < 6)) {
      
      System.out.print("Buenas noches");
        
    } 
    
    if ((hora >= 24) || (hora < 0)) {
      
      System.out.print("La hora no es correcta");
        
    }   
              
  }
}



