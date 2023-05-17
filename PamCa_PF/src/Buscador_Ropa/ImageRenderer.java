package Buscador_Ropa;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class ImageRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        // Crear un JLabel para mostrar la imagen
        JLabel label = new JLabel();
        
        // Verificar si el valor es un byte array (imagen en BLOB)
        if (value instanceof byte[]) {
            
            // Convertir el byte array a ImageIcon
            byte[] imagenBytes = (byte[]) value;
            ImageIcon imagenIcono = new ImageIcon(imagenBytes);
            
            // Establecer la imagen en el JLabel
            label.setIcon(imagenIcono);
        }
        
        // Establecer el alineamiento del JLabel
        label.setHorizontalAlignment(JLabel.CENTER);
        
        return label;
    }
}

