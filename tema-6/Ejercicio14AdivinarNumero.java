package tema6;

import java.util.Scanner;

/**
 *Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6. El
 *programa intentará adivinar el número que estás pensando - un número entre 0
 *y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el programa
 *debe preguntar si el número que estás pensando es mayor o menor que el que
 *te acaba de decir. 
 * 
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio14AdivinarNumero {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    int i = 1;
    int numeroPensadoOrdenador;
    int numeroSecreto = 0;
    int numeroMenor = 0;
    int numeroMayor = 100;
    
    System.out.println("¡Adivina qué número estoy pensando! \n");
    
    do {   
      
      System.out.println("Debes introducir un número entre " + numeroMenor + " y " + numeroMayor + ".\n");
      numeroPensadoOrdenador = (int) (Math.random() * ((numeroMayor - numeroMenor) + 1) + numeroMenor);
      System.out.println("El número introducido es: " + numeroPensadoOrdenador);
      
      System.out.println("");
      System.out.println("Escoge una de las opciones: ");
      System.out.println("");
      System.out.println("1)El número que ha introducido es mayor que el número secreto \n");
      System.out.println("2)El número que ha introducido es menor que el número secreto \n");
      System.out.println("3)¡Ha acertado! \n");
      System.out.print("Elección: ");
      numeroSecreto = Integer.parseInt(s.nextLine());
      System.out.println("\n");
      
      if (numeroSecreto == 3) {
        i = 6;
        System.out.print("¡Enhorabuena! \n");
        
      } else if (numeroSecreto == 2) {
          
          System.out.println("Incorrecto \n");
          System.out.println("Te quedan " + (5 - i) + " intentos. \n");
          System.out.println("Por favor, vuelva a intentarlo.");
          System.out.println("");
          numeroMenor = numeroPensadoOrdenador + 1;
          
      } else if (numeroSecreto == 1) {
          System.out.println("Incorrecto \n");
          System.out.println("Te quedan " + (5 - i) + " intentos. \n");
          System.out.println("Por favor, vuelva a intentarlo.");
          System.out.println("");
          numeroMayor = numeroPensadoOrdenador - 1;
 
      } 
      
      i++;
      
    } while (i < 6);
    
  }
}
