/**
  *Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas
  *que se imparten en el curso. Cada pregunta acertada sumará un punto. El
  *programa mostrará al final la calificación obtenida. Pásale el minicuestionario a
  *tus compañeros y pídeles que lo hagan para ver qué tal andan de conocimientos
  *en las diferentes asignaturas del curso.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio12Cuestionario { // Clase principal
  public static void main(String[] args) {
    
      System.out.println("Este programa es un minicuestionario sobre programación \n");
    
    System.out.println("¿Qué resultado da la siguiente operación?");
    System.out.println("System.out.println(5>>1);\n");
    System.out.println("1. 6");
    System.out.println("2. true");
    System.out.println("3. 4");
    System.out.println("4. 2\n");
        
    System.out.print("Introducir respuesta: ");
    int respuesta1 = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    int puntos = 0;
    
    switch (respuesta1) {
      case 1, 3, 4:
        System.out.println("Respuesta incorrecta\n");
       break;
        
      case 2:
        System.out.println("Respuesta correcta\n");
        puntos++;
        break;
        
      default:
        System.out.println("Ese número no es correcto\n");
                        
    } 
                
    System.out.println("¿Cómo puedo elevar un número a una potencia?");
    System.out.println("1. Math.poten");
    System.out.println("2. Operador **");
    System.out.println("3. Math.pow");
    System.out.println("4. Operador ^\n");
    
    System.out.print("Introducir respuesta: ");
    int respuesta2 = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    switch (respuesta2) {
      case 1, 2, 4:
        System.out.println("Respuesta incorrecta\n");
       break;
        
      case 3:
        System.out.println("Respuesta correcta\n");
        puntos++;
        break;
        
      default:
        System.out.println("Ese número no es correcto\n");
    
    }
    
    System.out.println("¿Cuál es el resultado del siguiente programa?");
    System.out.println("int i=1;");
    System.out.println("int j=2;");
    System.out.println("System.out.println ((i > 1) && (j > 4));\n");
    System.out.println("1. true");
    System.out.println("2. false");
    System.out.println("3. undefined");
    System.out.println("4. No compila el código\n");
    
    System.out.print("Introducir respuesta: ");
    int respuesta3 = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    switch (respuesta3) {
      case 1, 3, 4:
        System.out.println("Respuesta incorrecta\n");
       break;
        
      case 2:
        System.out.println("Respuesta correcta\n");
        puntos++;
        break;
        
      default:
        System.out.println("Ese número no es correcto\n");
    
    }
    
    System.out.println("¿Cuál es el resultado del siguiente programa?");
    System.out.println("int j=2;");
    System.out.println("System.out.println(j == 3); \n");
    System.out.println("1. true");
    System.out.println("2. false");
    System.out.println("3. undefined");
    System.out.println("4. j == 3\n");
    
    System.out.print("Introducir respuesta: ");
    int respuesta4 = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    switch (respuesta4) {
      case 1, 3, 4:
        System.out.println("Respuesta incorrecta\n");
       break;
        
      case 2:
        System.out.println("Respuesta correcta\n");
        puntos++;
        break;
        
      default:
        System.out.println("Ese número no es correcto\n");
    
    } 
       
    System.out.println("¿Qué resultado da la siguiente operación?");
    System.out.println("System.out.println(12&13);\n");
    System.out.println("1. true");
    System.out.println("2. false");
    System.out.println("3. 12");
    System.out.println("4. 13\n");
    
    System.out.print("Introducir respuesta: ");
    int respuesta5 = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    switch (respuesta5) {
      case 1, 2, 4:
        System.out.println("Respuesta incorrecta\n");
       break;
        
      case 3:
        System.out.println("Respuesta correcta\n");
        puntos++;
        break;
        
      default:
        System.out.println("Ese número no es correcto\n");
        
    }  
    
        System.out.println("\nHas obtenido " + puntos + " puntos.");
      
  }
}
