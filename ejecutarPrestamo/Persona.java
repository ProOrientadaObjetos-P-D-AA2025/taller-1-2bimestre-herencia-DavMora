package ejecutarprestamo;

public class Persona {
    private String nombre;
    private String apellido;
    private String username;

    public Persona(String nombre, String apellido, String username) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.username = username;
    }

    public String getNombre() { return nombre; }

    public String getApellido() { return apellido; }

    public String getUsername() { return username; }

    @Override
    public String toString() {
        return nombre + " " + apellido + " (" + username + ")";
    }
}
    
}
