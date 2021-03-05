/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06tiempo;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Tiempo {

  private int hora = 0;
  private int minutos = 0;
  private int segundos = 0;

  public Tiempo(int hora, int minutos, int segundos) {
    this.hora = hora;
    this.minutos = minutos;
    this.segundos = segundos;
  }

  @Override
  public String toString() {
    return hora + "h " + minutos + "m " + segundos + "s";
  }
  
  /**
   * Método que calcula la suma de dos horas.
   * @param hora
   * @param minutos
   * @param segundos
   * @return la hora resultado de la suma de dos horas.
   */
  public String suma(int hora, int minutos, int segundos) {
    int s = this.segundos + segundos;
    int auxs = 0;
    int auxm = 0;

    if (s > 59) {
      s = s - 60;
      auxm = 1;
    }

    int m = this.minutos + minutos + auxm;
    int auxh = 0;

    if (m > 59) {
      m = m - 60;
      auxh = 1;
    }

    int h = this.hora + hora + auxh;

    return h + "h " + m + "m " + s + "s";
  }
  
  /**
   * Método que calcula la diferencia entre dos horas.
   * 
   * @param hora
   * @param minutos
   * @param segundos
   * @return la diferencia de dos horas.
   */
  public String resta(int hora, int minutos, int segundos) {
//    int h1 = this.hora * 60;
//    int m1 = (h1 + this.minutos) * 60;
//    int s1 = m1 + this.segundos;
//    
//    int h2 = hora * 60;
//    int m2= (h2 + minutos) * 60;
//    int s2 = m2 + segundos;
//    
//    double s3 = s1 - s2;
//    
//    double h3 = s3 / 3600;
//    
//    int h =  (int) s3 / 3600;
//    
//    double m3 = h3 - h;
//    int m = (int) Math.floor(m3 * 60);
//    double s4 = (m3 * 60 - m);
//    int s = (int) Math.ceil(s4 * 60);

    int s = 0;
    int m = 0;
    int h = 0;

    if (segundos > this.segundos) {
      s = (this.segundos + 60) - segundos;
      m = (this.minutos - 1);

      if (m < minutos) {
        m = (this.minutos - 1 + 60) - minutos;
        h = (this.hora - 1);
        h = h - hora;
      } else {
        m = this.minutos - 1 - minutos;
        h = this.hora - hora;
      }
    } else {
      s = this.segundos - segundos;
      if (this.minutos < minutos) {
        m = (this.minutos + 60) - minutos;
        h = (this.hora - 1);
        h = h - hora;
      } else {
        m = this.minutos - minutos;
        h = this.hora - hora;
      }
    }

    return h + "h " + m + "m " + s + "s";
  }

}
