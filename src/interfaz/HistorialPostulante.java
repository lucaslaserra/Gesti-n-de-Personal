// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491
package interfaz;

import dominio.*;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gonza
 */
public class HistorialPostulante extends javax.swing.JFrame implements SistemaObserver {

    private Sistema miSistema;

    DefaultListModel<Postulante> modelo;

    public HistorialPostulante(Sistema sistema) {
        miSistema = sistema;
        initComponents();
        modelo = new DefaultListModel<>();
        ListaPostulantes.setModel(modelo);
        actualizarLista();
        setLocationRelativeTo(null);
        miSistema.adjuntar(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaValores = new javax.swing.JTable();
        BotonSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListaExperiencias = new javax.swing.JList<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaPostulantes = new javax.swing.JList<>();
        jPanel7 = new javax.swing.JPanel();
        Nombre = new javax.swing.JLabel();
        Cedula = new javax.swing.JLabel();
        Direccion = new javax.swing.JLabel();
        Telefono = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        Linkedin = new javax.swing.JLabel();
        Formato = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        LabelNombre = new javax.swing.JLabel();
        LabelCedula = new javax.swing.JLabel();
        LabelDireccion = new javax.swing.JLabel();
        LabelTelefono = new javax.swing.JLabel();
        LabelMail = new javax.swing.JLabel();
        LabelLinkedin = new javax.swing.JLabel();
        LabelFormato = new javax.swing.JLabel();
        LabelExperiencia = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        LabelBuscar = new javax.swing.JLabel();
        TextBuscador = new javax.swing.JTextField();
        BotonBuscar = new javax.swing.JButton();
        BotonResetar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();

        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(1300, 1000));
        setSize(new java.awt.Dimension(710, 741));
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaValores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro", "Evaluador", "Puntaje", "Comentarios"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaValores.setPreferredSize(new java.awt.Dimension(200, 80));
        jScrollPane3.setViewportView(TablaValores);
        if (TablaValores.getColumnModel().getColumnCount() > 0) {
            TablaValores.getColumnModel().getColumn(0).setPreferredWidth(3);
            TablaValores.getColumnModel().getColumn(1).setPreferredWidth(50);
            TablaValores.getColumnModel().getColumn(2).setPreferredWidth(5);
            TablaValores.getColumnModel().getColumn(3).setPreferredWidth(390);
        }

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 1106, 259));

        BotonSalir.setText("Salir");
        BotonSalir.setPreferredSize(new java.awt.Dimension(100, 30));
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(BotonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 890, -1, -1));

        jScrollPane2.setViewportView(ListaExperiencias);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 320, 110));

        jSeparator1.setPreferredSize(new java.awt.Dimension(1000, 3));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, -1, 20));

        jPanel2.setLayout(new java.awt.BorderLayout(10, 10));

        jLabel1.setText("Postulantes:");
        jPanel2.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        ListaPostulantes.setLayoutOrientation(javax.swing.JList.HORIZONTAL_WRAP);
        ListaPostulantes.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaPostulantesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(ListaPostulantes);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 353, 269));

        jPanel7.setMinimumSize(new java.awt.Dimension(100, 35));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 35));
        jPanel7.setLayout(new java.awt.GridLayout(8, 1, 0, 5));
        jPanel7.add(Nombre);
        jPanel7.add(Cedula);
        jPanel7.add(Direccion);
        jPanel7.add(Telefono);
        jPanel7.add(Mail);

        Linkedin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LinkedinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LinkedinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LinkedinMouseExited(evt);
            }
        });
        jPanel7.add(Linkedin);
        jPanel7.add(Formato);

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 96, 330, 270));

        jPanel8.setLayout(new java.awt.GridLayout(9, 1));

        LabelNombre.setText("Nombre:");
        jPanel8.add(LabelNombre);

        LabelCedula.setText("Cédula:");
        jPanel8.add(LabelCedula);

        LabelDireccion.setText("Dirección:");
        jPanel8.add(LabelDireccion);

        LabelTelefono.setText("Telefono:");
        jPanel8.add(LabelTelefono);

        LabelMail.setText("Mail:");
        jPanel8.add(LabelMail);

        LabelLinkedin.setText("Linkedin:");
        jPanel8.add(LabelLinkedin);

        LabelFormato.setText("Formato:");
        jPanel8.add(LabelFormato);

        LabelExperiencia.setText("Experiencia:");
        LabelExperiencia.setVerifyInputWhenFocusTarget(false);
        jPanel8.add(LabelExperiencia);

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 94, -1, 310));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Historial de Postulante");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 200, -1));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel10.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 10, 5));

        LabelBuscar.setText("Buscar: ");
        jPanel10.add(LabelBuscar);

        TextBuscador.setMinimumSize(new java.awt.Dimension(3333, 22));
        TextBuscador.setName(""); // NOI18N
        TextBuscador.setPreferredSize(new java.awt.Dimension(300, 22));
        TextBuscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextBuscadorActionPerformed(evt);
            }
        });
        jPanel10.add(TextBuscador);

        BotonBuscar.setText("Buscar");
        BotonBuscar.setPreferredSize(new java.awt.Dimension(100, 30));
        BotonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonBuscarActionPerformed(evt);
            }
        });
        jPanel10.add(BotonBuscar);

        BotonResetar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BotonResetar.setText("Resetear");
        BotonResetar.setCursor(new java.awt.Cursor(java.awt.Cursor.E_RESIZE_CURSOR));
        BotonResetar.setPreferredSize(new java.awt.Dimension(100, 30));
        BotonResetar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonResetarActionPerformed(evt);
            }
        });
        jPanel10.add(BotonResetar);

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, 590, -1));

        getContentPane().add(jPanel1, new java.awt.GridBagConstraints());

        jPanel3.setMinimumSize(new java.awt.Dimension(15, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        getContentPane().add(jPanel3, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void ListaPostulantesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaPostulantesValueChanged
        Postulante postulanteSelected = ListaPostulantes.getSelectedValue();
        limpiarLabels();
        limpiarTabla();
        if (postulanteSelected == null) {
            return;
        }
        actualizarListaExperiencias(postulanteSelected);
        String nombre = postulanteSelected.getNombre();
        String cedula = postulanteSelected.getCedula();
        String direccion = postulanteSelected.getDireccion();
        String telefono = postulanteSelected.getTelefono();
        String mail = postulanteSelected.getEmail();
        String linkedin = postulanteSelected.getLinkedin();
        String formato = postulanteSelected.getTipoTrabajo();
        Formato.setText(formato);
        Nombre.setText(nombre);
        Cedula.setText(cedula);
        Direccion.setText(direccion);
        Telefono.setText(telefono);
        Mail.setText(mail);
        Linkedin.setText(linkedin);
        Linkedin.setForeground(Color.BLUE);

        ArrayList<Entrevista> entrevistas = miSistema.obtenerListaEntrevistas();
        DefaultTableModel modeloT = (DefaultTableModel) TablaValores.getModel();
        for (Entrevista en : entrevistas) {
            if (en.getPostulante().getCedula().equals(postulanteSelected.getCedula())) {
                int numero = en.getId();
                int puntaje = en.getPuntuacion();
                String comentario = en.getComentarios();
                Evaluador evaluador = en.getEvaluador();
                Object[] datos = {numero, evaluador + " (" + evaluador.getCedula() + ") ", puntaje, comentario};
                modeloT.addRow(datos);

            }

        }
        if (modeloT.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No tuvo ninguna entrevista hasta el momento", "Alert", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_ListaPostulantesValueChanged

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        dispose();
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void BotonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonBuscarActionPerformed
        String palabra = TextBuscador.getText().toLowerCase();
        limpiarTabla();
        DefaultTableModel modeloT = (DefaultTableModel) TablaValores.getModel();
        Postulante postulanteSelected = ListaPostulantes.getSelectedValue();
        ArrayList<Entrevista> entrevistas = miSistema.obtenerListaEntrevistas();

        for (Entrevista en : entrevistas) {
            if (en.getPostulante().getCedula().equals(postulanteSelected.getCedula())) {
                int numero = en.getId();
                int puntaje = en.getPuntuacion();
                Evaluador evaluador = en.getEvaluador();
                String comentario = en.getComentarios().toLowerCase();
                if (comentario.contains(palabra)) {
                    comentario = "<html>" + comentario.replaceAll(palabra, "<font color='red'>" + palabra + "</font>") + "</html>";
                    Object[] datosR = {numero, evaluador + " (" + evaluador.getCedula() + ") ", puntaje, comentario};
                    modeloT.addRow(datosR);

                } else {
                    Object[] datos = {numero, evaluador + " (" + evaluador.getCedula() + ") ", puntaje, comentario};
                    modeloT.addRow(datos);
                }

            }
        }

    }//GEN-LAST:event_BotonBuscarActionPerformed

    public void actualizar() {
        actualizarLista();
        limpiarLabels();
        DefaultListModel<String> modeloLimpio = new DefaultListModel<>();
        modeloLimpio.clear();
        ListaExperiencias.setModel(modeloLimpio);
    }


    private void BotonResetarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonResetarActionPerformed
        Postulante postulanteSelected = ListaPostulantes.getSelectedValue();
        limpiarTabla();
        TextBuscador.setText("");
        ArrayList<Entrevista> entrevistas = miSistema.obtenerListaEntrevistas();
        DefaultTableModel modeloT = (DefaultTableModel) TablaValores.getModel();
        for (Entrevista en : entrevistas) {
            if (en.getPostulante().getCedula().equals(postulanteSelected.getCedula())) {
                int numero = en.getId();
                int puntaje = en.getPuntuacion();
                String comentario = en.getComentarios();
                Evaluador evaluador = en.getEvaluador();
                Object[] datos = {numero, evaluador + " (" + evaluador.getCedula() + ") ", puntaje, comentario};
                modeloT.addRow(datos);

            }

        }
    }//GEN-LAST:event_BotonResetarActionPerformed

    private void TextBuscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextBuscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextBuscadorActionPerformed

    private void LinkedinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkedinMouseClicked
        int confirmacion = JOptionPane.showConfirmDialog(this, "Se cerrará la ventana al abrir el link, ¿Está seguro de continuar?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            Postulante postulanteSelected = ListaPostulantes.getSelectedValue();
            abrirLinkedin(postulanteSelected.getLinkedin());
        }

    }//GEN-LAST:event_LinkedinMouseClicked

    public void windowClosing(WindowEvent e) {
        // No hacer nada al intentar cerrar la ventana
    }

    private void LinkedinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkedinMouseEntered
        Linkedin.setForeground(Color.RED);
    }//GEN-LAST:event_LinkedinMouseEntered

    private void LinkedinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LinkedinMouseExited
        Linkedin.setForeground(Color.BLUE);
    }//GEN-LAST:event_LinkedinMouseExited
    public void actualizarLista() {
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        postulantes.sort((Postulante p1, Postulante p2) -> {
            int cedula1 = Integer.parseInt(p1.getCedula());
            int cedula2 = Integer.parseInt(p2.getCedula());
            return Integer.compare(cedula1, cedula2);
        });

        DefaultListModel<Postulante> modeloL = new DefaultListModel<>();
        for (Postulante j : postulantes) {
            modeloL.addElement(j);
        }
        ListaPostulantes.setModel(modeloL);
    }

    public void actualizarListaExperiencias(Postulante postulante) {
        DefaultListModel<String> modeloLE = new DefaultListModel<>();
        Map<Habilidad, Integer> habilidades = postulante.getHabilidades();
        for (Map.Entry<Habilidad, Integer> entry : habilidades.entrySet()) {
            modeloLE.addElement(entry.getKey() + " (" + entry.getValue() + ")");
        }
        ListaExperiencias.setModel(modeloLE);

    }

    public void limpiarLabels() {
        Cedula.setText("");
        Direccion.setText("");
        Linkedin.setText("");
        Mail.setText("");
        Nombre.setText("");
        Telefono.setText("");
        Formato.setText("");
    }

    public void limpiarTabla() {
        DefaultTableModel modeloT = (DefaultTableModel) TablaValores.getModel();
        modeloT.setRowCount(0);
    }

    public void abrirLinkedin(String linkedin) {
        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();
            if (desktop.isSupported(Desktop.Action.BROWSE)) {
                try {
                    desktop.browse(new URI(linkedin));
                } catch (IOException | URISyntaxException e) {
                    JOptionPane.showMessageDialog(this, "No se ha podido abrir el link.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonBuscar;
    private javax.swing.JButton BotonResetar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JLabel Cedula;
    private javax.swing.JLabel Direccion;
    private javax.swing.JLabel Formato;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelCedula;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelExperiencia;
    private javax.swing.JLabel LabelFormato;
    private javax.swing.JLabel LabelLinkedin;
    private javax.swing.JLabel LabelMail;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel Linkedin;
    private javax.swing.JList<String> ListaExperiencias;
    private javax.swing.JList<Postulante
    > ListaPostulantes;
    private javax.swing.JLabel Mail;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTable TablaValores;
    private javax.swing.JLabel Telefono;
    private javax.swing.JTextField TextBuscador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
