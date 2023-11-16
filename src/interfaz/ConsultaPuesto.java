/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.*;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

/**
 *
 * @author Gonza
 */
public class ConsultaPuesto extends javax.swing.JFrame {

    private Sistema miSistema;

    public ConsultaPuesto(Sistema sistema) {

        miSistema = sistema;
        initComponents();
        actualizarLista();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JLabel();
        LabelPuestos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPuestos = new javax.swing.JList<>();
        LabelNivel = new javax.swing.JLabel();
        SpinnerNivel = new javax.swing.JSpinner();
        BotonConsultar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        LabelPostulantes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaPostulantes = new javax.swing.JList<>();
        BotonCancelar = new javax.swing.JButton();
        BotonExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Consulta para puesto");

        LabelPuestos.setText("Puestos:");

        ListaPuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(ListaPuestos);

        LabelNivel.setText("Nivel:");

        SpinnerNivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        BotonConsultar.setText("Consultar");
        BotonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarActionPerformed(evt);
            }
        });

        LabelPostulantes.setText("Postulanes:");

        jScrollPane2.setViewportView(ListaPostulantes);

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonExportar.setText("Exportar");
        BotonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonExportar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelPostulantes)
                    .addComponent(LabelPuestos)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LabelNivel)
                        .addGap(63, 63, 63)
                        .addComponent(SpinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(BotonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jSeparator1)
                    .addComponent(jScrollPane2))
                .addGap(36, 36, 36))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(LabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelPuestos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNivel)
                    .addComponent(SpinnerNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonConsultar))
                .addGap(27, 27, 27)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LabelPostulantes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCancelar)
                    .addComponent(BotonExportar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarActionPerformed
        limpiarListaPostulantes();
        Puesto puestoSelected = ListaPuestos.getSelectedValue();

        int nivel = (int) SpinnerNivel.getValue();
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        ArrayList<Entrevista> entrevistas = miSistema.obtenerListaEntrevistas();
        ArrayList<Habilidad> habilidadesPuesto = puestoSelected.getHabilidadesRequeridas();

        ArrayList<Postulante> postulantesFiltrados = new ArrayList<>();

        for (Postulante p : postulantes) {
            for (Entrevista e : entrevistas) {
                if (e.getPostulante().equals(p)) {
                    if (p.getTipoTrabajo().equals(puestoSelected.getTipo())) {
                        if (!postulantesFiltrados.contains(p)) {
                            postulantesFiltrados.add(p);
                        }

                    }
                }

            }
        }

        ArrayList<Postulante> postulantesAceptados = new ArrayList<>();

        for (Postulante postulante : postulantesFiltrados) {
            int contador = 0;
            System.out.println(postulante.getNombre());
            for (Habilidad habilidad : habilidadesPuesto) {
                if (postulante.getHabilidades().keySet().contains(habilidad)) {
                    if (postulante.getNivelHabilidad(habilidad) >= nivel) {
                        contador++;
                    }

                }
            }

            if (contador == habilidadesPuesto.size()) {
                postulantesAceptados.add(postulante);
            }
        }
        DefaultListModel<Postulante> modeloLista = new DefaultListModel<>();
        for (Postulante pAceptado : postulantesAceptados) {
            System.out.println(pAceptado.getNombre());
            modeloLista.addElement(pAceptado);
        }
        ListaPostulantes.setModel(modeloLista);


    }//GEN-LAST:event_BotonConsultarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExportarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonExportarActionPerformed

    public void actualizarLista() {
        DefaultListModel<Puesto> modeloActualizar = new DefaultListModel<>();
        ArrayList<Puesto> puestos = miSistema.obtenerListaPuestos();
        for (Puesto p : puestos) {

            modeloActualizar.addElement(p);
        }
        ListaPuestos.setModel(modeloActualizar);
    }

    public void limpiarListaPostulantes() {
        DefaultListModel<Postulante> modeloLimpiar = new DefaultListModel<>();
        modeloLimpiar.clear();
        ListaPostulantes.setModel(modeloLimpiar);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonConsultar;
    private javax.swing.JButton BotonExportar;
    private javax.swing.JLabel LabelNivel;
    private javax.swing.JLabel LabelPostulantes;
    private javax.swing.JLabel LabelPuestos;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JList<Postulante> ListaPostulantes;
    private javax.swing.JList<Puesto> ListaPuestos;
    private javax.swing.JSpinner SpinnerNivel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
