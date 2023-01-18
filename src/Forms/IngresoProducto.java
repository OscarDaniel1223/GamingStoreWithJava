/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dany0
 */

public class IngresoProducto extends javax.swing.JPanel {

    /**
     * Creates new form IngresoProducto
     */
    String url = "jdbc:mysql://localhost:3306/tienda";
    String username = "root";
    String password = "";
    String nombreUsuario;
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection connection;
    PreparedStatement pstm;
    ResultSet rs;
    DefaultTableModel modelo = new DefaultTableModel();
    public void MostrarTabla(){
        String consulta = "Select * from misproductos";
        try{
            connection = DriverManager.getConnection(url, username, password);
            pstm = connection.prepareStatement(consulta);
            rs = pstm.executeQuery();
            Object[] misProductos = new Object[5];
            modelo = (DefaultTableModel) jTableProductos.getModel();
            while(rs.next()){
                misProductos [0] = rs.getString("CodigoProducto");
                misProductos [1] = rs.getString("NombreProducto");
                misProductos [2] = rs.getDouble("Existencia");
                misProductos [3] = "$" + rs.getDouble("PrecioUnitario");
                misProductos[4] = rs.getDouble("Descuento");
                modelo.addRow(misProductos);
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.", "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void LimpiarTabla(){
        for(int i = 0; i< jTableProductos.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }
    public void TransferirFocus(){
        KeyEvent ev = null;
        if(ev.getKeyCode() == KeyEvent.VK_ENTER){
            this.transferFocus();
        }
    }
    
    public void LimpiarTextBoxs(){
        txtCodigoProducto.setText("");
        txtNombreProducto.setText("");
        spnCantidad.setText("");
        txtPrecioUnitario.setText("");
        txtDescuento.setText("0");
    }
    
    public IngresoProducto() {
        initComponents();
        num(spnCantidad);
        num(txtPrecioUnitario);
        num(txtDescuento);
        MostrarTabla();
       
        
        
    }
    private void num(JTextField a){
       a.addKeyListener(new KeyAdapter(){
           public void keyTyped(KeyEvent e){
                char c = e.getKeyChar();
                if(!Character.isDigit(c) && c != '.'){
                    e.consume();
            
                }
                if(c == '.' && a.getText().contains(".")){
                    e.consume();
                }
                
           }
       });
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        txtNombreProducto = new javax.swing.JTextField();
        txtPrecioUnitario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDescuento = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 21, 126), 3));

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setText("Codigo del producto:");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel2.setText("Nombre del producto:");

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel3.setText("Cantidad:");

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel4.setText("Precio unitario:");

        txtCodigoProducto.setBorder(null);
        txtCodigoProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCodigoProductoKeyReleased(evt);
            }
        });

        txtNombreProducto.setBorder(null);
        txtNombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreProductoKeyReleased(evt);
            }
        });

        txtPrecioUnitario.setBorder(null);

        jLabel6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Inventario");

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo ", "Producto", "Existencia", "Precio Unitario", "Descuento(%)"
            }
        ));
        jScrollPane1.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(0).setPreferredWidth(100);
            jTableProductos.getColumnModel().getColumn(1).setPreferredWidth(650);
        }

        jLabel7.setText("USD");

        spnCantidad.setBorder(null);
        spnCantidad.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                spnCantidadPropertyChange(evt);
            }
        });
        spnCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                spnCantidadKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                spnCantidadKeyTyped(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(86, 21, 126));
        btnIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paquete.png"))); // NOI18N
        btnIngresar.setText("Ingresar producto");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel5.setText("Descuento:");

        txtDescuento.setText("0");
        txtDescuento.setBorder(null);

        jLabel8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        jLabel8.setText("%");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1)
                        .addGap(27, 27, 27)
                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(jLabel5)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8)
                        .addGap(277, 277, 277)
                        .addComponent(btnIngresar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)
                        .addGap(114, 114, 114)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator5)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                        .addGap(85, 85, 85)
                        .addComponent(jLabel4)
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(jLabel7))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel7)))
                        .addGap(6, 6, 6)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel6))
                            .addComponent(jLabel8)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnIngresar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    ///Metodo que guarda la informacio del producto en la base de datos y si ya se encuentra imprime la informacion en los campos para su actualizacion
    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        // TODO add your handling code here:
        if(txtCodigoProducto.getText().equals("") || txtNombreProducto.getText().equals("") || spnCantidad.getText().equals("") || txtPrecioUnitario.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Complete todos los campos solicitados.", "Informacion incompleta", JOptionPane.ERROR_MESSAGE);
        }else{
            String cod = txtCodigoProducto.getText();
        String nombre = txtNombreProducto.getText();
        double cantidad = Double.parseDouble(spnCantidad.getText());
        double precio = Double.parseDouble(txtPrecioUnitario.getText());
        double desc = Double.parseDouble(txtDescuento.getText());
        
        try{
            connection = DriverManager.getConnection(url, username,password);
            pstm = connection.prepareStatement("Select * from misProductos where CodigoProducto = ?");
            pstm.setString(1, cod);
            rs = pstm.executeQuery();
            if(rs.next()){
                if(txtDescuento.getText() == ""){
                double nuevaCantidad;
                rs.first();
                double existencia  = rs.getDouble(3);
                nuevaCantidad = existencia + cantidad;
                pstm = connection.prepareStatement("Update misproductos set Existencia = ? where CodigoProducto = ? ");
                pstm.setDouble(1, nuevaCantidad);
                pstm.setString(2, cod);
                pstm.executeUpdate();
                LimpiarTabla();
                MostrarTabla();
                System.out.println("Registro actualizado");
                System.out.println("Existencia: " + existencia);
                System.out.println("Cantidad nueva: "+ nuevaCantidad);
                LimpiarTextBoxs();
                connection.close();
                }else{
                    double nuevaCantidad = Double.parseDouble(spnCantidad.getText());
                    double nuevoDesc = Double.parseDouble(txtDescuento.getText());
                    rs.first();
                    pstm = connection.prepareStatement("Update misproductos set Existencia = ? , Descuento = ? where CodigoProducto = ? ");
                    pstm.setDouble(1, nuevaCantidad);
                    pstm.setDouble(2, nuevoDesc);
                    pstm.setString(3, cod);
                    pstm.executeUpdate();
                    LimpiarTabla();
                    MostrarTabla();
                    System.out.println("Registro actualizado");
                    System.out.println("Cantidad nueva: "+ nuevaCantidad);
                    System.out.println("Nuevo descuento: " + nuevoDesc);
                    LimpiarTextBoxs();
                    connection.close();
                }
               
               
                
            }else{
                pstm = connection.prepareStatement("Insert into misProductos(CodigoProducto, NombreProducto, Existencia, PrecioUnitario, Descuento) values (?,?,?,?,?)");
                pstm.setString(1, cod);
                pstm.setString(2, nombre);
                pstm.setDouble(3, cantidad);
                pstm.setDouble(4, precio);
                pstm.setDouble(5, desc);
                pstm.executeUpdate();
                LimpiarTabla();
                MostrarTabla();
                System.out.println("Producto añadido.");
                LimpiarTextBoxs();
                connection.close();
            }
            
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al conectar con la base de datos.", "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        }
        
        
        
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void spnCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnCantidadKeyTyped
        // TODO add your handling code here:
         
       
       
        
    }//GEN-LAST:event_spnCantidadKeyTyped
