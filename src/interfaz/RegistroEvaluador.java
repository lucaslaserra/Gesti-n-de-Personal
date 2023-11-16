/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author lucas
 */
public class RegistroEvaluador extends javax.swing.JFrame {

    private Sistema miSistema;
    public RegistroEvaluador( Sistema sistema) {
       miSistema = sistema;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField5 = new javax.swing.JTextField();
        LabelTitulo = new javax.swing.JLabel();
        LabelNombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        TextoCedula = new javax.swing.JTextField();
        TextoFechadeIngreso = new javax.swing.JTextField();
        TextoDireccion = new javax.swing.JTextField();
        BotonRegistrar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Registro de Evaluador");

        LabelNombre.setText("Nombre:");

        jLabel2.setText("Cedula:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Fecha de Ingreso:");

        TextoNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(LabelTitulo)
                .addGap(0, 137, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(LabelNombre)
                            .addComponent(jLabel4)
                            .addComponent(TextoCedula, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                            .addComponent(TextoNombre)
                            .addComponent(TextoFechadeIngreso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(BotonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(27, 27, 27))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(LabelTitulo)
                .addGap(28, 28, 28)
                .addComponent(LabelNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TextoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4))
                    .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoFechadeIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        TextoNombre.getAccessibleContext().setAccessibleParent(TextoNombre);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        String nombre = TextoNombre.getText();
        String cedula = TextoCedula.getText();
        String fechadeIngreso = TextoFechadeIngreso.getText();
        String direccion = TextoDireccion.getText();
           if (nombre.isEmpty() || cedula.isEmpty() || fechadeIngreso.isEmpty() || direccion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Los campos no pueden estar vacíos.", "Error", JOptionPane.ERROR_MESSAGE);
        
    }else{
        Evaluador evaluador = new Evaluador (fechadeIngreso,nombre,cedula,direccion);
        miSistema.agregarEvaluador(evaluador);
        limpiarFormulario();
        JOptionPane.showMessageDialog(null, "Se ha registrado el evaluador con exito!","Exito",JOptionPane.INFORMATION_MESSAGE);
    }
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JTextField TextoCedula;
    private javax.swing.JTextField TextoDireccion;
    private javax.swing.JTextField TextoFechadeIngreso;
    private javax.swing.JTextField TextoNombre;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables


  private void limpiarFormulario() {
        // Limpia todos los campos de texto
        TextoNombre.setText("");
        TextoDireccion.setText("");
        TextoFechadeIngreso.setText("");
        TextoCedula.setText("");
       
        // ... otros campos

        // Desmarca cualquier botón de radio seleccionado
       
    }
}