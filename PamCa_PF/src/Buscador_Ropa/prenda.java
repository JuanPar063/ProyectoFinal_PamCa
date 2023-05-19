
package Buscador_Ropa;


public class prenda {
private int id;
    private String nombre;
    private String tipo;
    private String talla;
    private float precio;
    private int cantidad;
    private byte[] imagen;

    // Constructor
    public prenda(int id, String nombre, String tipo, String talla, float precio, int cantidad, byte[] imagen) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.talla = talla;
        this.precio = precio;
        this.cantidad = cantidad;
        this.imagen = imagen;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }


}
