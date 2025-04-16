/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 * Excepción que indica que se intentó acelerar cuando el automóvil está apagado.
 * Esta excepción se lanza cuando se invoca una acción de aceleración sin haber encendido previamente el automóvil.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class ApagadoNoAceleraException extends RuntimeException {

    /**
     * Crea una nueva instancia de ApagadoNoAceleraException con un mensaje predeterminado.
     * El mensaje indica que no se puede acelerar porque el automóvil está apagado.
     */
    public ApagadoNoAceleraException() {
        super("El automovil esta pagado, por lo tanto no puede acelerar");
    }
}

