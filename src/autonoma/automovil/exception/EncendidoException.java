/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 * Excepción que indica que se intentó encender un automóvil que ya está encendido.
 * Esta excepción se lanza para evitar operaciones redundantes o inválidas sobre el estado del vehículo.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class EncendidoException extends RuntimeException {

    /**
     * Crea una nueva instancia de EncendidoException con un mensaje predeterminado.
     * El mensaje indica que el automóvil ya se encuentra encendido.
     */
    public EncendidoException() {
        super("El Automovil está encendido");
    }
}

