/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarprestamo;

public class InstitucionEducativa {
    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nombre, String siglas) {
        this.nombre = nombre;
        this.siglas = siglas;
    }

    public String getNombre() { return nombre; }

    public String getSiglas() { return siglas; }

    @Override
    public String toString() {
        return nombre + " (" + siglas + ")";
    }
}
