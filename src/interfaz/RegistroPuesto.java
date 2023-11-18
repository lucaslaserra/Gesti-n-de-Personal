// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package interfaz;

import dominio.Habilidad;
import dominio.Puesto;
import dominio.Sistema;
import dominio.SistemaObserver;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class RegistroPuesto extends javax.swing.JFrame implements SistemaObserver{

    DefaultListModel<Habilidad> modelo;
    private Sistema miSistema;

    public RegistroPuesto(Sistema sistema) {
        miSistema = sistema;
        initComponents();
        setLocationRelativeTo(null);
        ListaTemasSeleccionados.setFixedCellHeight(15);
        ListaTemasSeleccionados.setFixedCellWidth(225);
        agregarHabilidadesCombo();
        modelo = new DefaultListModel<>();
        ListaTemasSeleccionados.setModel(modelo);
        miSistema.adjuntar(this);
    }

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
        PanelLista = new javax.swing.JScrollPane();
        ListaTemasSeleccionados = new javax.swing.JList<>();
        BotonCancelar = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();
        JbotonAgregarTema = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Registro de puesto");

        jLabel1.setText("Nombre del puesto:");

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });

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

        jLabel3.setText("Habilidades requeridas:");

        CombodeTemas.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                CombodeTemasComponentAdded(evt);
            }
        });
        CombodeTemas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CombodeTemasActionPerformed(evt);
            }
        });

        ListaTemasSeleccionados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PanelLista.setViewportView(ListaTemasSeleccionados);

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CombodeTemas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(JbotonAgregarTema)
                                .addGap(7, 7, 7))))
                    .addGroup(layout.createSequentialGroup()
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
                                .addComponent(JMixto)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11))
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
                .addComponent(PanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        if (nombrePuesto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        ArrayList<Puesto> puestos = miSistema.obtenerListaPuestos();
        boolean existe = puestos.stream().anyMatch(puesto -> puesto.getNombre().equals(nombrePuesto));

        if (existe) {
            JOptionPane.showMessageDialog(this, "Ya se ha ingresado ese puesto, verifica el nombre.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (JRemoto.isSelected()) {
            tipoTrabajo = "Remoto";
        } else if (JPresencial.isSelected()) {
            tipoTrabajo = "Presencial";
        } else if (JMixto.isSelected()) {
            tipoTrabajo = "Mixto";
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de trabajo!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (modelo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No agregó una habilidad requerida", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Puesto puesto = new Puesto(nombrePuesto, tipoTrabajo);
        for (int i = 0; i < modelo.getSize(); i++) {
            puesto.setHabilidadesRequeridas(modelo.elementAt(i));
        }

        miSistema.agregarPuesto(puesto);
        JOptionPane.showMessageDialog(this, "Se ha agregado el puesto con éxito!", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        limpiarFormulario();


    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void CombodeTemasComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_CombodeTemasComponentAdded

    }//GEN-LAST:event_CombodeTemasComponentAdded

    private void JbotonAgregarTemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbotonAgregarTemaActionPerformed
        Habilidad habilidadSelect = (Habilidad) CombodeTemas.getSelectedItem();
        if (modelo.contains(habilidadSelect)) {
            JOptionPane.showMessageDialog(this, "Ya agrego esa habilidad!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            modelo.addElement(habilidadSelect);
        }
    }//GEN-LAST:event_JbotonAgregarTemaActionPerformed

    private void CombodeTemasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CombodeTemasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CombodeTemasActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    public void agregarHabilidadesCombo() {
        ArrayList<Habilidad> habilidades = miSistema.obtenerListaHabilidades();
        for (Habilidad j : habilidades) {
            CombodeTemas.addItem(j);
        }
    }
    
    public void actualizar() {
        while (CombodeTemas.getItemCount() > 0) {
            Object item = CombodeTemas.getItemAt(0);
            if (item != null) {
                CombodeTemas.removeItemAt(0);
            }
        }
        agregarHabilidadesCombo();
    }

    private void limpiarFormulario() {
        // Limpia todos los campos de texto
        jTextFieldNombre.setText("");
        modelo.removeAllElements();
        // Desmarca cualquier botón de radio seleccionado
        buttonGroup1.clearSelection();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JComboBox<Habilidad> CombodeTemas;
    private javax.swing.JRadioButton JMixto;
    private javax.swing.JRadioButton JPresencial;
    private javax.swing.JRadioButton JRemoto;
    private javax.swing.JButton JbotonAgregarTema;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JList<Habilidad> ListaTemasSeleccionados;
    private javax.swing.JScrollPane PanelLista;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
