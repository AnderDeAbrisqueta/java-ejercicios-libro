/**
  *La tienda online BanderaDeEspaña.es vende banderas personalizadas de la
  *máxima calidad y nos ha pedido hacer un configurador que calcule el precio
  *según el alto y el ancho. El precio base de una bandera es de un céntimo de
  *euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio
  *se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío
  *son 3.25 €. El IVA ya está incluido en todas las tarifas.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio25VentaBandera { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que calcula el precio de las banderas personalizadas. \n");
            
    System.out.print("Por favor, introduzca la altura de la bandera en cm: ");
    double alturaBandera = Double.parseDouble(System.console().readLine());
       
    System.out.print("Ahora introduzca la anchura en cm: ");
    double anchoBandera = Double.parseDouble(System.console().readLine());
     
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String escudoBordado = System.console().readLine().toLowerCase();
    System.out.println("");
    
    System.out.println("Gracias. Aquí tiene el desglose de su compra. \n");
    
    double areaBandera = alturaBandera * anchoBandera;
    double precioBandera = areaBandera * 0.01;
    
    System.out.printf("Bandera de %5.2f cm²: %6.2f €\n", areaBandera, precioBandera);
    
    if (escudoBordado.equals("n")) {
      System.out.printf("Sin escudo: %16.2f €\n", 0.00);
      System.out.printf("Gastos de envío: %11.2f €\n",3.25); 
      double total = precioBandera + 3.25;
      System.out.printf("TOTAL: %21.2f €", total);
      
    } else {
       System.out.printf("Con escudo: %16.2f €\n", 2.50); 
       System.out.printf("Gastos de envío: %11.2f €\n",3.25); 
        double total = precioBandera + 2.50 + 3.25;
        System.out.printf("TOTAL: %21.2f €", total);
    }  
                
  }
}
