/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

/**
 *
 * @author juanb
 */
public class Llanta {
    private String tipo;
    private double limiteVelocidad;

    public Llanta(String tipo, double limiteVelocidad) {
        this.tipo = tipo;
        this.limiteVelocidad = limiteVelocidad;
    }

    public double getLimiteVelocidad() {
        return limiteVelocidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setLimiteVelocidad(double limiteVelocidad) {
        this.limiteVelocidad = limiteVelocidad;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
