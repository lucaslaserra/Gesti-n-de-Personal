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

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Consulta por Habilidad");

        ListaTemas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaTemasValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaTemas);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Habilidades:");

        jLabel2.setText("Postulantes (nivel >5):");

        jLabel3.setText("Puestos con este requisito:");

        PanelPostulantes.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        PanelPostulantes.setEnabled(false);
        jScrollPane2.setViewportView(PanelPostulantes);

        PanelPuestos.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        PanelPuestos.setEnabled(false);
        jScrollPane3.setViewportView(PanelPuestos);

        BotonSalir.setText("Salir");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(38, 38, 38))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(LabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(221, 221, 221))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTitulo)
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
