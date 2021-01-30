/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misfunciones;

/**
 * Esta clase desarrolla una serie de funciones matemáticas.
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Matematicas {

  /**
   * Esta función calcula el número de dígitos de un número entero positivo.
   *
   * @param numero al que se le quiere calcular la cantidad de dígitos.
   * @return el número de dígitos del número introducido.
   */
  public static int digitos(long numero) {
    int n = 0;

    if (numero == 0) {
      n = 1;
    } else {
      while (numero > 0) {
        numero /= 10;
        n++;
      }
    }

    return n;
  }

  /**
   * Esta función calcula el número de dígitos de un número entero positivo.
   *
   * @param numero al que se le quiere calcular la cantidad de dígitos.
   * @return el número de dígitos del número introducido.
   */
  public static int digitos(int numero) {
    return digitos((long) numero);
  }

  /**
   * Esta función calcula la potencia de un número a partir de la base y su
   * exponente.
   *
   * @param base es la base de la potencia.
   * @param exponente es el exponente de la potencia.
   * @return la potencia de un número.
   */
  public static double potencia(double base, double exponente) {
    return Math.pow(base, exponente);
  }

  /**
   * Esta función determina si un número es primo.
   *
   * @param numero del que se quiere saber si es primo o no lo es.
   * @return si es verdadero o falso, que el número es primo.
   */
  public static boolean esPrimo(int numero) {
    boolean esNumeroPrimo = true;

    for (int i = 2; i < numero; i++) {
      double evaluacionNumero = numero % i;

      if (evaluacionNumero == 0) {
        return false;
      }
    }

    return true;
  }

  /**
   * Esta función determina el siguiente número primo de un número introducido
   * por teclado
   *
   * @param numero a partir del cual se buscará el número primo más próximo 
   * (mayor al número introducido).
   * @return un número primo.
   */
  public static int siguientePrimo(int numero) {
    numero++;

    while (true) {
      if (esPrimo(numero)) {
        return numero;
      } else {
        numero++;
      }
    }

  }

  /**
   * Función que voltea un número entero positivo.
   *
   * @param numero entero positivo.
   * @return el número volteado.
   */
  public static long voltea(long numero) {
    long numeroVolteado = 0;

    while (numero > 0) {
      numeroVolteado = (numeroVolteado * 10) + (numero % 10);
      numero /= 10;
    }

    return numeroVolteado;
  }

  /**
   * Función que devuelve el dígito que está en la posición n de un número
   * entero positivo.
   *
   * @param numero entero positivo.
   * @param n es la posición del dígito en el número, contado a partir del 0 y de
   * izquierda a derecha.
   * @return dígito del número en la posición elegida.
   */
  public static int digitoN(long numero, int n) {

    long numero1 = (long) (numero / (int) potencia(10, digitos(numero) - n)) * 10;
    long numero2 = (long) (numero / (int) potencia(10, digitos(numero) - (n + 1)));
    int digito = (int) (numero2 - numero1);

    return digito;
  }

  /**
   * Función que devuelve verdadero o falso si un número es capicúa.
   *
   * @param numero del que se quiere saber si es capicúa.
   * @return verdaderos si el número es capicúa y falso si no lo es.
   */
  public static boolean esCapicua(long numero) {
    long numeroInverso = voltea(numero);
    boolean numeroEsCapicua;

    if (numero == numeroInverso) {
      numeroEsCapicua = true;

    } else {
      numeroEsCapicua = false;
    }
    return numeroEsCapicua;
  }
  
  /**
   * Función que da la posición de la primera ocurrencia de un dígito
   * dentro de un número entero. 
   * 
   * @param numero entero al que se le quiere determinar la posición de 
   * un dígito.
   * @param digito: dígito al que se le quiere determinar la posición dentro del
   * número entero.
   * @return la posición del dígito seleccionado, si no se encuentra, devuelve -1. 
   * La posición del dígito en el número se cuenta a partir del 0 y de izquierda 
   * a derecha.
   */
  public static int posicionDeDigito(long numero, int digito) {
    digitos(numero);
    int posicionDigito = -1;

    for (int i = 0; i < digitos(numero); i++) {
      int digitoEnNumero = (int) (numero / Math.pow(10, (digitos(numero) - (i + 1))));

      if (digitoEnNumero % 10 == digito) {
        posicionDigito = i;
        i = digitos(numero);
      }
    }
    return posicionDigito;
  }
  
  /**
   * Función que le quita a un número n dígitos por detrás (por la derecha).
   * 
   * @param numero entero al que se le quieren quitar dígitos por la derecha.
   * @param nDigitos número de dígitos que se quieren quitar.
   * @return el número cortado por la derecha.
   */
  public static long quitarPorDetras(long numero, int nDigitos) {
    return (long) (numero / Math.pow(10, nDigitos));
  }
  
  /**
   * Función que le quita a un número n dígitos por detrás (por la derecha).
   * 
   * @param numero entero al que se le quieren quitar dígitos por la derecha.
   * @param nDigitos número de dígitos que se quieren quitar.
   * @return el número cortado por la derecha.
   */
  public static long quitarPorDetras(int numero, int nDigitos) {
    return quitarPorDetras((long) numero, (int) nDigitos);
  }
  
  /**
   * Función que le quita a un número n dígitos por delante (por la izquierda).
   * 
   * @param numero entero al que se le quieren quitar dígitos por la izquierda.
   * @param nDigitos número de dígitos que se quieren quitar.
   * @return el número cortado por la izquierda
   */
  public static long quitarPorDelante(long numero, int nDigitos) {
    digitos(numero);
    return numero % (long) Math.pow(10, digitos(numero) - nDigitos);
  }
  
  /**
   * Función que le quita a un número n dígitos por delante (por la izquierda).
   * 
   * @param numero entero al que se le quieren quitar dígitos por la izquierda.
   * @param nDigitos número de dígitos que se quieren quitar.
   * @return el número cortado por la izquierda
   */
  public static long quitarPorDelante(int numero, int nDigitos) {
    return quitarPorDelante((long) numero, (int) nDigitos);
  }
}
