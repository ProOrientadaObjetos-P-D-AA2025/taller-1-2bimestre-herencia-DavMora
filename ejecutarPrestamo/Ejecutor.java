/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecutarprestamo;


public class Ejecutor {
    public static void main(String[] args) {
        Persona beneficiario1 = new Persona("Ana", "Lopez", "alopez");
        Persona garante1 = new Persona("Carlos", "Perez", "cperez");

        PrestamoAutomovil pa = new PrestamoAutomovil(
                "SUV", "Toyota", garante1, 15000.00,
                beneficiario1, 12, "Loja"
        );
        pa.calcularValorMensualAutomovil();

        Persona beneficiario2 = new Persona("Luis", "Martinez", "lmartinez");
        InstitucionEducativa ie = new InstitucionEducativa("UTPL", "UTPL");

        PrestamoEducativo pe = new PrestamoEducativo(
                "Universitario", ie, 4800.00,
                beneficiario2, 24, "Quito"
        );
        pe.calcularValorMensualCarrera();

        System.out.println("--------- Lista de Préstamos ---------");
        System.out.println(pa);
        System.out.println("--------------------------------------");
        System.out.println(pe);
        System.out.println("--------------------------------------");
    }
}
