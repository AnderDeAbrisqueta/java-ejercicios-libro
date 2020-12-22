/**
  *Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce
  *su jugada y luego el usuario 2. Si alguno de los usuarios introduce una opción
  *incorrecta, el programa deberá mostrar un mensaje de error.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio28JuegoPPT { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Juego Piedra, Papel y Tijera\n");
           
    System.out.print("Por favor, jugador 1, elija una jugada (piedra, papel o tijera): ");
    String jugador1 = System.console().readLine().toLowerCase();
       
    System.out.print("Por favor, jugador 2, elija una jugada (piedra, papel o tijera): ");
    String jugador2 = System.console().readLine().toLowerCase();
   
      if (jugador1.equals("piedra") && jugador2.equals("papel")) {
        System.out.print("El jugador 2 gana");
        
      } else if (jugador1.equals("piedra") && jugador2.equals("tijera")) {  
          System.out.print("El jugador 1 gana");
          
      } else if (jugador1.equals("piedra") && jugador2.equals("piedra")) {  
          System.out.print("Empate"); 
          
      } else if (jugador1.equals("papel") && jugador2.equals("piedra")) {  
          System.out.print("El jugador 1 gana"); 
          
      } else if (jugador1.equals("papel") && jugador2.equals("tijera")) {  
          System.out.print("El jugador 2 gana");  
          
      } else if (jugador1.equals("papel") && jugador2.equals("papel")) {  
          System.out.print("Empate");
          
      } else if (jugador1.equals("tijera") && jugador2.equals("piedra")) {  
          System.out.print("El jugador 2 gana"); 
          
      } else if (jugador1.equals("tijera") && jugador2.equals("papel")) {  
          System.out.print("El jugador 1 gana");
          
      } else if (jugador1.equals("tijera") && jugador2.equals("tijera")) {  
          System.out.print("Empate");
   
    }  
            
  }
}
