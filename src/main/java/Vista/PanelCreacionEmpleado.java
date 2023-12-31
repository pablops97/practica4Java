/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vista;

import Modelo.Analista;
import Modelo.ESaldoNoValido;
import Modelo.Empleado;
import Modelo.Fecha;
import Modelo.Programador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ConoMaster
 */
public class PanelCreacionEmpleado extends javax.swing.JPanel {

    /**
     * Creates new form PanelCreacionEmpleado
     */ 
        String tipo;
        VistaPrincipal vistaPrincipal;
    public PanelCreacionEmpleado(VistaPrincipal frame) {
        initComponents();
        this.tipo = null;
        this.setSize(1000,800);
        this.setBackground(Color.ORANGE);
        this.vistaPrincipal = frame;
        nombreField.setEditable(true);
        sueldoField.setEditable(true);
        sueldoMaxField.setEditable(true);
        diaField.setEditable(true);
        mesField.setEditable(true);
        anioField.setEditable(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonAtras = new javax.swing.JButton();
        botonCrear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nombreField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sueldoField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sueldoMaxField = new javax.swing.JTextField();
        labelSustitutivo1 = new javax.swing.JLabel();
        fieldSustitutivo1 = new javax.swing.JTextField();
        labelSustitutivo2 = new javax.swing.JLabel();
        fieldSustitutivo2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        diaField = new javax.swing.JTextField();
        mesField = new javax.swing.JTextField();
        anioField = new javax.swing.JTextField();
        tituloLabel = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1000, 528));

