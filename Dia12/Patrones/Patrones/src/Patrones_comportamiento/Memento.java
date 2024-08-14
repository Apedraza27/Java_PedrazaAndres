/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;

/**
 *
 * @author andre
 */
// Memento
class Memento {
    private String estado;

    public Memento(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }
}

// Originador
class EditorTexto {
    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Memento guardar() {
        return new Memento(texto);
    }

    public void restaurar(Memento memento) {
        texto = memento.getEstado();
    }

    public String getTexto() {
        return texto;
    }
}

// Cuidador
class Historial {
    private List<Memento> mementos = new ArrayList<>();

    public void agregarMemento(Memento memento) {
        mementos.add(memento);
    }

    public Memento obtenerM

emento(int index) {
        return mementos.get(index);
    }
}

public class Memento {
    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Historial historial = new Historial();

        editor.setTexto("Versión 1");
        historial.agregarMemento(editor.guardar());

        editor.setTexto("Versión 2");
        historial.agregarMemento(editor.guardar());

        editor.setTexto("Versión 3");

        System.out.println("Estado actual: " + editor.getTexto());  // Versión 3
        editor.restaurar(historial.obtenerMemento(0));
        System.out.println("Restaurado a: " + editor.getTexto());  // Versión 1
    }
}
