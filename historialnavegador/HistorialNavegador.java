package historialnavegador;
import java.util.Stack;

public class HistorialNavegador {

    public static void main(String[] args) {

        Stack<String> historial = new Stack<>();

        navegar(historial, "google.com");
        navegar(historial, "youtube.com");
        navegar(historial, "openai.com");

        System.out.println();

        if (!historial.empty()) {
            System.out.println(" Página actual: " + historial.peek());
        }

        System.out.println();

        volver(historial);
        volver(historial);
        volver(historial);

        System.out.println();

        volver(historial);
    }

    public static void navegar(Stack<String> historial, String url) {
        historial.push(url);
        System.out.println(" Navegando a: " + url);
    }

    public static void volver(Stack<String> historial) {
        if (!historial.empty()) {
            String pagina = historial.pop();
            System.out.println("⬅️ Volviendo desde: " + pagina);

            if (!historial.empty()) {
                System.out.println(" Ahora estas en: " + historial.peek());
            } else {
                System.out.println(" No quedan paginas en el historial.");
            }
        } else {
            System.out.println(" Historial vacio No se puede volver atrás.");
        }
    }
}