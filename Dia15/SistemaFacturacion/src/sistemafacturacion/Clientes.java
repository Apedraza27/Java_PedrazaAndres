/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafacturacion;

/**
 *
 * @author camper
 */
public class Clientes {
    private String nombre;
    private String tipo; // Ejemplo: "Regular", "VIP"

    public Clientes(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }
}

