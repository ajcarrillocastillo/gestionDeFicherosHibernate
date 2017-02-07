/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestionDeMovimientos.vista;

import gestionDeMovimientos.controlador.ControladorInsertardoDeMovimientos;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author jesus
 */
public class JDialogInsertadoMovimientos extends javax.swing.JDialog {
    private boolean flagImporteMovimiento = false;
    private boolean flagFechaMovimiento = false;
    private boolean flagDescripcionMovimiento = false;
     private ControladorInsertardoDeMovimientos controladorAnnadirMovimientos;
    public JDialogInsertadoMovimientos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelInsertarMovimiento = new javax.swing.JLabel();
        jComboBoxNumeroDeEmpleado = new javax.swing.JComboBox();
        jTextFieldImporte = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox();
        jTextFieldFecha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescripcion = new javax.swing.JTextArea();
        jButtonInsertar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelInsertarMovimiento.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelInsertarMovimiento.setText("Insertar Movimiento");

        jComboBoxNumeroDeEmpleado.setToolTipText("Numero de Empleado");

        jTextFieldImporte.setForeground(new java.awt.Color(126, 126, 126));
        jTextFieldImporte.setText("Importe");
        jTextFieldImporte.setToolTipText("Importe de Movimiento");
        jTextFieldImporte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldImporteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldImporteFocusLost(evt);
            }
        });
        jTextFieldImporte.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldImporteKeyTyped(evt);
            }
        });

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Gasto", "Ingreso" }));
        jComboBoxTipo.setToolTipText("Tipo de Movimiento");

        jTextFieldFecha.setForeground(new java.awt.Color(126, 126, 126));
        jTextFieldFecha.setText("20/01/2000");
        jTextFieldFecha.setToolTipText("Fecha De Movimiento");
        jTextFieldFecha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldFechaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextFieldFechaFocusLost(evt);
            }
        });

        jTextAreaDescripcion.setColumns(20);
        jTextAreaDescripcion.setForeground(new java.awt.Color(126, 126, 126));
        jTextAreaDescripcion.setRows(5);
        jTextAreaDescripcion.setText("Descripción");
        jTextAreaDescripcion.setToolTipText("Descripción de movimiento");
        jTextAreaDescripcion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextAreaDescripcionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextAreaDescripcionFocusLost(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaDescripcion);

        jButtonInsertar.setText("Insertar");
        jButtonInsertar.setToolTipText("Insertar Movimiento en la BDD");
        jButtonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInsertarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(39, 39, 39)
                            .addComponent(jComboBoxNumeroDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jButtonInsertar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabelInsertarMovimiento)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelInsertarMovimiento)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxNumeroDeEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonInsertar)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAreaDescripcionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionFocusGained
        flagDescripcionMovimiento = controladorAnnadirMovimientos.VaciarCampos(jTextAreaDescripcion, flagDescripcionMovimiento);
    }//GEN-LAST:event_jTextAreaDescripcionFocusGained

    private void jTextAreaDescripcionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextAreaDescripcionFocusLost
        if (jTextFieldFecha.getText().isEmpty()) {
            flagDescripcionMovimiento = controladorAnnadirMovimientos.RellenarCampos("Descripción", jTextAreaDescripcion, flagDescripcionMovimiento);

        }
    }//GEN-LAST:event_jTextAreaDescripcionFocusLost

    private void jTextFieldImporteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldImporteFocusGained
        flagImporteMovimiento = controladorAnnadirMovimientos.VaciarCampos(jTextFieldImporte, flagImporteMovimiento);
    }//GEN-LAST:event_jTextFieldImporteFocusGained

    private void jTextFieldImporteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldImporteFocusLost
        if (jTextFieldImporte.getText().isEmpty()) {
            flagImporteMovimiento = controladorAnnadirMovimientos.RellenarCampos("Importe", jTextFieldImporte, flagImporteMovimiento);

        }
    }//GEN-LAST:event_jTextFieldImporteFocusLost

    private void jTextFieldImporteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldImporteKeyTyped
        controladorAnnadirMovimientos.limitadorNumeros(evt);
    }//GEN-LAST:event_jTextFieldImporteKeyTyped

    private void jTextFieldFechaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFechaFocusGained
        flagFechaMovimiento = controladorAnnadirMovimientos.VaciarCampos(jTextFieldFecha, flagFechaMovimiento);
    }//GEN-LAST:event_jTextFieldFechaFocusGained

    private void jTextFieldFechaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldFechaFocusLost
        if (jTextFieldFecha.getText().isEmpty()) {
            flagFechaMovimiento = controladorAnnadirMovimientos.RellenarCampos("20/01/2000", jTextFieldFecha, flagFechaMovimiento);

        }
    }//GEN-LAST:event_jTextFieldFechaFocusLost

    private void jButtonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertarActionPerformed
        flagDescripcionMovimiento = controladorAnnadirMovimientos.VaciarCampos(jTextAreaDescripcion, flagDescripcionMovimiento);
        flagFechaMovimiento = controladorAnnadirMovimientos.VaciarCampos(jTextFieldFecha, flagFechaMovimiento);
        flagImporteMovimiento = controladorAnnadirMovimientos.VaciarCampos(jTextFieldImporte, flagImporteMovimiento);
        
         boolean control = controladorAnnadirMovimientos.insertarDatosMovimientos();
         if (control == false) {
            if (jTextAreaDescripcion.getText().isEmpty()) {
                flagDescripcionMovimiento = controladorAnnadirMovimientos.RellenarCampos("Descripción", jTextAreaDescripcion, flagDescripcionMovimiento);

            }
            if (jTextFieldFecha.getText().isEmpty()) {
                flagFechaMovimiento = controladorAnnadirMovimientos.RellenarCampos("20/01/2000", jTextFieldFecha, flagFechaMovimiento);

            }
            if (jTextFieldImporte.getText().isEmpty()) {
                flagImporteMovimiento = controladorAnnadirMovimientos.RellenarCampos("Importe", jTextFieldImporte, flagImporteMovimiento);

            }
           
         }else {
            flagDescripcionMovimiento = controladorAnnadirMovimientos.RellenarCampos("Descripción", jTextAreaDescripcion, flagDescripcionMovimiento);
            flagFechaMovimiento = controladorAnnadirMovimientos.RellenarCampos("20/01/2000", jTextFieldFecha, flagFechaMovimiento);
            flagImporteMovimiento = controladorAnnadirMovimientos.RellenarCampos("Importe", jTextFieldImporte, flagImporteMovimiento);
           
         }
    }//GEN-LAST:event_jButtonInsertarActionPerformed


    public boolean isFlagImporteMovimiento() {
        return flagImporteMovimiento;
    }

    public void setFlagImporteMovimiento(boolean flagImporteMovimiento) {
        this.flagImporteMovimiento = flagImporteMovimiento;
    }

    public boolean isFlagFechaMovimiento() {
        return flagFechaMovimiento;
    }

    public void setFlagFechaMovimiento(boolean flagFechaMovimiento) {
        this.flagFechaMovimiento = flagFechaMovimiento;
    }

    public JButton getjButtonInsertar() {
        return jButtonInsertar;
    }

    public void setjButtonInsertar(JButton jButtonInsertar) {
        this.jButtonInsertar = jButtonInsertar;
    }

    public JComboBox getjComboBoxNumeroDeEmpleado() {
        return jComboBoxNumeroDeEmpleado;
    }

    public void setjComboBoxNumeroDeEmpleado(JComboBox jComboBoxNumeroDeEmpleado) {
        this.jComboBoxNumeroDeEmpleado = jComboBoxNumeroDeEmpleado;
    }

    public JComboBox getjComboBoxTipo() {
        return jComboBoxTipo;
    }

    public void setjComboBoxTipo(JComboBox jComboBoxTipo) {
        this.jComboBoxTipo = jComboBoxTipo;
    }

    public JTextArea getjTextAreaDescripcion() {
        return jTextAreaDescripcion;
    }

    public void setjTextAreaDescripcion(JTextArea jTextAreaDescripcion) {
        this.jTextAreaDescripcion = jTextAreaDescripcion;
    }

    public JTextField getjTextFieldFecha() {
        return jTextFieldFecha;
    }

    public void setjTextFieldFecha(JTextField jTextFieldFecha) {
        this.jTextFieldFecha = jTextFieldFecha;
    }

    public JTextField getjTextFieldImporte() {
        return jTextFieldImporte;
    }

    public void setjTextFieldImporte(JTextField jTextFieldImporte) {
        this.jTextFieldImporte = jTextFieldImporte;
    }

    public void setControladorAnnadirMovimientos(ControladorInsertardoDeMovimientos controladorAnnadirMovimientos) {
        this.controladorAnnadirMovimientos = controladorAnnadirMovimientos;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JDialogInsertadoMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDialogInsertadoMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDialogInsertadoMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDialogInsertadoMovimientos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDialogInsertadoMovimientos dialog = new JDialogInsertadoMovimientos(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonInsertar;
    private javax.swing.JComboBox jComboBoxNumeroDeEmpleado;
    private javax.swing.JComboBox jComboBoxTipo;
    private javax.swing.JLabel jLabelInsertarMovimiento;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescripcion;
    private javax.swing.JTextField jTextFieldFecha;
    private javax.swing.JTextField jTextFieldImporte;
    // End of variables declaration//GEN-END:variables

}