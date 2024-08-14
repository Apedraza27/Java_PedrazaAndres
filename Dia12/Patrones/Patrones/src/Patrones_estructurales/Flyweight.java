/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_estructurales;

/**
 *
 * @author andre
 */
import java.util.HashMap;
import java.util.Map;

// Flyweight
interface Forma {
    void dibujar();
}

// Flyweight concreto
class Circulo implements Forma {
    private String color;

    public Circulo(String color) {
        this.color = color;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo de color: " + color);
    }
}

// Flyweight Factory
class FormaFactory {
    private static final Map<String, Forma> formas = new HashMap<>();

    public static Forma obtenerCirculo(String color) {
        Circulo circulo = (Circulo) formas.get(color);
        if (circulo == null) {
            circulo = new Circulo(color);
            formas.put(color, circulo);
            System.out.println("Creando un círculo de color: " + color);
        }
        return circulo;
    }
}

public class Flyweight {
    public static void main(String[] args) {
        Forma circuloRojo = FormaFactory.obtenerCirculo("rojo");
        circuloRojo.dibujar();  // Creando un círculo de color: rojo
                                // Dibujando un círculo de color: rojo

        Forma otroCirculoRojo = FormaFactory.obtenerCirculo("rojo");
        otroCirculoRojo.dibujar();  // Dibujando un círculo de color: rojo

        Forma circuloAzul = FormaFactory.obtenerCirculo("azul");
        circuloAzul.dibujar();  // Creando un círculo de color: azul
                                // Dibujando un círculo de color: azul
    }
}
