package hashmap;
import java.util.Map;
import java.util.HashMap;

public class InventarioPorCodigo {

    public static void main(String[] args) {

        // 1️⃣ Estructura: Map con HashMap
        Map<String, String> inventario = new HashMap<>();

        // 2️⃣ Inserción
        inventario.put("A001", "Laptop Dell");
        inventario.put("A002", "Televisor Sony");
        inventario.put("A003", "Impresora HP");

        System.out.println("📦 Inventario inicial:");
        mostrarInventario(inventario);

        System.out.println();

        // 3️⃣ Colisión / Actualización: misma clave, nuevo valor
        inventario.put("A001", "Laptop HP"); // sobrescribe el valor anterior

        // 4️⃣ Verificación
        System.out.println("🔁 Actualización del SKU A001:");
        System.out.println("SKU A001 = " + inventario.get("A001"));

        System.out.println();

        // 5️⃣ Búsqueda rápida (existente e inexistente)
        buscarProducto(inventario, "A002"); // existe
        buscarProducto(inventario, "X999"); // no existe
    }

    public static void mostrarInventario(Map<String, String> inventario) {
        for (Map.Entry<String, String> entry : inventario.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }

    public static void buscarProducto(Map<String, String> inventario, String sku) {
        String producto = inventario.get(sku); // O(1) promedio

        if (producto != null) {
            System.out.println("🔎 SKU " + sku + " encontrado: " + producto);
        } else {
            System.out.println("❌ SKU " + sku + " no existe en el inventario.");
        }
    }
}