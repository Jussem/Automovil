/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 * Excepción que indica que el automóvil ha tenido un accidente.
 * Esta excepción se lanza cuando ocurre una colisión en la simulación del automóvil.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class AccidenteException extends RuntimeException {

    /**
     * Crea una nueva instancia de AccidenteException con un mensaje predeterminado.
     * El mensaje indica que el automóvil ha sido estrellado.
     */
    public AccidenteException() {
        super("El Automovil ha sido estrellado!!!");
    }
}
