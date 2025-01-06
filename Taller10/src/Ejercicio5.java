import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        String[][] inventario = {
            {"producto1", "Arroz", "1.50", "2kg"},
            {"producto2", "Pan", "0.75", "30"},
            {"producto3", "Leche", "1.00", "20"},
            {"producto4", "Café", "5.00", "15"}
        };

        Scanner tcl = new Scanner(System.in);

        System.out.println("Bienvenido a la tienda");
        System.out.print("Ingrese el codigo del producto:");
        String codigoProducto = tcl.nextLine();

        System.out.print("Ingrese la cantidad requerida:");
        int cantidadDeseada = tcl.nextInt();

        boolean productoEncontrado = false;

        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i][0].equals(codigoProducto)) {
                productoEncontrado = true;
                String nombre = inventario[i][1];
                double precio = Double.parseDouble(inventario[i][2]);
                int stock = Integer.parseInt(inventario[i][3]);

                if (cantidadDeseada > stock) {
                    System.out.println("Alerta: Stock insuficiente, Solo hay " + stock + " unidades disponibles.");
                } else {
                    double subtotal = precio * cantidadDeseada;
                    double iva = subtotal * 0.15;
                    double total = subtotal + iva;
                    double descuento = 0;
                    if (total > 100) {
                        descuento = total * 0.10;
                        total -= descuento;
                    }
                    inventario[i][3] = String.valueOf(stock - cantidadDeseada);
                    System.out.println("\n--- Factura ---");
                    System.out.println("Producto: " + nombre);
                    System.out.println("Cantidad: " + cantidadDeseada);
                    System.out.println("Precio Unitario: $" + precio);
                    System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
                    System.out.println("IVA (15%): $" + String.format("%.2f", iva));
                    if (descuento > 0) {
                        System.out.println("Descuento (10%): -$" + String.format("%.2f", descuento));
                    }
                    System.out.println("Total a Pagar: $" + String.format("%.2f", total));
                }
                break;
            }
        }

        if (!productoEncontrado) {
            System.out.println("Error: Producto no encontrado.");
        }
       tcl.close();
    }
}

/*
Bienvenido a la tienda
Ingrese el codigo del producto:34
Ingrese la cantidad requerida:100
Error: Producto no encontrado.
*/