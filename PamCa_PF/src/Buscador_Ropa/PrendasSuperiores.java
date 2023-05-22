package Buscador_Ropa;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Pardo
 */
public class PrendasSuperiores extends javax.swing.JFrame {

    public // Crear una lista para almacenar los objetos Ropa
            List<prenda> listaprendas = new ArrayList<prenda>();
    public static CarritoClass CarritoC = new CarritoClass();
    public static List<prenda> listaPrenda = CarritoC.getListaPrenda();
    public static List<String> tallasDisponibles = new ArrayList<>();

    public List<prenda> Enviar() {
        return listaPrenda;
    }
    public static int c = 0;
    public static int cant = 0;

    public PrendasSuperiores() {

        initComponents();
        this.setLocationRelativeTo(null);
        Cerrar_Carrito.confirmarSalida(this);
        cant = 0;
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_codigo?allowPublicKeyRetrieval=true", "root", "0411");

            Statement statement = connection.createStatement();
            String query = "SELECT * FROM ropa WHERE tipo = 'prenda superior'";

            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nombre = resultSet.getString("nombre");
                String tipo = resultSet.getString("tipo");
                String talla = resultSet.getString("talla");
                float precio = resultSet.getFloat("precio");
                int cantidad = resultSet.getInt("cantidad");
                int cantidadcarrito = resultSet.getInt("cantidad_carrito");
                byte[] imagen = resultSet.getBytes("imagen");

                prenda ropa = new prenda(id, nombre, tipo, talla, precio, cantidad, cantidadcarrito, imagen);
                listaprendas.add(ropa);
            }

            prenda prenda1 = listaprendas.get(c);
            ImageIcon imageIcon = new ImageIcon(prenda1.getImagen());

            imagenlugar.setIcon(imageIcon);
            nombre.setText(prenda1.getNombre());
            talla.setText(prenda1.getTalla());
            precio.setText(String.valueOf(prenda1.getPrecio()));

            /* Establecer las tallas que hay de la prenda:
            for (prenda ropa : listaprendas) {
                String talla = ropa.getTalla();
                if (!tallasDisponibles.contains(talla)) {
                    tallasDisponibles.add(talla);
                }
            }

            // Crea el modelo:
            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
            for (String talla : tallasDisponibles) {
                comboBoxModel.addElement(talla);
            }
            
           tallaseleccion.setModel(comboBoxModel);*/
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la imagen." + e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imagenlugar = new javax.swing.JLabel();
        talla = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        precio = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        anterior = new javax.swing.JButton();
        siguiente = new javax.swing.JButton();
        carrito = new javax.swing.JButton();
        cuenta = new javax.swing.JButton();
        ccom = new javax.swing.JTextField();
        mas = new javax.swing.JButton();
        menos = new javax.swing.JButton();
        añadir = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        imagenlugar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        talla.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        nombre.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        precio.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI Historic", 1, 14)); // NOI18N
        jLabel1.setText("USD");

        jLabel2.setFont(new java.awt.Font("Vladimir Script", 1, 48)); // NOI18N
        jLabel2.setText("PamCa");

