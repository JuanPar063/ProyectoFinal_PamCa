package Buscador_Ropa;

import static Buscador_Ropa.PrendasSuperiores.CarritoC;
import static Buscador_Ropa.PrendasSuperiores.listaPrenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/**
 * @author Juan Pardo
 */
public class Carrito extends javax.swing.JFrame {

    public Carrito() {
        initComponents();
        this.setLocationRelativeTo(null);
        Cerrar_Carrito.confirmarSalida(this);
        text1.setVisible(false);
        text2.setVisible(false);
        prendacambiar.setVisible(false);
        aceptar.setVisible(false);
        cantidadcambiar.setVisible(false);

        DefaultTableModel modelo = new DefaultTableModel();

        modelo.addColumn("Nombre");
        modelo.addColumn("Talla");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Imagen");

        // Agregar los registros a la tabla
        for (prenda ropa : listaPrenda) {

            modelo.addRow(new Object[]{ropa.getNombre(), ropa.getTalla(), ropa.getPrecio(), ropa.getCantidadCarrito(), ropa.getImagen()});

        }

        // Establecer el modelo de tabla en el JTable
        tablacarrito.setModel(modelo);

        // Obtener la columna de imagen por índice
        TableColumn imageColumn = tablacarrito.getColumnModel().getColumn(4);

        // Crear el renderizador de celdas personalizado
        ImageRenderer imageRenderer = new ImageRenderer();

        // Establecer el renderizador de celdas personalizado para la columna de imagen
        imageColumn.setCellRenderer(imageRenderer);

        int alturaCelda = 150; // Tamaño en píxeles
        tablacarrito.setRowHeight(alturaCelda);

        int anchoimagen = 250; // Tamaño en píxeles

        tablacarrito.getColumnModel().getColumn(4).setPreferredWidth(anchoimagen);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablacarrito = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        atras = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        editarcarrito = new javax.swing.JButton();
        text1 = new javax.swing.JLabel();
        prendacambiar = new javax.swing.JTextField();
        text2 = new javax.swing.JLabel();
        cantidadcambiar = new javax.swing.JTextField();
        aceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel2.setText("PamCa");

        tablacarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Talla", "Precio", "Cantidad", "Imagen"
            }
        ));
        jScrollPane1.setViewportView(tablacarrito);

        jButton1.setText("Cuenta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        atras.setText("Atras");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        comprar.setText("Comprar");

        editarcarrito.setText("Editar Carrito");
        editarcarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarcarritoActionPerformed(evt);
            }
        });

        text1.setText("Cambiar cantidad de la prenda:");

        text2.setText("Nueva cantidad:");

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(atras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(comprar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(288, 288, 288)))
                        .addGap(30, 30, 30)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(88, 88, 88))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addComponent(editarcarrito))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(text1)))
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(prendacambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cantidadcambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(text2, javax.swing.GroupLayout.Alignment.LEADING))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(aceptar)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(prendacambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(text2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cantidadcambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(aceptar)))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comprar)
                    .addComponent(atras)
                    .addComponent(editarcarrito))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CrearIngresar ci = new CrearIngresar();
        ci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Menú_inicio me = new Menú_inicio();
        me.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void editarcarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarcarritoActionPerformed
        text1.setVisible(true);
        text2.setVisible(true);
        prendacambiar.setVisible(true);
        aceptar.setVisible(true);
        cantidadcambiar.setVisible(true);
    }//GEN-LAST:event_editarcarritoActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        if (prendacambiar.getText().isEmpty() | cantidadcambiar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe indicar primero la prenda y la nueva cantidad que desea añadir a su carrito.");

        } else {
            String cantidad = cantidadcambiar.getText();
            if (!cantidad.matches("\\d+")) {
                JOptionPane.showMessageDialog(null, "Debe ingresar un número para indicar la cantidada nueva del producto en el carrito.");
            } else {

                int id = 0;
                boolean comprobar = false;
                String Prenda = prendacambiar.getText();
                int NuevaCantidad = Integer.parseInt(cantidadcambiar.getText());
                for (prenda ropa : listaPrenda) {
                    if (ropa.getNombre().equalsIgnoreCase(Prenda)) {
                        if (NuevaCantidad <= ropa.getCantidad()) {
                            ropa.setCantidadCarrito(NuevaCantidad);
                            id = ropa.getId();
                            comprobar = true;
                        }
                    }
                }
                if (comprobar) {
                    String actualizar = "UPDATE ropa SET cantidad_carrito = ? WHERE id = ?";
                    try {
                        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_codigo?useSSL=false", "root", "0411");

                        // Prepara la consulta SQL con los parámetros necesarios
                        PreparedStatement statement = connection.prepareStatement(actualizar);
                        statement.setInt(1, NuevaCantidad);
                        statement.setInt(2, id);

                        // Ejecuta la consulta SQL
                        statement.executeUpdate();
                        DefaultTableModel modelo = new DefaultTableModel();

                        modelo.addColumn("Nombre");
                        modelo.addColumn("Talla");
                        modelo.addColumn("Precio");
                        modelo.addColumn("Cantidad");
                        modelo.addColumn("Imagen");

                        // Agregar los registros a la tabla
                        for (prenda ropa : listaPrenda) {

                            modelo.addRow(new Object[]{ropa.getNombre(), ropa.getTalla(), ropa.getPrecio(), ropa.getCantidadCarrito(), ropa.getImagen()});

                        }

                        // Establecer el modelo de tabla en el JTable
                        tablacarrito.setModel(modelo);

                        // Obtener la columna de imagen por índice
                        TableColumn imageColumn = tablacarrito.getColumnModel().getColumn(4);

                        // Crear el renderizador de celdas personalizado
                        ImageRenderer imageRenderer = new ImageRenderer();

                        // Establecer el renderizador de celdas personalizado para la columna de imagen
                        imageColumn.setCellRenderer(imageRenderer);

                        int alturaCelda = 150; // Tamaño en píxeles
                        tablacarrito.setRowHeight(alturaCelda);

                        int anchoimagen = 250; // Tamaño en píxeles

                        tablacarrito.getColumnModel().getColumn(4).setPreferredWidth(anchoimagen);
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null, "No se pudo actualizar la cantidad nueva al carrito." + e);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró una prenda con el nombre ingresado o\n la cantidad nueva solicitada supera el stock del producto.");

                }
            }

        }
    }//GEN-LAST:event_aceptarActionPerformed

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
            java.util.logging.Logger.getLogger(Carrito.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Carrito.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Carrito.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Carrito.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Carrito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aceptar;
    private javax.swing.JButton atras;
    private javax.swing.JTextField cantidadcambiar;
    private javax.swing.JButton comprar;
    private javax.swing.JButton editarcarrito;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField prendacambiar;
    private javax.swing.JTable tablacarrito;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    // End of variables declaration//GEN-END:variables
}
