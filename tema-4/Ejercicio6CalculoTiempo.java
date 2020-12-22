/**
  *Realiza un programa que calcule el tiempo que tardará en caer un objeto desde
  *una altura h. Aplica la fórmula t = √2h/g siendo g = 9,81m/s²
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio6CalculoTiempo { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que resuelve el tiempo de caida de un objeto");
    
    System.out.print("Por favor, introduzca el valor de la altura en m: ");
    double altura = Double.parseDouble(System.console().readLine());
    
    final double gravedad = 9.81;  
    double tiempo;
    
    if ((altura < 0)) {
      
      System.out.print("La raiz no tiene solución real");
      
    } else {  
    
    tiempo = (double) Math.sqrt(2 * altura / gravedad);
    
    System.out.print("El tiempo que tarda un objeto en caer desde " + altura);
    System.out.printf(" m es " + "%.2f", tiempo);
    System.out.print(" s");
    
    }
  }
}
