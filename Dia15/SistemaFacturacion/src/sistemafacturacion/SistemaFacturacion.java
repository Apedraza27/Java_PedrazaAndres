/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemafacturacion;

import java.util.Scanner;
import java.util.function.Function;

public class SistemaFacturacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clientes cliente = new Clientes("Juan Perez", "VIP");
        Facturas factura = new Facturas(cliente);

        while (true) {
            System.out.println("1. Agregar producto");
            System.out.println("2. Calcular total");
            System.out.println("3. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar lógica para añadir productos
                    System.out.println("Nombre del producto:");
                    String nombreProducto = scanner.nextLine();
                    System.out.println("Precio del producto:");
                    double precioProducto = scanner.nextDouble();
                    System.out.println("Categoría del producto:");
                    String categoriaProducto = scanner.nextLine();
                    break;
                case 2:
                {
                    Function<Double, Double> descuentoRegular = null;
                    Function<Double, Double> descuentoVIP = null;
                    Function<Double, Double> descuento = cliente.getTipo().equals("VIP") ? descuentoVIP : descuentoRegular;
                }
                {
                    Function<Double, Double> descuento = null;
                    double totalConDescuento = factura.calcularTotal(descuento);
                }
                {
                    String totalConDescuento = null;
                    System.out.println("Total con descuento: " + totalConDescuento);
                }
                    break;




                case 3:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
