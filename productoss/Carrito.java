package productoss;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> carrito;

    public Carrito() {
        carrito = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        if (!carrito.contains(p)) {
            carrito.add(p);
            System.out.println("Producto agregado: " + p.getNombre());
        } else {
            System.out.println("El producto ya existe en el carrito: " + p.getNombre());
        }
    }

    public void eliminarProducto(Producto p) {
        if (carrito.remove(p)) {
            System.out.println("Producto eliminado: " + p.getNombre());
        } else {
            System.out.println("El producto no estaba en el carrito.");
        }
    }

    public void eliminarPorIndice(int index) {
        if (index >= 0 && index < carrito.size()) {
            Producto eliminado = carrito.remove(index);
            System.out.println("Producto eliminado por índice: " + eliminado.getNombre());
        } else {
            System.out.println("Índice inválido.");
        }
    }

    public void mostrarCarrito() {
        if (carrito.isEmpty()) {
            System.out.println("El carrito está vacío.");
        } else {
            System.out.println(" Productos en el carrito:");
            for (Producto p : carrito) {
                System.out.println(p);
            }
        }
    }
}