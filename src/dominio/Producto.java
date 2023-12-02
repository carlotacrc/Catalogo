package dominio;
public  class Producto {

    //////atributos//////
    private String talla;
     private double precio;
    private String tipo;
    private String nombre;

    ///////constructores//////
    public Producto(double precio,String talla,String tipo, String nombre) {
        this.talla = talla;
        this.precio = precio;
        this.tipo = tipo;
        this.nombre = nombre;
    }

    ///////getters y setters//////
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    ///////metodos//////
    public boolean equals(Object o){
        if (o == null) return false;
        if (o == this) return true;
        if (!(o instanceof Producto))return false;
        Producto producto = (Producto) o;
        return producto.getNombre().equals(this.getNombre()) && producto.getTipo().equals(this.getTipo()) && producto.getTalla().equals(this.getTalla()) && producto.getPrecio() == this.getPrecio();
    }

    public void cambiarCaracteristicas(String nombre, String tipo, String talla, double precio){
        this.nombre = nombre;
        this.tipo = tipo;
        this.talla = talla;
        this.precio = precio;
    }

    public String toString(){
        return nombre + " " + tipo + " " + talla + " " + precio;
    }

}


