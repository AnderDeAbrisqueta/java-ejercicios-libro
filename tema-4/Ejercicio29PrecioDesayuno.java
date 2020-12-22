/**
  *Realiza un programa que calcule el precio de un desayuno. El programa
  *preguntará primero qué ha tomado el usuario de comer: palmera, donut o
  *pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo, el
  *programa debe preguntar además si era con aceite o con tortilla; el primero
  *vale 1’20 € y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o
  *café a 1’50 y 1’20 respectivamente.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio29PrecioDesayuno { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Precio del desayuno\n");
           
    System.out.print("¿Qué ha tomado de comer? (palmera, donut o pitufo): ");
    String comida = System.console().readLine().toLowerCase();
       
    System.out.print("¿Qué ha tomado de beber? (zumo o café): ");
    String bebida = System.console().readLine().toLowerCase();
 
    System.out.println("Gracias por su compra.\n");
    
    switch (comida) {
      case "palmera":
      
        if (bebida.equals("zumo"))  {
          double palmera = 1.40;
          System.out.printf("Desayuno: %-8s %2.2f€\n", comida, palmera);
          double zumo = 1.50;
          System.out.printf("Bebida: %-8s %6.2f€\n", bebida, zumo);
          double total = palmera + zumo;    
          System.out.printf("Total:%17.2f€\n", total);
                
        } else {
          double palmera = 1.40;
          System.out.printf("Desayuno: %-8s %2.2f€\n", comida, palmera);
          double cafe = 1.20;
          System.out.printf("Bebida: %-8s %6.2f€\n", bebida, cafe);
          double total = palmera + cafe;    
          System.out.printf("Total:%17.2f€\n", total);
               
        }    
      break;
      
      case "donut":
     if (bebida.equals("zumo"))  {
          double donut = 1.00;
          System.out.printf("Desayuno: %-8s %2.2f€\n", comida, donut);
          double zumo = 1.50;
          System.out.printf("Bebida: %-8s %6.2f€\n", bebida, zumo);
          double total = donut + zumo;    
          System.out.printf("Total:%17.2f€\n", total);
                
        } else {
          double donut = 1.00;
          System.out.printf("Desayuno: %-8s %2.2f€\n", comida, donut);
          double cafe = 1.20;
          System.out.printf("Bebida: %-8s %6.2f€\n", bebida, cafe);
          double total = donut + cafe;    
          System.out.printf("Total:%17.2f€\n", total);   
          
      }
      break;
      
      case "pitufo":
        System.out.print("¿Lo quiere con aceite o con tortilla?: ");
        String tipopitufo = System.console().readLine().toLowerCase();
        
        if (tipopitufo.equals("aceite") && bebida.equals("zumo")) {
          double pitufoAceite = 1.20;
          System.out.printf("Desayuno: %-8s %2.2f€\n", comida, pitufoAceite);
          double zumo = 1.50;
          System.out.printf("Bebida: %-8s %6.2f€\n", bebida, zumo);
          double total = pitufoAceite + zumo;    
          System.out.printf("Total:%17.2f€\n", total);
                
        } else if (tipopitufo.equals("aceite") && bebida.equals("cafe")) {
          double pitufoAceite = 1.20;
          System.out.printf("Desayuno: %-8s %2.2f€\n", comida, pitufoAceite);
          double cafe = 1.20;
          System.out.printf("Bebida: %-8s %6.2f€\n", bebida, cafe);
          double total = pitufoAceite + cafe;    
          System.out.printf("Total:%17.2f€\n", total); 
          
        } else  if (tipopitufo.equals("tortilla") && bebida.equals("zumo")) {
          double pitufoTortilla = 1.60;
          System.out.printf("Desayuno: %-8s %2.2f€\n", comida, pitufoTortilla);
          double zumo = 1.50;
          System.out.printf("Bebida: %-8s %6.2f€\n", bebida, zumo);
          double total = pitufoTortilla + zumo;    
          System.out.printf("Total:%17.2f€\n", total);  
          
        } else if (tipopitufo.equals("tortilla") && bebida.equals("cafe")) {
          double pitufoTortilla = 1.60;
          System.out.printf("Desayuno: %-8s %2.2f€\n", comida, pitufoTortilla);
          double cafe = 1.20;
          System.out.printf("Bebida: %-8s %6.2f€\n", bebida, cafe);
          double total = pitufoTortilla + cafe;    
          System.out.printf("Total:%17.2f€\n", total);   
           
        } 
      break;
              
    default:
      System.out.println("No es un tipo de desayuno");
    }  
            
  }
}
