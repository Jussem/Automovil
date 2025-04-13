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
 *
 * @author juanb
 */
public class Simulador {

    private Vehiculo vehiculo;

    public Simulador(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public boolean encenderVehiculo() {
        try {
            return vehiculo.encender();
        } catch (EncendidoException e) {
            throw e;
        }
    }

    public boolean apagarVehiculo() {
        try {
            return vehiculo.apagar();
        } catch (ApagadoException | AccidenteException e) {
            throw e;
        }
    }

    public void acelerarVehiculo(double incremento) {
        try {
            vehiculo.acelerar(incremento);
        } catch (ApagadoNoAceleraException | AccidenteException e) {
            throw e;
        }
    }

    public void frenarVehiculo(double decremento) {
        try {
            vehiculo.frenar(decremento);
        } catch (DetenidoException | ApagadoNoFrenaException | PatinaException e) {
            throw e;
        }
    }

    public void recuperarControlVehiculo() {
        vehiculo.recuperarElControl();
    }

    public void frenarBruscamenteVehiculo(double decremento) {
        try {
            vehiculo.frenarBruscamente(decremento);
        } catch (PatinaException e) {
            throw e;
        }
    }

    public boolean estaEncendidoElVehiculo() {
        return vehiculo.getMotor().getEncendido();
    }
}
