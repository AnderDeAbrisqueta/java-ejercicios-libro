/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18controldeincidencias;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Incidencia {
  private static int pendientes = 0;
  private static int numeroDeIncidencia = 1;
  private int codigo;
  private int numeroDePuesto;
  private String problema;
  private Estado estado;
  private String solucion;

  public Incidencia(int numeroDePuesto, String problema) {
    this.codigo = numeroDeIncidencia ++;
    this.numeroDePuesto = numeroDePuesto;
    this.problema = problema;
    this.estado = Estado.PENDIENTE;
    Incidencia.pendientes ++;
  }

  public static int getPendientes() {
    return pendientes;
  }

  @Override
  public String toString() {
    return "Incidencia " + this.codigo + " - Puesto: " 
            + this.numeroDePuesto  + " - " + this.problema + " - " + 
            (this.estado.equals(Estado.PENDIENTE) ? "Pendiente" : "Resuelta - " 
            + this.solucion);
  }
  
  public enum Estado {
    PENDIENTE, RESUELTA;
  }
  
  public void resuelve(String solucion) {
    this.solucion = solucion;
    this.estado = Estado.RESUELTA;
    Incidencia.pendientes --;
  }
  
  
  
  
  
  
  
  
}
