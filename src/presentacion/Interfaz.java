package presentacion;
import java.util.Scanner;
import dominio.Tienda;

public class Interfaz {
    private Scanner scanner = new Scanner(System.in);
    private Tienda tienda = new Tienda("Tienda de ropa");

    public void menuPrincipal() {
        System.out.println("========= Menú Cátalogo =========");
        System.out.println("|1. Mostrar Cátalogo                    |");
        System.out.println("|2. Agregar Producto al Carrito         |");
        System.out.println("|3. Quitar Producto del Carrito         |");
        System.out.println("|4. Mostrar Precio Total del Carrito    |");
        System.out.println("|6. Salir                               |");
        System.out.print(" Elige una opción:");
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            menuPrincipal();
            String opcion = scanner.nextLine();
            if (opcion.equals("1")) {
                System.out.println(tienda.mostrarCatalogo());
            } else if (opcion.equals("2")) {
                agregarProductoCarrito();
            } else if (opcion.equals("3")) {
                quitarProductoCarrito();
            } else if (opcion.equals("4")) {
                mostrarPrecioTotalCarrito();
            } else if (opcion.equals("5")) {
                vaciarCarrito();
            } else if (opcion.equals("6")) {
                pagarCompra();
            } else if (opcion.equals("7")) {
                salir = true;
            } else {
                System.out.println("Opción no válida. Por favor, elige una opción del menú.");
            }
        }
    }

    private void pagarCompra() {
        
    }
    private void vaciarCarrito() {
    }

    private void mostrarPrecioTotalCarrito() {
    }

    public void agregarProductoCarrito(){
        System.out.println("========= Agregar Producto al Carrito =========");
        System.out.println("Introduce el nombre del producto:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el tipo del producto:");
        String tipo = scanner.nextLine();
        System.out.println("Introduce la talla del producto:");
        String talla = scanner.nextLine();
        System.out.println("Introduce el precio del producto:");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        tienda.agregarProductoCarrito(nombre, tipo, talla, precio);
    }


    public void quitarProductoCarrito(){
        System.out.println("========= Quitar Producto del Carrito =========");
        System.out.println("Introduce el nombre del producto:");
        String nombre = scanner.nextLine();
        System.out.println("Introduce el tipo del producto:");
        String tipo = scanner.nextLine();
        System.out.println("Introduce la talla del producto:");
        String talla = scanner.nextLine();
        System.out.println("Introduce el precio del producto:");
        double precio = scanner.nextDouble();
        scanner.nextLine();
        tienda.quitarProductoCarrito(nombre, tipo, talla, precio);
    }


}
