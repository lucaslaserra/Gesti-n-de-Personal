/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.*;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class IngresoEntrevista extends javax.swing.JFrame {

    private Sistema miSistema;
    DefaultListModel<Postulante> modelo1;
    DefaultListModel<Evaluador> modelo2;

    public IngresoEntrevista(Sistema sistema) {
        miSistema = sistema;
        initComponents();
        modelo1 = new DefaultListModel<>();
        modelo2 = new DefaultListModel<>();
        ListaEvaluadores.setModel(modelo2);
        ListaPostulantes.setModel(modelo1);
        actualizarLista();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        LabelTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPostulantes = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaEvaluadores = new javax.swing.JList<>();
        jLabel4 = new javax.swing.JLabel();
        SpinnerPuntaje = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TextComentarios = new javax.swing.JTextArea();
        BotonCancelar = new javax.swing.JButton();
        BotonRegistrar = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Ingreso de entrevista");

        jLabel2.setText("Postulantes:");

        jLabel3.setText("Evaluadores:");

        jScrollPane1.setViewportView(ListaPostulantes);

        jScrollPane2.setViewportView(ListaEvaluadores);

        jLabel4.setText("Puntaje:");

        SpinnerPuntaje.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        jLabel5.setText("Comentarios:");

        TextComentarios.setColumns(20);
        TextComentarios.setRows(5);
        jScrollPane3.setViewportView(TextComentarios);

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 177, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SpinnerPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE))
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LabelTitulo)
                        .addGap(185, 185, 185))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitulo)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(SpinnerPuntaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        Postulante postulanteSelected = ListaPostulantes.getSelectedValue();
        Evaluador evaluadorSelected = ListaEvaluadores.getSelectedValue();
        int puntaje = (int)SpinnerPuntaje.getValue();
        String comentarios = TextComentarios.getText();
        
        if(postulanteSelected == null || evaluadorSelected == null){
             JOptionPane.showMessageDialog(this, "Debe seleccionar un postulante y a su vez a un evaluador", "Error", JOptionPane.ERROR_MESSAGE);
             return;
        }else{
        Entrevista entrevista = new Entrevista (postulanteSelected,evaluadorSelected,comentarios,puntaje);
        miSistema.agregarEntrevista(entrevista);
        JOptionPane.showMessageDialog(this, "Se ha ingresado la entrevista con exito, el numero de su entrevista es: "+(miSistema.obtenerNumdeEntrevistas()-1), "Exito", JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        }
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    public void actualizarLista() {
        DefaultListModel<Evaluador> modeloE = new DefaultListModel<>();
        ArrayList<Evaluador> evaluadores = miSistema.obtenerListaEvaluadores();
        DefaultListModel<Postulante> modeloP = new DefaultListModel<>();
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        for (Evaluador e : evaluadores) {
            modeloE.addElement(e);
        }
        ListaEvaluadores.setModel(modeloE);
        for (Postulante p : postulantes) {
            modeloP.addElement(p);
        }
        ListaPostulantes.setModel(modeloP);
    }
    public void limpiar(){
    TextComentarios.setText("");
    ListaEvaluadores.clearSelection();
    ListaPostulantes.clearSelection();
    SpinnerPuntaje.setValue(0);
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonRegistrar;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JList<Evaluador> ListaEvaluadores;
    private javax.swing.JList<Postulante> ListaPostulantes;
    private javax.swing.JSpinner SpinnerPuntaje;
    private javax.swing.JTextArea TextComentarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
