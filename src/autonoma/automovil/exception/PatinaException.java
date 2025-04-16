/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 * Excepción que indica que el automóvil está patinando.
 * Esta excepción se lanza cuando el automóvil pierde tracción o estabilidad en condiciones de manejo.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class PatinaException extends RuntimeException {

    /**
     * Crea una nueva instancia de PatinaException con un mensaje predeterminado.
     * El mensaje indica que el automóvil está patinando y ha perdido tracción.
     */
    public PatinaException() {
        super("El Automovil está patinando");
    }
}
