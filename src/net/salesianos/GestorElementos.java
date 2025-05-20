package net.salesianos;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;

public class GestorElementos {
    private final ArrayList<Elemento> lista = new ArrayList<>();

    public void añadirElemento() {
        String nombre = Utils.pedirTexto("Introduce el nombre:");
        String categoria = Utils.pedirTexto("Introduce la categoría:");
        String ubicacion = Utils.pedirTexto("Introduce la ubicación:");
        int puntuacion = Utils.pedirEntero("Introduce la puntuación (1-5):");

        lista.add(new Elemento(nombre, categoria, ubicacion, puntuacion));
    }

    public void editarElemento() {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay elementos para editar.");
            return;
        }

        mostrarElementos();
        int idx = Utils.pedirIndice("Introduce el índice del elemento a editar:", lista.size());
        Elemento e = lista.get(idx);

        e.setNombre(Utils.pedirTexto("Nuevo nombre:"));
        e.setCategoria(Utils.pedirTexto("Nueva categoría:"));
        e.setUbicacion(Utils.pedirTexto("Nueva ubicación:"));
        e.setPuntuacion(Utils.pedirEntero("Nueva puntuación (1-5):"));
    }

    public void eliminarElemento() {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay elementos para eliminar.");
            return;
        }

        mostrarElementos();
        int idx = Utils.pedirIndice("Introduce el índice del elemento a eliminar:", lista.size());
        lista.remove(idx);
    }

    public void mostrarElementos() {
        if (lista.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay elementos para mostrar.");
            return;
        }

        Collections.sort(lista);
        StringBuilder sb = new StringBuilder("Listado de elementos:\n");
        for (int i = 0; i < lista.size(); i++) {
            sb.append("[").append(i).append("] ").append(lista.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }

    public ArrayList<Elemento> getLista() {
        return lista;
    }
}
