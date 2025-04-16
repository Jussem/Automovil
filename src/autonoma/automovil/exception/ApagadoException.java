/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 * Excepción que indica que se intentó realizar una acción cuando el automóvil estaba apagado.
 * Esta excepción se lanza si se intenta, por ejemplo, avanzar o acelerar sin haber encendido el automóvil.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class ApagadoException extends RuntimeException {

    /**
     * Crea una nueva instancia de ApagadoException con un mensaje predeterminado.
     * El mensaje indica que el automóvil está apagado.
     */
    public ApagadoException() {
        super("El Automovil esta apagado");
    }
}
