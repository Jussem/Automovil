/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 *
 * @author juanb
 */
public class ApagadoNoAcelera extends RuntimeException{
    public ApagadoNoAcelera(){
        super("El automovil esta pagado, por lo tanto no puede acelerar");
    }
}
