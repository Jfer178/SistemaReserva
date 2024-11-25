/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controladores.ControladoresEmpleados;
import Modelo1.Empleado;
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

public class RegistroEmpleado extends javax.swing.JFrame {

    private ControladoresEmpleados controladorEmpleado;
    private Empleado Emp;

    public RegistroEmpleado() {
        initComponents();

        Emp = new Empleado();
        controladorEmpleado = new ControladoresEmpleados(Emp, this);

        cargaropcionessexo();
        cargarProfesiones();

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
        TextIDEmplado = new javax.swing.JTextField();
        CODIGO = new javax.swing.JLabel();
        TextSalario = new javax.swing.JTextField();
        CAPACIDAD = new javax.swing.JLabel();
        TxtIDADMINISTRADOR = new javax.swing.JTextField();
        IDADMIN = new javax.swing.JLabel();
        ID1 = new javax.swing.JLabel();
        TextNombreEmplado = new javax.swing.JTextField();
        CODIGO1 = new javax.swing.JLabel();
        TextHraVuelo = new javax.swing.JTextField();
        IDADMIN1 = new javax.swing.JLabel();
        CajitaSexo = new javax.swing.JComboBox<>();
        CajitaProfesion = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTEmplado = new javax.swing.JTable();
        SALIR = new javax.swing.JButton();
        botonPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 2, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE EMPLEADOS");
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

        TextIDEmplado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextIDEmplado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIDEmpladoActionPerformed(evt);
            }
        });

        CODIGO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CODIGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CODIGO.setText("SALARIO");

        TextSalario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextSalario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextSalarioActionPerformed(evt);
            }
        });

        CAPACIDAD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CAPACIDAD.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CAPACIDAD.setText("PROFESION");

        TxtIDADMINISTRADOR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TxtIDADMINISTRADOR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TxtIDADMINISTRADOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIDADMINISTRADORActionPerformed(evt);
            }
        });

        IDADMIN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDADMIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDADMIN.setText("ID ADMIN");

        ID1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID1.setText("NOMBRE");

        TextNombreEmplado.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextNombreEmplado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextNombreEmplado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNombreEmpladoActionPerformed(evt);
            }
        });

        CODIGO1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CODIGO1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CODIGO1.setText("HRA VUELO");

        TextHraVuelo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextHraVuelo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TextHraVuelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextHraVueloActionPerformed(evt);
            }
        });

        IDADMIN1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDADMIN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDADMIN1.setText("SEXO");

        CajitaSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CajitaSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaSexoActionPerformed(evt);
            }
        });

        CajitaProfesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CajitaProfesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaProfesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextIDEmplado, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(IDADMIN1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajitaSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(CODIGO1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextHraVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TextNombreEmplado, javax.swing.GroupLayout.PREFERRED_SIZE, 419, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(IDADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtIDADMINISTRADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(CODIGO, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CAPACIDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CajitaProfesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ID, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CajitaSexo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextIDEmplado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(IDADMIN1)
                        .addComponent(CODIGO1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TextHraVuelo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDADMIN)
                    .addComponent(TxtIDADMINISTRADOR, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CODIGO)
                    .addComponent(TextSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAPACIDAD)
                    .addComponent(CajitaProfesion, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextNombreEmplado, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(ID1))
                .addGap(30, 30, 30))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 760, 160));

        JTEmplado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID EMPLEADO", "NOMBRE", "HRA VUELO", "SALARIO", "SEXO", "PROFESION", "ID ADMIN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTEmplado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTEmpladoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTEmplado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 760, 170));

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
        jPanel1.add(botonPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 560, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed

    }//GEN-LAST:event_AGREGARActionPerformed

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed

    }//GEN-LAST:event_EDITARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed

    }//GEN-LAST:event_LIMPIARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed

    }//GEN-LAST:event_BUSCARActionPerformed

    private void CARGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARGARActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();
        JTEmplado.setModel(modelo);
        String sql = "SELECT `IDEMPLEADOS`, `NOMBRE`, `HORAS_VUELO`, `SALARIO`, `SEXO`, `PROFESION`, `IDADMINISTRADOR` FROM `empleados`";

        try (Connection con = new conexionbasededatos().conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            modelo.addColumn("ID EMPLEADO");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("HRA VUELO");
            modelo.addColumn("SALARIO");
            modelo.addColumn("SEXO");
            modelo.addColumn("PROFESION");
            modelo.addColumn("ID ADMIN");

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

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed

    }//GEN-LAST:event_ELIMINARActionPerformed

    private void JTEmpladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTEmpladoMouseClicked
        try (Connection con = new conexionbasededatos().conectar()) {
            int fila = JTEmplado.getSelectedRow();
            String idAvion = JTEmplado.getValueAt(fila, 0).toString();
            String sql = "SELECT `IDEMPLEADOS`, `NOMBRE`, `HORAS_VUELO`, `SALARIO`, `SEXO`, `PROFESION`, `IDADMINISTRADOR` FROM `empleados` WHERE `IDEMPLEADOS` = ?";

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, idAvion);
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        TextIDEmplado.setText(rs.getString("IDEMPLEADOS"));
                        TextNombreEmplado.setText(rs.getString("NOMBRE"));
                        TextHraVuelo.setText(rs.getString("HORAS_VUELO"));
                        TextSalario.setText(rs.getString("SALARIO"));
                        CajitaSexo.setSelectedItem(rs.getString("SEXO"));
                        CajitaProfesion.setSelectedItem(rs.getString("PROFESION"));
                        TxtIDADMINISTRADOR.setText(rs.getString("IDADMINISTRADOR"));
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR DATOS DEL EMPLADO: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JTEmpladoMouseClicked

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        PantAdminitrador adminPanel = new PantAdminitrador();
        adminPanel.setVisible(true); // Muestra el panel de administrador
        dispose();
    }//GEN-LAST:event_SALIRActionPerformed

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
                parrafo.add(" REGISTROS DE EMPLEADOS \n\n");

                // Agregar la fecha y hora
                Paragraph fechaParrafo = new Paragraph("Fecha y hora de creación: " + fechaHora);
                fechaParrafo.setAlignment(Paragraph.ALIGN_TOP);
                fechaParrafo.setSpacingAfter(10); // Espacio entre la fecha y el contenido

                documento.add(header);
                documento.add(parrafo);
                documento.add(fechaParrafo); // Agregar la fecha y hora
                documento.add(Chunk.NEWLINE);

                // Crear la tabla con 7 columnas (corregido de 6 a 7)
                PdfPTable table = new PdfPTable(7);
                table.setWidthPercentage(100);

                // Celdas del encabezado
                PdfPCell IDEMPLEADOS = new PdfPCell(new Phrase("ID EMPLEADOS"));
                IDEMPLEADOS.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell NOMBRE = new PdfPCell(new Phrase("NOMBRE"));
                NOMBRE.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell HORAS_VUELO = new PdfPCell(new Phrase("HRA VUELO"));
                HORAS_VUELO.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell SALARIO = new PdfPCell(new Phrase("SALARIO"));
                SALARIO.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell SEXO = new PdfPCell(new Phrase("SEXO"));
                SEXO.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell PROFESION = new PdfPCell(new Phrase("PROFESION"));
                PROFESION.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell IDADMINISTRADOR = new PdfPCell(new Phrase("ID ADMIN"));
                IDADMINISTRADOR.setBackgroundColor(BaseColor.YELLOW);

                // Agregar celdas al encabezado
                table.addCell(IDEMPLEADOS);
                table.addCell(NOMBRE);
                table.addCell(HORAS_VUELO);
                table.addCell(SALARIO);
                table.addCell(SEXO);
                table.addCell(PROFESION);
                table.addCell(IDADMINISTRADOR);

                // Obtener los registros desde la base de datos
                try {
                    Connection con = new conexionbasededatos().conectar();
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM empleados");
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        // Agregar los datos de cada fila
                        table.addCell(rs.getString("IDEMPLEADOS")); // Cambia por el nombre de la columna si es necesario
                        table.addCell(rs.getString("NOMBRE"));
                        table.addCell(rs.getString("HORAS_VUELO"));
                        table.addCell(rs.getString("SALARIO"));
                        table.addCell(rs.getString("SEXO"));
                        table.addCell(rs.getString("PROFESION"));
                        table.addCell(rs.getString("IDADMINISTRADOR"));
                    }

                    // Agregar la tabla al documento
                    documento.add(table);

                } catch (DocumentException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR EN CONEXION: " + e);
                }

                // Cerrar el documento
                documento.close();
                JOptionPane.showMessageDialog(null, "REPORTE EMPLEADOS CREADO :)");
            } catch (DocumentException | FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN PDF: " + e);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN LA IMAGEN: " + e);
            }
        }
    }//GEN-LAST:event_botonPDFActionPerformed

    private void TxtIDADMINISTRADORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIDADMINISTRADORActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIDADMINISTRADORActionPerformed

    private void TextSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextSalarioActionPerformed

    private void TextIDEmpladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIDEmpladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIDEmpladoActionPerformed

    private void TextNombreEmpladoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNombreEmpladoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNombreEmpladoActionPerformed

    private void TextHraVueloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextHraVueloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextHraVueloActionPerformed

    private void CajitaSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaSexoActionPerformed


    }//GEN-LAST:event_CajitaSexoActionPerformed

    private void CajitaProfesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaProfesionActionPerformed


    }//GEN-LAST:event_CajitaProfesionActionPerformed

    private void cargaropcionessexo() {

        Connection con = new conexionbasededatos().conectar();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();

            // Consulta para obtener los valores del campo ENUM
            rs = stmt.executeQuery("SHOW COLUMNS FROM empleados LIKE 'SEXO'");

            if (rs.next()) {
                String enumType = rs.getString("Type");
                System.out.println("ENUM type for SEXO: " + enumType);  // Ver la definición de tipo ENUM

                enumType = enumType.replace("enum(", "").replace(")", "");
                String[] enumValues = enumType.split(",");

                CajitaSexo.removeAllItems(); // Limpiar el JComboBox
                CajitaSexo.addItem("ESCOGER");

                // Agregar los valores al JComboBox
                for (String value : enumValues) {
                    value = value.replace("'", "").trim(); // Limpiar comillas
                    CajitaSexo.addItem(value);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR TIPOS DE SEXO: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
                    con.close();  // Cerrar la conexión aquí
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "ERROR AL CERRAR RECURSOS: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

    }

    private void cargarProfesiones() {

        Connection con = new conexionbasededatos().conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Consulta para obtener los valores del campo ENUM
            String sql = "SHOW COLUMNS FROM empleados LIKE 'PROFESION'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                String enumType = rs.getString("Type");
                System.out.println("ENUM type for PROFESION: " + enumType);  // Ver la definición de tipo ENUM

                enumType = enumType.replace("enum(", "").replace(")", "");
                String[] enumValues = enumType.split(",");

                CajitaProfesion.removeAllItems(); // Limpiar el JComboBox
                CajitaProfesion.addItem("ESCOGER");

                // Agregar los valores al JComboBox
                for (String value : enumValues) {
                    value = value.replace("'", "").trim(); // Limpiar comillas
                    CajitaProfesion.addItem(value);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR TIPOS DE PROFESION: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
                    con.close();  // Cerrar la conexión aquí
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "ERROR AL CERRAR RECURSOS: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
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
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroEmpleado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AGREGAR;
    public javax.swing.JButton BUSCAR;
    private javax.swing.JLabel CAPACIDAD;
    public javax.swing.JButton CARGAR;
    private javax.swing.JLabel CODIGO;
    private javax.swing.JLabel CODIGO1;
    public javax.swing.JComboBox<String> CajitaProfesion;
    public javax.swing.JComboBox<String> CajitaSexo;
    public javax.swing.JButton EDITAR;
    public javax.swing.JButton ELIMINAR;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel IDADMIN;
    private javax.swing.JLabel IDADMIN1;
    public javax.swing.JTable JTEmplado;
    public javax.swing.JButton LIMPIAR;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField TextHraVuelo;
    public javax.swing.JTextField TextIDEmplado;
    public javax.swing.JTextField TextNombreEmplado;
    public javax.swing.JTextField TextSalario;
    public javax.swing.JTextField TxtIDADMINISTRADOR;
    private javax.swing.JButton botonPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelderelleno;
    // End of variables declaration//GEN-END:variables
}
