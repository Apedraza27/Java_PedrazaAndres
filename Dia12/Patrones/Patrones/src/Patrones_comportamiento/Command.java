/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;

/**
 *
 * @author andre
 */
// Comando
interface Comando {
    void ejecutar();
}

// Receptor
class Luz {
    public void encender() {
        System.out.println("Luz encendida");
    }

    public void apagar() {
        System.out.println("Luz apagada");
    }
}

// Comandos concretos
class EncenderLuzComando implements Comando {
    private Luz luz;

    public EncenderLuzComando(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.encender();
    }
}

class ApagarLuzComando implements Comando {
    private Luz luz;

    public ApagarLuzComando(Luz luz) {
        this.luz = luz;
    }

    @Override
    public void ejecutar() {
        luz.apagar();
    }
}

// Invocador
class ControlRemoto {
    private Comando comando;

    public void setComando(Comando comando) {
        this.comando = comando;
    }

    public void presionarBoton() {
        comando.ejecutar();
    }
}

public class Command {
    public static void main(String[] args) {
        Luz luz = new Luz();
        Comando encenderLuz = new EncenderLuzComando(luz);
        Comando apagarLuz = new ApagarLuzComando(luz);

        ControlRemoto control = new ControlRemoto();
        control.setComando(encenderLuz);
        control.presionarBoton();  // Luz encendida

        control.setComando(apagarLuz);
        control.presionarBoton();  // Luz apagada
    }
}
