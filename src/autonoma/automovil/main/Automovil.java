/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.automovil.main;

import autonoma.automovil.models.Vehiculo;
import autonoma.automovil.models.sounds.ReproductorSonido;
import autonoma.automovil.models.views.VentanaPrincipal;

/**
 * Clase principal que inicia la simulación del automóvil.
 * En este punto se crea un objeto de tipo Vehiculo, se inicializa una ventana principal
 * para interactuar con el usuario y se reproduce un sonido inicial para iniciar la simulación.
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class Automovil {

    /**
     * Método principal que arranca la simulación del automóvil.
     * Se crea una instancia del objeto Vehiculo, se configura y muestra la ventana principal,
     * y se reproduce un sonido de inicio.
     * 
     * @param args Los argumentos de la línea de comandos (no utilizados en esta aplicación).
     */
    public static void main(String[] args) {
        // Crear un nuevo objeto Vehiculo
        Vehiculo vehiculo = new Vehiculo();
        
        // Crear la ventana principal con el objeto Vehiculo
        VentanaPrincipal ventana = new VentanaPrincipal(vehiculo);
        
        // Hacer visible la ventana principal
        ventana.setVisible(true);
        
        // Reproducir sonido de inicio
        ReproductorSonido.reproducir("sonidoinicial.wav");
        
        // TODO: lógica de la aplicación aquí
    }
}

