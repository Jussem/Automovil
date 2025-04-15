/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models.sounds;

import java.io.InputStream;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author juanb
 */
public class ReproductorSonido {
    private static Clip clip;

    /**
     * Reproduce un archivo de sonido en bucle.
     *
     * @param nombreArchivo Nombre del archivo de sonido (con extensión) ubicado en /autonoma/automovil/sounds/
     */
    public static void reproducir(String nombreArchivo) {
        try {
            detener(); // Detiene cualquier sonido que esté sonando

            String ruta = "/autonoma/simulador/sounds/" + nombreArchivo;
            InputStream inputStream = ReproductorSonido.class.getResourceAsStream(ruta);

            if (inputStream == null) {
                System.out.println("Archivo no encontrado: " + nombreArchivo);
                return;
            }

            AudioInputStream audioStream = AudioSystem.getAudioInputStream(inputStream);
            clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

        } catch (Exception e) {
            System.out.println("Error al reproducir sonido: " + e.getMessage());
        }
    }

    /**
     * Detiene y libera cualquier sonido que se esté reproduciendo.
     */
    public static void detener() {
        try {
            if (clip != null) {
                clip.stop();
                clip.flush();
                clip.close();
                clip = null;
            }
        } catch (Exception e) {
            System.out.println("Error al detener sonido: " + e.getMessage());
        }
    }
}
