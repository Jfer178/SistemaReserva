/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controladores.ControladorAvion;
import Modelo1.Avion;
import Controladores.conexionbasededatos;
import java.sql.Statement;
import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.Phrase;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class RegistroAvion extends javax.swing.JFrame {

    private ControladorAvion controlador;
    private Avion fcol;

    public RegistroAvion() {

        initComponents();

        fcol = new Avion();
        controlador = new ControladorAvion(fcol, this); // Pasa las instancias al controlador

        cargarOpcionesTipo();
        cargarOpcionesModelo();
        obtenerSiguienteIDAvion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        AGREGAR = new javax.swing.JButton();
        EDITAR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        CARGAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        panelderelleno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        ID = new javax.swing.JLabel();
        TextIDavion = new javax.swing.JTextField();
        MODELO = new javax.swing.JLabel();
        TIPO = new javax.swing.JLabel();
        CODIGO = new javax.swing.JLabel();
        TextCodigo = new javax.swing.JTextField();
        CAPACIDAD = new javax.swing.JLabel();
        TextCapacidad = new javax.swing.JTextField();
        CajitaOpcinesTipo = new javax.swing.JComboBox<>();
        CajitaOpcionesModelo = new javax.swing.JComboBox<>();
        TxtIDADMINISTRADOR = new javax.swing.JTextField();
        IDADMIN = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTAvion = new javax.swing.JTable();
        SALIR = new javax.swing.JButton();
        botonPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 2, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE AVIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 430, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        AGREGAR.setText("AGREGAR");
        AGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGREGARActionPerformed(evt);
            }
        });

        EDITAR.setText("EDITAR");
        EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EDITARActionPerformed(evt);
            }
        });

        LIMPIAR.setText("LIMPIAR");
        LIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPIARActionPerformed(evt);
            }
        });

        BUSCAR.setText("BUSCAR");
        BUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUSCARActionPerformed(evt);
            }
        });

        CARGAR.setText("CARGAR");
        CARGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARGARActionPerformed(evt);
            }
        });

        ELIMINAR.setText("ELIMINAR");
        ELIMINAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ELIMINARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(CARGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(AGREGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(EDITAR, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(ELIMINAR, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(BUSCAR)
                .addGap(38, 38, 38)
                .addComponent(LIMPIAR)
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AGREGAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CARGAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EDITAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(LIMPIAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BUSCAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ELIMINAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 760, 50));

        panelderelleno.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelderellenoLayout = new javax.swing.GroupLayout(panelderelleno);
        panelderelleno.setLayout(panelderellenoLayout);
        panelderellenoLayout.setHorizontalGroup(
            panelderellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 910, Short.MAX_VALUE)
        );
        panelderellenoLayout.setVerticalGroup(
            panelderellenoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        jPanel1.add(panelderelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 910, 20));

        jLabel2.setFont(new java.awt.Font("Agbalumo", 0, 26)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Datos del Avion");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 210, 30));

        jLabel3.setFont(new java.awt.Font("Agbalumo", 0, 26)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Opciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, 30));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID.setText("ID ");

        TextIDavion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextIDavion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIDavionActionPerformed(evt);
            }
        });

        MODELO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MODELO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MODELO.setText("MODELO");

        TIPO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TIPO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TIPO.setText("TIPO");

        CODIGO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CODIGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CODIGO.setText("CODIGO");

        TextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCodigoActionPerformed(evt);
            }
        });

        CAPACIDAD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CAPACIDAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CAPACIDAD.setText("CAPACIDAD");

        TextCapacidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextCapacidadActionPerformed(evt);
            }
        });

        CajitaOpcinesTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaOpcinesTipoActionPerformed(evt);
            }
        });

        CajitaOpcionesModelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CajitaOpcionesModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaOpcionesModeloActionPerformed(evt);
            }
        });

        TxtIDADMINISTRADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDADMINISTRADORActionPerformed(evt);
            }
        });

        IDADMIN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDADMIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDADMIN.setText("ID ADMIN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(IDADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtIDADMINISTRADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAPACIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextIDavion, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(MODELO, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajitaOpcionesModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajitaOpcinesTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TIPO, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(MODELO)
                    .addComponent(ID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextIDavion)
                    .addComponent(CajitaOpcinesTipo)
                    .addComponent(CajitaOpcionesModelo))
                .addGap(25, 25, 25)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CAPACIDAD)
                        .addComponent(TextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CODIGO)
                        .addComponent(TxtIDADMINISTRADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(IDADMIN))
                    .addComponent(TextCapacidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 760, 120));

        JTAvion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID AVION", "ID ADMIN", "CODIGO", "TIPO", "MODELO", "CAPACIDAD"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTAvion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTAvionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTAvion);
        if (JTAvion.getColumnModel().getColumnCount() > 0) {
            JTAvion.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 760, 170));

        SALIR.setBackground(new java.awt.Color(255, 51, 51));
        SALIR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 255, 255));
        SALIR.setText("<");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanel1.add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 30));

        botonPDF.setBackground(new java.awt.Color(0, 102, 255));
        botonPDF.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        botonPDF.setForeground(new java.awt.Color(255, 255, 255));
        botonPDF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pdfimagen.png"))); // NOI18N
        botonPDF.setText("PDF");
        botonPDF.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonPDF.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        botonPDF.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        botonPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPDFActionPerformed(evt);
            }
        });
        jPanel1.add(botonPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 510, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed

        obtenerSiguienteIDAvion();
    }//GEN-LAST:event_AGREGARActionPerformed

    private void CARGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARGARActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();
        JTAvion.setModel(modelo);
        String sql = "SELECT `IDAVION`, `IDADMINISTRADOR`, `CODIGO`, `TIPO`, `MODELO`, `CAPACIDAD` FROM `avion`";

        try (Connection con = new conexionbasededatos().conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            modelo.addColumn("IDADVION");
            modelo.addColumn("IDADMIN");
            modelo.addColumn("CODIGO");
            modelo.addColumn("TIPO");
            modelo.addColumn("MODELO");
            modelo.addColumn("CAPACIDAD");

            while (rs.next()) {
                Object[] fila = new Object[modelo.getColumnCount()];
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    fila[i] = rs.getObject(i + 1);
                }
                modelo.addRow(fila);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR DATOS: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CARGARActionPerformed

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed


    }//GEN-LAST:event_EDITARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed


    }//GEN-LAST:event_LIMPIARActionPerformed

    private void TextIDavionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIDavionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIDavionActionPerformed

    private void TextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCodigoActionPerformed

    private void TextCapacidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextCapacidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextCapacidadActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed


    }//GEN-LAST:event_BUSCARActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        PantAdminitrador adminPanel = new PantAdminitrador();
        adminPanel.setVisible(true); // Muestra el panel de administrador
        dispose();
    }//GEN-LAST:event_SALIRActionPerformed

    private void CajitaOpcinesTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaOpcinesTipoActionPerformed


    }//GEN-LAST:event_CajitaOpcinesTipoActionPerformed

    private void JTAvionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTAvionMouseClicked
        try (Connection con = new conexionbasededatos().conectar()) {
            int fila = JTAvion.getSelectedRow();
            String idAvion = JTAvion.getValueAt(fila, 0).toString();
            String sql = "SELECT `IDAVION`, `IDADMINISTRADOR` , `CODIGO`, `TIPO`, `MODELO`, `CAPACIDAD` FROM `avion` WHERE `IDAVION` = ?";

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, idAvion);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        TextIDavion.setText(rs.getString("IDAVION"));
                        TxtIDADMINISTRADOR.setText(rs.getString("IDADMINISTRADOR"));
                        TextCodigo.setText(rs.getString("CODIGO"));
                        CajitaOpcinesTipo.setSelectedItem(rs.getString("TIPO"));
                        CajitaOpcionesModelo.setSelectedItem(rs.getString("MODELO"));
                        TextCapacidad.setText(rs.getString("CAPACIDAD"));
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR DATOS DEL AVIÓN: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JTAvionMouseClicked

    private void CajitaOpcionesModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaOpcionesModeloActionPerformed


    }//GEN-LAST:event_CajitaOpcionesModeloActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed


    }//GEN-LAST:event_ELIMINARActionPerformed

    private void TxtIDADMINISTRADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDADMINISTRADORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDADMINISTRADORActionPerformed

    private void botonPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPDFActionPerformed

        Document documento = new Document();

        // Crear un JFileChooser
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Documents", "pdf");
        fileChooser.setFileFilter(filter);
        fileChooser.setDialogTitle("Guardar PDF");

        // Mostrar el diálogo para guardar
        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            // Asegúrate de que el archivo tenga la extensión .pdf
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.toLowerCase().endsWith(".pdf")) {
                filePath += ".pdf";
            }

            try {
                PdfWriter.getInstance(documento, new FileOutputStream(filePath));

                // Obtener la fecha y la hora
                SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String fechaHora = sdf.format(new Date());

                documento.open();

                Image header = Image.getInstance("C:/Users/Jere/Documents/NetBeansProjects/SRV/src/imagenes/4-removebg-preview_1.png");
                header.scaleToFit(300, 200);
                header.setAlignment(Chunk.ALIGN_RIGHT);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_BASELINE);
                parrafo.add("FORMATO CREADO POR FCOL AirLines ® \n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
                parrafo.add(" REGISTROS DE AVIONES \n\n");

                // Agregar la fecha y hora
                Paragraph fechaParrafo = new Paragraph("Fecha y hora de creación: " + fechaHora);
                fechaParrafo.setAlignment(Paragraph.ALIGN_TOP);
                fechaParrafo.setSpacingAfter(10); // Espacio entre la fecha y el contenido

                documento.add(header);
                documento.add(parrafo);
                documento.add(fechaParrafo); // Agregar la fecha y hora
                documento.add(Chunk.NEWLINE);

                PdfPTable table = new PdfPTable(6);
                table.setWidthPercentage(100);
                PdfPCell idavion = new PdfPCell(new Phrase("IDAVION"));
                idavion.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell idadmin = new PdfPCell(new Phrase("IDADMINISTRADOR"));
                idadmin.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell codigo = new PdfPCell(new Phrase("CODIGO"));
                codigo.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell tipo = new PdfPCell(new Phrase("TIPO"));
                tipo.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell modelo = new PdfPCell(new Phrase("MODELO"));
                modelo.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell capacidad = new PdfPCell(new Phrase("CAPACIDAD"));
                capacidad.setBackgroundColor(BaseColor.YELLOW);

                table.addCell(idavion);
                table.addCell(idadmin);
                table.addCell(codigo);
                table.addCell(tipo);
                table.addCell(modelo);
                table.addCell(capacidad);

                try {
                    Connection con = new conexionbasededatos().conectar();
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM avion ");
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        table.addCell(rs.getString(1));
                        table.addCell(rs.getString(2));
                        table.addCell(rs.getString(3));
                        table.addCell(rs.getString(4));
                        table.addCell(rs.getString(5));
                        table.addCell(rs.getString(6));
                    }

                    documento.add(table);

                } catch (DocumentException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR EN CONEXION: " + e);
                }

                documento.close();
                JOptionPane.showMessageDialog(null, "REPORTE AVION CREADO :)");
            } catch (DocumentException | FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN PDF: " + e);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN LA IMAGEN: " + e);
            }
        }
    }//GEN-LAST:event_botonPDFActionPerformed

    private void cargarOpcionesTipo() {
        Connection con = new conexionbasededatos().conectar();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();

            // Consulta para obtener los valores del campo ENUM
            rs = stmt.executeQuery("SHOW COLUMNS FROM avion LIKE 'TIPO'");

            if (rs.next()) {
                String enumType = rs.getString("Type");
                enumType = enumType.replace("enum(", "").replace(")", "");
                String[] enumValues = enumType.split(",");

                CajitaOpcinesTipo.removeAllItems(); // Limpiar el JComboBox

                CajitaOpcinesTipo.addItem("ESCOGER");
                // Agregar los valores al JComboBox
                for (String value : enumValues) {
                    value = value.replace("'", "").trim(); // Limpiar comillas
                    CajitaOpcinesTipo.addItem(value);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR TIPOS: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close(); // Cerrar la conexión aquí
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "ERROR AL CERRAR RECURSOS: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cargarOpcionesModelo() {
        Connection con = new conexionbasededatos().conectar();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Consulta para obtener los valores del campo ENUM
            String sql = "SHOW COLUMNS FROM avion LIKE 'MODELO'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                String enumType = rs.getString("Type");
                enumType = enumType.replace("enum(", "").replace(")", "");
                String[] enumValues = enumType.split(",");

                CajitaOpcionesModelo.removeAllItems(); // Limpiar el JComboBox
                CajitaOpcionesModelo.addItem("ESCOGER");

                // Agregar los valores al JComboBox
                for (String value : enumValues) {
                    value = value.replace("'", "").trim(); // Limpiar comillas
                    CajitaOpcionesModelo.addItem(value);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR MODELOS: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            // Cerrar recursos
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (con != null) {
                    con.close(); // Cerrar la conexión aquí
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "ERROR AL CERRAR RECURSOS: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void obtenerSiguienteIDAvion() {
        String sql = "SELECT MAX(IDAVION) AS maxID FROM avion";
        try (Connection con = new conexionbasededatos().conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                int nextID = rs.getInt("maxID") + 1; // Sumar 1 al máximo ID actual
                TextIDavion.setText(String.valueOf(nextID)); // Establecer el siguiente ID en el campo
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL OBTENER EL SIGUIENTE ID: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
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
            java.util.logging.Logger.getLogger(RegistroAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroAvion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

    

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroAvion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AGREGAR;
    public javax.swing.JButton BUSCAR;
    private javax.swing.JLabel CAPACIDAD;
    public javax.swing.JButton CARGAR;
    private javax.swing.JLabel CODIGO;
    public javax.swing.JComboBox<String> CajitaOpcinesTipo;
    public javax.swing.JComboBox<String> CajitaOpcionesModelo;
    public javax.swing.JButton EDITAR;
    public javax.swing.JButton ELIMINAR;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IDADMIN;
    public javax.swing.JTable JTAvion;
    public javax.swing.JButton LIMPIAR;
    private javax.swing.JLabel MODELO;
    public javax.swing.JButton SALIR;
    private javax.swing.JLabel TIPO;
    public javax.swing.JTextField TextCapacidad;
    public javax.swing.JTextField TextCodigo;
    public javax.swing.JTextField TextIDavion;
    public javax.swing.JTextField TxtIDADMINISTRADOR;
    private javax.swing.JButton botonPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelderelleno;
    // End of variables declaration//GEN-END:variables
}
