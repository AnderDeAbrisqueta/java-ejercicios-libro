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

    int indiceNumerosMenores = 0;
    int indiceNumerosMayores = 0;
    int[] numerosMenores = new int[10];
    int[] numerosMayores = new int[10];

    for (int i = 0; i < 10; i++) {
      if (numeroEnteroAletorio[i] <= 100) {
        numerosMenores[indiceNumerosMenores++] = numeroEnteroAletorio[i];
      } else {
        numerosMayores[indiceNumerosMayores++] = numeroEnteroAletorio[i];
      }
      
    }
    
    int[] numerosIntercalados = new int[10];
    int indiceMenoresOrganizaos = 0;
    int indiceMayoresOrganizados = 0;
    int j = 0;
    
    do {  
      
      if (indiceMenoresOrganizaos < indiceNumerosMenores) {
        numerosIntercalados[j++] = numerosMenores[indiceMenoresOrganizaos++];
      }
      
      if (indiceMayoresOrganizados < indiceNumerosMayores) {
        numerosIntercalados[j++] = numerosMayores[indiceMayoresOrganizados++];
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
    for (int n : numerosIntercalados) {
      System.out.printf("│%5d", n);
    }
    System.out.println("│\n└────────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┴─────┘");

  }
}
