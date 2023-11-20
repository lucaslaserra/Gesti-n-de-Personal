// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package interfaz;

import dominio.*;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class AltaEntrevista extends javax.swing.JFrame implements SistemaObserver {

    private Sistema miSistema;
    DefaultListModel<Postulante> modelo1;
    DefaultListModel<Evaluador> modelo2;

    public AltaEntrevista(Sistema sistema) {
        miSistema = sistema;
        initComponents();
        modelo1 = new DefaultListModel<>();
        modelo2 = new DefaultListModel<>();
        ListaEvaluadores.setModel(modelo2);
        ListaPostulantes.setModel(modelo1);
        actualizarLista();
        setLocationRelativeTo(null);
        sistema.adjuntar(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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

        jPanel1.setLayout(new java.awt.GridBagLayout());

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Alta de entrevista");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanel1.add(LabelTitulo, gridBagConstraints);

        jLabel2.setText("Postulantes:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 30, 0, 0);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Evaluadores:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(36, 12, 0, 0);
        jPanel1.add(jLabel3, gridBagConstraints);

        jScrollPane1.setViewportView(ListaPostulantes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 30, 0, 40);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jScrollPane2.setViewportView(ListaEvaluadores);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 6, 0, 30);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        jLabel4.setText("Puntaje:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 30, 0, 0);
        jPanel1.add(jLabel4, gridBagConstraints);

        SpinnerPuntaje.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(32, 0, 0, 0);
        jPanel1.add(SpinnerPuntaje, gridBagConstraints);

        jLabel5.setText("Comentarios:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(29, 30, 0, 0);
        jPanel1.add(jLabel5, gridBagConstraints);

        TextComentarios.setColumns(20);
        TextComentarios.setRows(5);
        jScrollPane3.setViewportView(TextComentarios);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 150;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(29, 0, 0, 30);
        jPanel1.add(jScrollPane3, gridBagConstraints);

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 23;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(30, 25, 12, 0);
        jPanel1.add(BotonCancelar, gridBagConstraints);

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 12, 25);
        jPanel1.add(BotonRegistrar, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Agrego entrevista
    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        Postulante postulanteSelected = ListaPostulantes.getSelectedValue();
        
        
        Evaluador evaluadorSelected = ListaEvaluadores.getSelectedValue();
        int puntaje = (int) SpinnerPuntaje.getValue();
        String comentarios = TextComentarios.getText();

        if (postulanteSelected == null || evaluadorSelected == null) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un postulante y a su vez a un evaluador", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (comentarios.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo comentario es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        Entrevista entrevista = new Entrevista(postulanteSelected, evaluadorSelected, comentarios, puntaje);
        miSistema.agregarEntrevista(entrevista);
        JOptionPane.showMessageDialog(this, "Se ha ingresado la entrevista con exito, el numero de su entrevista es: " + (miSistema.obtenerNumdeEntrevistas() - 1), "Exito", JOptionPane.INFORMATION_MESSAGE);

        limpiar();
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    // Cierro pestaña
    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    // Actualizo listas de evaluadores y postulantes.
    public void actualizarLista() {
        DefaultListModel<Evaluador> modeloE = new DefaultListModel<>();
        ArrayList<Evaluador> evaluadores = miSistema.obtenerListaEvaluadores();
        DefaultListModel<Postulante> modeloP = new DefaultListModel<>();
        
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        postulantes.sort((Postulante p1, Postulante p2) -> {
            int cedula1 = Integer.parseInt(p1.getCedula());
            int cedula2 = Integer.parseInt(p2.getCedula());
            return Integer.compare(cedula1, cedula2);
        });
        
        
        for (Evaluador e : evaluadores) {
            modeloE.addElement(e);
        }
        ListaEvaluadores.setModel(modeloE);
        for (Postulante p : postulantes) {
            modeloP.addElement(p);
        }
        ListaPostulantes.setModel(modeloP);
    }

    // Limpiar campos y listas
    public void limpiar() {
        TextComentarios.setText("");
        ListaEvaluadores.clearSelection();
        ListaPostulantes.clearSelection();
        SpinnerPuntaje.setValue(0);
    }

    // Actualizar (observer)
    public void actualizar() {
        actualizarLista();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
