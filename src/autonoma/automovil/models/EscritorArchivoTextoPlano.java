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
 *
 * @author juanb
 */
public class EscritorArchivoTextoPlano implements Escritor{
    private String filePath;

    public EscritorArchivoTextoPlano(String filePath) {
        this.filePath = filePath;
    }

    ////////////////////////////////////////////////////////////////////////////
    /**
     * Sobreescribe el archivo de texto con las líneas proporcionadas.
     * 
     * @param archivo Lista de líneas a escribir.
     * @throws IOException Si ocurre un error al escribir el archivo.
     */
    @Override
    public void escribir(ArrayList<String> archivo) throws IOException {
        File fichero = new File(filePath);

        try (FileWriter writer = new FileWriter(fichero, false);
             PrintWriter pw = new PrintWriter(writer)) {

            for (String linea : archivo) {
                pw.println(linea);
            }

        }
    }
}
