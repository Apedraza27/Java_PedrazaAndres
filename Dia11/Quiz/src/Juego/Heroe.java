package Juego;

import java.util.ArrayList;
import java.util.List;

public class Heroe extends Caracteres {
    private String clase;
    private List<Armas> inventario;
    
    public Heroe(){}

    public Heroe(String clase, List<Armas> inventario, String nombre, String rasgos, Object arma, String habilidad1, String habilidad2, String habilidadUlt) {
        super(nombre, rasgos, arma, habilidad1, habilidad2, habilidadUlt);
        this.clase = clase;
        this.inventario = new ArrayList<>();
    }

    public String getClase() {
        return clase;
    }

    public List<Armas> getInventario() {
        return inventario;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public void setInventario(List<Armas> inventario) {
        this.inventario = inventario;
    }

}
