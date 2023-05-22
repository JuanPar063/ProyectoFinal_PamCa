
package Buscador_Ropa;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Cerrar_Carrito {
     public static void confirmarSalida(JFrame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                try {

                Connection conexion = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/bd_codigo", "root", "0411");

                String actualizar = ("UPDATE ropa SET cantidad_carrito = NULL WHERE cantidad_carrito IS NOT NULL;");
                PreparedStatement consulta = conexion.prepareStatement(actualizar);

                consulta.executeUpdate();

                conexion.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se cambio el valor de cantidad_carrito " + ex);
            }
            }
        });
    }
 
}
