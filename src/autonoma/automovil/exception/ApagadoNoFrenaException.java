/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 *
 * @author juanb
 */
public class ApagadoNoFrenaException extends RuntimeException{
    public ApagadoNoFrenaException(){
        super("El automovil esta apagado, por lo tanto no puede frenar");
    }
}
