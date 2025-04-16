/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Clase que implementa la interfaz {@link Escritor} para escribir un archivo de texto plano.
 * Esta clase sobreescribe el archivo especificado por la ruta proporcionada con las líneas 
 * contenidas en la lista de cadenas.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class EscritorArchivoTextoPlano implements Escritor {

    /** Ruta del archivo donde se escribirán los datos */
    private String filePath;

    /**
     * Constructor que inicializa la ruta del archivo.
     * 
     * @param filePath Ruta del archivo en el que se escribirán los datos.
     */
    public EscritorArchivoTextoPlano(String filePath) {
        this.filePath = filePath;
    }

    ////////////////////////////////////////////////////////////////////////////

    /**
     * Sobreescribe el archivo de texto con las líneas proporcionadas.
     * Si el archivo ya existe, se sobrescribirá completamente. Si no existe, se creará.
     * 
     * @param archivo Lista de cadenas que se desean escribir en el archivo.
     * @throws IOException Si ocurre un error al escribir el archivo.
     */
    @Override
    public void escribir(ArrayList<String> archivo) throws IOException {
        File fichero = new File(filePath);

        try (FileWriter writer = new FileWriter(fichero, false);
             PrintWriter pw = new PrintWriter(writer)) {

            // Escribe cada línea de la lista en el archivo
            for (String linea : archivo) {
                pw.println(linea);
            }

        }
    }
}
