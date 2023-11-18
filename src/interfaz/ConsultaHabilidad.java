// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package interfaz;

import dominio.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.DefaultListModel;

public class ConsultaHabilidad extends javax.swing.JFrame implements SistemaObserver{

    DefaultListModel<Habilidad> modelo;
    private Sistema miSistema;

    public ConsultaHabilidad(Sistema sistema) {
        miSistema = sistema;
        initComponents();
        modelo = new DefaultListModel<>();
        ListaTemas.setModel(modelo);
        actualizarLista();
        setLocationRelativeTo(null);
        miSistema.adjuntar(this);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        LabelTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaTemas = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PanelPostulantes = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        PanelPuestos = new javax.swing.JTextPane();
        BotonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Consulta por Habilidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 20, 0);
        jPanel1.add(LabelTitulo, gridBagConstraints);

        ListaTemas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaTemasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaTemas);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.ipady = 114;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 78, 0, 78);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Habilidades:");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(45, 0, 0, 0);
        jPanel1.add(jLabel1, gridBagConstraints);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Postulantes (nivel >5):");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(61, 18, 0, 20);
        jPanel1.add(jLabel2, gridBagConstraints);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Puestos con este requisito:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(61, 20, 0, 18);
        jPanel1.add(jLabel3, gridBagConstraints);

        PanelPostulantes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        PanelPostulantes.setEnabled(false);
        jScrollPane2.setViewportView(PanelPostulantes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 20);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        PanelPuestos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        PanelPuestos.setEnabled(false);
        jScrollPane3.setViewportView(PanelPuestos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 100;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 20);
        jPanel1.add(jScrollPane3, gridBagConstraints);

        BotonSalir.setText("Salir");
        BotonSalir.setMaximumSize(new java.awt.Dimension(76, 23));
        BotonSalir.setMinimumSize(new java.awt.Dimension(76, 23));
        BotonSalir.setPreferredSize(new java.awt.Dimension(76, 23));
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 20, 20, 0);
        jPanel1.add(BotonSalir, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    public void actualizar(){
        actualizarLista();
        limpiarPanel();
    }
    
    private void ListaTemasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaTemasValueChanged
        if (ListaTemas.getSelectedValue() == null) {
            return;
        }
        Habilidad habilidadSelect = ListaTemas.getSelectedValue();
        limpiarPanel();
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        ArrayList<Puesto> puestos = miSistema.obtenerListaPuestos();

        StringBuilder postulantesText = new StringBuilder();
        StringBuilder puestosTexto = new StringBuilder();

        for (Postulante p : postulantes) {
            Set<Habilidad> conjuntoDeHabilidad = p.getHabilidades().keySet();
            for (Habilidad Ph : conjuntoDeHabilidad) {
                if (Ph.toString().equals(habilidadSelect.toString())) {
                    if (p.getNivelHabilidad(Ph) > 5) {
                        postulantesText.append(p.toString()).append("\n");
                    }
                }
            }
            PanelPostulantes.setText(postulantesText.toString());
        }
        for (Puesto Pu : puestos) {
            ArrayList<Habilidad> habilidades = Pu.getHabilidadesRequeridas();
            for (Habilidad h : habilidades) {
                if (h.toString().equals(habilidadSelect.toString())) {
                    puestosTexto.append(Pu.toString()).append("\n");
                }
            }

        }
        PanelPuestos.setText(puestosTexto.toString());


    }//GEN-LAST:event_ListaTemasValueChanged
    public void actualizarLista() {
        DefaultListModel<Habilidad> modelo = new DefaultListModel<>();
        ArrayList<Habilidad> habilidades = miSistema.obtenerListaHabilidades();
        for (Habilidad j : habilidades) {

            modelo.addElement(j);
        }
        ListaTemas.setModel(modelo);
    }

    public void limpiarPanel() {
        PanelPostulantes.setText("");
        PanelPuestos.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JList<Habilidad> ListaTemas;
    private javax.swing.JTextPane PanelPostulantes;
    private javax.swing.JTextPane PanelPuestos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
