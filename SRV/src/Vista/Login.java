package Vista;

import Controladores.ControldelLogin;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;


public class Login extends javax.swing.JFrame {
     private ControldelLogin controlador;
    
    int xMouse, yMouse;
    private int idClienteLogueado;
    RegistroUsuario RGU = new RegistroUsuario();
    
    public Login() {
        initComponents();
    controlador = new ControldelLogin(this);
    }

    @SuppressWarnings("unchecked")
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        LOGO = new javax.swing.JLabel();
        FONDO = new javax.swing.JLabel();
        LOGO2 = new javax.swing.JLabel();
        INICIOSESION = new javax.swing.JLabel();
        USUARIO = new javax.swing.JLabel();
        CAJITAUSUARIO = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        CONTRASEÑA = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        CAJITACONTRASEÑA = new javax.swing.JPasswordField();
        PANELFONDENTRADA = new javax.swing.JPanel();
        ENTRAR = new javax.swing.JLabel();
        HEADER = new javax.swing.JPanel();
        EXITPAN = new javax.swing.JPanel();
        X = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        BTNREGISTRARTE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LOGO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3-removebg-preview.png"))); // NOI18N
        BG.add(LOGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 340, 270));

        FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Captura de pantalla 2024-09-23 200923.png"))); // NOI18N
        BG.add(FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, -160, 380, 680));

        LOGO2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LOGO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/4-removebg-preview_1.png"))); // NOI18N
        LOGO2.setText("jLabel1");
        BG.add(LOGO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 210, 180));

        INICIOSESION.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        INICIOSESION.setText("INICIO DE SESION");
        BG.add(INICIOSESION, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        USUARIO.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        USUARIO.setText("Usuario  ");
        BG.add(USUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        CAJITAUSUARIO.setForeground(new java.awt.Color(204, 204, 204));
        CAJITAUSUARIO.setText("INGRESE SU USUARIO");
        CAJITAUSUARIO.setBorder(null);
        CAJITAUSUARIO.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CAJITAUSUARIOMousePressed(evt);
            }
        });
        CAJITAUSUARIO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJITAUSUARIOActionPerformed(evt);
            }
        });
        BG.add(CAJITAUSUARIO, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 370, 40));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 370, 10));

        CONTRASEÑA.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        CONTRASEÑA.setText("Contraseña");
        BG.add(CONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, -1, -1));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        BG.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 370, 10));

        CAJITACONTRASEÑA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CAJITACONTRASEÑA.setForeground(new java.awt.Color(204, 204, 204));
        CAJITACONTRASEÑA.setText("************");
        CAJITACONTRASEÑA.setBorder(null);
        CAJITACONTRASEÑA.setCaretColor(new java.awt.Color(204, 204, 204));
        CAJITACONTRASEÑA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CAJITACONTRASEÑAMousePressed(evt);
            }
        });
        CAJITACONTRASEÑA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CAJITACONTRASEÑAActionPerformed(evt);
            }
        });
        BG.add(CAJITACONTRASEÑA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 370, 40));

        PANELFONDENTRADA.setBackground(new java.awt.Color(0, 153, 204));
        PANELFONDENTRADA.setForeground(new java.awt.Color(0, 204, 255));

        ENTRAR.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        ENTRAR.setForeground(new java.awt.Color(255, 255, 255));
        ENTRAR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ENTRAR.setText("ENTRAR ");
        ENTRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ENTRAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ENTRARMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ENTRARMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ENTRARMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PANELFONDENTRADALayout = new javax.swing.GroupLayout(PANELFONDENTRADA);
        PANELFONDENTRADA.setLayout(PANELFONDENTRADALayout);
        PANELFONDENTRADALayout.setHorizontalGroup(
            PANELFONDENTRADALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ENTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        PANELFONDENTRADALayout.setVerticalGroup(
            PANELFONDENTRADALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ENTRAR, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        BG.add(PANELFONDENTRADA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 130, 40));

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

        X.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        X.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        X.setText("X");
        X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XMouseExited(evt);
            }
        });

        javax.swing.GroupLayout EXITPANLayout = new javax.swing.GroupLayout(EXITPAN);
        EXITPAN.setLayout(EXITPANLayout);
        EXITPANLayout.setHorizontalGroup(
            EXITPANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );
        EXITPANLayout.setVerticalGroup(
            EXITPANLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(X, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HEADERLayout = new javax.swing.GroupLayout(HEADER);
        HEADER.setLayout(HEADERLayout);
        HEADERLayout.setHorizontalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADERLayout.createSequentialGroup()
                .addComponent(EXITPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 431, Short.MAX_VALUE))
        );
        HEADERLayout.setVerticalGroup(
            HEADERLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HEADERLayout.createSequentialGroup()
                .addComponent(EXITPAN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        BG.add(HEADER, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 30));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        BTNREGISTRARTE.setBackground(new java.awt.Color(153, 255, 255));
        BTNREGISTRARTE.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        BTNREGISTRARTE.setText("REGISTRATE");
        BTNREGISTRARTE.setBorder(null);
        BTNREGISTRARTE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNREGISTRARTE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNREGISTRARTEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTNREGISTRARTE, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTNREGISTRARTE, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        BG.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CAJITAUSUARIOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJITAUSUARIOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJITAUSUARIOActionPerformed

    private void CAJITACONTRASEÑAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CAJITACONTRASEÑAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CAJITACONTRASEÑAActionPerformed

    private void HEADERMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HEADERMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HEADERMousePressed

    private void HEADERMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HEADERMouseDragged

        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_HEADERMouseDragged

    private void XMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XMouseClicked

    private void XMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseEntered
        EXITPAN.setBackground(Color.red);
        X.setForeground(Color.white);
    }//GEN-LAST:event_XMouseEntered

    private void XMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseExited
        EXITPAN.setBackground(Color.white);
        X.setForeground(Color.black);
    }//GEN-LAST:event_XMouseExited

    private void ENTRARMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARMouseEntered
        PANELFONDENTRADA.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_ENTRARMouseEntered

    private void ENTRARMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARMouseExited
        PANELFONDENTRADA.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_ENTRARMouseExited

    private void CAJITAUSUARIOMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CAJITAUSUARIOMousePressed
        if (CAJITAUSUARIO.getText().equals("INGRESE SU USUARIO")) {
            CAJITAUSUARIO.setText("");
            CAJITAUSUARIO.setForeground(Color.black);
        }
        if (String.valueOf(CAJITACONTRASEÑA.getPassword()).isEmpty()) {
            CAJITACONTRASEÑA.setText("************");
            CAJITACONTRASEÑA.setForeground(Color.gray);
        }

    }//GEN-LAST:event_CAJITAUSUARIOMousePressed

    private void CAJITACONTRASEÑAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CAJITACONTRASEÑAMousePressed

        if (String.valueOf(CAJITACONTRASEÑA.getPassword()).equals("************")) {
            CAJITACONTRASEÑA.setText("");
            CAJITACONTRASEÑA.setForeground(Color.black);
        }
        
        if (CAJITAUSUARIO.getText().isEmpty()) {
            CAJITAUSUARIO.setText("INGRESE SU USUARIO");
            CAJITAUSUARIO.setForeground(Color.gray);
        }
        
    }//GEN-LAST:event_CAJITACONTRASEÑAMousePressed

    private void ENTRARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ENTRARMouseClicked
    
    controlador.autenticarYAbrir();
        
    }//GEN-LAST:event_ENTRARMouseClicked

    private void BTNREGISTRARTEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNREGISTRARTEActionPerformed
        
        
        RGU.setLg(this);
        RGU.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_BTNREGISTRARTEActionPerformed

    public String getUsuario() {
        return CAJITAUSUARIO.getText();
    }

    public String getContraseña() {
        return String.valueOf(CAJITACONTRASEÑA.getPassword());
    }

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new Login().setVisible(true);
            }
        });

        System.out.println("BIENVENIDO AL SISTEMA!");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton BTNREGISTRARTE;
    private javax.swing.JPasswordField CAJITACONTRASEÑA;
    private javax.swing.JTextField CAJITAUSUARIO;
    private javax.swing.JLabel CONTRASEÑA;
    private javax.swing.JLabel ENTRAR;
    private javax.swing.JPanel EXITPAN;
    private javax.swing.JLabel FONDO;
    private javax.swing.JPanel HEADER;
    private javax.swing.JLabel INICIOSESION;
    private javax.swing.JLabel LOGO;
    private javax.swing.JLabel LOGO2;
    private javax.swing.JPanel PANELFONDENTRADA;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JLabel X;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}

