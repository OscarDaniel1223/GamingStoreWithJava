/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


/**
 *
 * @author Dany0
 */
public class RegistroUsuario extends javax.swing.JPanel {

    /**
     * Creates new form RegistroUsuario
     */
    public RegistroUsuario() {
        initComponents();
        lblConfirm.setVisible(false);
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
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtContra = new javax.swing.JPasswordField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtConfirmContra = new javax.swing.JPasswordField();
        jSeparator4 = new javax.swing.JSeparator();
        rdbAdmin = new javax.swing.JRadioButton();
        rdbUser = new javax.swing.JRadioButton();
        btnRegistrar = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 21, 126), 3));
        setMinimumSize(new java.awt.Dimension(1230, 474));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Nombre de usuario:");

        txtUsuario.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtUsuario.setBorder(null);
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Correo electronico:");

        txtCorreo.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtCorreo.setBorder(null);
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        txtContra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtContra.setBorder(null);
        txtContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Confirmar contraseña:");

        txtConfirmContra.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        txtConfirmContra.setBorder(null);
        txtConfirmContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtConfirmContraKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConfirmContraKeyTyped(evt);
            }
        });

        rdbAdmin.setBackground(new java.awt.Color(255, 255, 255));
        rdbAdmin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdbAdmin.setText("Administrador");
        rdbAdmin.setBorder(null);
        rdbAdmin.setFocusPainted(false);
        rdbAdmin.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbAdminStateChanged(evt);
            }
        });

        rdbUser.setBackground(new java.awt.Color(255, 255, 255));
        rdbUser.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        rdbUser.setText("Usuario");
        rdbUser.setBorder(null);
        rdbUser.setFocusCycleRoot(true);
        rdbUser.setFocusPainted(false);
        rdbUser.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rdbUserStateChanged(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(86, 21, 126));
        btnRegistrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistrarMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Registrar");

        javax.swing.GroupLayout btnRegistrarLayout = new javax.swing.GroupLayout(btnRegistrar);
        btnRegistrar.setLayout(btnRegistrarLayout);
        btnRegistrarLayout.setHorizontalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(38, 38, 38))
        );
        btnRegistrarLayout.setVerticalGroup(
            btnRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnRegistrarLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(15, 15, 15))
        );

        lblConfirm.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        lblConfirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/advertencia.png"))); // NOI18N
        lblConfirm.setText("Las contraseñas no coinciden.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblConfirm)
                                    .addComponent(txtConfirmContra, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbAdmin)
                            .addComponent(rdbUser))
                        .addGap(53, 53, 53)
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(123, 123, 123)
                        .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(157, 157, 157)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rdbAdmin)
                                .addGap(18, 18, 18)
                                .addComponent(rdbUser))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(txtContra, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(txtConfirmContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(lblConfirm)))
                .addContainerGap(103, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    String url = "jdbc:mysql://localhost:3306/tienda";
    String username = "root";
    String password = "";
    String nombreUsuario;
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection connection;
    PreparedStatement pstm;
    ResultSet rs;
    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtContraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraKeyReleased
        // TODO add your handling code here:
        String contra = String.valueOf(txtContra.getPassword());
        String confirmContra = String.valueOf(txtConfirmContra.getPassword());
        if(contra.equals(confirmContra)){
            lblConfirm.setVisible(false);
        }else{
            lblConfirm.setVisible(true);
        }
    }//GEN-LAST:event_txtContraKeyReleased

    private void txtConfirmContraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmContraKeyReleased
        // TODO add your handling code here:
        String pass = String.valueOf(txtContra.getPassword());
        String ConfirmPass = String.valueOf(txtConfirmContra.getPassword());
        if(ConfirmPass.equals(pass)){
            lblConfirm.setVisible(false);
        }else{
            lblConfirm.setVisible(true);
        }
    }//GEN-LAST:event_txtConfirmContraKeyReleased

    private void txtConfirmContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmContraKeyTyped
        // TODO add your handling code here:

    }//GEN-LAST:event_txtConfirmContraKeyTyped

    private void rdbAdminStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbAdminStateChanged
        // TODO add your handling code here:
        if(rdbAdmin.isSelected()){
            rdbUser.setSelected(false);
        }
    }//GEN-LAST:event_rdbAdminStateChanged

    private void rdbUserStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rdbUserStateChanged
        // TODO add your handling code here:
        if(rdbUser.isSelected()){
            rdbAdmin.setSelected(false);
        }
    }//GEN-LAST:event_rdbUserStateChanged

    private void btnRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistrarMouseClicked
        // TODO add your handling code here:
        String usuario = txtUsuario.getText();
        String correo = txtCorreo.getText();
        String pass = String.valueOf(txtContra.getPassword());
        String Confirmpass = String.valueOf(txtConfirmContra.getPassword());
        String rol;
        if(rdbAdmin.isSelected()){
            rol = rdbAdmin.getText();
        }else{
            if(rdbUser.isSelected()){
                rol = rdbUser.getText();
            }else{
                rol = "";
            }

        }
        if(usuario.equals("")||correo.equals("")||pass.equals("")|| Confirmpass.equals("")||rol.equals("")){
            JOptionPane.showMessageDialog(null, "Complete toda la informacion", "Error", JOptionPane.ERROR_MESSAGE);
        }else{
            if(lblConfirm.isVisible()){
                JOptionPane.showMessageDialog(null,"Las contraseñas no coinciden.", "Error", JOptionPane.ERROR_MESSAGE);
            }else{
                try{
                    connection = DriverManager.getConnection(url, username, password);
                    pstm = connection.prepareStatement("INSERT INTO usuarios(usuario,correo,pass,rol) VALUES(?,?,?,?)");
                    pstm.setString(1,usuario);
                    pstm.setString(2,correo);
                    pstm.setString(3, pass);
                    pstm.setString(4, rol);

                    pstm.execute();
                    JOptionPane.showMessageDialog(null, "Usuario registrado.");
                    txtUsuario.setText("");
                    txtCorreo.setText("");
                    txtContra.setText("");
                    txtConfirmContra.setText("");
                    rdbAdmin.setSelected(false);
                    rdbUser.setSelected(false);
                }catch(SQLException ex){
                    JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.", "Error de conexion", JOptionPane.ERROR_MESSAGE);
                }
            }

        }

    }//GEN-LAST:event_btnRegistrarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JRadioButton rdbAdmin;
    private javax.swing.JRadioButton rdbUser;
    private javax.swing.JPasswordField txtConfirmContra;
    private javax.swing.JPasswordField txtContra;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
