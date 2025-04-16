/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.automovil.models.views;

import autonoma.automovil.models.Motor;
import autonoma.automovil.models.sounds.ReproductorSonido;
import javax.swing.ImageIcon;

/**
 *
 * @author juanb
 */
public class VentanaAccidentar extends javax.swing.JFrame {
    private Motor motor;
    /**
     * Creates new form VentanaAccidentar
     */
    public VentanaAccidentar(Motor motor) {
        initComponents();
        this.setLocationRelativeTo(null);
        ReproductorSonido.reproducir("sonidoAccidente.wav");
        
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/automovil/models/images/carroFondo.png")).getImage());
        }catch(Exception e){
            System.out.println("la imagen no fue encontrada");
        }
        this.motor=motor;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/automovil/models/images/gifAccidente.gif"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        ReproductorSonido.detener();
        this.motor.apagarPorAccidente();
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
