/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import autonoma.automovil.exception.AccidenteException;
import autonoma.automovil.exception.ApagadoNoAceleraException;
import autonoma.automovil.exception.ApagadoNoFrenaException;
import autonoma.automovil.exception.DetenidoException;
import autonoma.automovil.exception.PatinaException;

/**
 * Clase que representa un vehículo compuesto por un motor y unas llantas.
 * Contiene la lógica para acelerar, frenar, encender, apagar y recuperar el control
 * en caso de pérdida por patinaje. Esta clase centraliza la interacción con
 * los componentes internos del vehículo.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class Vehiculo {
    
    /** Motor del vehículo */
    private Motor motor;

    /** Llantas del vehículo */
    private Llanta llanta;

    /** Indica si el vehículo se encuentra en estado de patinaje */
    private boolean patinado;

    /**
     * Constructor vacío. Crea un vehículo sin componentes definidos.
     */
    public Vehiculo() {
        this.motor = null;
        this.llanta = null;
        this.patinado = false;
    }

    /**
     * Constructor que inicializa el vehículo con un motor y llantas.
     * 
     * @param motor Motor a asignar.
     * @param llanta Llanta a asignar.
     */
    public Vehiculo(Motor motor, Llanta llanta) {
        this.motor = motor;
        this.llanta = llanta;
    }

    // Getters y setters
    public Llanta getLlanta() {
        return llanta;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void setPatinado(boolean patinado) {
        this.patinado = patinado;
    }

    /**
     * Acelera el vehículo en la cantidad indicada.
     * 
     * @param incremento Valor a incrementar en la velocidad.
     * @return Nueva velocidad actual.
     * @throws ApagadoNoAceleraException si el motor está apagado.
     * @throws AccidenteException si se supera la velocidad máxima del motor.
     */
    public double acelerar(double incremento) {
        if (!motor.getEncendido()) {
            throw new ApagadoNoAceleraException();
        }

        double velocidadActual = motor.getVelocidadActual();
        double velocidadMaxima = motor.getObtenerVelocidadMaxima();
        double velocidadResultado = velocidadActual + incremento;

        if (velocidadResultado > velocidadMaxima) {
            throw new AccidenteException();
        }

        motor.setVelocidadActual(velocidadResultado);
        return velocidadResultado;
    }

    /**
     * Reduce la velocidad del vehículo.
     * 
     * @param decremento Valor a disminuir en la velocidad.
     * @return Nueva velocidad actual.
     * @throws ApagadoNoFrenaException si el motor está apagado.
     * @throws DetenidoException si el vehículo ya está detenido.
     * @throws PatinaException si la velocidad excede el límite de las llantas.
     */
    public double frenar(double decremento) {
        if (!motor.getEncendido()) {
            throw new ApagadoNoFrenaException();
        }

        double velocidad = motor.getVelocidadActual();

        if (velocidad == 0) {
            throw new DetenidoException();
        }

        if (velocidad > llanta.getLimiteVelocidad()) {
            patinado = true;
            throw new PatinaException();
        }

        double nuevaVelocidad = velocidad - decremento;
        if (nuevaVelocidad < 0) {
            nuevaVelocidad = 0;
        }

        motor.setVelocidadActual(nuevaVelocidad);
        return nuevaVelocidad;
    }

    /**
     * Detiene el vehículo y recupera el control después de un patinaje.
     */
    public void recuperarElControl() {
        if (patinado) {
            motor.setVelocidadActual(0);
            motor.setEncendido(false);
            motor.setApagado(true);
            patinado = false;
        }
    }

    /**
     * Realiza una frenada brusca.
     * 
     * @param decremento Cantidad de velocidad a reducir.
     * @throws PatinaException si la frenada supera el umbral o el límite de la llanta.
     * @throws ApagadoNoFrenaException si el motor está apagado.
     * @throws DetenidoException si el vehículo ya está detenido.
     */
    public void frenarBruscamente(double decremento) throws PatinaException, ApagadoNoFrenaException, DetenidoException {
        frenar(decremento); // Reutiliza la lógica base de frenar

        if (decremento > 30 || decremento > this.llanta.getLimiteVelocidad()) {
            throw new PatinaException();
        }
    }

    /**
     * Intenta encender el vehículo.
     * 
     * @return true si se encendió correctamente.
     * @throws EncendidoException si el motor ya estaba encendido.
     */
    public boolean encender() {
        return this.motor.encender();
    }

    /**
     * Intenta apagar el vehículo.
     * 
     * @return true si se apagó correctamente.
     * @throws ApagadoException si ya estaba apagado.
     * @throws AccidenteException si la velocidad es mayor a 60.
     */
    public boolean apagar() {
        return this.motor.apagar();
    }
}
