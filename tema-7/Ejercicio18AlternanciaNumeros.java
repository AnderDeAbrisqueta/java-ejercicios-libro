package tema7;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio18AlternanciaNumeros {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    //Construcción del array original
    int[] numeroEnteroAletorio = new int[10];

    for (int i = 0; i < 10; i++) {
      numeroEnteroAletorio[i] = (int) (Math.random() * 201);
    }

    System.out.println("Array Original");

    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int n : numeroEnteroAletorio) {
      System.out.printf("│%5d", n);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

    //Clasificación de los números
    int contadorNumerosMenores = 0;
    int contadorNumerosMayores = 0;
    int[] numerosMenores = new int[10];
    int[] numerosMayores = new int[10];

    for (int i = 0; i < 10; i++) {
      if (numeroEnteroAletorio[i] <= 100) {
        numerosMenores[contadorNumerosMenores++] = numeroEnteroAletorio[i];
      } else {
        numerosMayores[contadorNumerosMayores++] = numeroEnteroAletorio[i];
      }
    }

    int[] arrayResultado = new int[10];
    int menoresColocados = 0;
    int mayoresColocados = 0;
    int j = 0;

    do {

      if (menoresColocados < contadorNumerosMenores) {
        arrayResultado[j++] = numerosMenores[menoresColocados++];
      }

      if (mayoresColocados < contadorNumerosMayores) {
        arrayResultado[j++] = numerosMayores[mayoresColocados++];
      }

    } while (j < 10);

    System.out.println("Array Resultado");

    System.out.println("\n┌────────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┬─────┐");
    System.out.print("│ Índice ");
    for (int i = 0; i < 10; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│\n├────────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┼─────┤");
    System.out.print("│ Valor  ");
    for (int a : arrayResultado) {
      System.out.printf("│%5d", a);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

  }
}
