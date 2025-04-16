/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.exception;

/**
 * Excepción que indica que el archivo leído está incompleto.
 * Esta excepción se lanza cuando el contenido del archivo no cumple con el formato o la cantidad de datos esperados.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class ArchivoIncompletoException extends RuntimeException {

    /**
     * Crea una nueva instancia de ArchivoIncompletoException con un mensaje predeterminado.
     * El mensaje indica que el archivo puede estar incompleto y debe verificarse su integridad.
     */
    public ArchivoIncompletoException() {
        super("Error al leer el archivo, verifique que esté completo");
    }
}

