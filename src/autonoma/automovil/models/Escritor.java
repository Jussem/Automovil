/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autonoma.automovil.models;

import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author juanb
 */
public interface Escritor {
    public abstract void escribir(ArrayList<String> archivo) throws IOException ;
}
