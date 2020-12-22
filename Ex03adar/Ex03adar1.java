/**
  *11/11/2020
  *
  *Grupo 1 DAM 2020-2022
  *@Ander De Abrisqueta Rangel
  */
public class Ex03adar1 { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Presupuesto Polos\n");
           
    System.out.print("Por favor, introduzca la cantidad de polos que desea: ");
    int cantidadPolos = Integer.parseInt(System.console().readLine());
       
    System.out.print("Introduce el número del tipo de polo (1. Blanco 2. Color): ");
    int tipoPolos = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la técnica (1.Serigrafía 2. Bordado): ");
    int tecnicaPolos = Integer.parseInt(System.console().readLine());
    
    System.out.println("El Polo Bonito - Presupuesto\n");
    
    switch (tipoPolos) {
      case 1:
        
        if ((cantidadPolos >= 20) && (cantidadPolos < 40))  {
          System.out.printf("Polo Blanco:%10d\n", cantidadPolos);
          System.out.printf("Precio unitario: %8.2f€\n", 4.90);
          double totalTextil = (double) cantidadPolos * 4.90;
          System.out.printf("Total textil: %11.2f€\n", totalTextil);
            
          if (tecnicaPolos == 1) {
            System.out.printf("Precio serigrafía: %6.2f€\n", 2.00); 
            double totalSerigrafia = (double) cantidadPolos * 2.00;
            System.out.printf("Total serigrafía:%8.2f€\n", totalSerigrafia);
            double subTotal = totalTextil + totalSerigrafia;
            System.out.printf("Subtotal:%16.2f€\n", subTotal);
            double iva = subTotal * 0.21;
            System.out.printf("IVA (21%%):%15.2f€\n", iva);
            double Total = subTotal + iva;
            System.out.printf("Total: %18.2f€\n", Total);
                  
            } else if (tecnicaPolos == 2) {
                System.out.printf("Precio bordado:%10.2f€\n", 3.00); 
                double totalBordado = (double) cantidadPolos * 3.00;
                System.out.printf("Total bordado:%11.2f€\n", totalBordado);
                double subTotal = totalTextil + totalBordado;
                System.out.printf("Subtotal:%16.2f€\n", subTotal);
                double iva = subTotal * 0.21;
                System.out.printf("IVA (21%%):%15.2f€\n", iva);
                double Total = subTotal + iva;
                System.out.printf("Total: %18.2f€\n", Total);
            }
                
              
          } else if ((cantidadPolos >= 40) && (cantidadPolos < 100))  {
              System.out.printf("Polo Blanco:%10d\n", cantidadPolos);
              System.out.printf("Precio unitario: %8.2f€\n", 3.90);
              double totalTextil1 = (double) cantidadPolos * 3.90;
              System.out.printf("Total textil: %11.2f€\n", totalTextil1);
            
            if ((tecnicaPolos == 1) && (cantidadPolos <= 50)) {
              System.out.printf("Precio serigrafía: %6.2f€\n", 2.00); 
              double totalSerigrafia = (double) cantidadPolos * 2.00;
              System.out.printf("Total serigrafía:%8.2f€\n", totalSerigrafia);
              double subTotal = totalTextil1 + totalSerigrafia;
              System.out.printf("Subtotal:%16.2f€\n", subTotal);
              double iva = subTotal * 0.21;
              System.out.printf("IVA (21%%):%15.2f€\n", iva);
              double Total = subTotal + iva;
              System.out.printf("Total: %18.2f€\n", Total);
                
            } else if ((tecnicaPolos == 1) && (cantidadPolos > 50)) {
                System.out.printf("Precio serigrafía: %6.2f€\n", 1.50); 
                double totalSerigrafia = (double) cantidadPolos * 1.50;
                System.out.printf("Total serigrafía: %8.2f€\n", totalSerigrafia);
                double subTotal = totalTextil1 + totalSerigrafia;
                System.out.printf("Subtotal:%16.2f€\n", subTotal);
                double iva = subTotal * 0.21;
                System.out.printf("IVA (21%%):%15.2f€\n", iva);
                double Total = subTotal + iva;
                System.out.printf("Total: %18.2f€\n", Total); 
                    
            } else if ((tecnicaPolos == 2) && (cantidadPolos <= 50)) {
                System.out.printf("Precio bordado:%10.2f€\n", 3.00); 
                double totalBordado = (double) cantidadPolos * 3.00;
                System.out.printf("Total bordado:%11.2f€\n", totalBordado);
                double subTotal = totalTextil1 + totalBordado;
                System.out.printf("Subtotal:%16.2f€\n", subTotal);
                double iva = subTotal * 0.21;
                System.out.printf("IVA (21%%):%15.2f€\n", iva);
                double Total = subTotal + iva;
                System.out.printf("Total: %18.2f€\n", Total);
                
            } else if ((tecnicaPolos == 2) && (cantidadPolos > 50)) {
                System.out.printf("Precio bordado:%10.2f€\n", 2.50); 
                double totalBordado = (double) cantidadPolos * 2.50;
                System.out.printf("Total bordado:%11.2f€\n", totalBordado);
                double subTotal = totalTextil1 + totalBordado;
                System.out.printf("Subtotal:%16.2f€\n", subTotal);
                double iva = subTotal * 0.21;
                System.out.printf("IVA (21%%):%15.2f€\n", iva);
                double Total = subTotal + iva;
                System.out.printf("Total: %18.2f€\n", Total);
            } 
              
              
          } else if (cantidadPolos >= 100)  {
              System.out.printf("Polo Blanco:%10d\n", cantidadPolos);
              System.out.printf("Precio unitario: %8.2f€\n", 3.20);
              double totalTextil2 = (double) cantidadPolos * 3.20;
              System.out.printf("Total textil: %11.2f€\n", totalTextil2);
              
              if (tecnicaPolos == 1) {
                System.out.printf("Precio serigrafía: %6.2f€\n", 1.50); 
                double totalSerigrafia = (double) cantidadPolos * 1.50;
                System.out.printf("Total serigrafía:%8.2f€\n", totalSerigrafia);
                double subTotal = totalTextil2 + totalSerigrafia;
                System.out.printf("Subtotal:%16.2f€\n", subTotal);
                double iva = subTotal * 0.21;
                System.out.printf("IVA (21%%):%15.2f€\n", iva);
                double Total = subTotal + iva;
                System.out.printf("Total: %18.2f€\n", Total);
                    
            } else if (tecnicaPolos == 2) {
                System.out.printf("Precio bordado:%10.2f€\n", 2.50); 
                double totalBordado = (double) cantidadPolos * 2.50;
                System.out.printf("Total bordado:%11.2f€\n", totalBordado);
                double subTotal = totalTextil2 + totalBordado;
                System.out.printf("Subtotal:%16.2f€\n", subTotal);
                double iva = subTotal * 0.21;
                System.out.printf("IVA (21%%):%15.2f€\n", iva);
                double Total = subTotal + iva;
                System.out.printf("Total: %18.2f€\n", Total);
            }  
          
          }
          
      break;
          
      case 2:
        
        if ((cantidadPolos >= 20) && (cantidadPolos < 40))  {
          System.out.printf("Polo Color:%11d\n", cantidadPolos);
          System.out.printf("Precio unitario: %8.2f€\n", 5.88);
          double totalTextil = (double) cantidadPolos * 5.88;
          System.out.printf("Total textil:%12.2f€\n", totalTextil);
            
            if (tecnicaPolos == 1) {
              System.out.printf("Precio serigrafía:%7.2f€\n", 2.00); 
              double totalSerigrafia = (double) cantidadPolos * 2.00;
              System.out.printf("Total serigrafía:%8.2f€\n", totalSerigrafia);
              double subTotal = totalTextil + totalSerigrafia;
              System.out.printf("Subtotal:%16.2f€\n", subTotal);
              double iva = subTotal * 0.21;
              System.out.printf("IVA (21%%):%15.2f€\n", iva);
              double Total = subTotal + iva;
              System.out.printf("Total: %18.2f€\n", Total);
                  
            } else if (tecnicaPolos == 2) {
                System.out.printf("Precio bordado:%10.2f€\n", 3.00); 
                double totalBordado = (double) cantidadPolos * 3.00;
                System.out.printf("Total bordado:%11.2f€\n", totalBordado);
                double subTotal = totalTextil + totalBordado;
                System.out.printf("Subtotal:%16.2f€\n", subTotal);
                double iva = subTotal * 0.21;
                System.out.printf("IVA (21%%):%15.2f€\n", iva);
                double Total = subTotal + iva;
                System.out.printf("Total: %18.2f€\n", Total);
            }
              
        } else if ((cantidadPolos >= 40) && (cantidadPolos < 100))  {
            System.out.printf("Polo Color:%11d\n", cantidadPolos);
            System.out.printf("Precio unitario: %8.2f€\n", 4.68);
            double totalTextil1 = (double) cantidadPolos * 4.68;
            System.out.printf("Total textil:%12.2f€\n", totalTextil1);
            
              if ((tecnicaPolos == 1) && (cantidadPolos <= 50)) {
                System.out.printf("Precio serigrafía:%7.2f€\n", 2.00); 
                double totalSerigrafia = (double) cantidadPolos * 2.00;
                System.out.printf("Total serigrafía:%8.2f€\n", totalSerigrafia);
                double subTotal = totalTextil1 + totalSerigrafia;
                System.out.printf("Subtotal:%16.2f€\n", subTotal);
                double iva = subTotal * 0.21;
                System.out.printf("IVA (21%%):%15.2f€\n", iva);
                double Total = subTotal + iva;
                System.out.printf("Total: %18.2f€\n", Total);
                
              } else if ((tecnicaPolos == 1) && (cantidadPolos > 50)) {
                  System.out.printf("Precio serigrafía:%7.2f€\n", 1.50); 
                  double totalSerigrafia = (double) cantidadPolos * 1.50;
                  System.out.printf("Total serigrafía:%8.2f€\n", totalSerigrafia);
                  double subTotal = totalTextil1 + totalSerigrafia;
                  System.out.printf("Subtotal:%16.2f€\n", subTotal);
                  double iva = subTotal * 0.21;
                  System.out.printf("IVA (21%%):%15.2f€\n", iva);
                  double Total = subTotal + iva;
                  System.out.printf("Total: %18.2f€\n", Total); 
                    
              } else if ((tecnicaPolos == 2) && (cantidadPolos <= 50)) {
                  System.out.printf("Precio bordado:%10.2f€\n", 3.00); 
                  double totalBordado = (double) cantidadPolos * 3.00;
                  System.out.printf("Total bordado:%11.2f€\n", totalBordado);
                  double subTotal = totalTextil1 + totalBordado;
                  System.out.printf("Subtotal:%16.2f€\n", subTotal);
                  double iva = subTotal * 0.21;
                  System.out.printf("IVA (21%%):%15.2f€\n", iva);
                  double Total = subTotal + iva;
                  System.out.printf("Total: %18.2f€\n", Total);
                
              } else if ((tecnicaPolos == 2) && (cantidadPolos > 50)) {
                  System.out.printf("Precio bordado:%10.2f€\n", 2.50); 
                  double totalBordado = (double) cantidadPolos * 2.50;
                  System.out.printf("Total bordado:%11.2f€\n", totalBordado);
                  double subTotal = totalTextil1 + totalBordado;
                  System.out.printf("Subtotal:%16.2f€\n", subTotal);
                  double iva = subTotal * 0.21;
                  System.out.printf("IVA (21%%):%15.2f€\n", iva);
                  double Total = subTotal + iva;
                  System.out.printf("Total: %18.2f€\n", Total);
              } 
            
          } else if (cantidadPolos >= 100)  {
              System.out.printf("Polo Color:%11d\n", cantidadPolos);
              System.out.printf("Precio unitario: %8.2f€\n", 3.84);
              double totalTextil2 = (double) cantidadPolos * 3.84;
              System.out.printf("Total textil:%12.2f€\n", totalTextil2);
              
              if (tecnicaPolos == 1) {
                System.out.printf("Precio serigrafía:%7.2f€\n", 1.50); 
                double totalSerigrafia = (double) cantidadPolos * 1.50;
                System.out.printf("Total serigrafía:%8.2f€\n", totalSerigrafia);
                double subTotal = totalTextil2 + totalSerigrafia;
                System.out.printf("Subtotal:%16.2f€\n", subTotal);
                double iva = subTotal * 0.21;
                System.out.printf("IVA (21%%):%15.2f€\n", iva);
                double Total = subTotal + iva;
                System.out.printf("Total: %18.2f€\n", Total);
                    
              } else if (tecnicaPolos == 2) {
                  System.out.printf("Precio bordado:%10.2f€\n", 2.50); 
                  double totalBordado = (double) cantidadPolos * 2.50;
                  System.out.printf("Total bordado:%11.2f€\n", totalBordado);
                  double subTotal = totalTextil2 + totalBordado;
                  System.out.printf("Subtotal:%16.2f€\n", subTotal);
                  double iva = subTotal * 0.21;
                  System.out.printf("IVA (21%%):%15.2f€\n", iva);
                  double Total = subTotal + iva;
                  System.out.printf("Total: %18.2f€\n", Total);
              }  
          
          }
      break;
          
        default:
          System.out.println("No es un tipo de Polo");
          
    }        
  }
}
