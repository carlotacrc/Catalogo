package dominio;
public  class Producto {

    private String talla;
     private double precio;
    private String tipo;
    private String nombre;

    public Producto(double precio,String talla,String tipo, String nombre) {
        this.talla = talla;
        this.precio = precio;
        this.tipo = tipo;
        this.nombre = nombre;
    }

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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }



   
}


