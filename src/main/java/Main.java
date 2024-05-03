
/* 2.- Un comerciante tributa mensualmente un impuesto provincial a los ingresos brutos, que es el 25% del total de ventas. Conociendo dicho total de ventas y el total de gastos del mes, se desea calcular la ganancia mensual del comerciante 
Sacchetti, Maria Giselle C2*/

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double ventasMes, gastosMes, gananciaMes, ingBrutosMes;
    double ingB = 0.25;
    

    System.out.println("Ingrese el total de ventas del mes: ");

    ventasMes = scanner.nextDouble();

    while (ventasMes <= 0) {
      System.out.println("Ingrese un valor valido para las ventas del mes: ");
      ventasMes = scanner.nextDouble();
    }

    if (ventasMes > 0) {
      System.out.println("Ingrese el total de gastos del mes: ");
      gastosMes = scanner.nextDouble();
      // calculo de los ingresos brutos
      ingBrutosMes = ventasMes * ingB;
      System.out.println("El ingreso bruto del mes es: " + ingBrutosMes);

      /*
       * Calculamos la ganancia mensual del comerciante restando los gastos
       * y el impuesto de las ventas:
       * ej Ganancia=Total de ventas−Total de gastos−Impuesto=5000−3000−1250=750
       */
      gananciaMes = ventasMes - gastosMes - ingBrutosMes;
      System.out.println("La ganancia mensual del comerciante es: " + gananciaMes);
    }
    scanner.close();
  }

}