package dominio;
import java.util.ArrayList;
import java.io.Serializable;
public class implements Serializable Tienda {
   
    private ArrayList<Producto> productos;

    public Tienda() {
        productos = new ArrayList<>();
    }

    public void annadir (Producto producto) {
        productos.add(producto);
    }

    public void mostrarProductos() {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void cambiarCaracteristicas(String nombre, String tipo, String talla, double precio) {
        for (Producto producto : productos) {
            if (producto.getNombre().equals(nombre)) {
                producto.setTipo(tipo);
                producto.setTalla(talla);
                producto.setPrecio(precio);
            }
        }
    }
}
