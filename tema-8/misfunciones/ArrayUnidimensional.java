/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class ArrayUnidimensional {

  public static void pintaArray(int arrayEntrada[]) {
    for (int numero : arrayEntrada) {
      System.out.print(numero + " ");
    }
  }

  public static void pintaArrayConIndice(int arrayEntrada[]) {
    final int N = arrayEntrada.length;
    System.out.print("┌────────┬");

    for (int i = 1; i < N; i++) {
      System.out.print("─────┬");
    }
    System.out.print("─────┐\n");
    System.out.print("│ Índice ");
    for (int i = 0; i < N; i++) {
      System.out.printf("│%5d", i);
    }
    System.out.println("│");
    System.out.print("├────────┼");
    for (int i = 1; i < N; i++) {
      System.out.print("─────┼");
    }
    System.out.print("─────┤\n");
    System.out.print("│ Valor  ");

    for (int i = 0; i < N; i++) {
      System.out.printf("│%5d", arrayEntrada[i]);
    }

    System.out.println("│");
    System.out.print("└────────┴");
    for (int i = 1; i < N; i++) {
      System.out.print("─────┴");
    }
    System.out.print("─────┘\n");

  }

  public static int[] generaArrayInt(int min, int max, int n) {
    int[] arrayResultado = new int[n];
    int i = 0;
    for (i = 0; i < n; i++) {
      arrayResultado[i] = (int) (Math.random() * ((max - min) + 1) + min);
    }
    return arrayResultado;
  }

  public static int[] filtraPrimos(int[] n) {
    int contador = 0;
    for (int i : n) {
      if (Matematicas.esPrimo(i)) {
        contador++;
      }
    }
    int[] arrayFinal = extraePrimos(n);
    int[] resultado = {-1};
    if (contador == 0) {
      return resultado;
    } else {
      return arrayFinal;
    }
  }

  public static int[] extraePrimos(int[] n) {
    int[] aux = new int[n.length];
    int contadorAux = 0;
    int digito = 0;
    for (int i = 0; i < n.length - 1; i++) {
      digito = n[i];
      if (Matematicas.esPrimo(digito) == true) {
        aux[contadorAux++] = n[i];
      }
    }
    int[] resultado = new int[contadorAux];
    for (int i = 0; i < contadorAux; i++) {
      resultado[i] = aux[i];
    }
    return resultado;
  }

}
