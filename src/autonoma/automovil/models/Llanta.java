/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

/**
 * Clase que representa una llanta de un vehículo. Contiene información sobre
 * el tipo de llanta y el límite de velocidad que puede soportar.
 * 
 * Esta clase se utiliza como parte de la configuración del vehículo en el
 * sistema de simulación de automóviles.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class Llanta {
    
    /** Tipo de llanta (por ejemplo: Buena, Bonita, Barata) */
    private String tipo;
    
    /** Límite de velocidad soportado por la llanta en km/h */
    private double limiteVelocidad;

    /**
     * Constructor que permite inicializar una llanta con su tipo y límite de velocidad.
     * 
     * @param tipo Tipo de llanta (descripción).
     * @param limiteVelocidad Límite de velocidad que puede soportar la llanta.
     */
    public Llanta(String tipo, double limiteVelocidad) {
        this.tipo = tipo;
        this.limiteVelocidad = limiteVelocidad;
    }

    /**
     * Obtiene el límite de velocidad soportado por la llanta.
     * 
     * @return Límite de velocidad en km/h.
     */
    public double getLimiteVelocidad() {
        return limiteVelocidad;
    }

    /**
     * Obtiene el tipo de la llanta.
     * 
     * @return Tipo de llanta como una cadena.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Establece un nuevo límite de velocidad para la llanta.
     * 
     * @param limiteVelocidad Nuevo valor para el límite de velocidad.
     */
    public void setLimiteVelocidad(double limiteVelocidad) {
        this.limiteVelocidad = limiteVelocidad;
    }

    /**
     * Establece un nuevo tipo para la llanta.
     * 
     * @param tipo Nuevo tipo de llanta.
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

