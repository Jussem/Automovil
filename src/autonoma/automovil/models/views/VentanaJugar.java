/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.automovil.models.views;

import autonoma.automovil.exception.AccidenteException;
import autonoma.automovil.exception.ApagadoException;
import autonoma.automovil.exception.ApagadoNoAceleraException;
import autonoma.automovil.exception.ApagadoNoFrenaException;
import autonoma.automovil.exception.DetenidoException;
import autonoma.automovil.exception.EncendidoException;
import autonoma.automovil.exception.PatinaException;
import autonoma.automovil.models.ConstructorAutos;
import autonoma.automovil.models.LectorArchivoTextoPlano;
import autonoma.automovil.models.Llanta;
import autonoma.automovil.models.Motor;
import autonoma.automovil.models.Simulador;
import autonoma.automovil.models.Vehiculo;
import autonoma.automovil.models.sounds.ReproductorSonido;
import java.io.IOException;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class VentanaJugar extends javax.swing.JFrame {
private Simulador simulador;
private Motor motor;
private ConstructorAutos constructorAutos;
private Llanta llanta;

    /**
     * Creates new form VentanaJugar
     */
    public VentanaJugar() {
        initComponents();
         this.setLocationRelativeTo(null);
        ReproductorSonido.reproducir("sonidoinicial.wav");
        
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/automovil/models/images/carroFondo.png")).getImage());
        }catch(Exception e){
            System.out.println("la imagen no fue encontrada");
        }
        leerInformacionArchivo();
    }

    private void leerInformacionArchivo(){
        LectorArchivoTextoPlano lector = new LectorArchivoTextoPlano();
        Motor motorVehiculo = null;
        Llanta llantasVehiculo = null;
        try{
            List<String> infoArchivo = lector.leer("config.txt");
            String[] linea1 = infoArchivo.get(0).split(" ");
            String[] linea2 = infoArchivo.get(1).split(" ");
            System.out.println(linea1[2]+linea2[1]);
            switch (linea1[2]){
                case "Buenas": llantasVehiculo = new Llanta("Buena", 110);
                case "Bonitas": llantasVehiculo = new Llanta("Bonitas", 70 );
                case "Baratas": llantasVehiculo = new Llanta("Baratas", 50 );
            }
            
            switch (linea2[1]){
                case "1000": motorVehiculo = new Motor("1000 cc", 100);
                case "2000": motorVehiculo = new Motor("2000 cc", 160);
                case "3000": motorVehiculo = new Motor("3000 cc", 220);
            }
            
            this.simulador = new Simulador(new Vehiculo(motorVehiculo,llantasVehiculo));
            this.motor = motorVehiculo;
        }catch (IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void actializarValorActual(){
        velocidadActual.setText("Velocidad actual: " + this.motor.getVelocidadActual() + " km/h");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelApagar = new javax.swing.JLabel();
        jLabelEncender = new javax.swing.JLabel();
        velocidadActual = new javax.swing.JLabel();
        jlabelAcelerar = new javax.swing.JLabel();
        jLabelFrenar = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/automovil/models/images/fondoPrincipal.gif"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jLabelApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/automovil/models/images/apagar.gif"))); // NOI18N
        jLabelApagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelApagarMouseClicked(evt);
            }
        });

        jLabelEncender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/automovil/models/images/encender.png"))); // NOI18N
        jLabelEncender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelEncenderMouseClicked(evt);
            }
        });

        velocidadActual.setText("jLabel4");

        jlabelAcelerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/automovil/models/images/acelerar.jpg"))); // NOI18N
        jlabelAcelerar.setText("jLabel4");
        jlabelAcelerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlabelAcelerarMouseClicked(evt);
            }
        });

        jLabelFrenar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/automovil/models/images/Freno.jpg"))); // NOI18N
        jLabelFrenar.setText("jLabel4");
        jLabelFrenar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFrenarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelEncender)
                    .addComponent(jLabelApagar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelFrenar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelAcelerar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(velocidadActual))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabelApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelEncender)
                        .addGap(6, 6, 6))
                    .addComponent(velocidadActual, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlabelAcelerar)
                        .addComponent(jLabelFrenar))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelApagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelApagarMouseClicked
        // TODO add your handling code here:
        try{
            this.simulador.apagarVehiculo();
            velocidadActual.setText("");
        }catch(ApagadoException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }catch(AccidenteException e){
            JOptionPane.showMessageDialog(this, "se paso el limite de velocidad y el Auto se ha accidentado");
            velocidadActual.setText("");
        }
    }//GEN-LAST:event_jLabelApagarMouseClicked

    private void jlabelAcelerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlabelAcelerarMouseClicked
        // TODO add your handling code here:
        try{
            if(!simulador.estaEncendidoElVehiculo()){
                throw new ApagadoNoAceleraException();
            }
            
            String input = JOptionPane.showInputDialog(this, "cuanto va a acelerar?");
            if (input == null||input.trim().isEmpty()) {
                return;
            }
            
            double increm=Double.parseDouble(input.trim());
            if (increm <= 0) {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese un número mayor que cero.");
                return;
            }
            simulador.acelerarVehiculo(increm);
            VentanaAumentarVelocidad ventana = new VentanaAumentarVelocidad();
            ventana.setVisible(true);
            this.actializarValorActual();
        }catch (ApagadoNoAceleraException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
        } catch (AccidenteException e) {
            VentanaAccidentar ventana = new VentanaAccidentar(this.motor);
            ventana.setVisible(true);
            JOptionPane.showMessageDialog(this, "Sobrepasó el límite permitido y se accidentó.");
            velocidadActual.setText("");
        }
    }//GEN-LAST:event_jlabelAcelerarMouseClicked

    private void jLabelFrenarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFrenarMouseClicked
        // TODO add your handling code here:
        try {
            if (!simulador.estaEncendidoElVehiculo()) {
                throw new ApagadoNoFrenaException();
            }

            String input = JOptionPane.showInputDialog(this, "¿Cuánto desea frenar?");
            if (input == null || input.trim().isEmpty()) {
                return;
            }

            double decrem = Double.parseDouble(input.trim());

            if (decrem <= 0) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor mayor a 0.");
                return;
            }

            
            try {
                simulador.frenarBruscamenteVehiculo(decrem);
            } catch (PatinaException e) {
                VentanaPatinar ventana = new VentanaPatinar();
                ventana.setVisible(true);
                this.simulador.recuperarControlVehiculo();
                this.actializarValorActual();
            }

            this.actializarValorActual();

        } catch (ApagadoNoFrenaException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }catch(DetenidoException e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.");
        } catch (PatinaException e) { 
            VentanaPatinar ventana = new VentanaPatinar();
            ventana.setVisible(true);
            JOptionPane.showMessageDialog(this, e.getMessage());
            this.simulador.recuperarControlVehiculo();
            this.actializarValorActual();
        }
    }//GEN-LAST:event_jLabelFrenarMouseClicked

    private void jLabelEncenderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelEncenderMouseClicked
        // TODO add your handling code here:
         try {
        this.simulador.encenderVehiculo();
        this.actializarValorActual();
        VentanaEncender ventana = new VentanaEncender();
        ventana.setVisible(true);
    } catch (EncendidoException e) {
        JOptionPane.showMessageDialog(this, e.getMessage());
    }
    }//GEN-LAST:event_jLabelEncenderMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApagar;
    private javax.swing.JLabel jLabelEncender;
    private javax.swing.JLabel jLabelFrenar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel jlabelAcelerar;
    private javax.swing.JLabel velocidadActual;
    // End of variables declaration//GEN-END:variables
}
