/**
  *Escribe un programa que genere la nómina (bien desglosada) de un empleado
  *según las siguientes condiciones:
  *•Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe
  *de proyecto), los días que ha estado de viaje visitando clientes durante el
  *mes y su estado civil (1 - Soltero, 2 - Casado).
  *• El sueldo base según el cargo es de 950, 1200 y 1600 euros según
  *si se trata de un prog. junior, un prog. senior o un jefe de proyecto
  *respectivamente.
  *• Por cada día de viaje visitando clientes se pagan 30 euros extra en
  *concepto de dietas. Al sueldo neto hay que restarle el IRPF, que será de
  *un 25% en caso de estar soltero y un 20% en caso de estar casado.
  *
  *@Ander De Abrisqueta Rangel
  */
public class Ejercicio24Nomina { // Clase principal
  public static void main(String[] args) {
    
    System.out.println("Programa que calcula la nómina. \n");
    
    System.out.println("Cargo del empleado: \n");
    System.out.println("1.-Programador junior");
    System.out.println("2.-Programador senior");
    System.out.println("3.-Jefe de proyecto");
    
    System.out.print("Por favor, introduzca el cargo del empleado (1 - 3): ");
    int cargo = Integer.parseInt(System.console().readLine());
       
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes?: ");
    int diasViaje = Integer.parseInt(System.console().readLine());
    
    System.out.println("Estado civil: \n");
    System.out.println("1.-Soltero");
    System.out.println("2.-Casado");
    
    System.out.print("Introduzca su estado civil (1 - 2): ");
    int estadoCivil = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    switch (cargo) {
      case 1:
        if (estadoCivil == 1)  {
          double sueldoBase = 900;
          double dietas = diasViaje*30;
          double sueldoBruto = sueldoBase + dietas;
          double retencionIrpf = sueldoBruto * 0.25;
          double sueldoNeto = sueldoBruto - retencionIrpf;
          
          System.out.println("---------------------------------");
          System.out.printf("| Sueldo base:%17.2f", sueldoBase);
          System.out.println(" |");
          System.out.printf("| Dietas (%2d", diasViaje);
          System.out.printf( " viajes):%10.2f", dietas);
          System.out.println(" |");
          System.out.println("|-------------------------------|");
          System.out.printf("| Suelo bruto:%17.2f", sueldoBruto);
          System.out.println(" |");
          System.out.printf("| Retención IRPF(25%%):%9.2f", retencionIrpf);
          System.out.println(" |");
          System.out.printf("| Sueldo neto:%17.2f", sueldoNeto);
          System.out.println(" |");
          System.out.println("---------------------------------\n");         
          
        } else {
            double sueldoBase = 900;
            double dietas = diasViaje*30;
            double sueldoBruto = sueldoBase + dietas;
            double retencionIrpf = sueldoBruto * 0.20;
            double sueldoNeto = sueldoBruto - retencionIrpf;
          
          System.out.println("---------------------------------");
          System.out.printf("| Sueldo base:%17.2f", sueldoBase);
          System.out.println(" |");
          System.out.printf("| Dietas )%2d", diasViaje);
          System.out.printf( " viajes):%10.2f", dietas);
          System.out.println(" |");
          System.out.println("|-------------------------------|");
          System.out.printf("| Suelo bruto:%17.2f", sueldoBruto);
          System.out.println(" |");
          System.out.printf("| Retención IRPF(20%%):%9.2f", retencionIrpf);
          System.out.println(" |");
          System.out.printf("| Sueldo neto:%17.2f", sueldoNeto);
          System.out.println(" |");
          System.out.println("---------------------------------\n");  
        }    
      break;
      
      case 2:
        if (estadoCivil == 1)  {
          double sueldoBase = 1200;
          double dietas = diasViaje*30;
          double sueldoBruto = sueldoBase + dietas;
          double retencionIrpf = sueldoBruto * 0.25;
          double sueldoNeto = sueldoBruto - retencionIrpf;
          
          System.out.println("---------------------------------");
          System.out.printf("| Sueldo base:%17.2f", sueldoBase);
          System.out.println(" |");
          System.out.printf("| Dietas (%2d", diasViaje);
          System.out.printf( " viajes):%10.2f", dietas);
          System.out.println(" |");
          System.out.println("|-------------------------------|");
          System.out.printf("| Suelo bruto:%17.2f", sueldoBruto);
          System.out.println(" |");
          System.out.printf("| Retención IRPF(25%%):%9.2f", retencionIrpf);
          System.out.println(" |");
          System.out.printf("| Sueldo neto:%17.2f", sueldoNeto);
          System.out.println(" |");
          System.out.println("---------------------------------\n");          
          
        } else {
            double sueldoBase = 1200;
            double dietas = diasViaje*30;
            double sueldoBruto = sueldoBase + dietas;
            double retencionIrpf = sueldoBruto * 0.20;
            double sueldoNeto = sueldoBruto - retencionIrpf;
          
          System.out.println("---------------------------------");
          System.out.printf("| Sueldo base:%17.2f", sueldoBase);
          System.out.println(" |");
          System.out.printf("| Dietas (%2d", diasViaje);
          System.out.printf( " viajes):%10.2f", dietas);
          System.out.println(" |");
          System.out.println("|-------------------------------|");
          System.out.printf("| Suelo bruto:%17.2f", sueldoBruto);
          System.out.println(" |");
          System.out.printf("| Retención IRPF(20%%):%9.2f", retencionIrpf);
          System.out.println(" |");
          System.out.printf("| Sueldo neto:%17.2f", sueldoNeto);
          System.out.println(" |");
          System.out.println("---------------------------------\n");   
        }
      break;
      
      case 3:
        if (estadoCivil == 1)  {
          double sueldoBase = 1600;
          double dietas = diasViaje*30;
          double sueldoBruto = sueldoBase + dietas;
          double retencionIrpf = sueldoBruto * 0.25;
          double sueldoNeto = sueldoBruto - retencionIrpf;
          
          System.out.println("---------------------------------");
          System.out.printf("| Sueldo base:%17.2f", sueldoBase);
          System.out.println(" |");
          System.out.printf("| Dietas (%2d", diasViaje);
          System.out.printf( " viajes):%10.2f", dietas);
          System.out.println(" |");
          System.out.println("|-------------------------------|");
          System.out.printf("| Suelo bruto:%17.2f", sueldoBruto);
          System.out.println(" |");
          System.out.printf("| Retención IRPF(25%%):%9.2f", retencionIrpf);
          System.out.println(" |");
          System.out.printf("| Sueldo neto:%17.2f", sueldoNeto);
          System.out.println(" |");
          System.out.println("---------------------------------\n");            
          
        } else {
            double sueldoBase = 1600;
            double dietas = diasViaje*30;
            double sueldoBruto = sueldoBase + dietas;
            double retencionIrpf = sueldoBruto * 0.20;
            double sueldoNeto = sueldoBruto - retencionIrpf;
          
          System.out.println("---------------------------------");
          System.out.printf("| Sueldo base:%17.2f", sueldoBase);
          System.out.println(" |");
          System.out.printf("| Dietas (%2d", diasViaje);
          System.out.printf( " viajes):%10.2f", dietas);
          System.out.println(" |");
          System.out.println("|-------------------------------|");
          System.out.printf("| Suelo bruto:%17.2f", sueldoBruto);
          System.out.println(" |");
          System.out.printf("| Retención IRPF(20%%):%9.2f", retencionIrpf);
          System.out.println(" |");
          System.out.printf("| Sueldo neto:%17.2f", sueldoNeto);
          System.out.println(" |");
          System.out.println("---------------------------------\n");   
        }
      break;
        
    default:
      System.out.println("No es un opción correcta");
    }  
            
  }
}
