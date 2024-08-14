/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;

/**
 *
 * @author andre
 */
abstract class Manejador {
    protected Manejador siguiente;

    public void establecerSiguiente(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    public abstract void manejarPeticion(String peticion);
}

class ManejadorConcretoA extends Manejador {
    @Override
    public void manejarPeticion(String peticion) {
        if (peticion.equals("A")) {
            System.out.println("ManejadorConcretoA maneja la petición A");
        } else if (siguiente != null) {
            siguiente.manejarPeticion(peticion);
        }
    }
}

class ManejadorConcretoB extends Manejador {
    @Override
    public void manejarPeticion(String peticion) {
        if (peticion.equals("B")) {
            System.out.println("ManejadorConcretoB maneja la petición B");
        } else if (siguiente != null) {
            siguiente.manejarPeticion(peticion);
        }
    }
}

public class Chain {
    public static void main(String[] args) {
        Manejador manejadorA = new ManejadorConcretoA();
        Manejador manejadorB = new ManejadorConcretoB();

        manejadorA.establecerSiguiente(manejadorB);

        manejadorA.manejarPeticion("A");  // ManejadorConcretoA maneja la petición A
        manejadorA.manejarPeticion("B");  // ManejadorConcretoB maneja la petición B
        manejadorA.manejarPeticion("C");  // No se maneja
    }
}