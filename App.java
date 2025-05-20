package net.salesianos;

import javax.swing.*;
import net.salesianos.*;

public class App {
    public static void main(String[] args) {
        GestorElementos gestor = new GestorElementos();
        String opcion;

        do {
            opcion = JOptionPane.showInputDialog("""
                    Elige una opción:
                    1. Añadir elemento
                    2. Editar elemento
                    3. Mostrar elementos
                    4. Eliminar elemento
                    Q. Salir
                    """);

            if (opcion == null)
                continue;

            try {
                switch (opcion.toUpperCase()) {
                    case "1" -> gestor.añadirElemento();
                    case "2" -> gestor.editarElemento();
                    case "3" -> gestor.mostrarElementos();
                    case "4" -> gestor.eliminarElemento();
                    case "Q" -> JOptionPane.showMessageDialog(null, "¡Hasta pronto!");
                    default -> JOptionPane.showMessageDialog(null, "Opción no válida.");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error inesperado: " + e.getMessage());
            }

        } while (!"Q".equalsIgnoreCase(opcion));
    }
}
