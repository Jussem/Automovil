/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interfaz que define el contrato para clases que implementan la funcionalidad de escribir en un archivo.
 * Las clases que implementan esta interfaz deben proporcionar una implementación del método escribir,
 * que permite guardar una lista de cadenas en un archivo.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public interface Escritor {

    /**
     * Escribe una lista de cadenas en un archivo.
     * El comportamiento específico de la escritura depende de la implementación de esta interfaz.
     * 
     * @param archivo Lista de cadenas que se desea escribir en el archivo.
     * @throws IOException Si ocurre un error al escribir el archivo.
     */
    public abstract void escribir(ArrayList<String> archivo) throws IOException;
}

