/**
  *Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
  *los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
  *el valor de cada variable, la suma, la resta, la división y la multiplicación.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio1DeclaracionVariable { // Clase principal
  public static void main(String[] args) {
    
    int x = 144;
    int y = 999;
    
    System.out.println("x = " + x + "\n" + "y = " + y );
    System.out.println("x+y = " + (x + y) + "\n" + "x-y = " + (x - y));
    System.out.println("x*y = " + (x * y));
    
    float division;
    
    division = (float) x / (float) y;
    System.out.printf("x/y = %.4f", division);
    
    
  }
}
