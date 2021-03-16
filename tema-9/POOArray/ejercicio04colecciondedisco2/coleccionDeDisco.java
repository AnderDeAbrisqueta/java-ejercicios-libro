/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio04colecciondedisco2;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class coleccionDeDisco {
// N determina el tamaño del array

  static int N = 3;

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
    int opcionListado;
    String codigoIntroducido;
    String codigo;
    String grupoIntroducido;
    String tituloIntroducido;
    String yearIntroducidoString;
    int yearIntroducido;
    String generoIntroducido;
    String duracionIntroducidaString;
    int duracionIntroducida;
    int primeraLibre;
    int i;
    int limiteInferior;
    int limiteSuperior;
    boolean existeCodigo = true;

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
          do {
            System.out.println("\nLISTADO");
            System.out.println("=======");
            System.out.println("1. Completo");
            System.out.println("2. Por grupo");
            System.out.println("3. Por género");
            System.out.println("4. En un rango de duración");
            System.out.println("5. Menú principal");
            System.out.print("Introduzca una opción: ");
            opcionListado = Integer.parseInt(s.nextLine());

            switch (opcionListado) {

              case 1: // Listado completo ////////////////

                for (i = 0; i < N; i++) {
                  if (!album[i].getCodigo().equals("Libre")) {
                    System.out.println("------------------------------------------");
                    System.out.println("Código: " + album[i].getCodigo());
                    System.out.println("Grupo: " + album[i].getGrupo());
                    System.out.println("Título: " + album[i].getTitulo());
                    System.out.println("Año: " + album[i].getYear());
                    System.out.println("Género: " + album[i].getGenero());
                    System.out.println("Duración: " + album[i].getDuracion());
                    System.out.println("------------------------------------------");
                  }
                }
                break;

              case 2: // Listado por autor ////////////////

                System.out.print("Introduzca el autor: ");
                grupoIntroducido = s.nextLine();

                for (i = 0; i < N; i++) {
                  if ((!album[i].getCodigo().equals("Libre")) && (album[i].getGrupo().equals(grupoIntroducido))) {
                    System.out.println("------------------------------------------");
                    System.out.println("Código: " + album[i].getCodigo());
                    System.out.println("Grupo: " + album[i].getGrupo());
                    System.out.println("Título: " + album[i].getTitulo());
                    System.out.println("Año: " + album[i].getYear());
                    System.out.println("Género: " + album[i].getGenero());
                    System.out.println("Duración: " + album[i].getDuracion());
                    System.out.println("------------------------------------------");
                  }
                }
                break;

              case 3: // Listado por género ////////////////

                System.out.print("Introduzca el género: ");
                generoIntroducido = s.nextLine();

                for (i = 0; i < N; i++) {
                  if ((!album[i].getCodigo().equals("Libre")) && (album[i].getGenero().equals(generoIntroducido))) {
                    System.out.println("------------------------------------------");
                    System.out.println("Código: " + album[i].getCodigo());
                    System.out.println("Grupo: " + album[i].getGrupo());
                    System.out.println("Título: " + album[i].getTitulo());
                    System.out.println("Año: " + album[i].getYear());
                    System.out.println("Género: " + album[i].getGenero());
                    System.out.println("Duración: " + album[i].getDuracion());
                    System.out.println("------------------------------------------");
                  }
                }
                break;

              case 4: // Listado en un rango de duración ////////////////

                System.out.println("Establezca el intervalo para la duración");
                System.out.print("Introduzca el límite inferior de duración en minutos: ");
                limiteInferior = Integer.parseInt(s.nextLine());
                System.out.print("Introduzca el límite superior de duración en minutos: ");
                limiteSuperior = Integer.parseInt(s.nextLine());

                for (i = 0; i < N; i++) {
                  if ((!album[i].getCodigo().equals("Libre")) && (album[i].getDuracion() <= limiteSuperior) && (album[i].getDuracion() >= limiteInferior)) {
                    System.out.println("------------------------------------------");
                    System.out.println("Código: " + album[i].getCodigo());
                    System.out.println("Grupo: " + album[i].getGrupo());
                    System.out.println("Título: " + album[i].getTitulo());
                    System.out.println("Año: " + album[i].getYear());
                    System.out.println("Género: " + album[i].getGenero());
                    System.out.println("Duración: " + album[i].getDuracion());
                    System.out.println("------------------------------------------");
                  }
                }

            } // switch (opcionListado)
          } while (opcionListado != 5);

          break;

        case 2:
          System.out.println("\nNUEVO DISCO");
          System.out.println("===========");

          // Busca la primera posición libre del array
          primeraLibre = 0;
          codigo = album[primeraLibre].getCodigo();
          while ((primeraLibre < N) && (!(codigo.equals("Libre")))) {
            primeraLibre++;
            if (primeraLibre < N) {
              codigo = album[primeraLibre].getCodigo();
            }
          }

          if (primeraLibre == N) {
            System.out.println("Lo siento, la base de datos está llena.");
          } else {
            System.out.println("Por favor, introduzca los datos del disco.");
            System.out.print("Código: ");

            // Comprueba que el código introducido no se repita
            existeCodigo = true;
            codigoIntroducido = s.nextLine();
            while (existeCodigo) {
              existeCodigo = false;
//              codigoIntroducido = s.nextLine();
              for (i = 0; i < N; i++) {
                if (codigoIntroducido.equals(album[i].getCodigo())) {
                  existeCodigo = true;
                }
              }

              if (existeCodigo) {
                System.out.println("Ese código ya existe en la base de datos.");
                System.out.print("Introduzca otro código: ");
              }
            } // while (existeCodigo)

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

            System.out.print("Duración: ");
            duracionIntroducida = Integer.parseInt(s.nextLine());
            album[primeraLibre].setDuracion(duracionIntroducida);
          }
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

          System.out.println("Autor: " + album[i].getGrupo());
          System.out.print("Nuevo autor: ");
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
          System.out.println("Duración: " + album[i].getDuracion());
          System.out.print("Duración: ");
          duracionIntroducidaString = s.nextLine();
          if (!duracionIntroducidaString.equals("")) {
            album[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
          }
          break;

        case 4:
          System.out.println("\nBORRAR");
          System.out.println("======");

          System.out.print("Por favor, introduzca el código del disco que desea borrar: ");
          codigoIntroducido = s.nextLine();

          i = -1;
          codigo = "";
          do {
            System.out.println(i);
            i++;
            if (i < N) {
              codigo = album[i].getCodigo();
            }
          } while (!(codigo.equals(codigoIntroducido)) && (i < N));

          System.out.println(i);

          if (i == N) {
            System.out.println("Lo siento, el código introducido no existe.");
          } else {
            album[i].setCodigo("Libre");
            System.out.println("Album borrado.");
          }

      } // switch
    } while (opcion != 5);
  }
}
