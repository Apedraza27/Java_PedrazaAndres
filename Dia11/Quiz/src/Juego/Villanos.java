package Juego;

public class Villanos extends Caracteres {
    private String tipo;
    private String ubicacion;
    
    public Villanos() {}

    public Villanos(String tipo, String ubicacion, String nombre, String rasgos, Object arma, String habilidad1, String habilidad2, String habilidadUlt) {
        super(nombre, rasgos, arma, habilidad1, habilidad2, habilidadUlt);
        this.tipo = tipo;
        this.ubicacion = ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
}
