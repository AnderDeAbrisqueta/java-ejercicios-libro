/**
  *Realiza un programa que resuelva una ecuación de segundo grado (del tipo
  *ax² + bx + c = 0).
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio9EcuacionSegundoGrado { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que resuelve la Ecuación de Segundo Grado");
    System.out.println("ax²+bx+c = 0 \n");
            
    System.out.print("Por favor, introduzca el coeficiente principal a: ");
    double a = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el coeficiente b: ");
    double b = Double.parseDouble(System.console().readLine());
    
    System.out.print("Por favor, introduzca el término independiente c: ");
    double c = Double.parseDouble(System.console().readLine());
    System.out.println("");
    
    double discriminante = Math.pow(b,2) - 4 * a * c;
    double solucion1;
    double solucion2;
    
    if ((a == 0) && (b == 0) && (c != 0 )) {
      System.out.println("Error, un número diferente de cero, no puede ser igual a 0");
      
      
      } else if((a == 0) && (b == 0) && (c == 0 )) {
      System.out.println("Única solución: 0");
      
      } else if (a == 0) {
        System.out.printf("Única solución: %.2f", (-c/b));
      
      } else if ((discriminante < 0)) {
        System.out.println("La raiz no tiene solución real");
                  
    } else {  
    
     solucion1 = (- b + Math.sqrt(discriminante)) / (2 * a);
     solucion2 = (- b - Math.sqrt(discriminante)) / (2 * a);
    
    System.out.printf("El valor de la solución 1 es " + "%.2f", solucion1);
    System.out.println("");
    System.out.printf("El valor de la solución 2 es " + "%.2f", solucion2);
    
    }
  }
}
