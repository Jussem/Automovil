/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import autonoma.automovil.exception.AccidenteException;
import autonoma.automovil.exception.ApagadoException;
import autonoma.automovil.exception.EncendidoException;

/**
 * Clase que representa el motor de un vehículo. Gestiona su estado (encendido/apagado),
 * la velocidad actual y su velocidad máxima.
 * 
 * Incluye mecanismos de validación mediante excepciones personalizadas para evitar
 * acciones no válidas como encender un motor ya encendido o apagarlo a alta velocidad.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class Motor {
    
    /** Nombre o tipo del motor (por ejemplo: "1000 cc", "2000 cc") */
    private String nombre;

    /** Velocidad máxima que puede alcanzar el motor */
    private double obtenerVelocidadMaxima;

    /** Velocidad actual del motor */
    private double velocidadActual;

    /** Estado que indica si el motor está encendido */
    private boolean encendido;

    /** Estado que indica si el motor está apagado */
    private boolean apagado;

    /**
     * Constructor de la clase Motor.
     * 
     * @param nombre Nombre o identificación del motor.
     * @param obtenerVelocidadMaxima Velocidad máxima que puede alcanzar.
     */
    public Motor(String nombre, double obtenerVelocidadMaxima) {
        this.nombre = nombre;
        this.obtenerVelocidadMaxima = obtenerVelocidadMaxima;
        this.velocidadActual = 0.0;
        this.encendido = false;
        this.apagado = true;
    }

    /**
     * Retorna si el motor está encendido.
     * @return true si está encendido, false en caso contrario.
     */
    public boolean getEncendido() {
        return encendido;
    }

    /**
     * Retorna el nombre del motor.
     * @return nombre del motor.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Retorna la velocidad máxima del motor.
     * @return velocidad máxima permitida.
     */
    public double getObtenerVelocidadMaxima() {
        return obtenerVelocidadMaxima;
    }

    /**
     * Retorna la velocidad actual del motor.
     * @return velocidad actual.
     */
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

    /**
     * Enciende el motor. Lanza una excepción si ya está encendido.
     * 
     * @return true si se enciende correctamente.
     * @throws EncendidoException si el motor ya está encendido.
     */
    public boolean encender() {
        if (encendido) {
            throw new EncendidoException();
        }

        encendido = true;
        apagado = false;
        return true;
    }

    /**
     * Apaga el motor. Lanza excepciones si ya está apagado o si la velocidad
     * actual es mayor a 60 km/h (por seguridad).
     * 
     * @return true si se apaga correctamente.
     * @throws ApagadoException si el motor ya está apagado.
     * @throws AccidenteException si intenta apagar el motor mientras va a más de 60 km/h.
     */
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

    /**
     * Apaga el motor en caso de accidente. Fuerza el estado apagado y reinicia velocidad.
     */
    public void apagarPorAccidente() {
        this.encendido = false;
        this.apagado = true;
        this.velocidadActual = 0;
    }
}
