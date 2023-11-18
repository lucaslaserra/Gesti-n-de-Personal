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

public class ConsultaPuesto extends javax.swing.JFrame {

    private Sistema miSistema;
    private Puesto ultimoPuesto = null;

    public ConsultaPuesto(Sistema sistema) {

        miSistema = sistema;
        initComponents();
        DefaultListModel<Postulante> modeloInicio = new DefaultListModel<>();
        ListaPostulantes.setModel(modeloInicio);
        actualizarLista();
        setLocationRelativeTo(null);
    }


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

        LabelPostulantes.setText("Postulantes:");

        jScrollPane2.setViewportView(ListaPostulantes);
        ListaPostulantes.getAccessibleContext().setAccessibleParent(ListaPostulantes);

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

        if (puestoSelected == null) {
            JOptionPane.showMessageDialog(this, "Seleccione un puesto.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        ArrayList<Habilidad> habilidadesPuesto = puestoSelected.getHabilidadesRequeridas();

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
//            System.out.println("Entra en el for final");
                int contador = 0;
//            System.out.println("Postulante filtrado en el for:" +postulante.getNombre());
//            System.out.println("Habilidades del postulante en el for:" +postulante.getHabilidades().toString());
                for (Habilidad habilidad : habilidadesPuesto) {
//                System.out.println("Habilidad " + habilidad);
                    if (postulante.getHabilidades().keySet().toString().contains(habilidad.getTema())) {
//                    System.out.println("Postulantes que contienen habilidad" + postulante.getNombre());
                        int nivelPostulante = postulante.getNivelHabilidad(habilidad);
//                    System.out.println(nivelPostulante);
                        if (nivel <= nivelPostulante) {
//                        System.out.println("Postulantes aceptados" + postulante.getNombre());
                            contador++;
                        }

                    }
                }
                if (contador == habilidadesPuesto.size()) {
                    postulantesAceptados.add(postulante);
                }
            }

            if (postulantesAceptados.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Los postulantes que se registraron no cumplen el nivel de requisito para el puesto", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultListModel<Postulante> modeloLista = new DefaultListModel<>();
                for (Postulante pAceptado : postulantesAceptados) {
                    modeloLista.addElement(pAceptado);
                }
                ListaPostulantes.setModel(modeloLista);
            }
            ultimoPuesto = puestoSelected;
        }
    }//GEN-LAST:event_BotonConsultarActionPerformed

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

    private String obtengoDatosPostulante(Postulante postulante, String puestoToString) {
        String Nombre = postulante.getNombre();
        String Cedula = postulante.getCedula();
        String Email = postulante.getEmail();
        puestoToString += Nombre + " - " + Cedula + " - " + Email + "\n";
        return puestoToString;
    }

    public void guardar(String puestoToString) {
        ArchivoGrabacion archivo = new ArchivoGrabacion("Consulta.txt", true); // true para extender
        archivo.grabarLinea(puestoToString);
        archivo.cerrar();
    }

    public void actualizarLista() {
        DefaultListModel<Puesto> modeloActualizar = new DefaultListModel<>();
        ArrayList<Puesto> puestos = miSistema.obtenerListaPuestos();
        for (Puesto p : puestos) {

            modeloActualizar.addElement(p);
        }
        ListaPuestos.setModel(modeloActualizar);
    }

    private ArrayList<Postulante> OrdenarLista(ArrayList<Postulante> listaPostulantes, ArrayList<Entrevista> entrevistas) {
        int n = listaPostulantes.size();
        Postulante temp;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                System.out.println("Comparo " + obtenerUltimaPuntuacion(listaPostulantes.get(j - 1), entrevistas) + " con " + obtenerUltimaPuntuacion(listaPostulantes.get(j), entrevistas));
                if (obtenerUltimaPuntuacion(listaPostulantes.get(j - 1), entrevistas) < obtenerUltimaPuntuacion(listaPostulantes.get(j), entrevistas)) {
                    temp = listaPostulantes.get(j - 1);
                    listaPostulantes.set(j - 1, listaPostulantes.get(j));
                    listaPostulantes.set(j, temp);
                }
            }
        }
        return listaPostulantes;
    }

    private int obtenerUltimaPuntuacion(Postulante postulante, ArrayList<Entrevista> entrevistas) {
        int puntuacion = 0;
        for (Entrevista e : entrevistas) {
            if (postulante.equals(e.getPostulante())) {
                puntuacion = e.getPuntuacion();
            }
        }
        return puntuacion;
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
