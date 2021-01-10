/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema7;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio02ArrayCaracteres {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    char [] simbolo;
    simbolo = new char[10];
    
    simbolo [0] = 'a';
    simbolo [1] = 'X';
    simbolo [4] = '@';
    simbolo [6] = ' ';
    simbolo [7] = '+';
    simbolo [8] = 'Q';
    
    for (int i = 0; i < 10; i++) {
      System.out.printf("num[%s]: %s\n", i, simbolo[i]);
    }
    
    
  }
}
