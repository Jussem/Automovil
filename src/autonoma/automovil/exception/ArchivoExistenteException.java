/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 * Excepción que indica que no se pudo leer un archivo porque no existe.
 * Esta excepción se lanza cuando se intenta acceder a un archivo que no está presente en la ubicación especificada.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class ArchivoExistenteException extends RuntimeException {

    /**
     * Crea una nueva instancia de ArchivoExistenteException con un mensaje predeterminado.
     * El mensaje sugiere verificar que el archivo exista antes de intentar leerlo.
     */
    public ArchivoExistenteException() {
        super("Error al leer el archivo, verifique que el archivo exista ");
    }
}
