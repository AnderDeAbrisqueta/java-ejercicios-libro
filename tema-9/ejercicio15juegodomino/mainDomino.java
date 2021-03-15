/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio15juegodomino;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class mainDomino {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {

    FichaDomino ficha1 = new FichaDomino((int) (Math.random() * 6), (int) (Math.random() * 6));
    System.out.print(ficha1);

    for (int i = 0; i < 7; i++) {

      FichaDomino ficha2 = new FichaDomino((int) (Math.random() * 7), (int) (Math.random() * 7));

      if (ficha1.encajaFicha(ficha2)) {
        System.out.print(ficha2);
        ficha1 = ficha2;
      } else {
        i--;
      }
    }
    System.out.println("");
  }
}
