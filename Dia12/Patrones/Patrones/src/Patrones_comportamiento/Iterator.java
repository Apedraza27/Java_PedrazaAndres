/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author andre
 */
// Agregado
class ColeccionLibros implements Iterable<String> {
    private final List<String> libros = new ArrayList<>();

    public void agregarLibro(String libro) {
        libros.add(libro);
    }

    @Override
    public Iterator<String> iterator() {
        return libros.iterator();
    }
}

public class Iterator {
    public static void main(String[] args) {
        ColeccionLibros coleccion = new ColeccionLibros();
        coleccion.agregarLibro("Libro A");
        coleccion.agregarLibro("Libro B");
        coleccion.agregarLibro("Libro C");

        for (String libro : coleccion) {
            System.out.println(libro);
        }
        // Salida:
        // Libro A
        // Libro B
        // Libro C
    }
}
