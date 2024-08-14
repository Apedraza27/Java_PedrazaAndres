/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;

/**
 *
 * @author andre
 */
// Estado
interface Estado {
    void manejar(Contexto contexto);
}

// Estados concretos
class EstadoConcretoA implements Estado {
    @Override
    public void manejar(Contexto contexto) {
        System.out.println("Manejando estado A");
        contexto.setEstado(new EstadoConcretoB());
    }
}

class EstadoConcretoB implements Estado {
    @Override
    public void manejar(Contexto contexto) {
        System.out.println("Manejando estado B");
        contexto.setEstado(new EstadoConcretoA());
    }
}

// Contexto
class Contexto {
    private Estado estado;

    public Contexto(Estado estado) {
        this.estado = estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void solicitar() {
        estado.manejar(this);
    }
}

public class State {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new EstadoConcretoA());

        contexto.solicitar();  // Manejando estado A
        contexto.solicitar();  // Manejando estado B
        contexto.solicitar();  // Manejando estado A
    }
}
