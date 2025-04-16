/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/**
 * Clase que implementa la interfaz {@link Lector} para leer archivos de texto plano.
 * Esta clase lee un archivo de texto línea por línea y las guarda en una lista de cadenas.
 * Además, incluye funcionalidades para limpiar líneas en blanco del archivo.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class LectorArchivoTextoPlano implements Lector {

    /** Lista donde se almacenarán las líneas leídas del archivo */
    private ArrayList<String> archivo;

    /** Charset utilizado para leer el archivo */
    private Charset charset = Charset.forName("UTF-8");

    /**
     * Constructor de la clase. Inicializa la lista de líneas del archivo.
     */
    public LectorArchivoTextoPlano() {
        this.archivo = new ArrayList<>();
    }

    /**
     * Lee el contenido de un archivo de texto línea por línea y lo guarda en una lista.
     * 
     * @param localizacionArchivo Ruta del archivo a leer.
     * @return Lista de cadenas donde cada elemento representa una línea del archivo.
     * @throws IOException Si ocurre un error al leer el archivo o si el archivo no existe.
     */
    @Override
    public ArrayList<String> leer(String localizacionArchivo) throws IOException {
        archivo.clear();
        File file = null;
        FileReader reader = null;
        BufferedReader buffer = null;

        file = new File(localizacionArchivo);
        reader = new FileReader(file);
        buffer = new BufferedReader(reader);

        String linea;
        while ((linea = buffer.readLine()) != null) {
            agregarLinea(linea);
        }

        reader.close();
        return this.archivo;
    }

    /**
     * Agrega una línea a la lista donde se almacenan las líneas leídas del archivo.
     * 
     * @param linea Línea que se desea agregar a la lista.
     */
    public void agregarLinea(String linea) {
        archivo.add(linea);
    }

    /**
     * Limpia las líneas en blanco del archivo.
     * Recorre la lista de líneas y elimina aquellas que no contienen texto.
     * 
     * @param texto Lista de cadenas que contiene las líneas del archivo.
     */
    public void limpiarTexto(ArrayList<String> texto) {
        for (int i = 0; i < texto.size(); i++) {
            if (texto.get(i).length() == 0) {
                texto.remove(i);
            }
        }
    }
}
