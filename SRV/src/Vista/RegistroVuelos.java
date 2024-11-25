/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controladores.ControladorVuelo;
import Modelo1.Vuelo;
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
import com.raven.event.EventTimePicker;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class RegistroVuelos extends javax.swing.JFrame {

    private ControladorVuelo controlador;
    private Vuelo vuelo;

    public RegistroVuelos() {
        initComponents();

        timePicker1.addEventTimePicker(new EventTimePicker() {

            @Override
            public void timeSelected(String string) {

            }
        });
        timePicker1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("Time Selected" + timePicker1.getSelectedTime());
            }
        });

        vuelo = new Vuelo();
        controlador = new ControladorVuelo(vuelo, this);

        cargarOpcionesOrgien();
        cargarOpcionesDestino();
        cargarOpcionesIdavion();
        cargarOpcionesIdEmpleado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        timePicker1 = new com.raven.swing.TimePicker();
        jPanel17 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        AGREGAR = new javax.swing.JButton();
        EDITAR = new javax.swing.JButton();
        LIMPIAR = new javax.swing.JButton();
        BUSCAR = new javax.swing.JButton();
        CARGAR = new javax.swing.JButton();
        ELIMINAR = new javax.swing.JButton();
        panelderelleno = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        ID1 = new javax.swing.JLabel();
        ID2 = new javax.swing.JLabel();
        ID3 = new javax.swing.JLabel();
        ID4 = new javax.swing.JLabel();
        ID5 = new javax.swing.JLabel();
        ID6 = new javax.swing.JLabel();
        ID7 = new javax.swing.JLabel();
        ID9 = new javax.swing.JLabel();
        TEXT_NROVUELO = new javax.swing.JTextField();
        TEXTIDVUELO = new javax.swing.JTextField();
        TEXT_ASIENTOS = new javax.swing.JTextField();
        jDateChooserFECHA = new com.toedter.calendar.JDateChooser();
        jComboBOXORIGEN = new javax.swing.JComboBox();
        jComboBOXDESTINO = new javax.swing.JComboBox();
        TEXT_ADMIN = new javax.swing.JTextField();
        ID10 = new javax.swing.JLabel();
        TEXT_HORA = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jComboBoxIDEMPLEADO = new javax.swing.JComboBox<>();
        jComboBoxIDAVION = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTVuelo = new javax.swing.JTable();
        SALIR = new javax.swing.JButton();
        botonPDF = new javax.swing.JButton();

        timePicker1.setDisplayText(TEXT_HORA);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Agency FB", 2, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REGISTRO DE VUELOS");
        jPanel17.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 430, -1));

        jPanel18.setBackground(new java.awt.Color(204, 255, 255));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

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

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
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
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AGREGAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CARGAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(EDITAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                    .addComponent(LIMPIAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BUSCAR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ELIMINAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 760, 50));

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

        jPanel17.add(panelderelleno, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 700, 910, 20));

        jLabel10.setFont(new java.awt.Font("Agbalumo", 0, 26)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Datos del Vuelos");
        jPanel17.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 210, 30));

        jLabel11.setFont(new java.awt.Font("Agbalumo", 0, 26)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Opciones");
        jPanel17.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 130, 30));

        jPanel19.setBackground(new java.awt.Color(204, 255, 255));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        ID1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID1.setText("ID VUELO");

        ID2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID2.setText("ASIENTOS");

        ID3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID3.setText("ID EMPLEADO");

        ID4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID4.setText("ID AVION");

        ID5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID5.setText("NRO_VUELO");

        ID6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID6.setText("FECHA");

        ID7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID7.setText("ORIGEN");

        ID9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID9.setText("DESTINO");

        TEXT_NROVUELO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT_NROVUELOActionPerformed(evt);
            }
        });

        TEXTIDVUELO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXTIDVUELOActionPerformed(evt);
            }
        });

        TEXT_ASIENTOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT_ASIENTOSActionPerformed(evt);
            }
        });

        jDateChooserFECHA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jDateChooserFECHAMouseClicked(evt);
            }
        });

        jComboBOXORIGEN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBOXORIGENActionPerformed(evt);
            }
        });

        jComboBOXDESTINO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBOXDESTINOActionPerformed(evt);
            }
        });

        TEXT_ADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT_ADMINActionPerformed(evt);
            }
        });

        ID10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ID10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ID10.setText("ID ADMIN");

        TEXT_HORA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TEXT_HORAActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("HORA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBoxIDEMPLEADO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIDEMPLEADOActionPerformed(evt);
            }
        });

        jComboBoxIDAVION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxIDAVIONActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                                .addComponent(ID3)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBoxIDEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(ID7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBOXORIGEN, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ID6)
                                .addGap(18, 18, 18)
                                .addComponent(jDateChooserFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel19Layout.createSequentialGroup()
                                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addComponent(ID4)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBoxIDAVION, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)
                                        .addComponent(ID9)
                                        .addGap(18, 18, 18)
                                        .addComponent(jComboBOXDESTINO, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(ID10)
                                        .addGap(12, 12, 12)
                                        .addComponent(TEXT_ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(ID2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(TEXT_ASIENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel19Layout.createSequentialGroup()
                                        .addGap(565, 565, 565)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(TEXT_HORA, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 9, Short.MAX_VALUE))))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ID1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TEXTIDVUELO, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(ID5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TEXT_NROVUELO, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(16, 16, 16))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ID5)
                        .addComponent(ID1)
                        .addComponent(TEXT_NROVUELO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(TEXTIDVUELO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TEXT_HORA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ID3)
                        .addComponent(ID7)
                        .addComponent(ID6)
                        .addComponent(jComboBOXORIGEN, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBoxIDEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserFECHA, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ID4)
                    .addComponent(ID2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID9)
                    .addComponent(TEXT_ASIENTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBOXDESTINO, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TEXT_ADMIN, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ID10)
                    .addComponent(jComboBoxIDAVION, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel17.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 940, 160));

        JTVuelo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID VUELO", "ID EMPLEADOS", "ID AVION", "NRO_VUELO", "ORIGEN", "DESTINO", "HORA", "FECHA", "ID ADMIN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        JTVuelo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTVueloMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTVuelo);

        jPanel17.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 940, 170));

        SALIR.setBackground(new java.awt.Color(255, 51, 51));
        SALIR.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 255, 255));
        SALIR.setText("<");
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        jPanel17.add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 30));

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
        jPanel17.add(botonPDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 560, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, 1068, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGREGARActionPerformed
        obtenerSiguienteIDVuelo();

    }//GEN-LAST:event_AGREGARActionPerformed

    private void EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EDITARActionPerformed

    }//GEN-LAST:event_EDITARActionPerformed

    private void LIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPIARActionPerformed

    }//GEN-LAST:event_LIMPIARActionPerformed

    private void BUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUSCARActionPerformed

    }//GEN-LAST:event_BUSCARActionPerformed

    private void CARGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CARGARActionPerformed

        DefaultTableModel modelo = new DefaultTableModel();
        JTVuelo.setModel(modelo);

        // Consulta SQL para obtener los registros de vuelos
        String sql = "SELECT `IDVUELOS`, `IDEMPLEADOS`, `IDAVION`, `NRO_VUELO`, `ORIGEN`, `DESTINO`, `FECHA`, `HORA`, `ASIENTO_DISPONIBLES`, `IDADMINISTRADOR` FROM `vuelos` WHERE 1";

        try (Connection con = new conexionbasededatos().conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            // Definir las columnas de la tabla
            modelo.addColumn("ID VUELO");
            modelo.addColumn("ID EMPLEADO");
            modelo.addColumn("ID AVION");
            modelo.addColumn("NRO VUELO");
            modelo.addColumn("ORIGEN");
            modelo.addColumn("DESTINO");
            modelo.addColumn("FECHA");
            modelo.addColumn("HORA");
            modelo.addColumn("ASIENTOS DISPONIBLES");
            modelo.addColumn("ID ADMIN");

            // Llenar la tabla con los datos de la consulta
            while (rs.next()) {
                Object[] fila = new Object[modelo.getColumnCount()];  // Crear una nueva fila con el tamaño de las columnas
                for (int i = 0; i < modelo.getColumnCount(); i++) {
                    fila[i] = rs.getObject(i + 1);  // Llenar la fila con los datos obtenidos del ResultSet
                }
                modelo.addRow(fila);  // Añadir la fila al modelo de la tabla
            }
        } catch (SQLException ex) {
            // Mostrar un mensaje de error si ocurre alguna excepción
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR DATOS: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_CARGARActionPerformed

    private void ELIMINARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ELIMINARActionPerformed

    }//GEN-LAST:event_ELIMINARActionPerformed

    private void JTVueloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTVueloMouseClicked
        try (Connection con = new conexionbasededatos().conectar()) {
            int fila = JTVuelo.getSelectedRow();
            String idVuelo = JTVuelo.getValueAt(fila, 0).toString();
            // Consulta SQL para obtener los datos del vuelo
            String sql = "SELECT `IDVUELOS`, `IDEMPLEADOS`, `IDAVION`, `NRO_VUELO`, `ORIGEN`, `DESTINO`, `FECHA`, `HORA`, `ASIENTO_DISPONIBLES`, `IDADMINISTRADOR` "
                    + "FROM `vuelos` WHERE `IDVUELOS` = ?";

            try (PreparedStatement ps = con.prepareStatement(sql)) {
                // Establecer el parámetro de la consulta (ID del vuelo)
                ps.setString(1, idVuelo);

                // Ejecutar la consulta y obtener los resultados
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        // Rellenar los campos de la vista con los datos del vuelo
                        TEXTIDVUELO.setText(rs.getString("IDVUELOS"));  // ID del vuelo
                        jComboBoxIDEMPLEADO.setSelectedItem(rs.getString("IDEMPLEADOS"));  // ID del empleado
                        jComboBoxIDAVION.setSelectedItem(rs.getString("IDAVION"));  // ID del avión
                        TEXT_NROVUELO.setText(rs.getString("NRO_VUELO"));  // Número de vuelo
                        jComboBOXORIGEN.setSelectedItem(rs.getString("ORIGEN"));  // Origen
                        jComboBOXDESTINO.setSelectedItem(rs.getString("DESTINO"));  // Destino
                        jDateChooserFECHA.setDate(rs.getDate("FECHA"));  // Fecha del vuelo
                        TEXT_HORA.setText(rs.getString("HORA"));  // Hora del vuelo
                        TEXT_ASIENTOS.setText(rs.getString("ASIENTO_DISPONIBLES"));  // Asientos disponibles
                        TEXT_ADMIN.setText(rs.getString("IDADMINISTRADOR"));  // ID del administrador
                    }
                }
            }
        } catch (SQLException e) {
            // Si hay un error con la conexión o la consulta, mostrar un mensaje de error
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR DATOS DEL VUELO: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_JTVueloMouseClicked

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

                // Imagen de encabezado
                Image header = Image.getInstance("C:/Users/Jere/Documents/NetBeansProjects/SRV/src/imagenes/4-removebg-preview_1.png"); // Cambiar el path a tu imagen
                header.scaleToFit(300, 200);
                header.setAlignment(Chunk.ALIGN_RIGHT);

                Paragraph parrafo = new Paragraph();
                parrafo.setAlignment(Paragraph.ALIGN_BASELINE);
                parrafo.add("FORMATO CREADO POR FCOL AirLines ® \n\n");
                parrafo.setFont(FontFactory.getFont("Tahoma", 18, Font.BOLD, BaseColor.DARK_GRAY));
                parrafo.add(" REGISTROS DE VUELOS \n\n");

                // Agregar la fecha y hora
                Paragraph fechaParrafo = new Paragraph("Fecha y hora de creación: " + fechaHora);
                fechaParrafo.setAlignment(Paragraph.ALIGN_TOP);
                fechaParrafo.setSpacingAfter(10); // Espacio entre la fecha y el contenido

                documento.add(header);
                documento.add(parrafo);
                documento.add(fechaParrafo); // Agregar la fecha y hora
                documento.add(Chunk.NEWLINE);

                // Crear la tabla con las columnas adecuadas para los vuelos
                PdfPTable table = new PdfPTable(7); // Suponiendo que tienes 7 columnas para el vuelo
                table.setWidthPercentage(100);

                // Encabezados de la tabla (modificados para vuelos)
                PdfPCell IDVUELOS = new PdfPCell(new Phrase("IDVUELOS"));
                IDVUELOS.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell NROVUELO = new PdfPCell(new Phrase("NRO VUELO"));
                NROVUELO.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell ORIGEN = new PdfPCell(new Phrase("ORIGEN"));
                ORIGEN.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell DESTINO = new PdfPCell(new Phrase("DESTINO"));
                DESTINO.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell FECHA = new PdfPCell(new Phrase("FECHA"));
                FECHA.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell HORA = new PdfPCell(new Phrase("HORA"));
                HORA.setBackgroundColor(BaseColor.YELLOW);
                PdfPCell ASIENTOS_DISPONIBLES = new PdfPCell(new Phrase("ASIENTOS DISPONIBLES"));
                ASIENTOS_DISPONIBLES.setBackgroundColor(BaseColor.YELLOW);

                // Agregar celdas al encabezado
                table.addCell(IDVUELOS);
                table.addCell(NROVUELO);
                table.addCell(ORIGEN);
                table.addCell(DESTINO);
                table.addCell(FECHA);
                table.addCell(HORA);
                table.addCell(ASIENTOS_DISPONIBLES);

                // Obtener los registros de vuelos desde la base de datos
                try {
                    Connection con = new conexionbasededatos().conectar();
                    PreparedStatement ps = con.prepareStatement("SELECT * FROM vuelos");
                    ResultSet rs = ps.executeQuery();

                    while (rs.next()) {
                        // Agregar los datos de cada vuelo a la tabla
                        table.addCell(rs.getString("IDVUELOS"));
                        table.addCell(rs.getString("NRO_VUELO"));
                        table.addCell(rs.getString("ORIGEN"));
                        table.addCell(rs.getString("DESTINO"));
                        table.addCell(rs.getString("FECHA"));
                        table.addCell(rs.getString("HORA"));
                        table.addCell(rs.getString("ASIENTO_DISPONIBLES"));
                    }

                    // Agregar la tabla al documento
                    documento.add(table);

                } catch (DocumentException | SQLException e) {
                    JOptionPane.showMessageDialog(null, "ERROR EN CONEXION: " + e);
                }

                // Cerrar el documento
                documento.close();
                JOptionPane.showMessageDialog(null, "REPORTE DE VUELOS CREADO :)");
            } catch (DocumentException | FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "ERROR AL CREAR PDF: " + e);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "ERROR EN LA IMAGEN: " + e);
            }
        }


    }//GEN-LAST:event_botonPDFActionPerformed

    private void TEXTIDVUELOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXTIDVUELOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXTIDVUELOActionPerformed

    private void jComboBOXDESTINOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBOXDESTINOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBOXDESTINOActionPerformed

    private void jComboBOXORIGENActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBOXORIGENActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBOXORIGENActionPerformed

    private void jDateChooserFECHAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jDateChooserFECHAMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooserFECHAMouseClicked

    private void TEXT_ASIENTOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT_ASIENTOSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT_ASIENTOSActionPerformed

    private void TEXT_ADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT_ADMINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT_ADMINActionPerformed

    private void TEXT_NROVUELOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT_NROVUELOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT_NROVUELOActionPerformed

    private void TEXT_HORAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TEXT_HORAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TEXT_HORAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        timePicker1.showPopup(this, 100, 100);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxIDEMPLEADOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIDEMPLEADOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxIDEMPLEADOActionPerformed

    private void jComboBoxIDAVIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxIDAVIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxIDAVIONActionPerformed

    private void cargarOpcionesOrgien() {
        Connection con = new conexionbasededatos().conectar();
        Statement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.createStatement();

            // Consulta para obtener los valores del campo ENUM
            rs = stmt.executeQuery("SHOW COLUMNS FROM vuelos LIKE 'ORIGEN'");

            if (rs.next()) {
                String enumType = rs.getString("Type");
                enumType = enumType.replace("enum(", "").replace(")", "");
                String[] enumValues = enumType.split(",");

                jComboBOXORIGEN.removeAllItems(); // Limpiar el JComboBox

                jComboBOXORIGEN.addItem("ESCOGER");
                // Agregar los valores al JComboBox
                for (String value : enumValues) {
                    value = value.replace("'", "").trim(); // Limpiar comillas
                    jComboBOXORIGEN.addItem(value);
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

    private void cargarOpcionesDestino() {
        Connection con = new conexionbasededatos().conectar();

        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Consulta para obtener los valores del campo ENUM
            String sql = "SHOW COLUMNS FROM vuelos LIKE 'DESTINO'";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                String enumType = rs.getString("Type");
                enumType = enumType.replace("enum(", "").replace(")", "");
                String[] enumValues = enumType.split(",");

                jComboBOXDESTINO.removeAllItems(); // Limpiar el JComboBox
                jComboBOXDESTINO.addItem("ESCOGER");

                // Agregar los valores al JComboBox
                for (String value : enumValues) {
                    value = value.replace("'", "").trim(); // Limpiar comillas
                    jComboBOXDESTINO.addItem(value);
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

    private void cargarOpcionesIdavion() {

        // Conexión a la base de datos
        Connection con = new conexionbasededatos().conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Consulta para obtener solo los valores de la columna IDAVION
            String sql = "SELECT `IDAVION` FROM `avion` WHERE 1";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            // Limpiar el JComboBox antes de agregar los elementos
            jComboBoxIDAVION.removeAllItems();
            jComboBoxIDAVION.addItem("ESCOGER");

            // Iterar sobre el ResultSet y agregar los elementos al JComboBox
            while (rs.next()) {
                // Obtener el valor de IDAVION
                String IDAVION = rs.getString("IDAVION");

                // Agregar el IDAVION al JComboBox
                jComboBoxIDAVION.addItem(IDAVION);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR LOS DATOS: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

    private void cargarOpcionesIdEmpleado() {

        Connection con = new conexionbasededatos().conectar();
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Consulta para obtener solo los valores de la columna IDEMPLEADOS
            String sql = "SELECT `IDEMPLEADOS` FROM `empleados` WHERE 1";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            // Limpiar el JComboBox antes de agregar los elementos
            jComboBoxIDEMPLEADO.addItem("ESCOGER");

            // Iterar sobre el ResultSet y agregar los elementos al JComboBox
            while (rs.next()) {
                // Obtener el valor de IDEMPLEADOS
                String IDEMPLEADOS = rs.getString("IDEMPLEADOS");

                // Agregar el IDEMPLEADOS al JComboBox
                jComboBoxIDEMPLEADO.addItem(IDEMPLEADOS);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "ERROR AL CARGAR LOS DATOS DE EMPLEADOS: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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

    private void obtenerSiguienteIDVuelo() {
        String sql = "SELECT MAX(IDVUELOS) AS maxID FROM vuelos";
        try (Connection con = new conexionbasededatos().conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                int nextID = rs.getInt("maxID") + 1; // Sumar 1 al máximo ID actual
                TEXTIDVUELO.setText(String.valueOf(nextID)); // Establecer el siguiente ID en el campo
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
            java.util.logging.Logger.getLogger(RegistroVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroVuelos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroVuelos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AGREGAR;
    public javax.swing.JButton BUSCAR;
    public javax.swing.JButton CARGAR;
    public javax.swing.JButton EDITAR;
    public javax.swing.JButton ELIMINAR;
    private javax.swing.JLabel ID1;
    private javax.swing.JLabel ID10;
    private javax.swing.JLabel ID2;
    private javax.swing.JLabel ID3;
    private javax.swing.JLabel ID4;
    private javax.swing.JLabel ID5;
    private javax.swing.JLabel ID6;
    private javax.swing.JLabel ID7;
    private javax.swing.JLabel ID9;
    public javax.swing.JTable JTVuelo;
    public javax.swing.JButton LIMPIAR;
    public javax.swing.JButton SALIR;
    public javax.swing.JTextField TEXTIDVUELO;
    public javax.swing.JTextField TEXT_ADMIN;
    public javax.swing.JTextField TEXT_ASIENTOS;
    public javax.swing.JTextField TEXT_HORA;
    public javax.swing.JTextField TEXT_NROVUELO;
    private javax.swing.JButton botonPDF;
    private javax.swing.JButton jButton1;
    public javax.swing.JComboBox jComboBOXDESTINO;
    public javax.swing.JComboBox jComboBOXORIGEN;
    public javax.swing.JComboBox<String> jComboBoxIDAVION;
    public javax.swing.JComboBox<String> jComboBoxIDEMPLEADO;
    public com.toedter.calendar.JDateChooser jDateChooserFECHA;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelderelleno;
    private com.raven.swing.TimePicker timePicker1;
    // End of variables declaration//GEN-END:variables
}
