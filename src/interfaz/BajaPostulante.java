// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package interfaz;

import dominio.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class BajaPostulante extends javax.swing.JFrame implements SistemaObserver{

    private Sistema miSistema;

    public BajaPostulante(Sistema sistema) {
        miSistema = sistema;
        initComponents();
        setLocationRelativeTo(null);


        cargarJListPostulantes();
        miSistema.adjuntar(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelPostulantes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPostulantes = new javax.swing.JList<>();
        jButtonDarDeBaja = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Baja de postulante");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 9;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel1.add(LabelTitulo, gridBagConstraints);

        LabelPostulantes.setText("Postulantes:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 50, 0, 0);
        jPanel1.add(LabelPostulantes, gridBagConstraints);

        jListPostulantes.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jListPostulantesComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jListPostulantes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 50, 0, 50);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jButtonDarDeBaja.setText("Aceptar");
        jButtonDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarDeBajaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 50);
        jPanel1.add(jButtonDarDeBaja, gridBagConstraints);

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 50, 20, 0);
        jPanel1.add(jButton1, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jListPostulantesComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jListPostulantesComponentAdded
    }//GEN-LAST:event_jListPostulantesComponentAdded

    public void actualizar(){
        cargarJListPostulantes();
    }
    
    private void jButtonDarDeBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDarDeBajaActionPerformed
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        int selectedIndex = jListPostulantes.getSelectedIndex();
        if (selectedIndex != -1) {
            Postulante postulanteAEliminar = jListPostulantes.getModel().getElementAt(selectedIndex);

            int confirmacion = JOptionPane.showConfirmDialog(this, "¿Está seguro de que desea eliminar al postulante: " + postulanteAEliminar.getNombre() + " ?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);

            if (confirmacion == JOptionPane.YES_OPTION) {
                miSistema.eliminarPostulante(postulanteAEliminar);
                postulantes.remove(selectedIndex);
                cargarJListPostulantes();
                JOptionPane.showMessageDialog(this, "Postulante eliminado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                
                // actualizar observers
                
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un postulante para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonDarDeBajaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelPostulantes;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonDarDeBaja;
    private javax.swing.JList<Postulante> jListPostulantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void cargarJListPostulantes() {
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        
        postulantes.sort((Postulante p1, Postulante p2) -> {
            int cedula1 = Integer.parseInt(p1.getCedula());
            int cedula2 = Integer.parseInt(p2.getCedula());
            return Integer.compare(cedula1, cedula2);
        });
        
        DefaultListModel<Postulante> modeloJListPostulantes = new DefaultListModel<>();
        for (Postulante postulante : postulantes) {
            modeloJListPostulantes.addElement(postulante);
        }
        jListPostulantes.setModel(modeloJListPostulantes);
    }
}
