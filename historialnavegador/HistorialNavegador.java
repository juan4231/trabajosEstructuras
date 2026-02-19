package historialnavegador;
import java.util.Stack;

public class HistorialNavegador {

    public static void main(String[] args) {

        // 1️⃣ Instancia
        Stack<String> historial = new Stack<>();

        // 2️⃣ Navegación (push)
        navegar(historial, "google.com");
        navegar(historial, "youtube.com");
        navegar(historial, "openai.com");

        System.out.println();

        // 3️⃣ Consulta (peek)
        if (!historial.empty()) {
            System.out.println("📍 Página actual: " + historial.peek());
        }

        System.out.println();

        // 4️⃣ Regreso (pop)
        volver(historial);
        volver(historial);
        volver(historial);

        System.out.println();

        // 5️⃣ Validación: intentar volver cuando ya está vacío
        volver(historial);
    }

    // Simula visitar una página
    public static void navegar(Stack<String> historial, String url) {
        historial.push(url);
        System.out.println("➡️ Navegando a: " + url);
    }

    // Simula el botón "Atrás"
    public static void volver(Stack<String> historial) {
        if (!historial.empty()) {
            String pagina = historial.pop();
            System.out.println("⬅️ Volviendo desde: " + pagina);

            if (!historial.empty()) {
                System.out.println("📍 Ahora estás en: " + historial.peek());
            } else {
                System.out.println("📭 No quedan páginas en el historial.");
            }
        } else {
            System.out.println("⚠️ Historial vacío. No se puede volver atrás.");
        }
    }
}