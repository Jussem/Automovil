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
 *
 * @author juanb
 */
public class Vehiculo {
    private Motor motor;
    private Llanta llanta;
    private boolean patinado;

    public Vehiculo() {
        this.motor = null;
        this.llanta = null;
        this.patinado = false;
    }

    public Vehiculo(Motor motor, Llanta llanta) {
        this.motor = motor;
        this.llanta = llanta;
    }

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
    public void recuperarElControl() {
        if (patinado) {
            motor.setVelocidadActual(0);
            motor.setEncendido(false);
            motor.setApagado(true);
            patinado = false;
        }
    }
    public void frenarBruscamente(double decremento) throws PatinaException, ApagadoNoFrenaException, DetenidoException {

        frenar(decremento); // usa  método actual
        
        if (decremento > 30) {
            throw new PatinaException(); // Esto indicará que el vehículo patina
        }
        if(decremento > this.llanta.getLimiteVelocidad()){
            throw new PatinaException();
        }
    }
    public boolean encender() {
        return this.motor.encender(); // motor.encender() retorna true o false
    }
    public boolean apagar(){
        return this.motor.apagar();
    }
}
