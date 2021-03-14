/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio03colecciondedisco;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class coleccionDeDisco {
// N determina el tamaño del array

  static int N = 100;

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);

    //Crea el array de discos
    Disco[] album = new Disco[N];

    // Crea todos los discos que van en cada una de
    // las celdas del array
    for (int i = 0; i < N; i++) {
      album[i] = new Disco();
    }

    int opcion;
    String codigoIntroducido;
    String grupoIntroducido;
    String tituloIntroducido;
    String yearIntroducidoString;
    int yearIntroducido;
    String generoIntroducido;
    int primeraLibre;
    int i;

    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {
        case 1:
          System.out.println("\nLISTADO");
          System.out.println("=======");
          for (i = 0; i < N; i++) {
            if (!album[i].getCodigo().equals("Libre")) {
              System.out.println(album[i]);
            }
          }
          break;

        case 2:
          System.out.println("\nNUEVO DISCO");
          System.out.println("===========");

          // Busca la primera posición libre del array
          primeraLibre = -1;
          do {
            primeraLibre++;
          } while (!((album[primeraLibre].getCodigo()).equals("Libre")));

          System.out.println("Por favor, introduzca los datos del disco.");

          System.out.print("Código: ");
          codigoIntroducido = s.nextLine();
          album[primeraLibre].setCodigo(codigoIntroducido);

          System.out.print("Grupo: ");
          grupoIntroducido = s.nextLine();
          album[primeraLibre].setGrupo(grupoIntroducido);

          System.out.print("Título: ");
          tituloIntroducido = s.nextLine();
          album[primeraLibre].setTitulo(tituloIntroducido);

          System.out.print("Año: ");
          yearIntroducido = Integer.parseInt(s.nextLine());
          album[primeraLibre].setYear(yearIntroducido);

          System.out.print("Género: ");
          generoIntroducido = s.nextLine();
          album[primeraLibre].setGenero(generoIntroducido);
          break;

        case 3:
          System.out.println("\nMODIFICAR");
          System.out.println("===========");

          System.out.print("Por favor, introduzca el código del disco cuyos datos desea cambiar: ");
          codigoIntroducido = s.nextLine();

          i = -1;
          do {
            i++;
          } while (!((album[i].getCodigo()).equals(codigoIntroducido)));

          System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

          System.out.println("Código: " + album[i].getCodigo());
          System.out.print("Nuevo código: ");
          codigoIntroducido = s.nextLine();
          if (!codigoIntroducido.equals("")) {
            album[i].setCodigo(codigoIntroducido);
          }

          System.out.println("Grupo: " + album[i].getGrupo());
          System.out.print("Nuevo grupo: ");
          grupoIntroducido = s.nextLine();
          if (!grupoIntroducido.equals("")) {
            album[i].setGrupo(grupoIntroducido);
          }

          System.out.println("Título: " + album[i].getTitulo());
          System.out.print("Nuevo título: ");
          tituloIntroducido = s.nextLine();
          if (!tituloIntroducido.equals("")) {
            album[i].setTitulo(tituloIntroducido);
          }

          System.out.println("Año: " + album[i].getYear());
          System.out.print("Nuevo año: ");
          yearIntroducidoString = s.nextLine();
          if (!yearIntroducidoString.equals("")) {
            album[i].setYear(Integer.parseInt(yearIntroducidoString));
          }

          System.out.println("Género: " + album[i].getGenero());
          System.out.print("Nuevo género: ");
          generoIntroducido = s.nextLine();
          if (!generoIntroducido.equals("")) {
            album[i].setGenero(generoIntroducido);
          }
          break;

        case 4:
          System.out.println("\nBORRAR");
          System.out.println("======");

          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codigoIntroducido = s.nextLine();

          i = -1;
          do {
            i++;
          } while (!((album[i].getCodigo()).equals(codigoIntroducido)));
          album[i].setCodigo("Libre");
          System.out.println("Album borrado.");
          break;

        default:

      } // switch
    } while (opcion != 5);

  }
}
