/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarprestamo;

public class Prestamo {
    protected Persona beneficiario;
    protected int tiempoPrestamo; 
    protected String ciudad;

    public Prestamo(Persona beneficiario, int tiempoPrestamo, String ciudad) {
        this.beneficiario = beneficiario;
        this.tiempoPrestamo = tiempoPrestamo;
        this.ciudad = ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Persona getBeneficiario() { return beneficiario; }

    public int getTiempoPrestamo() { return tiempoPrestamo; }

    public String getCiudad() { return ciudad; }

    @Override
    public String toString() {
        return "Beneficiario: " + beneficiario +
               ", Tiempo: " + tiempoPrestamo + " meses" +
               ", Ciudad: " + ciudad;
    }
}
