// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491

package interfaz;

import dominio.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VentanaPrincipal extends javax.swing.JFrame {

    private Sistema miSistema;

    public VentanaPrincipal(Sistema sistema) {
        miSistema = sistema;
        initComponents();
        setLocationRelativeTo(null);
        
//        miSistema.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        MenuRegistroTematica = new javax.swing.JMenuItem();
        MenuConsultaTematica = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuAltaPostulante = new javax.swing.JMenuItem();
        MenuBajaPostulante = new javax.swing.JMenuItem();
        MenuHistoriaPostulante = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        MenuRegistroEvaluador = new javax.swing.JMenuItem();
        MenuIngresoEntrevista = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        MenuRegistroPuesto = new javax.swing.JMenuItem();
        MenuConsultaPuesto = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(430, 400));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Personal");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 204, 255))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel1, java.awt.BorderLayout.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido al sistema para gestión de postulantes");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(104, 25));

        jMenu3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jMenu3.setText("Habilidad");

        MenuRegistroTematica.setText("Alta de Habilidad");
        MenuRegistroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroTematicaActionPerformed(evt);
            }
        });
        jMenu3.add(MenuRegistroTematica);

        MenuConsultaTematica.setText("Consulta de habilidad");
        MenuConsultaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaTematicaActionPerformed(evt);
            }
        });
        jMenu3.add(MenuConsultaTematica);

        jMenuBar1.add(jMenu3);

        jMenu4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jMenu4.setText("Postulante");

        MenuAltaPostulante.setText("Alta de Postulante");
        MenuAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAltaPostulanteActionPerformed(evt);
            }
        });
        jMenu4.add(MenuAltaPostulante);

        MenuBajaPostulante.setText("Baja de Postulante");
        MenuBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBajaPostulanteActionPerformed(evt);
            }
        });
        jMenu4.add(MenuBajaPostulante);

        MenuHistoriaPostulante.setText("Historial de Postulante");
        MenuHistoriaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHistoriaPostulanteActionPerformed(evt);
            }
        });
        jMenu4.add(MenuHistoriaPostulante);

        jMenuBar1.add(jMenu4);

        jMenu5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jMenu5.setText("Entrevista");

        MenuRegistroEvaluador.setText("Alta de Evaluador");
        MenuRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroEvaluadorActionPerformed(evt);
            }
        });
        jMenu5.add(MenuRegistroEvaluador);

        MenuIngresoEntrevista.setText("Alta de Entrevista");
        MenuIngresoEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIngresoEntrevistaActionPerformed(evt);
            }
        });
        jMenu5.add(MenuIngresoEntrevista);

        jMenuBar1.add(jMenu5);

        jMenu6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jMenu6.setText("Puesto");

        MenuRegistroPuesto.setText("Alta de Puesto");
        MenuRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroPuestoActionPerformed(evt);
            }
        });
        jMenu6.add(MenuRegistroPuesto);

        MenuConsultaPuesto.setText("Consulta de Puesto");
        MenuConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaPuestoActionPerformed(evt);
            }
        });
        jMenu6.add(MenuConsultaPuesto);

        jMenuBar1.add(jMenu6);

        jMenu7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        jMenu7.setText("Salir");
        jMenu7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu7ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuRegistroTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroTematicaActionPerformed
        RegistroHabilidad paneltematica = new RegistroHabilidad(miSistema);
        paneltematica.setVisible(true);
//        miSistema.
    }//GEN-LAST:event_MenuRegistroTematicaActionPerformed

    private void MenuAltaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAltaPostulanteActionPerformed
        AltaPostulante panelAlta = new AltaPostulante(miSistema);
        panelAlta.setVisible(true);
    }//GEN-LAST:event_MenuAltaPostulanteActionPerformed

    private void MenuBajaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBajaPostulanteActionPerformed
        BajaPostulante panelbaja = new BajaPostulante(miSistema);
        panelbaja.setVisible(true);
    }//GEN-LAST:event_MenuBajaPostulanteActionPerformed

    private void MenuRegistroEvaluadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroEvaluadorActionPerformed
        RegistroEvaluador RegEvaluador = new RegistroEvaluador(miSistema);
        RegEvaluador.setVisible(true);
    }//GEN-LAST:event_MenuRegistroEvaluadorActionPerformed

    private void MenuIngresoEntrevistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIngresoEntrevistaActionPerformed
        boolean opcionNoCumple = false;
        ArrayList<Evaluador> evaluadores = miSistema.obtenerListaEvaluadores();
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        if (evaluadores.isEmpty() && postulantes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se registro ningun evaluador y postulante hasta el momento!.", "Error", JOptionPane.ERROR_MESSAGE);
            opcionNoCumple = true;
        } else if (evaluadores.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe registrar al menos un evaluador.", "Error", JOptionPane.ERROR_MESSAGE);
            opcionNoCumple = true;
        } else if (postulantes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe registrar al menos un postulante.", "Error", JOptionPane.ERROR_MESSAGE);
            opcionNoCumple = true;
        }
        if (!opcionNoCumple) {
            IngresoEntrevista panelIngreso = new IngresoEntrevista(miSistema);
            panelIngreso.setVisible(true);
        }
    }//GEN-LAST:event_MenuIngresoEntrevistaActionPerformed

    private void MenuRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroPuestoActionPerformed
        ArrayList<Habilidad> habilidades = miSistema.obtenerListaHabilidades();
        if (habilidades.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe registrar al menos una habilidad.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            RegistroPuesto RegPuesto = new RegistroPuesto(miSistema);
            RegPuesto.setVisible(true);
        }
    }//GEN-LAST:event_MenuRegistroPuestoActionPerformed

    private void MenuConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaPuestoActionPerformed
        ArrayList<Puesto> puestos = miSistema.obtenerListaPuestos();
        if (puestos.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe registrar al menos un puesto.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ConsultaPuesto VconsultaPuesto = new ConsultaPuesto(miSistema);
            VconsultaPuesto.setVisible(true);
        }
    }//GEN-LAST:event_MenuConsultaPuestoActionPerformed

    private void MenuHistoriaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHistoriaPostulanteActionPerformed
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        if (postulantes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe registrar al menos un postulante.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            HistorialPostulante panelHistorial = new HistorialPostulante(miSistema);
            panelHistorial.setVisible(true);
        }
    }//GEN-LAST:event_MenuHistoriaPostulanteActionPerformed

    private void MenuConsultaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaTematicaActionPerformed
        ArrayList<Habilidad> habilidades = miSistema.obtenerListaHabilidades();
        if (habilidades.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe registrar al menos una habilidad.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            ConsultaHabilidad VconsultaAtributo = new ConsultaHabilidad(miSistema);
            VconsultaAtributo.setVisible(true);
        }
    }//GEN-LAST:event_MenuConsultaTematicaActionPerformed

    private void jMenu7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu7ActionPerformed
        dispose();
    }//GEN-LAST:event_jMenu7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAltaPostulante;
    private javax.swing.JMenuItem MenuBajaPostulante;
    private javax.swing.JMenuItem MenuConsultaPuesto;
    private javax.swing.JMenuItem MenuConsultaTematica;
    private javax.swing.JMenuItem MenuHistoriaPostulante;
    private javax.swing.JMenuItem MenuIngresoEntrevista;
    private javax.swing.JMenuItem MenuRegistroEvaluador;
    private javax.swing.JMenuItem MenuRegistroPuesto;
    private javax.swing.JMenuItem MenuRegistroTematica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
