package Buscador_Ropa;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class FileManager {

    public static void guardarUsuario(Usuario usuario, String filePath) {
        try ( FileWriter writer = new FileWriter(filePath, true)) {
            PrintWriter archivo = new PrintWriter(writer);

            if (FileManager.comprobar(usuario.getNombre(), filePath)) {
                JOptionPane.showMessageDialog(null, "Usuario ya existente, ingrese un nuevo usuario porfavor.");
            } else {
                archivo.println(usuario.getNombre() + "\t" + usuario.getContraseña() + "\t" + usuario.getCorreo() + "\t" + "\n");
                JOptionPane.showMessageDialog(null, "Información del usuario guardada en el archivo.");
            }

            archivo.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar la información del usuario en el archivo." + e);

        }

    }

    public static boolean comprobar(String nom, String ruta) { //valida que el nombre no se encuentre ya dentro de los registros
        boolean re = false;

        try {
            File archivo = new File(ruta);
            Scanner scanner = new Scanner(archivo);
            while (scanner.hasNextLine()) {

                String linea = scanner.nextLine();
                String[] campos = linea.split("\t"); // separar los campos por la tabulación
                String nombre = campos[0];

                if (nombre.equals(nom)) {
                    re = true;
                }

            }

            scanner.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "HUBO UN PROBLEMA AL MOMENTO DE LEER EL ARCHIVO");
        }

        return re;
    }

    public static void guardarInformacion(String fecha, int cantidad, String nombre, float total, String filePath) {
        try ( FileWriter writer = new FileWriter(filePath, true)) {
           
            PrintWriter archivo = new PrintWriter(writer);
            archivo.println(fecha + "\t" + cantidad + "\t" + nombre + "\t" + total);
            archivo.close();
            
        } catch (IOException e) {
           JOptionPane.showMessageDialog(null, "no se pudo guardar la factura.");
        }
    }
}
