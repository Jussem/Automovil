/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase encargada de leer un archivo de configuración y construir objetos Vehiculo
 * basados en los parámetros extraídos del archivo.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class ConstructorAutos {

    /** Objeto lector para manejar la lectura del archivo */
    private Lector lector;

    /**
     * Constructor que recibe un lector.
     * 
     * @param lector Objeto que implementa la interfaz Lector
     */
    public ConstructorAutos(Lector lector) {
        this.lector = lector;
    }

    /**
     * Verifica si un archivo existe.
     * 
     * @param ruta Ruta del archivo.
     * @return true si el archivo existe, false en caso contrario.
     */
    public boolean archivoExiste(String ruta) {
        return new File(ruta).exists();
    }

    /**
     * Lee el archivo de configuración y crea un objeto Vehiculo.
     * El archivo debe contener información sobre el tipo de llantas y motor del vehículo.
     * 
     * @param ruta Ruta del archivo de configuración.
     * @return Vehiculo configurado con llantas y motor.
     * @throws IOException Si el archivo no existe o hay un error en la lectura.
     */
    public Vehiculo leerArchivo(String ruta) throws IOException {
        // Lee las líneas del archivo
        ArrayList<String> lineas = lector.leer(ruta);

        // Verifica si las líneas son válidas
        if (lineas.size() < 2 || !lineaValida(lineas.get(0)) || !lineaValida(lineas.get(1))) {
            throw new IOException("Archivo de configuración incompleto.");
        }

        // Extrae el tipo de llantas y motor de las líneas
        String tipoLlantas = extraerTipo(lineas.get(0));
        String tipoMotor = extraerTipo(lineas.get(1));

        // Crea objetos Llanta y Motor basados en los tipos extraídos
        Llanta llantas = crearLlantas(tipoLlantas);
        Motor motor = crearMotor(tipoMotor);

        // Retorna un nuevo objeto Vehiculo con las llantas y motor configurados
        return new Vehiculo(motor, llantas);
    }

    /**
     * Verifica si una línea contiene al menos dos partes separadas por espacios.
     * 
     * @param linea Línea del archivo.
     * @return true si la línea contiene al menos dos partes, false en caso contrario.
     */
    private boolean lineaValida(String linea) {
        return linea != null && linea.split("\\s+").length >= 2;
    }

    /**
     * Extrae el segundo valor de una línea de texto (el tipo de llanta o motor).
     * 
     * @param linea Línea del archivo.
     * @return Segundo valor (tipo) como texto limpio.
     */
    private String extraerTipo(String linea) {
        return linea.split("\\s+")[1].trim();
    }

    /**
     * Crea un objeto Llanta según el tipo.
     * 
     * @param tipo Tipo de llantas en texto.
     * @return Objeto Llanta con su velocidad límite correspondiente.
     */
    private Llanta crearLlantas(String tipo) {
        switch (tipo.toLowerCase()) {
            case "buenas": return new Llanta("Buena", 110);
            case "bonitas": return new Llanta("Bonita", 70);
            case "baratas": return new Llanta("Baratas", 50);
            default: return null;
        }
    }

    /**
     * Crea un objeto Motor según el tipo de cilindrada.
     * 
     * @param tipo Tipo de motor como texto (1000, 2000, 3000).
     * @return Objeto Motor con su velocidad máxima correspondiente.
     */
    private Motor crearMotor(String tipo) {
        switch (tipo.toLowerCase()) {
            case "1000": return new Motor("1000 cc", 100);
            case "2000": return new Motor("2000 cc", 160);
            case "3000": return new Motor("3000 cc", 220);
            default: return null;
        }
    }
}