        anterior.setText("<----");
        anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anteriorActionPerformed(evt);
            }
        });

        siguiente.setText("---->");
        siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteActionPerformed(evt);
            }
        });

        carrito.setText("Carrito");
        carrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carritoActionPerformed(evt);
            }
        });

        cuenta.setText("Cuenta");
        cuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuentaActionPerformed(evt);
            }
        });

        ccom.setEditable(false);
        ccom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ccom.setText("0");

        mas.setText("arriba");
        mas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masActionPerformed(evt);
            }
        });

        menos.setText("abajo");
        menos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosActionPerformed(evt);
            }
        });

        añadir.setText("Añadir al carrito");
        añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirActionPerformed(evt);
            }
        });

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel2)
                        .addGap(70, 70, 70)
                        .addComponent(carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(cuenta))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(imagenlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(talla, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(precio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(jButton1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(añadir)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(ccom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(menos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(anterior, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(imagenlugar, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)))
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(talla, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(17, 17, 17)
                            .addComponent(ccom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(mas)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(menos))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(precio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadir)
                    .addComponent(jButton1))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void siguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteActionPerformed

        if (c < (listaprendas.size() - 1)) {

            c = c + 1;
            prenda prenda1 = listaprendas.get(c);
            ImageIcon imageIcon = new ImageIcon(prenda1.getImagen());

            imagenlugar.setIcon(imageIcon);
            nombre.setText(prenda1.getNombre());
            talla.setText(prenda1.getTalla());
            precio.setText(String.valueOf(prenda1.getPrecio()));

        }
        cant = 0;
        ccom.setText(String.valueOf(cant));

    }//GEN-LAST:event_siguienteActionPerformed

    private void anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anteriorActionPerformed
        if (c > 0) {

            c = c - 1;

            prenda prenda1 = listaprendas.get(c);
            ImageIcon imageIcon = new ImageIcon(prenda1.getImagen());

            imagenlugar.setIcon(imageIcon);
            nombre.setText(prenda1.getNombre());
            talla.setText(prenda1.getTalla());
            precio.setText(String.valueOf(prenda1.getPrecio()));

        }
        cant = 0;
        ccom.setText(String.valueOf(cant));
    }//GEN-LAST:event_anteriorActionPerformed

    private void masActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masActionPerformed

        prenda prenda1 = listaprendas.get(c);
        int cantidadcomprar = Integer.parseInt(ccom.getText());
        if (cantidadcomprar < prenda1.getCantidad()) {
            cant = cant + 1;
            ccom.setText(String.valueOf(cant));
        }
    }//GEN-LAST:event_masActionPerformed

    private void menosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosActionPerformed

        int cantidadcomprar = Integer.parseInt(ccom.getText());
        if (cantidadcomprar > 0) {
            cant = cant - 1;
            ccom.setText(String.valueOf(cant));
        }
    }//GEN-LAST:event_menosActionPerformed

    private void añadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirActionPerformed
        prenda prenda1 = listaprendas.get(c);

        // Define la consulta SQL para actualizar la celda
        String actualizar = "UPDATE ropa SET cantidad_carrito = ? WHERE id = ?";

        if (prenda1.getCantidadCarrito() != 0) {
            JOptionPane.showMessageDialog(null, "Ya se añadió la prenda al carrito, si desea añadir más cantidad puede hacerlo desde el carrito.");

        } else {
            // Especifica los nuevos valores y el ID de la fila que quieres actualizar
            int nuevoValor = cant;
            int id = prenda1.getId();

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_codigo?useSSL=false", "root", "0411");

                // Prepara la consulta SQL con los parámetros necesarios
                PreparedStatement statement = connection.prepareStatement(actualizar);
                statement.setInt(1, nuevoValor);
                statement.setInt(2, id);

                // Ejecuta la consulta SQL
                statement.executeUpdate();

                // Actualiza la información de cuanta cantidad de la prenda hay en el carrito
                prenda1.setCantidadCarrito(nuevoValor);

                // Añade la prenda al carrito
                CarritoC.agregarPrenda(prenda1);

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar la cantcarrito y añadir al carrito." + e);
            }
        }
    }//GEN-LAST:event_añadirActionPerformed

    private void carritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carritoActionPerformed
        Carrito car = new Carrito();
        car.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_carritoActionPerformed

    private void cuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuentaActionPerformed
        CrearIngresar ci = new CrearIngresar();
        ci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cuentaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menú_inicio me = new Menú_inicio();
        me.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PrendasSuperiores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrendasSuperiores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrendasSuperiores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrendasSuperiores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrendasSuperiores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anterior;
    private javax.swing.JButton añadir;
    private javax.swing.JButton carrito;
    private javax.swing.JTextField ccom;
    private javax.swing.JButton cuenta;
    private javax.swing.JLabel imagenlugar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton mas;
    private javax.swing.JButton menos;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel precio;
    private javax.swing.JButton siguiente;
    private javax.swing.JLabel talla;
    // End of variables declaration//GEN-END:variables
}
