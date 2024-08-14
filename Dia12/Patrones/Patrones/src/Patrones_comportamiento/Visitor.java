/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;

/**
 *
 * @author andre
 */
// Elemento
interface Elemento {
    void aceptar(Visitante visitante);
}

// Elementos concretos
class ElementoConcretoA implements Elemento {
    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }

    public String operacionA() {
        return "Operación A";
    }
}

class ElementoConcretoB implements Elemento {
    @Override
    public void aceptar(Visitante visitante) {
        visitante.visitar(this);
    }

    public String operacionB() {
        return "Operación B";
    }
}

// Visitante
interface Visitante {
    void visitar(ElementoConcretoA elementoA);
    void visitar(ElementoConcretoB elementoB);
}

// Visitante concreto
class VisitanteConcreto implements Visitante {
    @Override
    public void visitar(ElementoConcretoA elementoA) {
        System.out.println("Visitando " + elementoA.operacionA());
    }

    @Override
    public void visitar(ElementoConcretoB elementoB) {
        System.out.println("Visitando " + elementoB.operacionB());
    }
}

public class Visitor {
    public static void main(String[] args) {
        Elemento elementoA = new ElementoConcretoA();
        Elemento elementoB = new ElementoConcretoB();

        Visitante visitante = new VisitanteConcreto();

        elementoA.aceptar(visitante);  // Visitando Operación A
        elementoB.aceptar(visitante);  // Visitando Operación B
    }
}
