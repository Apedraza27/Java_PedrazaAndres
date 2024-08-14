/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_estructurales;

/**
 *
 * @author andre
 */
class SistemaDeLuz {
    public void encender() {
        System.out.println("Luz encendida");
    }

    public void apagar() {
        System.out.println("Luz apagada");
    }
}

class SistemaDeSonido {
    public void encender() {
        System.out.println("Sonido encendido");
    }

    public void apagar() {
        System.out.println("Sonido apagado");
    }
}

class CineEnCasaFachada {
    private SistemaDeLuz luz;
    private SistemaDeSonido sonido;

    public CineEnCasaFachada() {
        luz = new SistemaDeLuz();
        sonido = new SistemaDeSonido();
    }

    public void comenzarPelicula() {
        luz.apagar();
        sonido.encender();
        System.out.println("Disfruta de la película");
    }

    public void finalizarPelicula() {
        sonido.apagar();
        luz.encender();
        System.out.println("Fin de la película");
    }
}

public class Facade {
    public static void main(String[] args) {
        CineEnCasaFachada cine = new CineEnCasaFachada();
        cine.comenzarPelicula();  // Luz apagada, Sonido encendido, Disfruta de la película
        cine.finalizarPelicula();  // Sonido apagado, Luz encendida, Fin de la película
    }
}
