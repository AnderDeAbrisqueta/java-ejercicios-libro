/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio05Pizza;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Pizza {

  //Atributos de Clase
  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  //Atributos de instancia
  private String tipo = "";
  private String tamano = "";
  private Estado estado;

  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.totalPedidas++;
    this.estado = Estado.PEDIDA;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public enum Estado {
    PEDIDA, SERVIDA
  }

  @Override
  public String toString() {
    return "Pizza{" + "tipo= " + tipo + ", tamano= " + tamano + ", estado= " 
            + (this.estado.equals(Estado.PEDIDA) ? "pedida" : "servida") + '}';
  }

  public void sirve() {
    if (this.estado == Estado.SERVIDA) {
      System.out.println("Esta pizza ya está servida.");
    } else {
      this.totalServidas++;
      this.estado = Estado.SERVIDA;
    }

  }

}
