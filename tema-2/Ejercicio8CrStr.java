/**
  *Escribe un programa que declare 5 variables de tipo char. A continuación, crea
  *otra variable como cadena de caracteres y asígnale como valor la concatenación
  *de las anteriores 5 variables. Por último, muestra la cadena de caracteres
  *por pantalla ¿Qué problemas te encuentras? Que la asignación muestra Letra1 +......
  * no reconoce la asignación de los caracteres ¿cómo lo has solucionado?
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio8CrStr { // Clase principal
  public static void main(String[] args) {
    char Letra1 = 'A';
    char Letra2 = 's';
    char Letra3 = 'i';
    char Letra4 = 'e';
    char Letra5 = 'r';
    String cadenaCaracteres = "Letra1 + Letra2 + Letra3 + Letra4 + Letra5";
    
    System.out.println("El nombre de mi hijo es " + cadenaCaracteres);
    //System.out.println("El nombre de mi hijo es " + Letra1 + Letra2 + Letra3 + Letra4 + Letra5);
    
  }
}
