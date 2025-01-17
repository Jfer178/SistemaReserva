/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controladores.conexionbasededatos;
import Controladores.ControladorUsuario;
import Modelo1.Usuario;
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

/**
 *
 * @author Jere
 */
public class RegistroClientes extends javax.swing.JFrame {

    private ControladorUsuario controlador;
    private Usuario fcol;

    public RegistroClientes() {
        initComponents();

        fcol = new Usuario();
        controlador = new ControladorUsuario(fcol, this);
        
        cargarOpcionesSexo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
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
        TextIdUsuarios = new javax.swing.JTextField();
        MODELO = new javax.swing.JLabel();
        TIPO = new javax.swing.JLabel();
        TxtICorreo = new javax.swing.JTextField();
        IDADMIN = new javax.swing.JLabel();
        TextNOMBRE = new javax.swing.JTextField();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        IDADMIN1 = new javax.swing.JLabel();
        TxtITEL = new javax.swing.JTextField();
        IDADMIN2 = new javax.swing.JLabel();
        TxtCONTRASEÑA = new javax.swing.JTextField();
        IDADMIN3 = new javax.swing.JLabel();
        TxtIEDAD = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTUsuarios = new javax.swing.JTable();
        SALIR = new javax.swing.JButton();
        botonPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 2, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE USUARIOS");
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

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 760, 50));

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

        TextIdUsuarios.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TextIdUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextIdUsuariosActionPerformed(evt);
            }
        });

        MODELO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MODELO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MODELO.setText("NOMBRE");

        TIPO.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TIPO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TIPO.setText("SEXO");

        TxtICorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtICorreoActionPerformed(evt);
            }
        });

        IDADMIN.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDADMIN.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDADMIN.setText("CORREO");

        TextNOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNOMBREActionPerformed(evt);
            }
        });

        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        IDADMIN1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDADMIN1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDADMIN1.setText("CONTRASEÑA");

        TxtITEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtITELActionPerformed(evt);
            }
        });

        IDADMIN2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDADMIN2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDADMIN2.setText("EDAD");

        TxtCONTRASEÑA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCONTRASEÑAActionPerformed(evt);
            }
        });

        IDADMIN3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        IDADMIN3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IDADMIN3.setText("TEL");

        TxtIEDAD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtIEDADActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(IDADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtICorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDADMIN3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(TxtITEL, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(IDADMIN2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtIEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(TextIdUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(105, 105, 105)
                        .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IDADMIN1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(MODELO, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(TextNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextIdUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TIPO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID))
                .addGap(19, 19, 19)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtICorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDADMIN)
                    .addComponent(TxtITEL, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IDADMIN2)
                    .addComponent(IDADMIN3)
                    .addComponent(TxtIEDAD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDADMIN1)
                    .addComponent(TxtCONTRASEÑA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MODELO))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 850, 180));

        JTUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID USUARIOS", "CORREO", "SEXO", "TELEFONO", "EDAD", "CONTRASEÑA", "NOMBRE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, 850, 170));

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
        jPanel1.add(botonPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 590, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, Short.MAX_VALUE)
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
        JTUsuarios.setModel(modelo);

        // La sentencia SQL que selecciona los datos de la tabla 'clientes'
        String sql = "SELECT `IDCLIENTE`, `NOMBRE`, `CONTRASEÑA`, `SEXO`, `TELEFONO`, `CORREO`, `EDAD` FROM `clientes` WHERE 1";

        try (Connection con = new conexionbasededatos().conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            // Añadir las columnas correspondientes a los datos de la tabla 'clientes'
            modelo.addColumn("IDCLIENTE");
            modelo.addColumn("NOMBRE");
            modelo.addColumn("CONTRASEÑA");
            modelo.addColumn("SEXO");
            modelo.addColumn("TELEFONO");
            modelo.addColumn("CORREO");
            modelo.addColumn("EDAD");

            // Recorrer el ResultSet y añadir cada fila a la tabla
            while (rs.next()) {
                Object[] fila = new Object[modelo.getColumnCount()];
                // Rellenar los valores de cada fila con los datos del ResultSet
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    fila[i] = rs.getObject(i + 1); // Obtenemos el valor de la columna i+1
                }
                modelo.addRow(fila); // Añadir la fila a la tabla
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR DATOS: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_CARGARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed

    }//GEN-LAST:event_ELIMINARActionPerformed

    private void TextIdUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextIdUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextIdUsuariosActionPerformed

    private void TextNOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNOMBREActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNOMBREActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed

    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void TxtICorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtICorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtICorreoActionPerformed

    private void JTUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTUsuariosMouseClicked
        try (Connection con = new conexionbasededatos().conectar()) {
            // Obtener la fila seleccionada en la tabla
            int fila = JTUsuarios.getSelectedRow();
            String idCliente = JTUsuarios.getValueAt(fila, 0).toString();  // Asumiendo que el ID está en la primera columna

            // Sentencia SQL para obtener los datos del cliente
            String sql = "SELECT `IDCLIENTE`, `NOMBRE`, `CONTRASEÑA`, `SEXO`, `TELEFONO`, `CORREO`, `EDAD` FROM `clientes` WHERE `IDCLIENTE` = ?";

            // Preparar la consulta
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, idCliente); // Establecer el ID del cliente a buscar

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        // Cargar los datos del cliente en los campos del formulario
                        TextIdUsuarios.setText(rs.getString("IDCLIENTE"));
                        TextNOMBRE.setText(rs.getString("NOMBRE"));
                        TxtICorreo.setText(rs.getString("CORREO"));
                        jComboBoxSexo.setSelectedItem(rs.getString("SEXO"));
                        TxtITEL.setText(rs.getString("TELEFONO"));
                        TxtCONTRASEÑA.setText(rs.getString("CONTRASEÑA"));
                        TxtIEDAD.setText(rs.getString("EDAD"));
                    }
                }
            }
        } catch (SQLException e) {
            // Mostrar mensaje de error si ocurre una excepción
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR DATOS DEL USUARIO: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_JTUsuariosMouseClicked

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

                // Imagen de cabecera (opcional)
                Image header = Image.getInstance("C:/Users/Jere/Documents/NetBeansProjects/SRV/src/imagenes/4-removebg-preview_1.png");
                header.scaleToFit(300, 200);
                header.setAlignment(Chunk.ALIGN_RIGHT);

                // Título y texto de introducción
                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_BASELINE);
                parrafo.add("FORMATO CREADO POR FCOL AirLines ® \n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
                parrafo.add(" REGISTROS DE USUARIOS \n\n");

                // Agregar la fecha y hora
                Paragraph fechaParrafo = new Paragraph("Fecha y hora de creación: " + fechaHora);
                fechaParrafo.setAlignment(Paragraph.ALIGN_TOP);
                fechaParrafo.setSpacingAfter(10); // Espacio entre la fecha y el contenido

                documento.add(header);
                documento.add(parrafo);
                documento.add(fechaParrafo); // Agregar la fecha y hora
                documento.add(Chunk.NEWLINE);

                // Crear la tabla de usuarios
                PdfPTable table = new PdfPTable(7);  // 7 columnas para los 7 campos
                table.setWidthPercentage(100);
                PdfPCell idCliente = new PdfPCell(new Phrase("IDCLIENTE"));
                idCliente.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell nombre = new PdfPCell(new Phrase("NOMBRE"));
                nombre.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell contraseña = new PdfPCell(new Phrase("CONTRASEÑA"));
                contraseña.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell sexo = new PdfPCell(new Phrase("SEXO"));
                sexo.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell telefono = new PdfPCell(new Phrase("TELEFONO"));
                telefono.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell correo = new PdfPCell(new Phrase("CORREO"));
                correo.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell edad = new PdfPCell(new Phrase("EDAD"));
                edad.setBackgroundColor(BaseColor.YELLOW);

                // Añadir los encabezados de las columnas
                table.addCell(idCliente);
                table.addCell(nombre);
                table.addCell(contraseña);
                table.addCell(sexo);
                table.addCell(telefono);
                table.addCell(correo);
                table.addCell(edad);

                // Consultar los datos de la tabla usuarios
                try {
                        Connection con = new conexionbasededatos().conectar();
                        PreparedStatement ps = con.prepareStatement("SELECT * FROM clientes "); 
                        ResultSet rs = ps.executeQuery();
                               
                        while (rs.next()) {
                            // Agregar cada fila de datos de usuarios
                            table.addCell(rs.getString("IDCLIENTE"));
                            table.addCell(rs.getString("NOMBRE"));
                            table.addCell(rs.getString("CONTRASEÑA"));
                            table.addCell(rs.getString("SEXO"));
                            table.addCell(rs.getString("TELEFONO"));
                            table.addCell(rs.getString("CORREO"));
                            table.addCell(rs.getString("EDAD"));
                        }

                        // Agregar la tabla al documento PDF
                        documento.add(table);

                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "ERROR AL CONSULTAR LOS DATOS DE USUARIOS: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                

                // Cerrar el documento PDF
                documento.close();
                JOptionPane.showMessageDialog(null, "REPORTE DE USUARIOS CREADO CON ÉXITO :)");

            } catch (DocumentException | FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN PDF: " + e.getMessage());
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN LA IMAGEN: " + e.getMessage());
            }
        }
    
    }//GEN-LAST:event_botonPDFActionPerformed

    private void TxtITELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtITELActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtITELActionPerformed

    private void TxtCONTRASEÑAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCONTRASEÑAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCONTRASEÑAActionPerformed

    private void TxtIEDADActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtIEDADActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtIEDADActionPerformed

    private void cargarOpcionesSexo() {
        Connection con = new conexionbasededatos().conectar();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();

            // Consulta para obtener los valores del campo ENUM
            rs = stmt.executeQuery("SHOW COLUMNS FROM clientes LIKE 'SEXO'");

            if (rs.next()) {
                String enumType = rs.getString("Type");
                enumType = enumType.replace("enum(", "").replace(")", "");
                String[] enumValues = enumType.split(",");

                jComboBoxSexo.removeAllItems(); // Limpiar el JComboBox

                jComboBoxSexo.addItem("ESCOGER");
                // Agregar los valores al JComboBox
                for (String value : enumValues) {
                    value = value.replace("'", "").trim(); // Limpiar comillas
                    jComboBoxSexo.addItem(value);
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
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AGREGAR;
    public javax.swing.JButton BUSCAR;
    public javax.swing.JButton CARGAR;
    public javax.swing.JButton EDITAR;
    public javax.swing.JButton ELIMINAR;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IDADMIN;
    private javax.swing.JLabel IDADMIN1;
    private javax.swing.JLabel IDADMIN2;
    private javax.swing.JLabel IDADMIN3;
    public javax.swing.JTable JTUsuarios;
    public javax.swing.JButton LIMPIAR;
    private javax.swing.JLabel MODELO;
    public javax.swing.JButton SALIR;
    private javax.swing.JLabel TIPO;
    public javax.swing.JTextField TextIdUsuarios;
    public javax.swing.JTextField TextNOMBRE;
    public javax.swing.JTextField TxtCONTRASEÑA;
    public javax.swing.JTextField TxtICorreo;
    public javax.swing.JTextField TxtIEDAD;
    public javax.swing.JTextField TxtITEL;
    private javax.swing.JButton botonPDF;
    public javax.swing.JComboBox<String> jComboBoxSexo;
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
