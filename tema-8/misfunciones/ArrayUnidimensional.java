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
   * Función que dibuja la tabla del array con los índices.
   *
   * @param arrayEntrada array inicial de entrada.
   */
  public static void pintaArrayConIndice(String arrayEntrada[]) {
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
    System.out.print("│Palabra ");

    for (int i = 0; i < N; i++) {
      System.out.printf("│%5s", arrayEntrada[i]);
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

  /**
   * Función que extrae los números primos de un array.
   *
   * @param n array original.
   * @return array con los números primos extraidos del array original.
   */
  public static int[] extraePrimos(int[] n) {
    int[] arrayAuxiliar = new int[n.length];
    int j = 0;
    for (int i = 0; i < n.length; i++) {
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
   * Función que que determina si una palabra se encuentra en un array o no.
   *
   * @param arrayOriginal array que se introduce para verificar si existe la
   * palabra que se está buscando.
   * @param n palbra que se está buscando.
   * @return devuelve verdadero o falso dependiendo si está o no la palabra.
   */
  public static boolean estaEnArrayInt(String[] arrayOriginal, String n) {
    for (String palabra : arrayOriginal) {
      if (palabra != null && palabra.equals(n)) {
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
   * Función que le da la vuelta a un array.
   *
   * @param arrayOriginal array al que se le quiere voltear.
   * @return array volteado.
   */
  public static String[] volteaArrayInt(String[] arrayOriginal) {
    String[] arrayResultado = new String[arrayOriginal.length];
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

  /**
   * Función que pinta una línea con un caracter.
   *
   * @param caracter de preferencia para realizar la línea. Debe colocarse entre
   * comillas simples (' ').
   * @param longitud es la cantidad de caracteres que se quieren colocar en la
   * línea.
   * @return una línea con el caracter de preferencia y la longitud escogida.
   */
  public static String pintaLineas(char caracter, int longitud) {
    String linea = "";
    for (int i = 0; i < longitud; i++) {
      linea += caracter;
    }
    return linea;
  }

  /**
   * Función que comvierte un array en String.
   *
   * @param a array que se quiere convertir en string.
   * @return un string de con los elementos array.
   */
  public static String convierteArrayEnString(int[] a) {
    String numero = "";
    for (int i = 0; i < a.length; i++) {
      numero += a[i];
    }
    return numero;
  }

  /**
   * Función que comvierte un array en String.
   *
   * @param a array que se quiere convertir en string.
   * @return un string de con los elementos array.
   */
  public static String convierteArrayEnString(String[] a) {
    String numero = "";
    for (int i = 0; i < a.length; i++) {
      numero += a[i];
    }
    return numero;
  }

  /**
   * Función que concatena arrays.
   *
   * @param a primer array que se quiere concatenar.
   * @param b segundo array que se quiere concatenar.
   * @return array concatenado.
   */
  public static int[] concatena(int[] a, int[] b) {
    int[] arrayResultado = new int[a.length + b.length];
    int j = 0;

    for (int i = 0; i < a.length; i++) {
      arrayResultado[i] = a[i];
      j++;
    }

    for (int i = 0; i < b.length; i++) {
      arrayResultado[j++] = b[i];
    }
    return arrayResultado;
  }

  /**
   * Función que devuelve un número del array de forma aleatoria.
   *
   * @param a array de donde se quiere escoger el número de forma aleatoria.
   * @return un númenro del array escogido aleatoriamente.
   */
  public static int aleatorioDeArray(int[] a) {
    int numeroEscogidoAzar = 0;
    int indice = (int) (Math.random() * a.length);
    for (int i = 0; i < a.length; i++) {
      if (i == indice) {
        numeroEscogidoAzar = a[i];
      }
    }
    return numeroEscogidoAzar;
  }

  /**
   * Quita los elementos nulos consecutivos por el final.
   *
   * @param s array que puede tener nulos al final
   * @return array sin nulos
   */
  public static String[] compacta(String[] s) {
    int i = s.length - 1;
    while (s[i] == null) {
      i--;
    }
    String[] resultado = new String[i + 1];
    System.arraycopy(s, 0, resultado, 0, i + 1);
    return resultado;
  }

  /**
   * Función que elimina las repeticiones de un array (String).
   *
   * @param s array al que se le quieren eliminar las repeticiones.
   * @return el array sin repeticiones.
   */
  public static String[] sinRepetir(String[] s) {
    String[] vacio = {};
    if (s.length == 0) {
      return vacio;
    }

    String aux[] = new String[s.length];
    int i = 0;

    for (String palabra : s) {
      if (!misfunciones.ArrayUnidimensional.estaEnArrayInt(aux, palabra)) {
        aux[i++] = palabra;
      }
    }

    String[] arrayResultado = new String[i];

    for (int j = 0; j < i; j++) {
      arrayResultado[j] = aux[j];
    }

    return arrayResultado;
  }

  /**
   * Función que elimina las repeticiones de un array (Int).
   *
   * @param s array al que se le quieren eliminar las repeticiones.
   * @return el array sin repeticiones.
   */
  public static int[] quitaRepetidos(int[] s) {
    int[] vacio = {};
    if (s.length == 0) {
      return vacio;
    }

    int aux[] = new int[s.length];
    int i = 0;

    for (int numero : s) {
      if (!misfunciones.ArrayUnidimensional.estaEnArrayInt(aux, numero)) {
        aux[i++] = numero;
      }
    }

    int[] arrayResultado = new int[i];

    for (int j = 0; j < i; j++) {
      arrayResultado[j] = aux[j];
    }

    return arrayResultado;
  }

  /**
   * Función que toma un trozo de array.
   *
   * @param arrayOriginal array del que se quiere tomar un trozo.
   * @param x índice inicial.
   * @param y índice final.
   * @return el trozo del array.
   */
  public static int[] trozoDeArray(int[] arrayOriginal, int x, int y) {
    int[] arrayAuxiliar = new int[arrayOriginal.length];
    int j = 0;

    for (int i = x; i <= y; i++) {
      arrayAuxiliar[j++] = arrayOriginal[i];
    }

    int[] arrayResultado = new int[j];
    for (int i = 0; i < j; i++) {
      arrayResultado[i] = arrayAuxiliar[i];
    }
    return arrayResultado;
  }

  /**
   * Función que determina la cantidad de veces que se repite un mismo dígito
   * contiguo en un número.
   *
   * @param a array que contiene el número a evaluar.
   * @return la cantidad de veces que se repite un dígito contiguo en un número.
   */
  public static int repeticionesDelPrimero(int[] a) {
    int repeticiones = 0;
    int i = 0;
    while ((i < a.length) && (a[0] == a[i])) {
      repeticiones++;
      i++;
    }
    return repeticiones;
  }

  /**
   * Función que devuelve un array eliminando los primeros elementos similares.
   *
   * @param a array original.
   * @return un array sin los primeros elementos comunes.
   */
  public static int[] cola(int[] a) {
    if (a.length == 0) {
      int[] aux = {};
      return aux;
    }
    int r = repeticionesDelPrimero(a);
    int[] c = new int[a.length - r];
    for (int i = r; i < a.length; i++) {
      c[i - r] = a[i];
    }
    return c;
  }

}
