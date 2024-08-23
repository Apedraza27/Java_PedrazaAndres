/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemafacturacion;

/**
 *
 * @author camper
 */
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Facturas {
    private Clientes cliente;
    private List<Productos> productos;
    private double total;

    public Facturas(Clientes cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Productos producto) {
        productos.add(producto);
        total += producto.getPrecio();
    }

    public double calcularTotal(Function<Double, Double> descuento) {
        return descuento.apply(total);
    }

    public Clientes getCliente() {
        return cliente;
    }

    public List<Productos> getProductos() {
        return productos;
    }

    public double getTotal() {
        return total;
    }
    
    
}