        botonAtras.setText("ATRAS");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });

        botonCrear.setText("CREAR");
        botonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Sitka Subheading", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setText("Nombre:");

        jLabel4.setText("Sueldo:");

        jLabel5.setText("SueldoMax:");

        sueldoMaxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueldoMaxFieldActionPerformed(evt);
            }
        });

        labelSustitutivo1.setText("jLabel6");

        labelSustitutivo2.setText("jLabel7");

        jLabel8.setText("Fecha:");

        diaField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaFieldActionPerformed(evt);
            }
        });

        mesField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesFieldActionPerformed(evt);
            }
        });

        tituloLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tituloLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloLabel.setText("jLabel9");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 708, Short.MAX_VALUE)
                        .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(26, 26, 26)
                                .addComponent(sueldoField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fieldSustitutivo1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(sueldoMaxField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(162, 162, 162))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldSustitutivo2, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelSustitutivo2)
                                        .addGap(162, 162, 162))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(139, 139, 139))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelSustitutivo1)
                        .addGap(160, 160, 160)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(diaField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(mesField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(anioField, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129)
                .addComponent(tituloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(nombreField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sueldoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(sueldoMaxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelSustitutivo1)
                    .addComponent(labelSustitutivo2))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldSustitutivo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldSustitutivo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(diaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mesField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(anioField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(338, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed

        vistaPrincipal.botones.setVisible(true);
        vistaPrincipal.panelEmpleados.setVisible(true);
        vistaPrincipal.crearEmpleados.setVisible(false);
    }//GEN-LAST:event_botonAtrasActionPerformed

    private void botonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearActionPerformed
        
        int numero;
        numero = (int) (Math.floor(Math.random() * (1000-2000+1)+2000));
        while(vistaPrincipal.lista.existe(numero)){
            numero = generarNumeroRandom();
        }
        
        
        if(tipo.equals("Programador") || tipo.equals("programador")){
            labelSustitutivo1.setText("Sueldo Extra Mensual");
            labelSustitutivo2.setText("Lenguaje programación");
           String nombre = (nombreField.getText().isBlank()) ?  null : nombreField.getText();
            int sueldo = (sueldoField.getText().isBlank()) ?  0 : Integer.parseInt(sueldoField.getText());
            int sueldoMax = (sueldoMaxField.getText().isBlank()) ?  0 : Integer.parseInt(sueldoMaxField.getText());
            int dia = (diaField.getText().isBlank()) ? 0 : Integer.parseInt(diaField.getText());
            int mes = (mesField.getText().isBlank()) ? 0 : Integer.parseInt(mesField.getText());
            int anio = (anioField.getText().isBlank()) ? 0 : Integer.parseInt(anioField.getText());
            int sueldoExtraMensual = (fieldSustitutivo1.getText().isBlank()) ?  0 : Integer.parseInt(fieldSustitutivo1.getText());
            String lenguajeProg = (fieldSustitutivo2.getText().isBlank()) ? null : fieldSustitutivo2.getText();

            try {
                    vistaPrincipal.lista.add(new Programador(sueldoExtraMensual, lenguajeProg, numero, nombre, sueldo, sueldoMax, new Fecha(dia,mes,anio)), numero);
                } catch (ESaldoNoValido ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } 
        }else{
            labelSustitutivo1.setText("Plus anual");
            labelSustitutivo2.setText("Horas trabajadas");
            String nombre = (nombreField.getText().isBlank()) ?  null : nombreField.getText();
            int sueldo = (sueldoField.getText().isBlank()) ?  0 : Integer.parseInt(sueldoField.getText());
            int sueldoMax = (sueldoMaxField.getText().isBlank()) ?  0 : Integer.parseInt(sueldoMaxField.getText());
            int dia = (diaField.getText().isBlank()) ? 0 : Integer.parseInt(diaField.getText());
            int mes = (mesField.getText().isBlank()) ? 0 : Integer.parseInt(mesField.getText());
            int anio = (anioField.getText().isBlank()) ? 0 : Integer.parseInt(anioField.getText());
            float plusAnual = (fieldSustitutivo1.getText().isBlank()) ? 0 : Float.parseFloat(fieldSustitutivo1.getText());
            int horasTrabajadas = (fieldSustitutivo2.getText().isBlank()) ? 0 : Integer.parseInt(fieldSustitutivo2.getText());

            if(dia > 31 || dia < 1 || mes > 12 || mes < 1 || anio > 2023){
                JOptionPane.showMessageDialog(this, "La fecha es erronea");
            }else{
                try {
                    vistaPrincipal.lista.add(new Analista(plusAnual, horasTrabajadas, numero, nombre, sueldo, sueldoMax, new Fecha(dia,mes,anio)), numero);
                } catch (ESaldoNoValido ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage());
                } 
            }
            
        }
        
        
        vistaPrincipal.lista.goingFirstNode();
        vistaPrincipal.botones.activarDesactivarBotonesAtras(false);
        vistaPrincipal.panelEmpleados.mostrarDatos();
        vistaPrincipal.botones.setVisible(true);
        vistaPrincipal.panelEmpleados.setVisible(true);
        vistaPrincipal.crearEmpleados.setVisible(false);
        
        
    }//GEN-LAST:event_botonCrearActionPerformed

    private void diaFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaFieldActionPerformed

    private void sueldoMaxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueldoMaxFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sueldoMaxFieldActionPerformed

    private void mesFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesFieldActionPerformed

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioField;
    private javax.swing.JButton botonAtras;
    private javax.swing.JButton botonCrear;
    private javax.swing.JTextField diaField;
    private javax.swing.JTextField fieldSustitutivo1;
    private javax.swing.JTextField fieldSustitutivo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel labelSustitutivo1;
    private javax.swing.JLabel labelSustitutivo2;
    private javax.swing.JTextField mesField;
    private javax.swing.JTextField nombreField;
    private javax.swing.JTextField sueldoField;
    private javax.swing.JTextField sueldoMaxField;
    private javax.swing.JLabel tituloLabel;
    // End of variables declaration//GEN-END:variables


public void elegirTipo(){
    if(tipo.equalsIgnoreCase("Analista")){
        labelSustitutivo1.setText("Plus anual");
        labelSustitutivo2.setText("Horas trabajadas");
        tituloLabel.setText("Crear un nuevo analista");
    }else{
        labelSustitutivo1.setText("Sueldo extra");
        labelSustitutivo2.setText("Lenguaje favorito");
        tituloLabel.setText("Crear un nuevo programador");
    }
}

public int generarNumeroRandom(){
    Random rand = new Random();
    int numero = rand.nextInt(1000, 2001);
    return numero;
}

public void limpiarCampos(){
    nombreField.setText("");
    sueldoField.setText("");
    sueldoMaxField.setText("");
    diaField.setText("");
    mesField.setText("");
    anioField.setText("");
    fieldSustitutivo1.setText("");
    fieldSustitutivo2.setText("");
}

}
