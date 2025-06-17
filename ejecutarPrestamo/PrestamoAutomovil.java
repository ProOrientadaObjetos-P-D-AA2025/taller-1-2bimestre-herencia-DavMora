/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarprestamo;

public class PrestamoAutomovil extends Prestamo {
    private String tipoAutomovil;
    private String marcaAutomovil;
    private Persona garante1;
    private double valorAutomovil;
    private double valorMensualAutomovil;

    public PrestamoAutomovil(String tipoAutomovil, String marcaAutomovil, Persona garante1, double valorAutomovil,
                             Persona beneficiario, int tiempoPrestamo, String ciudad) {
        super(beneficiario, tiempoPrestamo, ciudad.toLowerCase());
        this.tipoAutomovil = tipoAutomovil;
        this.marcaAutomovil = marcaAutomovil;
        this.garante1 = garante1;
        this.valorAutomovil = valorAutomovil;
    }

    public void calcularValorMensualAutomovil() {
        valorMensualAutomovil = valorAutomovil / tiempoPrestamo;
    }

    @Override
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad.toLowerCase();
    }

    @Override
    public String toString() {
        return "Prestamo Automovil -> " + super.toString() +
               ", Tipo: " + tipoAutomovil +
               ", Marca: " + marcaAutomovil +
               ", Garante: " + garante1 +
               ", Valor Auto: " + valorAutomovil +
               ", Cuota Mensual: " + valorMensualAutomovil;
    }
}

