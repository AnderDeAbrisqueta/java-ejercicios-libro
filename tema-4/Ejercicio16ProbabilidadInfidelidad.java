/**
  *Realiza un programa que nos diga si hay probabilidad de que nuestra pareja nos
  *está siendo infiel. El programa irá haciendo preguntas que el usuario contestará
  *con verdadero o falso. Cada pregunta contestada como verdadero sumará 3
  *puntos. Las preguntas contestadas con falso no suman puntos. 
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio16ProbabilidadInfidelidad { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que permite saber si tu pareja te es infiel o no");
    System.out.println("");
    
    System.out.println("A continuación se listan las preguntas del test");
    System.out.println("Introduce V para la respuesta verdadera y F para decir que es falsa");
    System.out.println("");
    
    System.out.print("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente: ");
    String pregunta1 = System.console().readLine().toLowerCase();
    System.out.println("");
    
    int puntos = 0;
    int puntosPregunta = 0;
    String v;
    
    if (pregunta1.equals("v")) {
      puntos += 3;
    }  
    
    System.out.print("Ha aumentado sus gastos de vestuario: ");
    String pregunta2 = System.console().readLine().toLowerCase();
    System.out.println("");
            
    if (pregunta2.equals("v")) {
      puntos += 3;
    }  
    
    System.out.print("Ha perdido el interés que mostraba anteriormente por ti: ");
    String pregunta3 = System.console().readLine().toLowerCase();
    System.out.println("");
            
    if (pregunta3.equals("v")) {
      puntos += 3;
    }  
    
    System.out.print("Ahora se afeita y se asea con más frecuencia (si es hombre) ");
    System.out.print("o ahora se arregla el pelo y se asea con más frecuencia (si es mujer): ");
    String pregunta4 = System.console().readLine().toLowerCase();
    System.out.println("");
            
    if (pregunta4.equals("v")) {
      puntos += 3;
    } 
    
    System.out.print("No te deja que mires la agenda de su teléfono móvil: ");
    String pregunta5 = System.console().readLine().toLowerCase();
    System.out.println("");
            
    if (pregunta5.equals("v")) {
      puntos += 3;

    } 
    
    System.out.print("A veces tiene llamadas que dice no querer contestar cuando estás tú delante: ");
    String pregunta6 = System.console().readLine().toLowerCase();
    System.out.println("");
            
    if (pregunta6.equals("v")) {
      puntos += 3;

    } 
    
    System.out.print("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a: ");
    String pregunta7 = System.console().readLine().toLowerCase();
    System.out.println("");
            
    if (pregunta7.equals("v")) {
      puntos += 3;

    }
    
    System.out.print("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo: ");
    String pregunta8 = System.console().readLine().toLowerCase();
    System.out.println("");
            
    if (pregunta8.equals("v")) {
      puntos += 3;

    }
    
    System.out.print("Has notado que últimamente se perfuma más: ");
    String pregunta9 = System.console().readLine().toLowerCase();
    System.out.println("");
            
    if (pregunta9.equals("v")) {
      puntos += 3;

    }
    
    System.out.print("Se confunde y te dice que ha estado en sitios donde no ha ido contigo: ");
    String pregunta10 = System.console().readLine().toLowerCase();
    System.out.println("");
            
    if (pregunta10.equals("v")) {
      puntos += 3;

    }
    
    System.out.println("\nHas obtenido " + puntos + " puntos.");
    System.out.println("");
    
    if (puntos <= 10) {
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      
    } else if ((puntos > 10) && (puntos <= 22)) {
      System.out.print("Quizás exista el peligro de otra persona en su ");
      System.out.print("vida o en su mente, aunque seguramente será algo sin "); 
      System.out.print("importancia. No bajes la guardia.");
    
    } else if ((puntos > 22) && (puntos <= 30)) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar ");
      System.out.print("viviendo un romance con otra persona. Te aconsejamos ");
      System.out.print("que indagues un poco más y averigües que ");
      System.out.print("es lo que está pasando por su cabeza. ");
      
    }  
  }
}
