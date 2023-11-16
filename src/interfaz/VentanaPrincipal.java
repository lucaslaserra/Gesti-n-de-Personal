/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import dominio.*;
import java.util.ArrayList;

public class VentanaPrincipal extends javax.swing.JFrame{

    private Sistema miSistema;
//    private transient ArrayList<SistemaObserver> observers = new ArrayList<>();
    
    public VentanaPrincipal(Sistema sistema) {
        miSistema = sistema;
        initComponents();
        setLocationRelativeTo(null);
    }

//     public void actualizar() {
//        miSistema.cargarSistema();
//    }

    private void recargarComponentesUI() {
        // Lógica para actualizar la interfaz gráfica con los datos más recientes de miSistema.
    }
    
//    public interface SistemaObserver {
//        void update();
//    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        MenuRegistroTematica = new javax.swing.JMenuItem();
        MenuAltaPostulante = new javax.swing.JMenuItem();
        MenuBajaPostulante = new javax.swing.JMenuItem();
        MenuRegistroEvaluador = new javax.swing.JMenuItem();
        MenuIngresoEntrevista = new javax.swing.JMenuItem();
        MenuRegistroPuesto = new javax.swing.JMenuItem();
        MenuConsultaPuesto = new javax.swing.JMenuItem();
        MenuHistoriaPostulante = new javax.swing.JMenuItem();
        MenuConsultaTematica = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión de Personal");
        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(204, 204, 255))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Bienvenido al sistema para gestión de postulantes");
        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jMenuBar1.setPreferredSize(new java.awt.Dimension(104, 25));

        jMenu2.setText("Opciones");

        MenuRegistroTematica.setText("Registro de Tematica");
        MenuRegistroTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroTematicaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuRegistroTematica);

        MenuAltaPostulante.setText("Alta de Postulante");
        MenuAltaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAltaPostulanteActionPerformed(evt);
            }
        });
        jMenu2.add(MenuAltaPostulante);

        MenuBajaPostulante.setText("Baja de Postulante");
        MenuBajaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBajaPostulanteActionPerformed(evt);
            }
        });
        jMenu2.add(MenuBajaPostulante);

        MenuRegistroEvaluador.setText("Registro de Evaluador");
        MenuRegistroEvaluador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroEvaluadorActionPerformed(evt);
            }
        });
        jMenu2.add(MenuRegistroEvaluador);

        MenuIngresoEntrevista.setText("Ingreso de entrevista");
        MenuIngresoEntrevista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIngresoEntrevistaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuIngresoEntrevista);

        MenuRegistroPuesto.setText("Registro de Puesto");
        MenuRegistroPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuRegistroPuestoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuRegistroPuesto);

        MenuConsultaPuesto.setText("Consulta para puesto");
        MenuConsultaPuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaPuestoActionPerformed(evt);
            }
        });
        jMenu2.add(MenuConsultaPuesto);

        MenuHistoriaPostulante.setText("Historia de postulante");
        MenuHistoriaPostulante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHistoriaPostulanteActionPerformed(evt);
            }
        });
        jMenu2.add(MenuHistoriaPostulante);

        MenuConsultaTematica.setText("Consulta por temática");
        MenuConsultaTematica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsultaTematicaActionPerformed(evt);
            }
        });
        jMenu2.add(MenuConsultaTematica);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

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
        IngresoEntrevista panelIngreso = new IngresoEntrevista(miSistema);
        panelIngreso.setVisible(true);
    }//GEN-LAST:event_MenuIngresoEntrevistaActionPerformed

    private void MenuRegistroPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuRegistroPuestoActionPerformed
        RegistroPuesto RegPuesto = new RegistroPuesto(miSistema);
        RegPuesto.setVisible(true);
    }//GEN-LAST:event_MenuRegistroPuestoActionPerformed

    private void MenuConsultaPuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaPuestoActionPerformed
        ConsultaPuesto VconsultaPuesto = new ConsultaPuesto(miSistema);
        VconsultaPuesto.setVisible(true);
    }//GEN-LAST:event_MenuConsultaPuestoActionPerformed

    private void MenuHistoriaPostulanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHistoriaPostulanteActionPerformed
        HistorialPostulante panelHistorial = new HistorialPostulante(miSistema);
        panelHistorial.setVisible(true);
    }//GEN-LAST:event_MenuHistoriaPostulanteActionPerformed

    private void MenuConsultaTematicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsultaTematicaActionPerformed
        ConsultaHabilidad VconsultaAtributo = new ConsultaHabilidad(miSistema);
        VconsultaAtributo.setVisible(true);
    }//GEN-LAST:event_MenuConsultaTematicaActionPerformed

 

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
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
