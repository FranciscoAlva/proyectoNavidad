package ayudahumanitaria2;
// LIBRERIAS IMPORTADAS PARA FUNCIONAR EL PROGRAMA

import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//SE LLAMA AL METODO PARA LA CONEXION
public class AppAyudaHumanitaria2 extends javax.swing.JFrame {

    conexionMysql con = new conexionMysql();
    Connection cn = con.conectar();

    //AQUI SE BLOQUEAN TODO PARA QUE NO SE VEAN DE INICIO EN EL PROGRAMA
    public AppAyudaHumanitaria2() {
        initComponents();
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jTable1.setVisible(false);
        jScrollPane1.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
        mostrardatos();
        datosproductos();
        datosong();
        datoszonaafectada();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrimerApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSegundoApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        BtnGuardar = new javax.swing.JButton();
        BtnModificar = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtIdProducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNombre_Producto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboProductos = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionProducto = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        txtIdDonante = new javax.swing.JTextField();
        BtnGuardarProducto = new javax.swing.JButton();
        BtnModificarProducto = new javax.swing.JButton();
        BtnEliminarProducto = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtIdONG = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtONG = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtONGNombre = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtCIF = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtLocalidadONG = new javax.swing.JTextField();
        BtnGuardarONG = new javax.swing.JButton();
        BtonModificarONG = new javax.swing.JButton();
        BtnEliminarONG = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        txtIdZA = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtNombreZA = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtPaisZA = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtCiudadZA = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtNombreONGZA = new javax.swing.JTextField();
        BtnGuardarZA = new javax.swing.JButton();
        BtnModificarZA = new javax.swing.JButton();
        BtnEliminarZA = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Datos del Donante", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Id");

        txtId.setBackground(new java.awt.Color(0, 0, 0));
        txtId.setForeground(new java.awt.Color(255, 255, 255));
        txtId.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtId.setEnabled(false);

