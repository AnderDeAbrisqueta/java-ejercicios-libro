/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema5;

import java.util.Scanner;

/**
 *
 * @AnderDeAbrisqueta
 */
public class Ejercicio11CuadradoCubo {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Programa que calcula el cuadrado y el cubo de un número entero\n");
    
    System.out.print("Por favor, introduzca un número: ");
    int numero = Integer.parseInt(s.nextLine());
    System.out.print("");
    
    System.out.printf("***********************\n"); 
    System.out.printf("Número  Cuadrado  Cubo\n"); 
    System.out.printf("***********************\n"); 
    
    for (int i = 0; i < 5; i++) {
 
     double cuadradoNumero = Math.pow(numero, 2);
     double cuboNumero = Math.pow(numero, 3);
     
     System.out.printf(" %3d   %6.0f   %6.0f\n", numero, cuadradoNumero, cuboNumero); 
     numero++;
    }
    
  }
}
    
  

