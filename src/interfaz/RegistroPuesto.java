/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.Habilidad;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author lucas
 */
public class RegistroPuesto extends javax.swing.JFrame {

    /**
     * Creates new form RegistroPuesto
     */
    public RegistroPuesto() {
        initComponents();
        agregarHabilidadesCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JRemoto = new javax.swing.JRadioButton();
        JPresencial = new javax.swing.JRadioButton();
        JMixto = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        CombodeTemas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaTemasSeleccionados = new javax.swing.JList<>();
        BotonCancelar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        JbotonAgregarTema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Registro de puesto");

        jLabel1.setText("Nombre del puesto:");

        jLabel2.setText("Tipo:");

        buttonGroup1.add(JRemoto);
        JRemoto.setText("Remoto");
        JRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRemotoActionPerformed(evt);
            }
        });

        buttonGroup1.add(JPresencial);
        JPresencial.setText("Presencial");

        buttonGroup1.add(JMixto);
        JMixto.setText("Mixto");

        jLabel3.setText("Temas requeridos:");

        CombodeTemas.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                CombodeTemasComponentAdded(evt);
            }
        });

        jScrollPane1.setViewportView(ListaTemasSeleccionados);

        BotonCancelar.setText("Cancelar");

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        JbotonAgregarTema.setText("Agregar");
        JbotonAgregarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbotonAgregarTemaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(LabelTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(JRemoto)
                        .addGap(18, 18, 18)
                        .addComponent(JPresencial)
                        .addGap(18, 18, 18)
                        .addComponent(JMixto))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BotonCancelar)
                        .addGap(220, 220, 220)
                        .addComponent(jButtonRegistrar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CombodeTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(JbotonAgregarTema)
                                .addGap(7, 7, 7)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JRemoto)
                    .addComponent(JPresencial)
                    .addComponent(JMixto))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CombodeTemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JbotonAgregarTema))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRemotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRemotoActionPerformed

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        String nombrePuesto = jTextFieldNombre.getText();
        String tipoTrabajo = "";
        if (JRemoto.isSelected()) {
            tipoTrabajo = "Remoto";
        } else if (JPresencial.isSelected()) {
            tipoTrabajo = "Presencial";
        } else if (JMixto.isSelected()) {
            tipoTrabajo = "Mixto";
        } else {
             JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de trabajo!");  
        }
        if(ListaTemasSeleccionados.getSize().equals( 0)){
             JOptionPane.showMessageDialog(this, "No agrego una habilidad requerida");
        }
       
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void CombodeTemasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_CombodeTemasComponentAdded
     
    }//GEN-LAST:event_CombodeTemasComponentAdded

    private void JbotonAgregarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbotonAgregarTemaActionPerformed
        
    }//GEN-LAST:event_JbotonAgregarTemaActionPerformed

    public void agregarHabilidadesCombo(){
    ArrayList<Habilidad> habilidades = Habilidad.obtenerListaHabilidades();
    for(Habilidad j: habilidades){
        CombodeTemas.addItem(j.getTema());
    }
    

 }
     


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JComboBox<String> CombodeTemas;
    private javax.swing.JRadioButton JMixto;
    private javax.swing.JRadioButton JPresencial;
    private javax.swing.JRadioButton JRemoto;
    private javax.swing.JButton JbotonAgregarTema;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JList<String> ListaTemasSeleccionados;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}

