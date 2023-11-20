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

public class AltaPuesto extends javax.swing.JFrame implements SistemaObserver{

    DefaultListModel<Habilidad> modelo;
    private Sistema miSistema;

    public AltaPuesto(Sistema sistema) {
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
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setLayout(new java.awt.GridBagLayout());

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Alta de puesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(12, 10, 5, 0);
        jPanel1.add(LabelTitulo, gridBagConstraints);

        jLabel1.setText("Nombre del puesto:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(21, 30, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 169;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(jTextFieldNombre, gridBagConstraints);

        jLabel2.setText("Tipo:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        buttonGroup1.add(JRemoto);
        JRemoto.setText("Remoto");
        JRemoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JRemotoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(JRemoto, gridBagConstraints);

        buttonGroup1.add(JPresencial);
        JPresencial.setText("Presencial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(JPresencial, gridBagConstraints);

        buttonGroup1.add(JMixto);
        JMixto.setText("Mixto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        jPanel1.add(JMixto, gridBagConstraints);

        jLabel3.setText("Habilidades requeridas:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(21, 30, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

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
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 102;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(CombodeTemas, gridBagConstraints);

        ListaTemasSeleccionados.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        PanelLista.setViewportView(ListaTemasSeleccionados);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 70;
        gridBagConstraints.ipady = 50;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 30);
        jPanel1.add(PanelLista, gridBagConstraints);

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(34, 30, 15, 0);
        jPanel1.add(BotonCancelar, gridBagConstraints);

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(34, 0, 15, 30);
        jPanel1.add(jButtonRegistrar, gridBagConstraints);

        JbotonAgregarTema.setText("Agregar");
        JbotonAgregarTema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbotonAgregarTemaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(JbotonAgregarTema, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JRemotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JRemotoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JRemotoActionPerformed

    // Hago alta del Puesto.
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        String nombrePuesto = jTextFieldNombre.getText();
        String tipoTrabajo = "";

        if (nombrePuesto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un nombre.", "Error", JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de trabajo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (modelo.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe agregar una habilidad requerida del puesto.", "Error", JOptionPane.ERROR_MESSAGE);
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

    // Agrego tema requerido en la lista
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
    
    // Actualizo panel (observer)
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables
}
