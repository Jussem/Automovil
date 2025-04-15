/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autonoma.automovil.main;

import autonoma.automovil.models.Vehiculo;
import autonoma.automovil.models.sounds.ReproductorSonido;
import autonoma.automovil.models.views.VentanaPrincipal;

/**
 *
 * @author juanb
 */
public class Automovil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Vehiculo vehiculo=new Vehiculo();
        
        VentanaPrincipal ventana= new VentanaPrincipal(vehiculo);
        ventana.setVisible(true);
        
        ReproductorSonido.reproducir("sonidoinicial.wav");
// TODO code application logic here
    }
    
}
