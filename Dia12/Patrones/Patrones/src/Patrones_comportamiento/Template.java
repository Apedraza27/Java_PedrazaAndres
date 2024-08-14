/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;

/**
 *
 * @author andre
 */
// Clase abstracta
abstract class Juego {
    abstract void inicializar();
    abstract void empezarJuego();
    abstract void terminarJuego();

    // Template Method
    public final void jugar() {
        inicializar();
        empezarJuego();
        terminarJuego();
    }
}

// Implementación concreta
class Futbol extends Juego {
    @Override
    void inicializar() {
        System.out.println("Futbol inicializado.");
    }

    @Override
    void empezarJuego() {
        System.out.println("Juego de futbol comenzado.");
    }

    @Override
    void terminarJuego() {
        System.out.println("Juego de futbol terminado.");
    }
}

public class Template {
    public static void main(String[] args) {
        Juego juego = new Futbol();
        juego.jugar();
        // Salida:
        // Futbol inicializado.
        // Juego de futbol comenzado.
        // Juego de futbol terminado.
    }
}
