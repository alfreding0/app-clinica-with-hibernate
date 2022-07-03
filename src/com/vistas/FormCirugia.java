package com.vistas;

import com.dao.DaoCirugia;
import com.dao.DaoCirugiaMedico;
import com.pojos.Cirugia;
import com.pojos.CirugiaMedico;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alfreding0
 */
public class FormCirugia extends javax.swing.JFrame {

    /**
     * Creates new form FormCirugia
     */
    public static Cirugia cirugia = new Cirugia();
    DaoCirugia daoCirugia = new DaoCirugia();
     
    public static CirugiaMedico cirugiaMedico = new CirugiaMedico();
    DaoCirugiaMedico daoCirugiaMedico = new DaoCirugiaMedico();

    public FormCirugia() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtHora = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSecretaria = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        txtNroSala = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtIDMedico = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNombreMedico = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Medicos designados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 560, 39));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel2.setText("Fecha");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 148, 29));

        txtFecha.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 270, 29));

        txtHora.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 267, 29));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Hora");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 148, 29));

        txtSecretaria.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtSecretaria, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, 29));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Medico");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 70, 29));

        jButton1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 140, 40));

        jButton2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 140, 40));

        jButton3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 140, 40));

        jButton4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, 140, 40));

        txtID.setEditable(false);
        txtID.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 60, 29));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 800, 170));

        jButton5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton5.setText("Limpiar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 140, 40));

        txtNroSala.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtNroSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 267, 29));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Nro Sala");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 148, 29));

        jButton6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton6.setText("Buscar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 80, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 840, 10));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("C I R U G I A");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 560, 39));

        txtIDMedico.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtIDMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 90, 30));

        jButton7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton7.setText("Buscar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 80, 30));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Secretaria");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 148, 29));

        txtNombreMedico.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        getContentPane().add(txtNombreMedico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 200, 30));

        jButton8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jButton8.setText("Quitar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 150, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.insertarNuevo();
        this.mostrarDetalleMedicoCirugia();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.agregarMedicoADetalle();
        this.mostrarDetalleMedicoCirugia();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.modificarDatos();
        this.mostrarDetalleMedicoCirugia();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.eliminar();
        this.mostrarDetalleMedicoCirugia();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        this.copiarFilaACampoDeEdicion();
    }//GEN-LAST:event_tablaMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.limpiarCampos();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new FormSecretaria().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        new FormMedico().setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        this.quitarMedicoDeDetalle();
        this.mostrarDetalleMedicoCirugia();
    }//GEN-LAST:event_jButton8ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtID;
    public static javax.swing.JTextField txtIDMedico;
    public static javax.swing.JTextField txtNombreMedico;
    private javax.swing.JTextField txtNroSala;
    public static javax.swing.JTextField txtSecretaria;
    // End of variables declaration//GEN-END:variables

//************************CIRUGIA***********************************
    private void insertarNuevo() {
        cirugia = new Cirugia(cirugia.getSecretaria(), new Date(), new Date(), Integer.parseInt(txtNroSala.getText()));
        daoCirugia.insertarCirugia(cirugia);
        txtID.setText(String.valueOf(cirugia.getId()));
    }

    private void modificarDatos() {
        cirugia = new Cirugia(cirugia.getSecretaria(), new Date(), new Date(), Integer.parseInt(txtNroSala.getText()));
        cirugia.setId(Integer.parseInt(txtID.getText()));

        daoCirugia.modificarCirugia(cirugia);
    }

    private void eliminar() {
        cirugia.setId(Integer.parseInt(txtID.getText()));
        daoCirugia.eliminarCirugia(cirugia);
    }

    
    
    private void limpiarCampos() {
        txtID.setText("");
        txtFecha.setText("");
        txtHora.setText("");
        txtNroSala.setText("");
        txtSecretaria.setText("");
    }
    
    
    
    
    
    
    
    
    
//    ************************************DETALLE***************************************************
    private void mostrarDetalleMedicoCirugia() {
        List<CirugiaMedico> detalleListaMedicosDesignados = daoCirugiaMedico.getListaDetalleCirugiaMedicos(Integer.parseInt(txtID.getText()));

        DefaultTableModel model = new DefaultTableModel(null, new String[]{"ID", "COD.MEDICO", "NOMBRE COMPLETO"});

        detalleListaMedicosDesignados.forEach((obj) -> {
            model.addRow(new Object[]{obj.getId(), obj.getMedico().getId(), obj.getMedico().getNombres() + " " + obj.getMedico().getApellidos()});
        });
        
        tabla.setModel(model);
    }
    
    private void agregarMedicoADetalle() {
        cirugiaMedico = new CirugiaMedico(cirugia, cirugiaMedico.getMedico());
        daoCirugiaMedico.insertarCirugiaMedico(cirugiaMedico);
    }

    private void copiarFilaACampoDeEdicion() {
        int fila = tabla.getSelectedRow();
        if (fila > -1) {
            txtIDMedico.setText(tabla.getValueAt(fila, 0).toString());
            txtNombreMedico.setText(tabla.getValueAt(fila, 2).toString());
        }
    }

    private void quitarMedicoDeDetalle() {
        cirugiaMedico.setId(Integer.parseInt(txtIDMedico.getText()));
        daoCirugiaMedico.eliminarCirugiaMedico(cirugiaMedico);
    }
}