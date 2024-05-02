
/* 2.- Un comerciante tributa mensualmente un impuesto provincial a los ingresos brutos, que es el 25% del total de ventas. Conociendo dicho total de ventas y el total de gastos del mes, se desea calcular la ganancia mensual del comerciante */


import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double ventasMes, gastosMes, gananciaMes, ingBrutosMes;
    double ingB = 0.25;
    
    System.out.println("Ingrese el total de ventas del mes: ");
    ventasMes = scanner.nextDouble();
    
    System.out.println("Ingrese el total de gastos del mes: ");
    gastosMes = scanner.nextDouble();
    //calculo de los ingresos brutos
    ingBrutosMes = ventasMes*ingB;
    System.out.println("El ingreso bruto del mes es: " + ingBrutosMes);
    scanner.close();

  }
  
 
}