/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controladores.conexionbasededatos;
import static Controladores.conexionbasededatos.conectar;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Jere
 */
public class RegistroUsuario extends javax.swing.JFrame {

    private Login Lg;
    int xMouse, yMouse;

    /**
     * Creates new form RRegistroUsuario
     */
    public RegistroUsuario() {

        initComponents();
        cargarOpcionesSexo();
    }

    public void setLg(Login Lg) {
        this.Lg = Lg;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        LOGO2 = new javax.swing.JLabel();
        TEXNOMBR = new javax.swing.JLabel();
        CajitaNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CajitaCedula = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        TEXNOMBR1 = new javax.swing.JLabel();
        TEXNOMBR2 = new javax.swing.JLabel();
        CajitaTelefono = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        TEXNOMBR6 = new javax.swing.JLabel();
        CajitaEmail = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        TEXNOMBR7 = new javax.swing.JLabel();
        CajitaContraseña = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        TEXNOMBR8 = new javax.swing.JLabel();
        CajitaEdad = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        PanelResgistrarse = new javax.swing.JPanel();
        TEXTSEXO = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        BtnRegistraermeBD = new javax.swing.JButton();
        jComboxSexo = new javax.swing.JComboBox<>();
        SALIR = new javax.swing.JButton();
        HEADER = new javax.swing.JPanel();
        EXITPAN = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/colorescambiadoslogo (1).png"))); // NOI18N
        LOGO2.setText("jLabel1");
        BG.add(LOGO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 270, 110));

