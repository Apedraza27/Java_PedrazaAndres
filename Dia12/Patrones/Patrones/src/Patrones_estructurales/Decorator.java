/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_estructurales;

/**
 *
 * @author andre
 */
// Componente
interface Visual {
    void dibujar();
}

// Componente concreto
class Ventana implements Visual {
    @Override
    public void dibujar() {
        System.out.println("Dibujando una ventana.");
    }
}

// Decorador
abstract class DecoradorVisual implements Visual {
    protected Visual visual;

    public DecoradorVisual(Visual visual) {
        this.visual = visual;
    }

    @Override
    public void dibujar() {
        visual.dibujar();
    }
}

// Decorador concreto
class BordeDecorador extends DecoradorVisual {
    public BordeDecorador(Visual visual) {
        super(visual);
    }

    @Override
    public void dibujar() {
        super.dibujar();
        System.out.println("Dibujando un borde.");
    }
}

public class Decorator {
    public static void main(String[] args) {
        Visual ventana = new Ventana();
        Visual ventanaConBorde = new BordeDecorador(ventana);

        ventana.dibujar();        // Dibujando una ventana.
        ventanaConBorde.dibujar();  // Dibujando una ventana.
                                   // Dibujando un borde.
    }
}
