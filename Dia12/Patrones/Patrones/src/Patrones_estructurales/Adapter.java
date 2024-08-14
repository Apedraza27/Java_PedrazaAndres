/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Patrones_estructurales;

/**
 *
 * @author andre
 */
// Clase existente
class MotorElectrico {
    public void conectar() {
        System.out.println("Conectando motor eléctrico.");
    }

    public void activar() {
        System.out.println("Activando motor eléctrico.");
    }
}

// Clase con interfaz incompatible
class MotorCombustion {
    public void encender() {
        System.out.println("Encendiendo motor de combustión.");
    }

    public void acelerar() {
        System.out.println("Acelerando motor de combustión.");
    }
}

// Adaptador
class MotorAdapter extends MotorElectrico {
    private MotorCombustion motorCombustion;

    public MotorAdapter(MotorCombustion motorCombustion) {
        this.motorCombustion = motorCombustion;
    }

    @Override
    public void conectar() {
        motorCombustion.encender();
    }

    @Override
    public void activar() {
        motorCombustion.acelerar();
    }
}

public class Adapter {
    public static void main(String[] args) {
        MotorElectrico motor = new MotorAdapter(new MotorCombustion());
        motor.conectar();  // Encendiendo motor de combustión
        motor.activar();   // Acelerando motor de combustión
    }
}
