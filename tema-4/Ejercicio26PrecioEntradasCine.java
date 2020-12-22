/**
  *Realiza un programa que calcule el precio de unas entradas de cine en función
  *del número de personas y del día de la semana. El precio base de una entrada
  *son 8 euros. El miércoles (día del espectador), el precio base es de 5 euros. Los
  *jueves son el día de la pareja, por lo que la entrada para dos cuesta 11 euros.
  *Con la tarjeta CineCampa se obtiene un 10% de descuento. Si un jueves, un
  *grupo de 6 personas compran entradas, el precio total sería de 33 euros ya
  *que son 3 parejas; pero si es un grupo de 7, pagarán 3 entradas de pareja más
  *1 individual que son 41 euros (33 + 8).
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio26PrecioEntradasCine { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Venta de entradas CineCampa. \n");
           
    System.out.print("Por favor, ingrese el número de entradas: ");
    int numeroEntradas = Integer.parseInt(System.console().readLine());
       
    System.out.print("Indique el día de la semana: ");
    String diaSemana = System.console().readLine().toLowerCase();
    
    System.out.print("¿Tiene tarjeta CineCampa? (s/n): ");
    String tarjetaCineCampa = System.console().readLine().toLowerCase();
    
    System.out.println("Aquí tiene sus entradas. Gracias por su compra.");
    System.out.println("");
    
    switch (diaSemana) {
      case "lunes", "martes", "viernes", "sábado", "sabado", "domingo":
        if (tarjetaCineCampa.equals("s"))  {
          System.out.println("Número de entradas: " + numeroEntradas);
          double precioEntrada = 8;
          System.out.printf("Precio por entrada: %.2f€\n", precioEntrada);
          double subTotal = (double)numeroEntradas * precioEntrada;
          System.out.printf("Subtotal: %14.2f€\n", subTotal);
          double descuento = subTotal * 0.10;
          System.out.printf("Descuento:%14.2f€\n", descuento);
          double total = subTotal - descuento;
          System.out.printf("Total:%18.2f€\n", total);
                
        } else {
          System.out.println("Número de entradas: " + numeroEntradas);
          double precioEntrada = 8;
          System.out.printf("Precio por entrada: %.2f€\n", precioEntrada);
          double subTotal = (double)numeroEntradas * precioEntrada;
          System.out.printf("Subtotal: %14.2f€\n", subTotal);
          double descuento = subTotal * 0.00;
          System.out.printf("Descuento:%14.2f€\n", descuento);
          double total = subTotal - descuento;
          System.out.printf("Total:%18.2f€\n", total);
        }    
      break;
      
      case "miercoles", "miércoles":
        if (tarjetaCineCampa.equals("s"))  {
          System.out.println("Número de entradas: " + numeroEntradas);
          double precioEntrada = 5;
          System.out.printf("Precio por entrada: %.2f€\n", precioEntrada);
          double subTotal = (double)numeroEntradas * precioEntrada;
          System.out.printf("Subtotal: %14.2f€\n", subTotal);
          double descuento = subTotal * 0.10;
          System.out.printf("Descuento:%14.2f€\n", descuento);
          double total = subTotal - descuento;
          System.out.printf("Total:%18.2f€\n", total);
                
        } else {
          System.out.println("Número de entradas: " + numeroEntradas);
          double precioEntrada = 5;
          System.out.printf("Precio por entrada: %.2f€\n", precioEntrada);
          double subTotal = (double)numeroEntradas * precioEntrada;
          System.out.printf("Subtotal: %14.2f€\n", subTotal);
          double descuento = subTotal * 0.00;
          System.out.printf("Descuento:%14.2f€\n", descuento);
          double total = subTotal - descuento;
          System.out.printf("Total:%18.2f€\n", total);
        }    
      break;
      
      case "jueves":
        System.out.println("Número de entradas:  " + numeroEntradas);
        double pareja = (double)numeroEntradas % 2;
        
        if ((tarjetaCineCampa.equals("s")) && (pareja == 0)) {
          int numeroEntradasPareja = numeroEntradas/2;
          double precioEntrada = 11;
          System.out.printf("Precio por entrada: %.2f€\n", precioEntrada);
          double subTotal = (double)numeroEntradasPareja * precioEntrada;
          System.out.printf("Subtotal:%16.2f€\n", subTotal);
          double descuento = subTotal * 0.10;
          System.out.printf("Descuento:%15.2f€\n", descuento);
          double total = subTotal - descuento;
          System.out.printf("Total:%19.2f€\n", total);
           
        } else if ((tarjetaCineCampa.equals("s")) && (pareja != 0)) { 
            int numeroEntradasPareja = (numeroEntradas - 1)/2;
            double precioEntradaPareja = 11;
            double precioEntradaIndividual = 8;
            System.out.printf("Precio de entrada por pareja:  %.2f€\n", precioEntradaPareja);
            System.out.printf("Precio de entrada individual:   %2.2f€\n", precioEntradaIndividual);
            double subTotal = (double)numeroEntradasPareja * precioEntradaPareja + precioEntradaIndividual;
            System.out.printf("Subtotal:%27.2f€\n", subTotal);
            double descuento = subTotal * 0.10;
            System.out.printf("Descuento:%26.2f€\n", descuento);
            double total = subTotal - descuento;
            System.out.printf("Total:%30.2f€\n", total);
        
        } else if ((tarjetaCineCampa.equals("n")) && (pareja == 0)) {
            int numeroEntradasPareja = numeroEntradas/2;
            double precioEntrada = 11;
            System.out.printf("Precio por entrada: %.2f€\n", precioEntrada);
            double subTotal = (double)numeroEntradasPareja * precioEntrada;
            System.out.printf("Subtotal:%16.2f€\n", subTotal);
            double descuento = subTotal * 0.00;
            System.out.printf("Descuento:%15.2f€\n", descuento);
            double total = subTotal - descuento;
            System.out.printf("Total:%19.2f€\n", total);
           
        } else { 
            int numeroEntradasPareja = (numeroEntradas - 1)/2;
            double precioEntradaPareja = 11;
            double precioEntradaIndividual = 8;
            System.out.printf("Precio de entrada por pareja:  %.2f€\n", precioEntradaPareja);
            System.out.printf("Precio de entrada individual:   %2.2f€\n", precioEntradaIndividual);
            double subTotal = (double)numeroEntradasPareja * precioEntradaPareja + precioEntradaIndividual;
            System.out.printf("Subtotal:%27.2f€\n", subTotal);
            double descuento = subTotal * 0.00;
            System.out.printf("Descuento:%26.2f€\n", descuento);
            double total = subTotal - descuento;
            System.out.printf("Total:%30.2f€\n", total);
        }   
                
      break;
              
    default:
      System.out.println("No es un día de la semana");
    }  
            
  }
}
