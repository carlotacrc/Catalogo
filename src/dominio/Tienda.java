
package dominio;
import java.util.ArrayList;


public class Tienda {
    private String nombre;
    private ArrayList<Catalogo> almacenes;

    public Tienda(String nombre) {
        this.nombre = nombre;
        almacenes = new ArrayList<>();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    }

    public Tienda add(Catalogo almacen) {
        almacenes.add(almacen);
        return this;
    }

    public char[] mostrarCatalogo() {
        return null;
    }

    public void agregarProductoCarrito(String nombre2, String tipo, String talla, double precio) {
    }

    public void quitarProductoCarrito(String nombre2, String tipo, String talla, double precio) {
    }
}
