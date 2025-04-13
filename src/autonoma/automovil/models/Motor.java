/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import autonoma.automovil.exception.AccidenteException;
import autonoma.automovil.exception.ApagadoException;
import autonoma.automovil.exception.EncendidoException;

/**
 *
 * @author juanb
 */
public class Motor {
    private String nombre;
    private double obtenerVelocidadMaxima;
    private double velocidadActual;
    private boolean encendido;
    private boolean apagado;

    public Motor(String nombre, double obtenerVelocidadMaxima) {
        this.nombre = nombre;
        this.obtenerVelocidadMaxima = obtenerVelocidadMaxima;
        this.velocidadActual = 0.0;
        this.encendido = false;
        this.apagado = true;
    }
    
     public boolean getEncendido() {
        return encendido;
     }
     
    public String getNombre() {
        return nombre;
    }

    public double getObtenerVelocidadMaxima() {
        return obtenerVelocidadMaxima;
    }

    public double getVelocidadActual() {
        return velocidadActual;
    }

    public void setApagado(boolean apagado) {
        this.apagado = apagado;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setObtenerVelocidadMaxima(double obtenerVelocidadMaxima) {
        this.obtenerVelocidadMaxima = obtenerVelocidadMaxima;
    }

    public void setVelocidadActual(double velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public boolean encender() {
    if (encendido) {
        throw new EncendidoException();
    }

    encendido = true;
    apagado = false;
    return true;
}

    public boolean apagar() {
    if (apagado) {
        throw new ApagadoException();
    }

    if (velocidadActual > 60.0) {
        throw new AccidenteException();
    }

    encendido = false;
    apagado = true;
    velocidadActual = 0.0;

    return true;
}
    public void apagarPorAccidente() {
        this.encendido = false;
        this.apagado = true;
        this.velocidadActual = 0;
    }     
}
