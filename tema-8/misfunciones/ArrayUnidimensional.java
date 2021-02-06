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

  /**
   * Función que pinta una array.
   *
   * @param arrayEntrada Array que se quiere pintar.
   */
  public static void pintaArray(int arrayEntrada[]) {
    for (int numero : arrayEntrada) {
      System.out.print(numero + " ");
    }
  }

  /**
   * Función que dibuja la tabla del array con los índices.
   *
   * @param arrayEntrada array inicial de entrada.
   */
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

  /**
   * Función que genera un array con números aleatorios.
   *
   * @param min número mínimo del rango.
   * @param max número máximo del rango.
   * @param n cantidad de números aleatorios.
   * @return array de tamaño n con números aleatorios en el rango introducido.
   */
  public static int[] generaArrayInt(int min, int max, int n) {
    int[] arrayResultado = new int[n];
    for (int i = 0; i < n; i++) {
      arrayResultado[i] = (int) (Math.random() * ((max - min) + 1) + min);
    }
    return arrayResultado;
  }

//  public static int[] filtraPrimos(int[] n) {
//    int j = 0;
//    for (int i : n) {
//      if (Matematicas.esPrimo(i)) {
//        j++;
//      }
//    }
//    int[] arrayResultado = extraePrimos(n);
//    int[] arrayAuxiliar = {-1};
//    return j == 0 ? arrayAuxiliar :  arrayResultado;
//  }
  /**
   * Función que extrae los números primos de un array.
   *
   * @param n array original
   * @return array con los números primos extraidos del array original.
   */
  public static int[] extraePrimos(int[] n) {
    int[] arrayAuxiliar = new int[n.length];
    int j = 0;
    for (int i = 0; i < n.length - 1; i++) {
      if (Matematicas.esPrimo(n[i])) {
        arrayAuxiliar[j++] = n[i];
      }
    }
    int[] arrayResultado = new int[j];
    for (int i = 0; i < j; i++) {
      arrayResultado[i] = arrayAuxiliar[i];
    }
    return arrayResultado;
  }

  /**
   * Función que devuelve el número menor de un array.
   *
   * @param arrayOriginal array que se va a introducir.
   * @return el número menor del array.
   */
  public static long minimoArrayInt(int[] arrayOriginal) {
    long numeroMinimo = Long.MAX_VALUE;
    for (int numero : arrayOriginal) {
      if (numero < numeroMinimo) {
        numeroMinimo = numero;
      }

    }
    return numeroMinimo;
  }

  /**
   * Función que devuelve el número mayor de un array.
   *
   * @param arrayOriginal array que se va a introducir.
   * @return el número mayor del array.
   */
  public static long maximoArrayInt(int[] arrayOriginal) {
    long numeroMaximo = Long.MIN_VALUE;
    for (int numero : arrayOriginal) {
      if (numero > numeroMaximo) {
        numeroMaximo = numero;
      }

    }
    return numeroMaximo;
  }

  /**
   * Función que calcula la media de los números de un array.
   *
   * @param arrayOriginal array que se le quiere determinar la media.
   * @return la media del array.
   */
  public static double mediaArrayInt(int[] arrayOriginal) {
    int j = 0;
    int sumaNumero = 0;
    for (int numero : arrayOriginal) {
      sumaNumero += numero;
      j++;
    }

    return (double) sumaNumero / j;
  }

  /**
   * Función que que determina si un número se encuentra en un array o no.
   *
   * @param arrayOriginal array que se introduce para verificar si existe el
   * número que se está buscando.
   * @param n número que se está buscando.
   * @return devuelve verdadero o falso dependiendo si está o no el número.
   */
  public static boolean estaEnArrayInt(int[] arrayOriginal, int n) {
    for (int numero : arrayOriginal) {
      if (n == numero) {
        return true;
      }
    }

    return false;
  }

  /**
   * Función que busca un número en un array y devuelve la posición (el índice)
   * en la que se encuentra.
   *
   * @param arrayOriginal array donde se busca el número de interés.
   * @param n número que se busca dentro del array.
   * @return la posición del número si se encuentra en el array. Si no está
   * devuelve -1.
   */
  public static int posicionEnArray(int[] arrayOriginal, int n) {
    for (int i = 0; i < arrayOriginal.length; i++) {
      if (arrayOriginal[i] == n) {
        return i;
      }
    }
    return -1;
  }

  /**
   * Función que le da la vuelta a un array.
   *
   * @param arrayOriginal array al que se le quiere voltear.
   * @return array volteado.
   */
  public static int[] volteaArrayInt(int[] arrayOriginal) {
    int[] arrayResultado = new int[arrayOriginal.length];
    int j = arrayOriginal.length;
    for (int i = 0; i < arrayOriginal.length; i++) {
      arrayResultado[--j] = arrayOriginal[i];
    }

    return arrayResultado;
  }

  /**
   * Función que rota n posiciones a la derecha los números de un array.
   *
   * @param arrayOriginal array al que se quiere rotar a la derecha los
   * elementos del mismo.
   * @param n número de veces que se quieren rotar.
   * @return el array rotado n veces a la derecha.
   */
  public static int[] rotaDerechaArrayInt(int[] arrayOriginal, int n) {
    int[] arrayResultado = new int[arrayOriginal.length];
    int j = arrayOriginal.length - n;
    int k = 0;
    for (int i = 0; i < arrayOriginal.length; i++) {
      if (i < j) {
        arrayResultado[i + n] = arrayOriginal[i];
      }
      if (i >= j) {
        arrayResultado[k++] = arrayOriginal[j++];
      }
    }
    return arrayResultado;
  }
  
  /**
   * Función que rota n posiciones a la izquierda los números de un array.
   * 
   * @param arrayOriginal array al que se quiere rotar a la izquierda los
   * elementos del mismo. 
   * @param n número de veces que se quieren rotar.
   * @return el array rotado n veces a la izquierda.
   */
  public static int[] rotaIzquierdaArrayInt(int[] arrayOriginal, int n) {
    int[] arrayResultado = new int[arrayOriginal.length];
    int j = arrayOriginal.length - n;
    int k = 0;
    for (int i = 0; i < arrayOriginal.length; i++) {
      if (i < n) {
        arrayResultado[j++] = arrayOriginal[i];
      }

      if (i >= n) {
        arrayResultado[k++] = arrayOriginal[n++];
      }

    }
    return arrayResultado;
  }

}
