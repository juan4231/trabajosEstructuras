package productoss;
public class Main {
    public static void main(String[] args) {

        Carrito carrito = new Carrito();

        Producto p1 = new Producto(1, "Laptop", 15000);
        Producto p2 = new Producto(2, "Mouse", 350);
        Producto p3 = new Producto(3, "Teclado", 700);
        Producto p4 = new Producto(1, "Laptop Duplicada", 15000); // Mismo ID

        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);
        carrito.agregarProducto(p4); // No debería agregarse

        carrito.mostrarCarrito();

        carrito.eliminarProducto(p2);
        carrito.eliminarPorIndice(0);

        carrito.mostrarCarrito();
    }
}