/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 * Excepción que indica que se intentó frenar cuando el automóvil está apagado.
 * Esta excepción se lanza al invocar una acción de frenado sin que el automóvil haya sido encendido previamente.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class ApagadoNoFrenaException extends RuntimeException {

    /**
     * Crea una nueva instancia de ApagadoNoFrenaException con un mensaje predeterminado.
     * El mensaje indica que no se puede frenar porque el automóvil está apagado.
     */
    public ApagadoNoFrenaException() {
        super("El automovil esta apagado, por lo tanto no puede frenar");
    }
}
