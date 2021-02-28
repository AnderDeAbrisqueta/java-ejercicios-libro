/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2vehiculos;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public abstract class Vehiculo {

  //Atributos de Clase
  private static int vehiculosCreados = 0;
  private static int kilometrosTotales = 0;

  //Atributos de Instancia
  private int kilometrosRecorridos = 0;
  private String matricula = "";
  private String modelo = "";
  private String marca = "";
  private String tipo = "";

  public Vehiculo() {
    this.kilometrosRecorridos = 0;
    Vehiculo.vehiculosCreados++;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public void recorre(int distanciaRecorrida) {
    this.kilometrosRecorridos += distanciaRecorrida;
    Vehiculo.kilometrosTotales += distanciaRecorrida;
  }

  public void vehiculosCreados(int vehiculos) {
    Vehiculo.vehiculosCreados += vehiculos;
  }

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public Vehiculo(String tipo, String matricula, String modelo, String marca, int kilometraje) {
    this.tipo = tipo;
    this.matricula = matricula;
    this.modelo = modelo;
    this.marca = marca;
    this.kilometrosRecorridos = kilometraje;
    Vehiculo.vehiculosCreados++;
    Vehiculo.kilometrosTotales += kilometraje;

  }

  public String ficha() {
    String resultado = "===========================\n";
    resultado += "Tipo de vehículo: " + this.tipo;
    resultado += "Matrícula: " + this.matricula;
    resultado += "\nModelo: " + this.modelo;
    resultado += "\nMarca: " + this.marca;
    resultado += "\nKilometraje: " + this.kilometrosRecorridos;
    resultado += "\n===========================";
    return resultado;

  }

}
