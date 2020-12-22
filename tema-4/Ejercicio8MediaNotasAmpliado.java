/**
  *Amplía el programa anterior para que diga la nota del boletín (insuficiente,
  *suficiente, bien, notable o sobresaliente).
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio8MediaNotasAmpliado { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que resuelve media de tres notas");
    
    System.out.print("Por favor, introduzca el valor de la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor de la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el valor de la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    
    double notaMedia = (nota1 + nota2 + nota3) / 3;
    System.out.printf("La nota media es: " + "%.1f", notaMedia);
    
    if (notaMedia < 5) {
      
      System.out.print(" Lo lamento, es insuficiente");
      
    } else { 
      
      if ((notaMedia >= 5) && (notaMedia < 6)) {
        
      System.out.print(" Tienes un suficiente");
      
      }
      
      if ((notaMedia >= 6) && (notaMedia < 7)) {
        
      System.out.print(" Tienes un Bien");
      
      }
      
      if ((notaMedia >= 7) && (notaMedia < 8)) {
        
      System.out.print(" Tienes un notable");
      
      }
      
      if ((notaMedia >= 8) && (notaMedia <= 10)) {
        
      System.out.print(" ¡Enhorabuena, tienes un sobresaliente!");
      
      }
    }
  }
}
