/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio01caballo;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Caballo {
  private String nombre;
  private int altura;
  private double peso;
  private String raza;
  private double velocidad;

  public Caballo() {
  }

  public Caballo(String nombre, int altura, double peso, String raza) {
    this.nombre = nombre;
    this.altura = altura;
    this.peso = peso;
    this.raza = raza;
  }
  
  public Caballo (String nombre, double velocidad) {
    this.nombre = nombre;
    this.velocidad = velocidad;
  }

  public String getNombre() {
    return nombre;
  }
  
  public void corre() {
    System.out.println("Estoy corriendo..., tacatac tacatac tacatac...");
  }
  
  public void come() {
    System.out.println("¡Umm! que rico está el heno.");
  }
  
  
  public void compiteCon(Caballo contrincanteCaballo) {
    if (contrincanteCaballo.velocidad > this.velocidad) {
      System.out.println(this.nombre + " pierde la carrera.");
    } else {
      System.out.println(this.nombre + " gana la carrera.");
    }
  }
  
}
