/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;

/**
 *
 * @author andre
 */
import java.util.ArrayList;
import java.util.List;

// Observador
interface Observador {
    void actualizar(String mensaje);
}

// Sujeto
class Sujeto {
    private List<Observador> observadores = new ArrayList<>();
    private String estado;

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificar() {
        for (Observador observador : observadores) {
            observador.actualizar(estado);
        }
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificar();
    }
}

// Observadores concretos
class ObservadorConcreto implements Observador {
    private String nombre;

    public ObservadorConcreto(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " recibió actualización: " + mensaje);
    }
}

public class Observer {
    public static void main(String[] args) {
        Sujeto sujeto = new Sujeto();

        Observador obs1 = new ObservadorConcreto("Observer 1");
        Observador obs2 = new ObservadorConcreto("Observer 2");

        sujeto.agregarObservador(obs1);
        sujeto.agregarObservador(obs2);

        sujeto.setEstado("Estado 1");
        // Observer 1 recibió actualización: Estado 1
        // Observer 2 recibió actualización: Estado 1

        sujeto.setEstado("Estado 2");
        // Observer 1 recibió actualización: Estado 2
        // Observer 2 recibió actualización: Estado 2
    }
}
