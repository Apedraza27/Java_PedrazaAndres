package Juego;

import java.util.ArrayList;
import java.util.List;

public class Armas {
    
    private String nombre;
    private List<Encantamiento> encantamientos;
    
    public Armas(String nombre){
        this.nombre = nombre;
        this.encantamientos = new ArrayList<>();
    }
    
    public String getNombre() {
        return nombre;
    }

    public List<Encantamiento> getEncantamientos() {
        return encantamientos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEncantamientos(List<Encantamiento> encantamientos) {
        this.encantamientos = encantamientos;
    }
    
}
