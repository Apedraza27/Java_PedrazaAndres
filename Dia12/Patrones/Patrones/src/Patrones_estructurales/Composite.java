/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_estructurales;

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.List;

// Componente
interface Graficos {
    void dibujar();
}

// Hoja
class Circulo implements Graficos {
    @Override
    public void dibujar() {
        System.out.println("Dibujando un círculo.");
    }
}

// Compuesto
class CompuestoDeGraficos implements Graficos {
    private List<Graficos> hijos = new ArrayList<>();

    public void agregar(Graficos grafico) {
        hijos.add(grafico);
    }

    public void remover(Graficos grafico) {
        hijos.remove(grafico);
    }

    @Override
    public void dibujar() {
        for (Graficos grafico : hijos) {
            grafico.dibujar();
        }
    }
}

public class Composite {
    public static void main(String[] args) {
        Graficos circulo1 = new Circulo();
        Graficos circulo2 = new Circulo();

        CompuestoDeGraficos compuesto = new CompuestoDeGraficos();
        compuesto.agregar(circulo1);
        compuesto.agregar(circulo2);

        compuesto.dibujar();  // Dibujando un círculo.
                              // Dibujando un círculo.
    }
}
