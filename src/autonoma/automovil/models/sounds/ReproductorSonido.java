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
 * Clase utilitaria encargada de reproducir sonidos en formato WAV desde recursos internos.
 * Soporta la reproducción en bucle y la detención de sonidos actuales.
 * <p>
 * Los sonidos deben estar ubicados dentro del paquete:
 * <code>/autonoma/automovil/models/sounds/</code>.
 * </p>
 * 
 * @author Juan José Morales A.
 * @version 20250416
 * @since 1.0
 */
public class ReproductorSonido {

    /** Clip de sonido actual en reproducción */
    private static Clip clip;

    /**
     * Reproduce un archivo de sonido ubicado en el paquete de recursos.
     * Si ya hay un sonido reproduciéndose, lo detiene primero.
     *
     * @param nombreArchivo Nombre del archivo de sonido con extensión, por ejemplo: "motor.wav".
     */
    public static void reproducir(String nombreArchivo) {
        try {
            detener(); // Detiene cualquier sonido previo

            String ruta = "/autonoma/automovil/models/sounds/" + nombreArchivo;
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
     * Detiene la reproducción de cualquier sonido activo y libera los recursos asociados.
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