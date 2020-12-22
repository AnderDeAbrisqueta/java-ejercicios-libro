package tema6;

import java.util.Scanner;

/**
 *
 * @author Ander De Abrisqueta Rangel
 */
public class Ejercicio15NotasMusicales {

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    
    int notaMusical = 0;
    int i = 0;
    String nota = "";
    
    int compases = (int) ((Math.random() * (7 - 1) + 1) + 1);
    int salida = 0;
    String primeraNota = "";
    
    System.out.print("𝄞 4/4 ");
    
    do { 
      
      for (i = 0; i < 4; i++) {
        notaMusical = (int) (Math.random() * 7 + 1);
        
        switch (notaMusical) {
          case 1:
            nota = "do";
            break;
        
          case 2:
            nota = "re";
            break;
        
          case 3:
            nota = "mi";
            break;
        
          case 4:
            nota = "fa";
            break;
        
          case 5:
            nota = "sol";
            break;
        
          case 6:
            nota = "la";
            break;
        
          case 7:
            nota = "si";
            break;
        
          default:
            
        }
        
        if ((salida == 0) && (i == 0)) {
          primeraNota = nota;
          //System.out.print(primeraNota);
        }
          
        if ((salida == compases - 1) && (i == 3)) {
          nota = primeraNota;
          //System.out.print(primeraNota);
          
        }
        System.out.print(nota + " ");
      }
      
      System.out.print("|");
      
      salida++;
      
    } while (salida < compases);
    
    System.out.println("|");
    
  }
}
