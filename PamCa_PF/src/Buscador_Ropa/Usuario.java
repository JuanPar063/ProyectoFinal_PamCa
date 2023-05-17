
package Buscador_Ropa;

public class Usuario {
   
    private String Nombre;
    private String Contraseña;
    private String Correo;

    // Constructor
    public Usuario(String nombre, String contraseña, String correo) {
        this.Nombre = nombre;
        this.Contraseña = contraseña;
        this.Correo = correo;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public String getCorreo() {
        return Correo;
    }
   
}



