/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Interfaz que define el contrato para clases que implementan la funcionalidad de leer archivos.
 * Las clases que implementan esta interfaz deben proporcionar una implementación del método leer,
 * que permite cargar el contenido de un archivo en una lista de cadenas.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public interface Lector {

    /**
     * Lee el contenido de un archivo y devuelve una lista de cadenas con cada línea del archivo.
     * 
     * @param localizacionArchivo Ruta del archivo a leer.
     * @return Una lista de cadenas donde cada elemento representa una línea del archivo.
     * @throws IOException Si ocurre un error al leer el archivo.
     */
    public abstract ArrayList<String> leer(String localizacionArchivo) throws IOException;
}

