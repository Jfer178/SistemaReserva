/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Modelo1.Reclamos;
import Controladores.conexionbasededatos;
import Vista.PantAdminitrador;
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


public class QRadmin extends javax.swing.JFrame {

    /**
     * Creates new form QRadmin
     */
    public QRadmin() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        CARGAR = new javax.swing.JButton();
        panelderelleno = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTReclamosA = new javax.swing.JTable();
        SALIR = new javax.swing.JButton();
        botonPDF = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 2, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("RECLAMOS DE CLIENTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 430, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        CARGAR.setText("CARGAR");
        CARGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CARGARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(CARGAR, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CARGAR, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 130, 50));

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
        jLabel2.setText("Reclamos ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 210, 30));

        jLabel3.setFont(new java.awt.Font("Agbalumo", 0, 26)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Opciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, 30));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        JTReclamosA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "IDRECLAMO", "IDCLIENTE", "DESCRIPCION", "FECHA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTReclamosA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTReclamosAMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTReclamosA);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 760, 180));

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
        jPanel1.add(botonPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 150, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 861, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CARGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARGARActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();
        JTReclamosA.setModel(modelo);
        String sql = "SELECT `IDRECLAMO`, `IDCLIENTE`, `DESCRIPCION`, `FECHA` FROM `reclamos` WHERE IDRECLAMO = ?";

        try (Connection con = new conexionbasededatos().conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            modelo.addColumn("IDRECLAMO");
            modelo.addColumn("IDCLIENTE");
            modelo.addColumn("DESCRIPCION");
            modelo.addColumn("FECHA");

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

    private void JTReclamosAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTReclamosAMouseClicked

    }//GEN-LAST:event_JTReclamosAMouseClicked

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

                // Cargar una imagen (header)
                Image header = Image.getInstance("C:/Users/Jere/Documents/NetBeansProjects/SRV/src/imagenes/4-removebg-preview_1.png");
                header.scaleToFit(300, 200);
                header.setAlignment(Chunk.ALIGN_RIGHT);

                // Crear un párrafo de título
                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_BASELINE);
                parrafo.add("FORMATO CREADO POR FCOL AirLines ® \n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
                parrafo.add(" REGISTROS DE RECLAMOS \n\n");

                // Agregar la fecha y hora
                Paragraph fechaParrafo = new Paragraph("Fecha y hora de creación: " + fechaHora);
                fechaParrafo.setAlignment(Paragraph.ALIGN_TOP);
                fechaParrafo.setSpacingAfter(10); // Espacio entre la fecha y el contenido

                documento.add(header);
                documento.add(parrafo);
                documento.add(fechaParrafo); // Agregar la fecha y hora
                documento.add(Chunk.NEWLINE);

                // Crear la tabla
                PdfPTable table = new PdfPTable(4); // Cambié el número de columnas a 4
                table.setWidthPercentage(100);

                // Agregar cabeceras de la tabla
                PdfPCell idReclamo = new PdfPCell(new Phrase("IDRECLAMO"));
                idReclamo.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell idCliente = new PdfPCell(new Phrase("IDCLIENTE"));
                idCliente.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell descripcion = new PdfPCell(new Phrase("DESCRIPCION"));
                descripcion.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell fecha = new PdfPCell(new Phrase("FECHA"));
                fecha.setBackgroundColor(BaseColor.YELLOW);

                // Añadir las celdas al encabezado de la tabla
                table.addCell(idReclamo);
                table.addCell(idCliente);
                table.addCell(descripcion);
                table.addCell(fecha);

                // Conexión a la base de datos
                try (Connection con = new conexionbasededatos().conectar(); PreparedStatement ps = con.prepareStatement("SELECT `IDRECLAMO`, `IDCLIENTE`, `DESCRIPCION`, `FECHA` FROM `reclamos`"); ResultSet rs = ps.executeQuery()) {

                    // Llenar la tabla con datos
                    while (rs.next()) {
                        table.addCell(rs.getString("IDRECLAMO"));
                        table.addCell(rs.getString("IDCLIENTE"));
                        table.addCell(rs.getString("DESCRIPCION"));
                        table.addCell(rs.getString("FECHA"));
                    }

                    documento.add(table);

                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR EN CONEXION: " + e);
                }

                documento.close();
                JOptionPane.showMessageDialog(null, "REPORTE DE RECLAMOS CREADO :)");

            } catch (DocumentException | FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN PDF: " + e);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN LA IMAGEN: " + e);
            }
        }
    

    }//GEN-LAST:event_botonPDFActionPerformed

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
        java.util.logging.Logger.getLogger(QRadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
        java.util.logging.Logger.getLogger(QRadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
        java.util.logging.Logger.getLogger(QRadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        java.util.logging.Logger.getLogger(QRadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
        public void run() {
            new QRadmin().setVisible(true);
        }
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton CARGAR;
    public javax.swing.JTable JTReclamosA;
    public javax.swing.JButton SALIR;
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
