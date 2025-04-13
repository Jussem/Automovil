/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 *
 * @author juanb
 */
public class DetenidoException extends RuntimeException{
    public DetenidoException(){
        super("EL Automovil esta detenidio, por lo tanto no es posible realizar la accion");
    }
}
