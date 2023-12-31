// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package interfaz;

import dominio.*;
import java.util.*;
import javax.swing.*;

public class AltaPostulanteConocimiento extends javax.swing.JFrame implements SistemaObserver{

    private Sistema miSistema;
    private Postulante postulante;
    private Map<String, Habilidad> habilidadesMap = new HashMap<>();

    public AltaPostulanteConocimiento( Postulante postulante, Sistema sistema) {
        this.postulante = postulante;
        miSistema = sistema;
        initComponents();
        setLocationRelativeTo(null);
        cargarComboHabilidades();
        miSistema.adjuntar(this);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxHablidades = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSpinnerNivel = new javax.swing.JSpinner();
        jButtonAgregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListHabilidades = new javax.swing.JList<>();
        jButtonEliminar = new javax.swing.JButton();
        JButtonSalir = new javax.swing.JButton();
        jButtonRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Habilidad:");

        jLabel2.setText("Nivel:");

        jSpinnerNivel.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        jButtonAgregar.setText("Agregar");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        jLabel3.setText("Experiencia:");

        jListHabilidades.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jListHabilidadesAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(jListHabilidades);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });

        JButtonSalir.setText("Cancelar");
        JButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSalirActionPerformed(evt);
            }
        });

        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JButtonSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonRegistrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jButtonEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxHablidades, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jComboBoxHablidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAgregar))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonEliminar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonSalir)
                    .addComponent(jButtonRegistrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Agrego habilidad al postulante
    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
    String habilidadString = (String) jComboBoxHablidades.getSelectedItem();
    Habilidad habilidadSeleccionada = habilidadesMap.get(habilidadString);
    int nivel = (Integer) jSpinnerNivel.getValue();
    if (habilidadSeleccionada != null) {
        postulante.addHabilidad(habilidadSeleccionada, nivel);
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, seleccione una habilidad.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    actualizarListaHabilidades();
    }//GEN-LAST:event_jButtonAgregarActionPerformed

    private void cargarComboHabilidades(){
        ArrayList<Habilidad> habilidades = miSistema.obtenerListaHabilidades();
        for (Habilidad habilidad : habilidades) {
            String habilidadString = habilidad.toString(); 
            jComboBoxHablidades.addItem(habilidadString);
            habilidadesMap.put(habilidadString, habilidad);
        }
    }
    
    // Actualizo panel (observer)
    public void actualizar() {
         while (jComboBoxHablidades.getItemCount() > 0) {
            Object item = jComboBoxHablidades.getItemAt(0);
            if (item != null) {
                jComboBoxHablidades.removeItemAt(0);
            }
        }
        cargarComboHabilidades();
    }
    
    // Actualizo la lista de habilidades
    private void actualizarListaHabilidades() {
    DefaultListModel<String> modelo = new DefaultListModel<>();
    for (Map.Entry<Habilidad, Integer> entrada : postulante.getHabilidades().entrySet()) {
        String texto = entrada.getKey().toString() + " (" + entrada.getValue() + ")";
        modelo.addElement(texto);
    }
    jListHabilidades.setModel(modelo);
}

    private void jListHabilidadesAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jListHabilidadesAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jListHabilidadesAncestorAdded

    // Elimino elemento habilidad de la lista
    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
      int selectedIndex = jListHabilidades.getSelectedIndex();
        if (selectedIndex != -1) {
            DefaultListModel<String> model = (DefaultListModel<String>) jListHabilidades.getModel();
            String selectedItem = model.getElementAt(selectedIndex);

            String[] parts = selectedItem.split(" \\("); 
            String habilidadTema = parts[0];

            // Busca la habilidad en el mapa usando solo el tema
            for (Map.Entry<String, Habilidad> entry : habilidadesMap.entrySet()) {
                if (entry.getValue().getTema().equals(habilidadTema)) {
                    postulante.removeHabilidad(entry.getValue());
                    model.remove(selectedIndex);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una habilidad para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    // Hago el alta de el postulante finalmente.
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed

        if(jListHabilidades.getModel().getSize() == 0){
            JOptionPane.showMessageDialog(this, "Debes asignarle una habilidad al postulante","Error",JOptionPane.ERROR_MESSAGE);
            return;
        }

        miSistema.agregarPostulante(postulante);
        JOptionPane.showMessageDialog(this, "Se ha registrado el postulante con exito!","Exito",JOptionPane.INFORMATION_MESSAGE);
        dispose();
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    // Salir
    private void JButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_JButtonSalirActionPerformed

 
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonSalir;
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JComboBox<String> jComboBoxHablidades;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JList<String> jListHabilidades;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinnerNivel;
    // End of variables declaration//GEN-END:variables

}