///Este metodo sirve por si el producto ya existe en la BD, imprime la informacion el los correspondientes campos
    private void txtCodigoProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoProductoKeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            String cod = txtCodigoProducto.getText();
            try{
                connection =DriverManager.getConnection(url, username, password);
                pstm = connection.prepareStatement("Select * from misProductos where CodigoProducto = ?");
                pstm.setString(1, cod);
                rs = pstm.executeQuery();
                if(rs.next()){
                    txtNombreProducto.setText(rs.getString("NombreProducto"));
                    spnCantidad.setText(String.valueOf(rs.getDouble("Existencia")));
                    txtPrecioUnitario.setText(String.valueOf(rs.getDouble("PrecioUnitario")));
                    txtDescuento.setText(String.valueOf(rs.getDouble("Descuento")));
                }
            }catch(SQLException ex){
                System.out.println(ex);
            }
            txtCodigoProducto.transferFocus();
        }
        
    }//GEN-LAST:event_txtCodigoProductoKeyReleased

    private void txtNombreProductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreProductoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtNombreProductoKeyReleased

    private void spnCantidadKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_spnCantidadKeyPressed
        // TODO add your handling code here:
       
       
        
    }//GEN-LAST:event_spnCantidadKeyPressed

    private void spnCantidadPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_spnCantidadPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_spnCantidadPropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTextField spnCantidad;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtNombreProducto;
    private javax.swing.JTextField txtPrecioUnitario;
    // End of variables declaration//GEN-END:variables
}
