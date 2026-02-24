package hashmap;
import java.util.Map;
import java.util.HashMap;

public class InventarioPorCodigo {

    public static void main(String[] args) {

        Map<String, String> inventario = new HashMap<>();

        inventario.put("A001", "Laptop Dell");
        inventario.put("A002", "Televisor Sony");
        inventario.put("A003", "Impresora HP");

        mostrarInventario(inventario);

        System.out.println();

        inventario.put("A001", "Laptop HP"); 

        System.out.println(" Actualización del SKU A001:");
        System.out.println("SKU A001 = " + inventario.get("A001"));

        System.out.println();

        buscarProducto(inventario, "A002"); 
        buscarProducto(inventario, "X999"); 
    }

    public static void mostrarInventario(Map<String, String> inventario) {
        for (Map.Entry<String, String> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static void buscarProducto(Map<String, String> inventario, String sku) {
        String producto = inventario.get(sku); // O(1) promedio

        if (producto != null) {
            System.out.println(" SKU " + sku + " encontrado: " + producto);
        } else {
            System.out.println(" SKU " + sku + " no existe .");
        }
    }
}