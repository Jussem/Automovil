/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 * Excepción que indica que se intentó realizar una acción cuando el automóvil estaba detenido.
 * Esta excepción se lanza si se ejecuta una operación no válida mientras el automóvil no está en movimiento.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class DetenidoException extends RuntimeException {

    /**
     * Crea una nueva instancia de DetenidoException con un mensaje predeterminado.
     * El mensaje indica que no es posible realizar la acción porque el automóvil está detenido.
     */
    public DetenidoException() {
        super("El automóvil está detenido, por lo tanto no es posible realizar la acción");
    }
}
