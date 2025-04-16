/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import autonoma.automovil.exception.AccidenteException;
import autonoma.automovil.exception.ApagadoException;
import autonoma.automovil.exception.ApagadoNoAceleraException;
import autonoma.automovil.exception.ApagadoNoFrenaException;
import autonoma.automovil.exception.DetenidoException;
import autonoma.automovil.exception.EncendidoException;
import autonoma.automovil.exception.PatinaException;

/**
 * Clase que actúa como un intermediario entre el usuario o la interfaz gráfica
 * y la lógica del vehículo. Permite simular acciones como encender, apagar,
 * acelerar y frenar un vehículo, gestionando las excepciones asociadas.
 * 
 * Esta clase encapsula el objeto Vehiculo y expone métodos de alto nivel
 * que representan acciones comunes del comportamiento de un automóvil.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class Simulador {

    /** Vehículo que se va a simular */
    private Vehiculo vehiculo;

    /**
     * Constructor del simulador que recibe un vehículo.
     * 
     * @param vehiculo Objeto Vehiculo que se desea controlar.
     */
    public Simulador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    /**
     * Intenta encender el vehículo.
     * 
     * @return true si se encendió correctamente.
     * @throws EncendidoException si el vehículo ya está encendido.
     */
    public boolean encenderVehiculo() {
        try {
            return vehiculo.encender();
        } catch (EncendidoException e) {
            throw e;
        }
    }

    /**
     * Intenta apagar el vehículo.
     * 
     * @return true si se apagó correctamente.
     * @throws ApagadoException si el vehículo ya está apagado.
     * @throws AccidenteException si se intenta apagar con velocidad > 60 km/h.
     */
    public boolean apagarVehiculo() {
        try {
            return vehiculo.apagar();
        } catch (ApagadoException | AccidenteException e) {
            throw e;
        }
    }

    /**
     * Acelera el vehículo con el incremento especificado.
     * 
     * @param incremento Cantidad de velocidad a incrementar.
     * @throws ApagadoNoAceleraException si el vehículo está apagado.
     * @throws AccidenteException si se excede la velocidad máxima permitida.
     */
    public void acelerarVehiculo(double incremento) {
        try {
            vehiculo.acelerar(incremento);
        } catch (ApagadoNoAceleraException | AccidenteException e) {
            throw e;
        }
    }

    /**
     * Reduce la velocidad del vehículo en la cantidad especificada.
     * 
     * @param decremento Cantidad de velocidad a disminuir.
     * @throws DetenidoException si el vehículo ya está detenido.
     * @throws ApagadoNoFrenaException si el vehículo está apagado.
     * @throws PatinaException si ocurre patinaje al frenar.
     */
    public void frenarVehiculo(double decremento) {
        try {
            vehiculo.frenar(decremento);
        } catch (DetenidoException | ApagadoNoFrenaException | PatinaException e) {
            throw e;
        }
    }

    /**
     * Llama al método de recuperación del control del vehículo,
     * usado tras un evento de patinaje.
     */
    public void recuperarControlVehiculo() {
        vehiculo.recuperarElControl();
    }

    /**
     * Realiza una frenada brusca en el vehículo.
     * 
     * @param decremento Cantidad de velocidad a reducir bruscamente.
     * @throws PatinaException si el vehículo pierde el control al frenar bruscamente.
     */
    public void frenarBruscamenteVehiculo(double decremento) {
        try {
            vehiculo.frenarBruscamente(decremento);
        } catch (PatinaException e) {
            throw e;
        }
    }

    /**
     * Consulta si el vehículo está actualmente encendido.
     * 
     * @return true si el vehículo está encendido, false si está apagado.
     */
    public boolean estaEncendidoElVehiculo() {
        return vehiculo.getMotor().getEncendido();
    }
}
