/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.ESaldoNoValido;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ConoMaster
 */
public class SeleccionAnalistaProgramador extends javax.swing.JPanel {

    boolean programador = false;
    boolean analista = false;
    public SeleccionAnalistaProgramador() {
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonProg = new javax.swing.JButton();
        botonAnalista = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        botonProg.setText("PROGRAMADOR");
        botonProg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonProgActionPerformed(evt);
            }
        });

        botonAnalista.setText("ANALISTA");
        botonAnalista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnalistaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 51));
        jLabel1.setText("¿Qué tipo de empleado deseas crear?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(botonProg, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addContainerGap(144, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonProg, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAnalista, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonProgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonProgActionPerformed
    programador = true;
    this.setVisible(false);
    }//GEN-LAST:event_botonProgActionPerformed

    private void botonAnalistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnalistaActionPerformed
    analista = true;
    this.setVisible(false);
    }//GEN-LAST:event_botonAnalistaActionPerformed

    public boolean isProgramador() {
        return programador;
    }

    public boolean isAnalista() {
        return analista;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnalista;
    private javax.swing.JButton botonProg;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}