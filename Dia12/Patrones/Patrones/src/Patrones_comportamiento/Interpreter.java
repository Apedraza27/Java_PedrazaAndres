/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;

/**
 *
 * @author andre
 */
// Expresión
interface Expresion {
    boolean interpretar(String contexto);
}

// Expresiones concretas
class ExpresionTerminal implements Expresion {
    private String dato;

    public ExpresionTerminal(String dato) {
        this.dato = dato;
    }

    @Override
    public boolean interpretar(String contexto) {
        return contexto.contains(dato);
    }
}

class ExpresionO implements Expresion {
    private Expresion expr1;
    private Expresion expr2;

    public ExpresionO(Expresion expr1, Expresion expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean interpretar(String contexto) {
        return expr1.interpretar(contexto) || expr2.interpretar(contexto);
    }
}

public class Interpreter {
    public static void main(String[] args) {
        Expresion isJava = new ExpresionTerminal("Java");
        Expresion isPython = new ExpresionTerminal("Python");

        Expresion esDesarrollador = new ExpresionO(isJava, isPython);

        System.out.println("¿El contexto contiene 'Java'? " + esDesarrollador.interpretar("Desarrollador Java"));  // true
        System.out.println("¿El contexto contiene 'Python'? " + esDesarrollador.interpretar("Desarrollador Python"));  // true
        System.out.println("¿El contexto contiene 'C++'? " + esDesarrollador.interpretar("Desarrollador C++"));  // false
    }
}
