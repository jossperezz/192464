import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nombre vendedor:");
        String nameVendedor = scanner.nextLine();

        System.out.println("Cantidad de productos vendidos:");
        int cantVentas = scanner.nextInt();
            
        System.out.println("Ingrese valor producto 1:");
        double producto1 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 2:");
        double producto2 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 3:");
        double producto3 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 4:");
        double producto4 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 5:");
        double producto5 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 6:");
        double producto6 = scanner.nextDouble();

        System.out.println("Ingrese valor producto 7:");
        double producto7 = scanner.nextDouble();
    

        double comision = 0;

        if (producto1 >= 100000) {
            comision = comision + (producto1 * 0.10);
        } else {
            comision = comision + (producto1 * 0.05);
        }

        if (producto2 >= 100000) {
            comision = comision + (producto2 * 0.10);
        } else {
            comision = comision + (producto2 * 0.05);
        }

        if (producto3 >= 100000) {
            comision = comision + (producto3 * 0.10);
        } else {
            comision = comision + (producto3 * 0.05);
        }

        if (producto4 >= 100000) {
            comision = comision + (producto4 * 0.10);
        } else {
            comision = comision + (producto4 * 0.05);
        }

        if (producto5 >= 100000) {
            comision = comision + (producto5 * 0.10);
        } else {
            comision = comision + (producto5 * 0.05);
        }

        if (producto6 >= 100000) {
            comision = comision + (producto6 * 0.10);
        } else {
            comision = comision + (producto6 * 0.05);
        }

        if (producto7 >= 100000) {
            comision = comision + (producto7 * 0.10);
        } else {
            comision = comision + (producto7 * 0.05);
        }

        double totalVentas = producto1 + producto2 + producto3 + producto4 + producto5 + producto6 + producto7;
        double salarioVendedor = (double) (comision + 1000000);

        System.out.println("Vendedor: " + nameVendedor);
        System.out.println("Total ventas: " + (int)totalVentas);
        System.out.println("Comisiones: " + (int)comision);
        System.out.println("Salario total: " + (int)salarioVendedor);
    }
    }
}
