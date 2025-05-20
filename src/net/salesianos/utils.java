package net.salesianos;

import javax.swing.*;

public class utils {
    public static String pedirTexto(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public static int pedirEntero(String mensaje) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                int valor = Integer.parseInt(input);
                if (valor >= 1 && valor <= 5)
                    return valor;
                else
                    JOptionPane.showMessageDialog(null, "Debe ser un número entre 1 y 5.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida. Intenta de nuevo.");
            }
        }
    }

    public static int pedirIndice(String mensaje, int max) {
        while (true) {
            try {
                String input = JOptionPane.showInputDialog(mensaje);
                int indice = Integer.parseInt(input);
                if (indice >= 0 && indice < max)
                    return indice;
                else
                    JOptionPane.showMessageDialog(null, "Índice fuera de rango.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Entrada inválida.");
            }
        }
    }
}