/**
  *11/11/2020
  *
  *Grupo 1 DAM 2020-2022
  *@Ander De Abrisqueta Rangel
  */
public class Ex03adar3 { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que recorta números");
           
    System.out.print("Por favor, introduzca el número a recortar: ");
    String numeroRecortar = System.console().readLine();
    
    int longitudNumero = numeroRecortar.length();
    int numeroRecortarInt = Integer.parseInt(numeroRecortar);
    
      if (numeroRecortarInt < 0) {
        double primeraCifra = numeroRecortarInt / Math.pow(10, longitudNumero - 2); 
     
      } else {
        double primeraCifra = numeroRecortarInt / Math.pow(10, longitudNumero - 1);
        
          if ((int)primeraCifra >= longitudNumero) {
          System.out.println("La primera cifra del número " + numeroRecortar + " es " + (int)primeraCifra + " y es mayor o igual a la cantidad de dígitos");
          System.out.println("Por lo tanto el número es " + numeroRecortar);
          
         } else {
            double numeroRecortado = (double) numeroRecortarInt / (Math.pow(10, longitudNumero - (int)primeraCifra));
            System.out.println("La primera cifra del número " + numeroRecortar + " es " + (int)primeraCifra);
            System.out.println("Por lo tanto el número es " + (int) numeroRecortado);
         }   
      }
          
  }
}
  
