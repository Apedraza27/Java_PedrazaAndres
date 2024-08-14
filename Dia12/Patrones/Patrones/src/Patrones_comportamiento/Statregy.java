/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_comportamiento;

/**
 *
 * @author andre
 */
// Estrategia
interface Estrategia {
    int realizarOperacion(int num1, int num2);
}

// Estrategias concretas
class OperacionSuma implements Estrategia {
    @Override
    public int realizarOperacion(int num1, int num2) {
        return num1 + num2;
    }
}

class OperacionResta implements Estrategia {
    @Override
    public int realizarOperacion(int num1, int num2) {
        return num1 - num2;
    }
}

// Contexto
class Contexto {
    private Estrategia estrategia;

    public Contexto(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    public int ejecutarEstrategia(int num1, int num2) {
        return estrategia.realizarOperacion(num1, num2);
    }
}

public class Statregy {
    public static void main(String[] args) {
        Contexto contexto = new Contexto(new OperacionSuma());
        System.out.println("Suma: " + contexto.ejecutarEstrategia(10, 5));  // Suma: 15

        contexto = new Contexto(new OperacionResta());
        System.out.println("Resta: " + contexto.ejecutarEstrategia(10, 5));  // Resta: 5
    }
}
