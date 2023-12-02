package dominio;
import java.util.ArrayList;

public class Catalogo {
    
private String nombre;
private ArrayList<Producto> productos;

public Catalogo(String nombre){
    this.nombre = nombre;
    productos = new ArrayList<>();

}

public void setNombre(String nombre){
    this.nombre = nombre;
}

public String getNombre(){
    return nombre;
}

public Catalogo add(Producto producto){
    productos.add(producto);
    return this;
}

public String mostrarCatalogo(){
    String catalogo = "";
    for (Producto producto : productos){
        catalogo += producto.getNombre() + " " + producto.getTipo() + " " + producto.getTalla() + " " + producto.getPrecio() + "\n";
    }
    return catalogo;
    }

    public void agregarProductoCarrito(String nombre2, String tipo, String talla, double precio){
        Producto producto = new Producto(precio, talla, tipo, nombre2);
        productos.add(producto);
    }

    public void quitarProductoCarrito(String nombre2, String tipo, String talla, double precio){
        Producto producto = new Producto(precio, talla, tipo, nombre2);
        productos.remove(producto);
    }

    

}


