/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_estructurales;

/**
 *
 * @author andre
 */
// Implementador
interface Dispositivo {
    void encender();
    void apagar();
    boolean estaEncendido();
}

// Implementación concreta
class Televisor implements Dispositivo {
    private boolean encendido = false;

    @Override
    public void encender() {
        encendido = true;
        System.out.println("Televisor encendido.");
    }

    @Override
    public void apagar() {
        encendido = false;
        System.out.println("Televisor apagado.");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}

// Abstracción
abstract class ControlRemoto {
    protected Dispositivo dispositivo;

    public ControlRemoto(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public abstract void encender();
    public abstract void apagar();
}

// Abstracción refinada
class ControlRemotoAvanzado extends ControlRemoto {

    public ControlRemotoAvanzado(Dispositivo dispositivo) {
        super(dispositivo);
    }

    @Override
    public void encender() {
        dispositivo.encender();
    }

    @Override
    public void apagar() {
        dispositivo.apagar();
    }

    public void silenciar() {
        if (dispositivo.estaEncendido()) {
            System.out.println("Dispositivo silenciado.");
        }
    }
}

public class Bridge {
    public static void main(String[] args) {
        Dispositivo tv = new Televisor();
        ControlRemoto control = new ControlRemotoAvanzado(tv);

        control.encender();  // Televisor encendido.
        control.silenciar();  // Dispositivo silenciado.
        control.apagar();    // Televisor apagado.
    }
}
