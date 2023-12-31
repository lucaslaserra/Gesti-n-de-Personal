// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package interfaz;

import dominio.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;


public class AltaPostulante extends javax.swing.JFrame {
    private Sistema miSistema;
    
    public AltaPostulante(Sistema sistema) {
       miSistema = sistema;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldMail = new javax.swing.JTextField();
        jTextFieldLinkedin = new javax.swing.JTextField();
        jRadioButtonRemoto = new javax.swing.JRadioButton();
        jRadioButtonPresencial = new javax.swing.JRadioButton();
        jRadioButtonMixto = new javax.swing.JRadioButton();
        jButtonCancelar = new javax.swing.JButton();
        jButtonSiguiente = new javax.swing.JButton();
        ErrorViewer = new java.awt.Label();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        label1.setText("Alta postulante");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 15, 0, 0);
        jPanel1.add(label1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Nombre:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 58, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Cédula:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 58, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Dirección:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 58, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Teléfono:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 58, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Mail:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 58, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Linkedin:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 58, 0, 0);
        jPanel1.add(jLabel6, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Formato:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 58, 0, 0);
        jPanel1.add(jLabel7, gridBagConstraints);

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 293;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 48, 0, 62);
        jPanel1.add(jTextFieldNombre, gridBagConstraints);

        jTextFieldCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCedulaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 293;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 48, 0, 62);
        jPanel1.add(jTextFieldCedula, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 293;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 48, 0, 62);
        jPanel1.add(jTextFieldDireccion, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.ipadx = 293;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 48, 0, 62);
        jPanel1.add(jTextFieldTelefono, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.ipadx = 293;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 48, 0, 62);
        jPanel1.add(jTextFieldMail, gridBagConstraints);

        jTextFieldLinkedin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLinkedinActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 17;
        gridBagConstraints.ipadx = 293;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 48, 0, 62);
        jPanel1.add(jTextFieldLinkedin, gridBagConstraints);

        buttonGroup.add(jRadioButtonRemoto);
        jRadioButtonRemoto.setText("Remoto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 14;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 48, 0, 0);
        jPanel1.add(jRadioButtonRemoto, gridBagConstraints);

        buttonGroup.add(jRadioButtonPresencial);
        jRadioButtonPresencial.setText("Presencial");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 20;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(jRadioButtonPresencial, gridBagConstraints);

        buttonGroup.add(jRadioButtonMixto);
        jRadioButtonMixto.setText("Mixto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 21;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 18, 0, 0);
        jPanel1.add(jRadioButtonMixto, gridBagConstraints);

        jButtonCancelar.setText("Cancelar");
        jButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.ipady = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 58, 26, 0);
        jPanel1.add(jButtonCancelar, gridBagConstraints);

        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 22;
        gridBagConstraints.gridy = 13;
        gridBagConstraints.ipadx = 58;
        gridBagConstraints.ipady = 8;
        jPanel1.add(jButtonSiguiente, gridBagConstraints);

        ErrorViewer.setForeground(new java.awt.Color(255, 0, 0));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 13;
        gridBagConstraints.ipadx = 161;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 58, 0, 0);
        jPanel1.add(ErrorViewer, gridBagConstraints);

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    // Avanzo a siguiente pantalla (AltaPostulanteConocimiento) si todo es correcto.
    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSiguienteActionPerformed
        String nombre = jTextFieldNombre.getText();
        String cedula = jTextFieldCedula.getText();
        String direccion = jTextFieldDireccion.getText();
        String telefono = jTextFieldTelefono.getText();
        String email = jTextFieldMail.getText();
        String linkedin = jTextFieldLinkedin.getText();
        
     
    if (nombre.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo nombre es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (cedula.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo cédula es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    } else {
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        boolean existe = false;
        for (int i = 0; i < postulantes.size() && !existe; i++) {
            if (postulantes.get(i).getCedula().equals(cedula)) {
                existe = true;
            }
        }
    
    if (!cedula.matches("^\\d+$")) {
        JOptionPane.showMessageDialog(this, "El campo cédula debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }   
        
    if (existe) {
        JOptionPane.showMessageDialog(this, "Ya se ha ingresado ese postulante, verifica la cédula.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
}
    if (direccion.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo dirección es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (telefono.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo teléfono es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (email.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo email es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    if (linkedin.isEmpty()) {
        JOptionPane.showMessageDialog(this, "El campo linkedin es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
        String tipoTrabajo = "";
        if (jRadioButtonRemoto.isSelected()) {
            tipoTrabajo = "Remoto";
        } else if (jRadioButtonPresencial.isSelected()) {
            tipoTrabajo = "Presencial";
        } else if (jRadioButtonMixto.isSelected()) {
            tipoTrabajo = "Mixto";
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un tipo de trabajo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Postulante postulante = new Postulante(nombre, cedula, direccion, telefono, email, linkedin, tipoTrabajo);
        
     if(!miSistema.obtenerListaHabilidades().isEmpty()){   
        AltaPostulanteConocimiento altaPostulanteConocimiento = new AltaPostulanteConocimiento( postulante,miSistema);
       altaPostulanteConocimiento.setVisible(true);
       limpiarFormulario();
     }else{
        JOptionPane.showMessageDialog(this, "No hay ninguna habilidad agregada, debe ir a Registro Habilidad e ingresar al menos una habilidad", "Error", JOptionPane.ERROR_MESSAGE);
     }
    }//GEN-LAST:event_jButtonSiguienteActionPerformed

    // Salir
    private void jButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarActionPerformed
       dispose();
    }//GEN-LAST:event_jButtonCancelarActionPerformed

    private void jTextFieldLinkedinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLinkedinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLinkedinActionPerformed

    private void jTextFieldCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Label ErrorViewer;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonMixto;
    private javax.swing.JRadioButton jRadioButtonPresencial;
    private javax.swing.JRadioButton jRadioButtonRemoto;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldLinkedin;
    private javax.swing.JTextField jTextFieldMail;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    // Limpio campos de texto.
    private void limpiarFormulario() {

        jTextFieldNombre.setText("");
        jTextFieldCedula.setText("");
        jTextFieldDireccion.setText("");
        jTextFieldTelefono.setText("");
        jTextFieldMail.setText("");
        jTextFieldLinkedin.setText("");
        buttonGroup.clearSelection();
    }


}

