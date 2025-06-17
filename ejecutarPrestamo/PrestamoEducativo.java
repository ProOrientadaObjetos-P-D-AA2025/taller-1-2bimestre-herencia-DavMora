/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarprestamo;

public class PrestamoEducativo extends Prestamo {
    private String nivelEstudio;
    private InstitucionEducativa institucion;
    private double valorCarrera;
    private double valorMensualCarrera;

    public PrestamoEducativo(String nivelEstudio, InstitucionEducativa institucion, double valorCarrera,
                             Persona beneficiario, int tiempoPrestamo, String ciudad) {
        super(beneficiario, tiempoPrestamo, ciudad.toUpperCase());
        this.nivelEstudio = nivelEstudio;
        this.institucion = institucion;
        this.valorCarrera = valorCarrera;
    }

    public void calcularValorMensualCarrera() {
        double base = valorCarrera / tiempoPrestamo;
        valorMensualCarrera = base - (base * 0.10);
    }

    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toUpperCase();
    }

    @Override
    public String toString() {
        return "Prestamo Educativo -> " + super.toString() +
               ", Nivel: " + nivelEstudio +
               ", Institución: " + institucion +
               ", Valor Carrera: " + valorCarrera +
               ", Cuota Mensual: " + valorMensualCarrera;
    }
}
