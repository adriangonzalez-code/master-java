package CPrimitivos;

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nombreFactura;
        double precio1, precio2;
        double impuesto = 19.0;
        double totalBruto, totalImpuesto, totalBrutoImpuesto;

        System.out.println("Ingrese el nombre de la factura o descripción:");
        nombreFactura = scanner.nextLine();

        System.out.println("Ingrese el precio del producto 1:");
        precio1 = scanner.nextDouble();

        System.out.println("Ingrese el precio del producto 2:");
        precio2 = scanner.nextDouble();

        totalBruto = precio1 + precio2;
        totalImpuesto = (impuesto * totalBruto) / 100;
        totalBrutoImpuesto = totalBruto + totalImpuesto;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + totalBruto + ", con un impuesto de " + totalImpuesto + " y el monto de impuesto es de " + totalBrutoImpuesto);
    }
}