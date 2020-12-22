/**
  *Modifica el programa anterior añadiendo colores. Puedes mostrar cada asignatura
  *de un color diferente.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio5HorarioClasesColores { // Clase principal
  public static void main(String[] args) {
    System.out.println("==============================================");
    System.out.println("Hora\tlun.\tmart.\tmiérc.\tjuev.\tvier.");
    System.out.println("==============================================");
    System.out.print("1ªHora|\t\033[32mENDES\033[39;49m|\t\033[35mPROGR");
    System.out.print("\033[39;49m|\t\033[35mPROGR\033[39;49m|\t\033[35mPROGR");
    System.out.println("\033[39;49m|\t\033[97mFOL\033[39;49m");
    System.out.print("2ªHora|\t\033[32mENDES\033[39;49m|\t\033[35mPROGR");
    System.out.print("\033[39;49m|\t\033[35mPROGR\033[39;49m|\t\033[94mLMSGI");
    System.out.println("\033[39;49m|\t\033[97mFOL\033[39;49m");
    System.out.print("3ªHora|\t\033[32mENDES\033[39;49m|\t\033[94mLMSGI");
    System.out.print("\033[39;49m|\t\033[35mPROGR\033[39;49m|\t\033[94mLMSGI");
    System.out.println("\033[39;49m|\t\033[97mFOL");
    System.out.print("4ªHora|\t\033[35mPROGR\033[39;49m|\t\033[94mLMSGI\033[39;49m|");
    System.out.print("\t\033[33mBADAT\033[39;49m|\t\033[96mSINF \033[39;49m|");
    System.out.println("\t\033[96mSINF\033[39;49m");
    System.out.print("5ªHora|\t\033[35mPROGR\033[39;49m|\t\033[33mBADAT");
    System.out.print("\033[39;49m|\t\033[33mBADAT\033[39;49m|\t\033[96mSINF ");
    System.out.println("\033[39;49m|\t\033[96mSINF\033[39;49m");
    System.out.print("6ªHora|\t\033[33mBADAT\033[39;49m|\t\033[33mBADAT");
    System.out.print("\033[39;49m|\t\033[33mBADAT\033[39;49m|\t\033[96mSINF ");
    System.out.println("\033[39;49m|\t\033[96mSINF\033[39;49m");
    System.out.println("");
    System.out.println("\033[33mBADAT\033[39;49m: Base de datos");
    System.out.println("\033[32mENDES\033[39;49m: Entornos de desarrollo");
    System.out.println("\033[97mFOL\033[39;49m: Formación y orientación profesional");
    System.out.print("\033[94mLMSGI\033[39;49m: Lenguajes de marcas y sistemas"); 
    System.out.println("gestión de información");
    System.out.println("\033[35mPROGR\033[39;49m:Programación");
    System.out.println("\033[96mSINF\033[39;49m: Sistemas informáticos");
  }
}