        TEXNOMBR.setFont(new java.awt.Font("Agbalumo", 2, 18)); // NOI18N
        TEXNOMBR.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXNOMBR.setText("Cedula C.C");
        BG.add(TEXNOMBR, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, -1));

        CajitaNombre.setForeground(new java.awt.Color(204, 204, 204));
        CajitaNombre.setText("NOMBRE COMPLETO");
        CajitaNombre.setBorder(null);
        CajitaNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajitaNombreMousePressed(evt);
            }
        });
        CajitaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaNombreActionPerformed(evt);
            }
        });
        BG.add(CajitaNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 370, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 370, 10));

        CajitaCedula.setForeground(new java.awt.Color(204, 204, 204));
        CajitaCedula.setText("CEDULA DE CIUDADANIA");
        CajitaCedula.setBorder(null);
        CajitaCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajitaCedulaMousePressed(evt);
            }
        });
        CajitaCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaCedulaActionPerformed(evt);
            }
        });
        BG.add(CajitaCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 370, 40));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 370, 10));

        TEXNOMBR1.setFont(new java.awt.Font("Agbalumo", 2, 18)); // NOI18N
        TEXNOMBR1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TEXNOMBR1.setText("Nombre");
        BG.add(TEXNOMBR1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 70, -1));

        TEXNOMBR2.setFont(new java.awt.Font("Agbalumo", 2, 18)); // NOI18N
        TEXNOMBR2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXNOMBR2.setText("Telefono");
        BG.add(TEXNOMBR2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, -1));

        CajitaTelefono.setForeground(new java.awt.Color(204, 204, 204));
        CajitaTelefono.setText("TELEFONO DE CONTACTO");
        CajitaTelefono.setBorder(null);
        CajitaTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajitaTelefonoMousePressed(evt);
            }
        });
        CajitaTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaTelefonoActionPerformed(evt);
            }
        });
        BG.add(CajitaTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 370, 40));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 370, 10));

        TEXNOMBR6.setFont(new java.awt.Font("Agbalumo", 2, 18)); // NOI18N
        TEXNOMBR6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXNOMBR6.setText("Email");
        BG.add(TEXNOMBR6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 70, -1));

        CajitaEmail.setForeground(new java.awt.Color(204, 204, 204));
        CajitaEmail.setText("CORREO");
        CajitaEmail.setBorder(null);
        CajitaEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajitaEmailMousePressed(evt);
            }
        });
        CajitaEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaEmailActionPerformed(evt);
            }
        });
        BG.add(CajitaEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 370, 40));

        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 420, 370, 10));

        TEXNOMBR7.setFont(new java.awt.Font("Agbalumo", 2, 18)); // NOI18N
        TEXNOMBR7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXNOMBR7.setText("Contraseña");
        BG.add(TEXNOMBR7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 100, -1));

        CajitaContraseña.setForeground(new java.awt.Color(204, 204, 204));
        CajitaContraseña.setText("UTILIZE MAYUSCULAS, MINISCULAS Y CARACTERES");
        CajitaContraseña.setBorder(null);
        CajitaContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajitaContraseñaMousePressed(evt);
            }
        });
        CajitaContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaContraseñaActionPerformed(evt);
            }
        });
        BG.add(CajitaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, 370, 40));

        jSeparator8.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, 370, 10));

        TEXNOMBR8.setFont(new java.awt.Font("Agbalumo", 2, 18)); // NOI18N
        TEXNOMBR8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXNOMBR8.setText("Edad");
        BG.add(TEXNOMBR8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 100, -1));

        CajitaEdad.setForeground(new java.awt.Color(204, 204, 204));
        CajitaEdad.setText("INSERTE SU EDAD");
        CajitaEdad.setBorder(null);
        CajitaEdad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CajitaEdadMousePressed(evt);
            }
        });
        CajitaEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CajitaEdadActionPerformed(evt);
            }
        });
        BG.add(CajitaEdad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, 370, 40));

        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 370, 10));

        PanelResgistrarse.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelResgistrarseLayout = new javax.swing.GroupLayout(PanelResgistrarse);
        PanelResgistrarse.setLayout(PanelResgistrarseLayout);
        PanelResgistrarseLayout.setHorizontalGroup(
            PanelResgistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 230, Short.MAX_VALUE)
        );
        PanelResgistrarseLayout.setVerticalGroup(
            PanelResgistrarseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        BG.add(PanelResgistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 750, 230, 40));

        TEXTSEXO.setFont(new java.awt.Font("Agbalumo", 2, 18)); // NOI18N
        TEXTSEXO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        TEXTSEXO.setText("Sexo");
        BG.add(TEXTSEXO, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, 100, -1));

        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, 370, 10));

        BtnRegistraermeBD.setBackground(new java.awt.Color(255, 51, 51));
        BtnRegistraermeBD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BtnRegistraermeBD.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistraermeBD.setText("REGISTRARME");
        BtnRegistraermeBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistraermeBDActionPerformed(evt);
            }
        });
        BG.add(BtnRegistraermeBD, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 700, 230, 40));

        jComboxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESCOJA SU GENERO" }));
        jComboxSexo.setBorder(null);
        jComboxSexo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboxSexoActionPerformed(evt);
            }
        });
        BG.add(jComboxSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 630, 370, 40));

        SALIR.setBackground(new java.awt.Color(0, 0, 204));
        SALIR.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        SALIR.setForeground(new java.awt.Color(255, 255, 255));
        SALIR.setText("<");
        SALIR.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });
        BG.add(SALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 30));

        HEADER.setBackground(new java.awt.Color(255, 255, 255));
        HEADER.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HEADERMouseDragged(evt);
            }
        });
        HEADER.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HEADERMousePressed(evt);
            }
        });

        EXITPAN.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout EXITPANLayout = new javax.swing.GroupLayout(EXITPAN);
        EXITPAN.setLayout(EXITPANLayout);
        EXITPANLayout.setHorizontalGroup(
            EXITPANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        EXITPANLayout.setVerticalGroup(
            EXITPANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HEADERLayout.createSequentialGroup()
                .addGap(0, 480, Short.MAX_VALUE)
                .addComponent(EXITPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADERLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(EXITPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BG.add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 784, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CajitaNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajitaNombreMousePressed
        if (CajitaNombre.getText().equals("NOMBRE COMPLETO")) {
            CajitaNombre.setText("");
            CajitaNombre.setForeground(Color.black);
        } else if (CajitaNombre.getText().isEmpty()) {
            CajitaNombre.setText("NOMBRE COMPLETO");
            CajitaNombre.setForeground(Color.gray);
    }//GEN-LAST:event_CajitaNombreMousePressed
    }

    private void CajitaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajitaNombreActionPerformed

    private void CajitaCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajitaCedulaMousePressed
        if (CajitaCedula.getText().equals("CEDULA DE CIUDADANIA")) {
            CajitaCedula.setText("");
            CajitaCedula.setForeground(Color.black);
        } else if (CajitaCedula.getText().isEmpty()) {
            CajitaCedula.setText("CEDULA DE CIUDADANIA");
            CajitaCedula.setForeground(Color.gray);
        }
    }//GEN-LAST:event_CajitaCedulaMousePressed

    private void CajitaCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajitaCedulaActionPerformed

    private void CajitaTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajitaTelefonoMousePressed
        if (CajitaTelefono.getText().equals("TELEFONO DE CONTACTO")) {
            CajitaTelefono.setText("");
            CajitaTelefono.setForeground(Color.black);
        } else if (CajitaTelefono.getText().isEmpty()) {
            CajitaTelefono.setText("TELEFONO DE CONTACTO");
            CajitaTelefono.setForeground(Color.gray);
        }     }//GEN-LAST:event_CajitaTelefonoMousePressed

    private void CajitaTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajitaTelefonoActionPerformed

    private void CajitaEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajitaEmailMousePressed
        if (CajitaEmail.getText().equals("CORREO")) {
            CajitaEmail.setText("");
            CajitaEmail.setForeground(Color.black);
        } else if (CajitaEmail.getText().isEmpty()) {
            CajitaEmail.setText("CORREO");
            CajitaEmail.setForeground(Color.gray);
        }     }//GEN-LAST:event_CajitaEmailMousePressed

    private void CajitaEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaEmailActionPerformed


    }//GEN-LAST:event_CajitaEmailActionPerformed

    private void CajitaContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajitaContraseñaMousePressed
        if (CajitaContraseña.getText().equals("UTILIZE MAYUSCULAS, MINISCULAS Y CARACTERES")) {
            CajitaContraseña.setText("");
            CajitaContraseña.setForeground(Color.black);
        } else if (CajitaContraseña.getText().isEmpty()) {
            CajitaContraseña.setText("UTILIZE MAYUSCULAS, MINISCULAS Y CARACTERES");
            CajitaContraseña.setForeground(Color.gray);

        }     }//GEN-LAST:event_CajitaContraseñaMousePressed

    private void CajitaContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaContraseñaActionPerformed


    }//GEN-LAST:event_CajitaContraseñaActionPerformed

    private void CajitaEdadMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CajitaEdadMousePressed
        if (CajitaEdad.getText().equals("INSERTE SU EDAD")) {
            CajitaEdad.setText("");
            CajitaEdad.setForeground(Color.black);
        } else if (CajitaEdad.getText().isEmpty()) {
            CajitaEdad.setText("INSERTE SU EDAD");
            CajitaEdad.setForeground(Color.gray);
        }     }//GEN-LAST:event_CajitaEdadMousePressed

    private void CajitaEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CajitaEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CajitaEdadActionPerformed

    private void BtnRegistraermeBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistraermeBDActionPerformed
        if (CajitaNombre.getText().isEmpty() || CajitaCedula.getText().isEmpty()
                || CajitaTelefono.getText().isEmpty() || CajitaEmail.getText().isEmpty()
                || CajitaContraseña.getText().isEmpty() || CajitaEdad.getText().isEmpty()
                || jComboxSexo.getSelectedItem() == null) {
            JOptionPane.showMessageDialog(this, "POR FAVOR, RELLENE TODOS LOS CAMPOS");
            return;
        }

        // Verifica si el texto en CajitaCedula es un número válido
        String cedulaText = CajitaCedula.getText();
        if (cedulaText.equals("CEDULA DE CIUDADANIA") || !isNumeric(cedulaText)  || cedulaText.length() != 10){
            JOptionPane.showMessageDialog(this, "POR FAVOR INGRESE UNA CDEULA DE 10 DIGITOS");
            return;
        }

        // Verifica si el texto en CajitaTelefono es un número válido
        String telefonoText = CajitaTelefono.getText();
        if (telefonoText.equals("TELEFONO DE CONTACTO") || !isNumeric(telefonoText)) {
            JOptionPane.showMessageDialog(this, "INGRESE UN NUMERO VALIDO");
            return;
        }

        // Verifica si el texto en CajitaEdad es un número válido
        String edadText = CajitaEdad.getText();
        if (edadText.equals("INSERTE SU EDAD") || !isNumeric(edadText)) {
            JOptionPane.showMessageDialog(this, "INGRESE UNA EDAD VALIDAD");
            return;
        }

        try {
            int idCliente = Integer.parseInt(cedulaText);  // Usamos cedula como IDCLIENTE
            int telefono = Integer.parseInt(telefonoText);
            int edad = Integer.parseInt(edadText);

            // Preparar la consulta
            PreparedStatement pst = null;
            Connection con = conectar();

            pst = con.prepareStatement("INSERT INTO `clientes`(`IDCLIENTE`, `NOMBRE`, `CONTRASEÑA`, `SEXO`, `TELEFONO`, `CORREO`, `EDAD`) VALUES (?,?,?,?,?,?,?)");
            pst.setInt(1, idCliente);  // Aquí insertamos la cédula como IDCLIENTE
            pst.setString(2, CajitaNombre.getText());
            pst.setString(3, CajitaContraseña.getText());
            pst.setString(4, jComboxSexo.getSelectedItem().toString());
            pst.setInt(5, telefono);
            pst.setString(6, CajitaEmail.getText());
            pst.setInt(7, edad);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "INGRESO EXITOSO");
            // Lógica para redirigir a otra ventana aquí
        } catch (SQLException e) {
            System.err.print(e);
        }
        
        Login PantL = new Login ();
        PantL.setVisible(true);
        dispose();

    }//GEN-LAST:event_BtnRegistraermeBDActionPerformed

    private void jComboxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboxSexoActionPerformed


        
        
    }//GEN-LAST:event_jComboxSexoActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
        Login PantL = new Login ();
        PantL.setVisible(true);
        dispose();
                
                
    }//GEN-LAST:event_SALIRActionPerformed

    private void HEADERMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HEADERMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HEADERMouseDragged

    private void HEADERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HEADERMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HEADERMousePressed

    private void cargarOpcionesSexo() {
        jComboxSexo.addItem("FEMENINO");
        jComboxSexo.addItem("MASCULINO");
        jComboxSexo.addItem("LGTBQ+");
    }

    private boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton BtnRegistraermeBD;
    public javax.swing.JTextField CajitaCedula;
    public javax.swing.JTextField CajitaContraseña;
    public javax.swing.JTextField CajitaEdad;
    public javax.swing.JTextField CajitaEmail;
    public javax.swing.JTextField CajitaNombre;
    public javax.swing.JTextField CajitaTelefono;
    private javax.swing.JPanel EXITPAN;
    private javax.swing.JPanel HEADER;
    private javax.swing.JLabel LOGO2;
    private javax.swing.JPanel PanelResgistrarse;
    public javax.swing.JButton SALIR;
    private javax.swing.JLabel TEXNOMBR;
    private javax.swing.JLabel TEXNOMBR1;
    private javax.swing.JLabel TEXNOMBR2;
    private javax.swing.JLabel TEXNOMBR6;
    private javax.swing.JLabel TEXNOMBR7;
    private javax.swing.JLabel TEXNOMBR8;
    private javax.swing.JLabel TEXTSEXO;
    public javax.swing.JComboBox<String> jComboxSexo;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    // End of variables declaration//GEN-END:variables
}