        jLabel2.setForeground(new java.awt.Color(102, 102, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");

        jLabel3.setForeground(new java.awt.Color(102, 102, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Primer Apellido");

        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Segundo Apellido");

        jLabel5.setForeground(new java.awt.Color(102, 102, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("DNI");

        jLabel6.setForeground(new java.awt.Color(102, 102, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Localidad");

        BtnGuardar.setText("Guardar");
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnModificar.setText("Modificar");
        BtnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarActionPerformed(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtId)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPrimerApellido)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtSegundoApellido)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDNI)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLocalidad))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BtnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrimerApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSegundoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardar)
                .addGap(18, 18, 18)
                .addComponent(BtnModificar)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminar)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Donantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        jTable1.setForeground(new java.awt.Color(102, 102, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 563, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA EL PRODUCTO A DONAR", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(102, 102, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("ID Producto");

        txtIdProducto.setBackground(new java.awt.Color(0, 0, 0));
        txtIdProducto.setEnabled(false);
        txtIdProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdProductoActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Nombre de producto");

        jLabel9.setForeground(new java.awt.Color(102, 102, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Tipo de Producto");

        comboProductos.setForeground(new java.awt.Color(51, 51, 255));
        comboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONA UNA OPCION", "COMIDA", "MEDICINA", "ROPA", "OTROS" }));

        jLabel10.setForeground(new java.awt.Color(102, 102, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Descripcion del Producto");

        txtDescripcionProducto.setColumns(20);
        txtDescripcionProducto.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionProducto);

        jLabel11.setForeground(new java.awt.Color(102, 102, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Id Donante");

        BtnGuardarProducto.setText("Guardar");
        BtnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarProductoActionPerformed(evt);
            }
        });

        BtnModificarProducto.setText("Modificar");
        BtnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnModificarProductoActionPerformed(evt);
            }
        });

        BtnEliminarProducto.setText("Eliminar");
        BtnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarProductoActionPerformed(evt);
            }
        });

        jLabel12.setForeground(new java.awt.Color(102, 102, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Id ONG");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdProducto)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre_Producto)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdDonante)
                    .addComponent(BtnModificarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdONG)
                    .addComponent(BtnGuardarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdDonante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardarProducto)
                .addGap(18, 18, 18)
                .addComponent(BtnModificarProducto)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminarProducto)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE PRODUCTO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });

        jTable2.setForeground(new java.awt.Color(102, 102, 255));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(204, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA LOS DATOS DE ONG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel13.setForeground(new java.awt.Color(102, 102, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("IdONG");

        txtONG.setBackground(new java.awt.Color(0, 0, 0));
        txtONG.setEnabled(false);

        jLabel14.setForeground(new java.awt.Color(102, 102, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Nombre ONG");

        txtONGNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtONGNombreActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(102, 102, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("CIF ");

        jLabel16.setForeground(new java.awt.Color(102, 102, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Localidad de ONG");

        BtnGuardarONG.setText("Guardar");
        BtnGuardarONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarONGActionPerformed(evt);
            }
        });

        BtonModificarONG.setText("Modificar");
        BtonModificarONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtonModificarONGActionPerformed(evt);
            }
        });

        BtnEliminarONG.setText("Eliminar");
        BtnEliminarONG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarONGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtONG)
                    .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtONGNombre)
                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCIF)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtLocalidadONG)
                    .addComponent(BtnGuardarONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtonModificarONG, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                    .addComponent(BtnEliminarONG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtONGNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCIF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLocalidadONG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardarONG)
                .addGap(18, 18, 18)
                .addComponent(BtonModificarONG)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminarONG)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(204, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE ONG", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        jTable3.setForeground(new java.awt.Color(102, 102, 255));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(204, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "INGRESA DATOS DE LA ZONA AFECTADA", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N

        jLabel17.setForeground(new java.awt.Color(102, 102, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Id Zona Afectada");

        txtIdZA.setBackground(new java.awt.Color(0, 0, 0));

        jLabel18.setForeground(new java.awt.Color(102, 102, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Nombre Zona Afectada");

        jLabel19.setForeground(new java.awt.Color(102, 102, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Pais");

        jLabel20.setForeground(new java.awt.Color(102, 102, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Ciudad");

        jLabel21.setForeground(new java.awt.Color(102, 102, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Nombre ONG");

        BtnGuardarZA.setText("Guardar ");
        BtnGuardarZA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarZAActionPerformed(evt);
            }
        });

        BtnModificarZA.setText("Modificar");

        BtnEliminarZA.setText("Eliminar");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEliminarZA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIdZA)
                    .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(txtNombreZA)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtPaisZA)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCiudadZA)
                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreONGZA)
                    .addComponent(BtnGuardarZA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnModificarZA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPaisZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCiudadZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreONGZA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardarZA)
                .addGap(18, 18, 18)
                .addComponent(BtnModificarZA)
                .addGap(18, 18, 18)
                .addComponent(BtnEliminarZA)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LISTADO DE ZONAS AFECTADAS", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 255))); // NOI18N

        jTable4.setForeground(new java.awt.Color(0, 51, 255));
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane5.setViewportView(jTable4);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 687, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "App de Ayuda Humanitaria", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(0, 0, 204))); // NOI18N
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 204));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jMenu1.setText("Donantes");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Productos");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem2.setText("Abrir Productos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("ONG");

        jMenuItem3.setText("Abrir");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Zona Afectada");

        jMenuItem4.setText("Abrir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem4);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //METODO PARA MOSTRAR LOS PANELES EN EL MENU DE DONANTES
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jTable1.setVisible(true);
        jScrollPane1.setVisible(true);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    //METODO PARA EL BOTON DE GUARDAR DONANTES
    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
       
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO donantes (Nombre,Primer_Apellido,Segundo_Apellido,DNI,Localidad) VALUES (?,?,?,?,?)");
            ps.setString(1, txtNombre.getText());
            ps.setString(2, txtPrimerApellido.getText());
            ps.setString(3, txtSegundoApellido.getText());
            ps.setString(4, txtDNI.getText());
            ps.setString(5, txtLocalidad.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            mostrardatos();
            limpiarentradas();
        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR AL DONANTE" + e);
        }
    }//GEN-LAST:event_BtnGuardarActionPerformed

    //METODO PARA SELECCIONAR UNA FILA DE LOS DONANTES Y BLOQUEAR EL BOTON GUARDAR PARA PODER MODIFICAR
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        BtnGuardar.setEnabled(false);
        BtnModificar.setEnabled(true);
        int fila;
        fila = this.jTable1.getSelectedRow();
        this.txtId.setText(this.jTable1.getValueAt(fila, 0).toString());
        this.txtNombre.setText(this.jTable1.getValueAt(fila, 1).toString());
        this.txtPrimerApellido.setText(this.jTable1.getValueAt(fila, 2).toString());
        this.txtSegundoApellido.setText(this.jTable1.getValueAt(fila, 3).toString());
        this.txtDNI.setText(this.jTable1.getValueAt(fila, 4).toString());
        this.txtLocalidad.setText(this.jTable1.getValueAt(fila, 5).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    //METODO PARA EL BOTON DE MODIFICAR DONANTES
    private void BtnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarActionPerformed
       
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE donantes SET Nombre='" + txtNombre.getText() + "',Primer_Apellido='" + txtPrimerApellido.getText() + "',Segundo_Apellido='" + txtSegundoApellido.getText() + "',DNI='" + txtDNI.getText() + "',Localidad='" + txtLocalidad.getText() + "' WHERE Id='" + txtId.getText() + "'");
            int indice = ps.executeUpdate();

            if (indice > 0) {
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                mostrardatos();
                limpiarentradas();
            } else {
                JOptionPane.showMessageDialog(null, "NO SELECCIONO NINGUNA FILA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS" + e);
        }
    }//GEN-LAST:event_BtnModificarActionPerformed

    
    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
    }//GEN-LAST:event_jMenu2ActionPerformed
        
    //METODO PARA BLOQUEAR EL BOTON GUARDAR DE DONANTES
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
       
        BtnGuardar.setEnabled(true);
        BtnModificar.setEnabled(false);
        limpiarentradas();
    }//GEN-LAST:event_jPanel2MouseClicked

    //METODO QUE SE VEAN LOS PANELES EN EL MENU PRODUCTOS
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jTable1.setVisible(false);
        jScrollPane1.setVisible(false);
        jPanel3.setVisible(true);
        jPanel4.setVisible(true);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // METODO PARA EL BOTON DE ELIMINAR DONANTES
    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed
       
        if (JOptionPane.showConfirmDialog(null, "QUIERE ELIMINAR DONANTE", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            try {
                PreparedStatement ps = cn.prepareStatement("DELETE FROM Donantes WHERE Id='" + txtId.getText() + "'");
                int indice = ps.executeUpdate();
                if (indice > 0) {
                    mostrardatos();
                } else {
                    System.out.println("FILA NO SELECCIONADA");
                }
                limpiarentradas();
            } catch (SQLException e) {
                System.out.println("ERROR AL ELIMINAR DATOS" + e);
            }
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed
    //METODO QUE SE VEAN LOS PANELES EN EL MENU PRODUCTOS
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jTable1.setVisible(false);
        jScrollPane1.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(true);
        jPanel6.setVisible(true);
        jPanel7.setVisible(false);
        jPanel8.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jTable1.setVisible(false);
        jScrollPane1.setVisible(false);
        jPanel3.setVisible(false);
        jPanel4.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel7.setVisible(true);
        jPanel8.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed
   
    private void txtIdProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdProductoActionPerformed
    }//GEN-LAST:event_txtIdProductoActionPerformed
    
    //METODO PARA EL BOTON DE GUARDAR PRODUCTOS
    private void BtnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarProductoActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO productos (Nombre_Producto,TipodeProducto,Descripcion_Producto,Iddonante,IdONG) VALUES (?,?,?,?,?)");
            ps.setString(1, txtNombre_Producto.getText());
            ps.setString(2, comboProductos.getSelectedItem().toString());
            ps.setString(3, txtDescripcionProducto.getText());
            ps.setString(4, txtIdDonante.getText());
            ps.setString(5, txtIdONG.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            datosproductos();
            limpiarentradas2();
        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR EL PRODUCTO" + e);
        }
    }//GEN-LAST:event_BtnGuardarProductoActionPerformed
    
    //METODO PARA EL BOTON MODIFICAR DE PRODUCTOS
    private void BtnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnModificarProductoActionPerformed
       
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE productos SET Nombre_Producto='" + txtNombre_Producto.getText() + "',TipodeProducto='" + comboProductos.getSelectedItem() + "',Descripcion_Producto='" + txtDescripcionProducto.getText() + "',Iddonante='" + txtIdDonante.getText() + "',IdONG='" + txtIdONG.getText() + "' WHERE Id_Producto='" + txtIdProducto.getText() + "'");
            int indice2 = ps.executeUpdate();

            if (indice2 > 0) {
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                datosproductos();
                limpiarentradas2();
            } else {
                JOptionPane.showMessageDialog(null, "NO SELECCIONO NINGUNA FILA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS" + e);
        }
    }//GEN-LAST:event_BtnModificarProductoActionPerformed

    //METODO PARA SELECCIONAR UNA FILA DE LOS PRODUCTOS Y BLOQUEAR EL BOTON GUARDAR PARA PODER MODIFICAR
    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       
        BtnGuardarProducto.setEnabled(false);
        BtnModificarProducto.setEnabled(true);
        int fila2;
        fila2 = this.jTable2.getSelectedRow();
        this.txtIdProducto.setText(this.jTable2.getValueAt(fila2, 0).toString());
        this.txtNombre_Producto.setText(this.jTable2.getValueAt(fila2, 1).toString());
        this.comboProductos.setSelectedItem(this.jTable2.getValueAt(fila2, 2).toString());
        this.txtDescripcionProducto.setText(this.jTable2.getValueAt(fila2, 3).toString());
        this.txtIdDonante.setText(this.jTable2.getValueAt(fila2, 4).toString());
        this.txtIdONG.setText(this.jTable2.getValueAt(fila2, 5).toString());
    }//GEN-LAST:event_jTable2MouseClicked

    //PARA BLOQUEAR BOTON MODIFICAR EN PRODUCTOS Y LIMPIAR LOS DATOS
    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        
        BtnGuardarProducto.setEnabled(true);
        BtnModificarProducto.setEnabled(false);
        limpiarentradas2();
    }//GEN-LAST:event_jPanel4MouseClicked

    //BOTON ELIMINAR PRODUCTOS
    private void BtnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarProductoActionPerformed
        
       if (JOptionPane.showConfirmDialog(null, "DESEA ELIMINAR ESTE PRODUCTO", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
        try {
            PreparedStatement ps = cn.prepareStatement("DELETE FROM productos WHERE Id_Producto='" + txtIdProducto.getText() + "'");
            int indice = ps.executeUpdate();
            if (indice > 0) {
                datosproductos();
            } else {
                System.out.println("FILA NO SELECCIONADA");
            }
            limpiarentradas2();
        } catch (SQLException e) {
            System.out.println("ERROR AL ELIMINAR DATOS" + e);
        }
       }
    }//GEN-LAST:event_BtnEliminarProductoActionPerformed
    
    private void txtONGNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtONGNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtONGNombreActionPerformed
    
    //BOTON GUARDAR ONG
    private void BtnGuardarONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarONGActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO ong (NombreONG,CIF,Localidad) VALUES (?,?,?)");
            ps.setString(1, txtONGNombre.getText());
            ps.setString(2, txtCIF.getText());
            ps.setString(3, txtLocalidadONG.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            datosong();
            limpiarentradas3();
        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR AL DONANTE" + e);
        }
    }//GEN-LAST:event_BtnGuardarONGActionPerformed

    // BOTON DE MODIFICAR DATOS ONG
    private void BtonModificarONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtonModificarONGActionPerformed
        
        try {
            PreparedStatement ps = cn.prepareStatement("UPDATE ong SET NombreONG='" + txtONGNombre.getText() + "',CIF='" + txtCIF.getText() + "',Localidad='" + txtLocalidadONG.getText() + "' WHERE IdONG='" + txtONG.getText() + "'");
            int indice = ps.executeUpdate();

            if (indice > 0) {
                JOptionPane.showMessageDialog(rootPane, "DATOS ACTUALIZADOS CORRECTAMENTE");
                datosong();
                limpiarentradas3();
            } else {
                JOptionPane.showMessageDialog(null, "NO SELECCIONO NINGUNA FILA");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR AL ACTUALIZAR DATOS" + e);
        }
    }//GEN-LAST:event_BtonModificarONGActionPerformed

    // METODO PARA SELECCIONAR UNA FILA DE LAS ONG Y BLOQUEAR EL BOTON GUARDAR PARA PODER MODIFICAR
    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        
        BtnGuardarONG.setEnabled(false);
        BtonModificarONG.setEnabled(true);
        int fila;
        fila = this.jTable3.getSelectedRow();
        this.txtONG.setText(this.jTable3.getValueAt(fila, 0).toString());
        this.txtONGNombre.setText(this.jTable3.getValueAt(fila, 1).toString());
        this.txtCIF.setText(this.jTable3.getValueAt(fila, 2).toString());
        this.txtLocalidadONG.setText(this.jTable3.getValueAt(fila, 3).toString());
    }//GEN-LAST:event_jTable3MouseClicked

    // PARA BLOQUEAR BOTON MODIFICAR EN ONG Y LIMPIAR LOS DATOS     
    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        
        BtnGuardarONG.setEnabled(true);
        BtonModificarONG.setEnabled(false);
        limpiarentradas3();
    }//GEN-LAST:event_jPanel6MouseClicked

    //BOTON ELIMINAR ONG
    private void BtnEliminarONGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarONGActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "ELIMINAR ONG", "SALIR", JOptionPane.YES_NO_CANCEL_OPTION) == 0) {
            try {
                PreparedStatement ps = cn.prepareStatement("DELETE FROM ong WHERE IdONG='" + txtONG.getText() + "'");
                int indice = ps.executeUpdate();
                if (indice > 0) {
                    datosong();
                } else {
                    System.out.println("FILA NO SELECCIONADA");
                }
                limpiarentradas3();
            } catch (SQLException e) {
                System.out.println("ERROR AL ELIMINAR DATOS" + e);
            }
        }
    }//GEN-LAST:event_BtnEliminarONGActionPerformed

    //BOTON GUARDAR ZONA AFECTADA
    private void BtnGuardarZAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarZAActionPerformed
       
        try {
            PreparedStatement ps = cn.prepareStatement("INSERT INTO zonaafectada (NombreZA,PaisZA,CiudadZA,NombreONG) VALUES (?,?,?,?)");
            ps.setString(1, txtNombreZA.getText());
            ps.setString(2, txtPaisZA.getText());
            ps.setString(3, txtCiudadZA.getText());
            ps.setString(4, txtDNI.getText());
            ps.setString(5, txtNombreONGZA.getText());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "DATOS GUARDADOS CORRECTAMENTE");
            datoszonaafectada();
            limpiarentradas4();
        } catch (SQLException e) {
            System.out.println("ERROR AL GUARDAR LA ZONA AFECTADA" + e);
        }
    }//GEN-LAST:event_BtnGuardarZAActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppAyudaHumanitaria2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnEliminarONG;
    private javax.swing.JButton BtnEliminarProducto;
    private javax.swing.JButton BtnEliminarZA;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnGuardarONG;
    private javax.swing.JButton BtnGuardarProducto;
    private javax.swing.JButton BtnGuardarZA;
    private javax.swing.JButton BtnModificar;
    private javax.swing.JButton BtnModificarProducto;
    private javax.swing.JButton BtnModificarZA;
    private javax.swing.JButton BtonModificarONG;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField txtCIF;
    private javax.swing.JTextField txtCiudadZA;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextArea txtDescripcionProducto;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdDonante;
    private javax.swing.JTextField txtIdONG;
    private javax.swing.JTextField txtIdProducto;
    private javax.swing.JTextField txtIdZA;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtLocalidadONG;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreONGZA;
    private javax.swing.JTextField txtNombreZA;
    private javax.swing.JTextField txtNombre_Producto;
    private javax.swing.JTextField txtONG;
    private javax.swing.JTextField txtONGNombre;
    private javax.swing.JTextField txtPaisZA;
    private javax.swing.JTextField txtPrimerApellido;
    private javax.swing.JTextField txtSegundoApellido;
    // End of variables declaration//GEN-END:variables

    // METODO PARA MOSTRAR LOS DATOS EN LA TABLA DONANTES
    private void mostrardatos() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Primer Apellido");
        modelo.addColumn("Segundo Apellido");
        modelo.addColumn("DNI");
        modelo.addColumn("Localidad");
        jTable1.setModel(modelo);
        String consultasql = "select*from donantes";
        String data[] = new String[6];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                data[4] = rs.getString(5);
                data[5] = rs.getString(6);
                modelo.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }

    // METODO PARA LIMPIAR LOS DATOS DE DONANTES
    private void limpiarentradas() {
        
        txtId.setText("");
        txtNombre.setText("");
        txtPrimerApellido.setText("");
        txtSegundoApellido.setText("");
        txtDNI.setText("");
        txtLocalidad.setText("");
    }

    // METODO PARA MOSTRAR DATOS EN LA TABLA PRODUCTOS
    private void datosproductos() {
       
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id Producto");
        modelo.addColumn("Nombre Producto");
        modelo.addColumn("Tipo de Producto");
        modelo.addColumn("Descripcion del Producto");
        modelo.addColumn("Id Donante");
        modelo.addColumn("Id ONG");
        jTable2.setModel(modelo);
        String consultasql = "select*from productos";
        String data2[] = new String[6];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data2[0] = rs.getString(1);
                data2[1] = rs.getString(2);
                data2[2] = rs.getString(3);
                data2[3] = rs.getString(4);
                data2[4] = rs.getString(5);
                data2[5] = rs.getString(6);
                modelo.addRow(data2);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }
    
    // METODO PARA LIMPIAR PRODUCTOS
    private void limpiarentradas2() {
       
        txtIdProducto.setText("");
        txtNombre_Producto.setText("");
        comboProductos.setSelectedIndex(0);
        txtDescripcionProducto.setText("");
        txtIdDonante.setText("");
        txtIdONG.setText("");
    }

    //MOSTRAR DATOS DE ONG
    private void datosong() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id ONG");
        modelo.addColumn("Nombre ONG");
        modelo.addColumn("CIF ONG");
        modelo.addColumn("Localidad");
        jTable3.setModel(modelo);
        String consultasql = "select*from ong";
        String data3[] = new String[4];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data3[0] = rs.getString(1);
                data3[1] = rs.getString(2);
                data3[2] = rs.getString(3);
                data3[3] = rs.getString(4);
                modelo.addRow(data3);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }

    // METODO PARA LIMPIAR ONG
    private void limpiarentradas3() {
        
        txtONG.setText("");
        txtONGNombre.setText("");
        txtCIF.setText("");
        txtLocalidadONG.setText("");
    }

    //MOSTRAR DATOS DE ZONA AFECTADA
    private void datoszonaafectada() {
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id Zona Afectada");
        modelo.addColumn("Nombre Zona Afectada");
        modelo.addColumn("Pais");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Nombre ONG");
        jTable4.setModel(modelo);
        String consultasql = "select*from ong";
        String data4[] = new String[5];

        Statement st;
        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(consultasql);
            while (rs.next()) {
                data4[0] = rs.getString(1);
                data4[1] = rs.getString(2);
                data4[2] = rs.getString(3);
                data4[3] = rs.getString(4);
                data4[4] = rs.getString(5);
                modelo.addRow(data4);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar datos " + e);
        }
    }

    private void limpiarentradas4() {
        
        txtIdZA.setText("");
        txtNombreZA.setText("");
        txtPaisZA.setText("");
        txtCiudadZA.setText("");
        txtNombreONGZA.setText("");
    }
    
    
}
