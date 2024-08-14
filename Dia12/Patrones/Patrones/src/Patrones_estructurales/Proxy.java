/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Patrones_estructurales;

/**
 *
 * @author andre
 */
// Sujeto
interface Imagen {
    void mostrar();
}

// RealSubject
class ImagenReal implements Imagen

 {
    private String archivo;

    public ImagenReal(String archivo) {
        this.archivo = archivo;
        cargarDesdeDisco();
    }

    private void cargarDesdeDisco() {
        System.out.println("Cargando " + archivo);
    }

    @Override
    public void mostrar() {
        System.out.println("Mostrando " + archivo);
    }
}

// Proxy
class ProxyImagen implements Imagen {
    private ImagenReal imagenReal;
    private String archivo;

    public ProxyImagen(String archivo) {
        this.archivo = archivo;
    }

    @Override
    public void mostrar() {
        if (imagenReal == null) {
            imagenReal = new ImagenReal(archivo);
        }
        imagenReal.mostrar();
    }
}

public class Proxy {
    public static void main(String[] args) {
        Imagen imagen = new ProxyImagen("foto.jpg");
        imagen.mostrar();  // Cargando foto.jpg
                           // Mostrando foto.jpg

        imagen.mostrar();  // Mostrando foto.jpg (no carga de nuevo)
    }
}
