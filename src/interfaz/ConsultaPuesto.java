// Lucas Laserra - 307103
// Gonzalo Álvarez - 315491
package interfaz;

import dominio.*;
import java.io.File;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import lectura.ArchivoGrabacion;

// Clase para la consulta de puestos en la interfaz gráfica
public class ConsultaPuesto extends javax.swing.JFrame implements SistemaObserver {

    private Sistema miSistema;
    private Puesto ultimoPuesto = null;

    // Constructor de la clase, inicializa la interfaz y adjunta al sistema
    public ConsultaPuesto(Sistema sistema) {

        miSistema = sistema;
        initComponents();
        DefaultListModel<Postulante> modeloInicio = new DefaultListModel<>();
        ListaPostulantes.setModel(modeloInicio);
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

        jPanel1.setLayout(new java.awt.GridBagLayout());

        LabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("Consulta para puesto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 8;
        gridBagConstraints.insets = new java.awt.Insets(6, 22, 0, 0);
        jPanel1.add(LabelTitulo, gridBagConstraints);

        LabelPuestos.setText("Puestos:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(12, 30, 0, 0);
        jPanel1.add(LabelPuestos, gridBagConstraints);

        ListaPuestos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(ListaPuestos);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 70;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 0, 30);
        jPanel1.add(jScrollPane1, gridBagConstraints);

        LabelNivel.setText("Nivel:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(21, 30, 0, 0);
        jPanel1.add(LabelNivel, gridBagConstraints);

        SpinnerNivel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 0, 0, 0);
        jPanel1.add(SpinnerNivel, gridBagConstraints);

        BotonConsultar.setText("Consultar");
        BotonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonConsultarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 11;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 0, 30);
        jPanel1.add(BotonConsultar, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 9;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 30);
        jPanel1.add(jSeparator1, gridBagConstraints);

        LabelPostulantes.setText("Postulantes:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 0, 0);
        jPanel1.add(LabelPostulantes, gridBagConstraints);

        jScrollPane2.setViewportView(ListaPostulantes);
        ListaPostulantes.getAccessibleContext().setAccessibleParent(ListaPostulantes);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 359;
        gridBagConstraints.ipady = 114;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(6, 30, 0, 30);
        jPanel1.add(jScrollPane2, gridBagConstraints);

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(18, 30, 18, 30);
        jPanel1.add(BotonCancelar, gridBagConstraints);

        BotonExportar.setText("Exportar");
        BotonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExportarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(18, 20, 18, 30);
        jPanel1.add(BotonExportar, gridBagConstraints);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Manejador del evento al presionar el botón Consultar
    private void BotonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonConsultarActionPerformed
        limpiarListaPostulantes();
        Puesto puestoSelected = ListaPuestos.getSelectedValue();
        int nivel = (int) SpinnerNivel.getValue();
        ArrayList<Postulante> postulantes = miSistema.obtenerListaPostulantes();
        ArrayList<Entrevista> entrevistas = miSistema.obtenerListaEntrevistas();

        // Verifica si se ha seleccionado un puesto
        if (puestoSelected == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un puesto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Habilidad> habilidadesPuesto = puestoSelected.getHabilidadesRequeridas();
        
        // Procesamiento de postulantes según el puesto y nivel seleccionado
        ArrayList<Postulante> postulantesFiltrados = new ArrayList<>();
        if (entrevistas.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hasta el momento no hubo ninguna entrevista.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            for (Postulante p : postulantes) {
                for (Entrevista e : entrevistas) {
                    if (e.getPostulante().getCedula().equals(p.getCedula())) {
                        if (p.getTipoTrabajo().toLowerCase().equals(puestoSelected.getTipo().toLowerCase())) {
                            if (!postulantesFiltrados.contains(p)) {
                                postulantesFiltrados.add(p);
                            }

                        }
                    }

                }
            }
            postulantesFiltrados = OrdenarLista(postulantesFiltrados, entrevistas);

            ArrayList<Postulante> postulantesAceptados = new ArrayList<>();

            for (Postulante postulante : postulantesFiltrados) {
                int contador = 0;
                for (Habilidad habilidad : habilidadesPuesto) {
                    if (postulante.getHabilidades().keySet().toString().contains(habilidad.getTema())) {
                        int nivelPostulante = postulante.getNivelHabilidad(habilidad);
                        if (nivel <= nivelPostulante) {
                            contador++;
                        }

                    }
                }
                if (contador == habilidadesPuesto.size()) {
                    postulantesAceptados.add(postulante);
                }
            }
            postulantesAceptados.sort((Postulante p1, Postulante p2) -> {
                int cedula1 = Integer.parseInt(p1.getCedula());
                int cedula2 = Integer.parseInt(p2.getCedula());
                return Integer.compare(cedula1, cedula2);
            });
             // Mostrar resultados o mensaje de error si no hay postulantes adecuados
            if (postulantesAceptados.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay postulantes que cumplan con el nivel requerido para este puesto.", "Ningún postulante cumple los requisitos", JOptionPane.ERROR_MESSAGE);
            } else {
                 // Mostrar postulantes aceptados en la lista
                DefaultListModel<Postulante> modeloLista = new DefaultListModel<>();
                for (Postulante pAceptado : postulantesAceptados) {
                    modeloLista.addElement(pAceptado);
                }
                ListaPostulantes.setModel(modeloLista);
            }
            ultimoPuesto = puestoSelected;
        }
    }//GEN-LAST:event_BotonConsultarActionPerformed

    public void actualizar() {
        actualizarLista();
        limpiarListaPostulantes();
    }

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void BotonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExportarActionPerformed

        File archivo = new File("Consulta.txt");

        if (archivo.exists()) {
            archivo.delete();
        }

        if (ultimoPuesto == null) {
            JOptionPane.showMessageDialog(this, "Debes hacer una consulta antes de poder exportarla.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String puestoToString = "Puesto: " + ultimoPuesto.getNombre() + "\n";
        ListModel<Postulante> modeloLista = ListaPostulantes.getModel();
        for (int i = 0; i < modeloLista.getSize(); i++) {
            puestoToString += "Postulante número " + i + 1 + ") ";
            puestoToString = obtengoDatosPostulante(modeloLista.getElementAt(i), puestoToString);
        }
        guardar(puestoToString);

        JOptionPane.showMessageDialog(this, "Se ha exportado el archivo exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_BotonExportarActionPerformed

    // Obtengo datos del postulante.
    private String obtengoDatosPostulante(Postulante postulante, String puestoToString) {
        String Nombre = postulante.getNombre();
        String Cedula = postulante.getCedula();
        String Email = postulante.getEmail();
        puestoToString += Nombre + " - " + Cedula + " - " + Email + "\n";
        return puestoToString;
    }

    // Genero archivo consulta.txt y guardo la consulta.
    public void guardar(String puestoToString) {
        ArchivoGrabacion archivo = new ArchivoGrabacion("Consulta.txt", true); // true para extender
        archivo.grabarLinea(puestoToString);
        archivo.cerrar();
    }
    
    // Actualizar lista de Puestos.
    public void actualizarLista() {
        
        DefaultListModel<Puesto> modeloActualizar = new DefaultListModel<>();
        ArrayList<Puesto> puestos = miSistema.obtenerListaPuestos();
        for (Puesto p : puestos) {

            modeloActualizar.addElement(p);
        }
        ListaPuestos.setModel(modeloActualizar);
    }

    // Ordeno lista de postulantes segun puntuación de la entrevista.
    private ArrayList<Postulante> OrdenarLista(ArrayList<Postulante> listaPostulantes, ArrayList<Entrevista> entrevistas) {
        int n = listaPostulantes.size();
        Postulante temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
             
                if (obtenerUltimaPuntuacion(listaPostulantes.get(j - 1), entrevistas) < obtenerUltimaPuntuacion(listaPostulantes.get(j), entrevistas)) {
                    temp = listaPostulantes.get(j - 1);
                    listaPostulantes.set(j - 1, listaPostulantes.get(j));
                    listaPostulantes.set(j, temp);
                }
            }
        }
        return listaPostulantes;
    }

    // Obtengo ultima puntuación.
    private int obtenerUltimaPuntuacion(Postulante postulante, ArrayList<Entrevista> entrevistas) {
        int puntuacion = 0;
        for (Entrevista e : entrevistas) {
            if (postulante.equals(e.getPostulante())) {
                puntuacion = e.getPuntuacion();
            }
        }
        return puntuacion;
    }

    // Limpio lista postulantes.
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
