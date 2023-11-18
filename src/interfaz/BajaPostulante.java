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

        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        LabelPostulantes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListPostulantes = new javax.swing.JList<>();
        jButtonDarDeBaja = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Baja de postulante");

        LabelPostulantes.setText("Postulantes:");

        jListPostulantes.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jListPostulantesComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jListPostulantes);

        jButtonDarDeBaja.setText("Aceptar");
        jButtonDarDeBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDarDeBajaActionPerformed(evt);
            }
        });

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(173, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonDarDeBaja)
                .addGap(48, 48, 48))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LabelPostulantes)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(43, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(LabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 395, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDarDeBaja)
                    .addComponent(jButton1))
                .addGap(60, 60, 60))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(112, 112, 112)
                    .addComponent(LabelPostulantes)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(173, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

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
        DefaultListModel<Postulante> modeloJListPostulantes = new DefaultListModel<>();
        for (Postulante postulante : postulantes) {
            modeloJListPostulantes.addElement(postulante);
        }
        jListPostulantes.setModel(modeloJListPostulantes);
    }
}
