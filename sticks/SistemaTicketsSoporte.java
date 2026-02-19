package sticks;
import java.util.Queue;
import java.util.LinkedList;

public class SistemaTicketsSoporte {

    public static void main(String[] args) {

        // 1️⃣ Definición: Queue usando LinkedList
        Queue<String> colaSoporte = new LinkedList<>();

        // 2️⃣ Llegada (Enqueue)
        colaSoporte.offer("Cliente A");
        colaSoporte.offer("Cliente B");
        colaSoporte.offer("Cliente C");

        System.out.println("📥 Llegadas registradas.");
        System.out.println();

        // 3️⃣ Próximo en fila (peek)
        if (colaSoporte.peek() != null) {
            System.out.println("👀 Próximo en la fila: " + colaSoporte.peek());
        } else {
            System.out.println("📭 No hay clientes en espera.");
        }

        System.out.println();

        // 4️⃣ Atención (Dequeue con poll)
        atenderCliente(colaSoporte);
        atenderCliente(colaSoporte);
        atenderCliente(colaSoporte);

        System.out.println();

        // 5️⃣ Manejo de vacío: intentar atender cuando ya no hay clientes
        atenderCliente(colaSoporte);
    }

    public static void atenderCliente(Queue<String> cola) {
        String cliente = cola.poll(); // poll() retorna null si la cola está vacía

        if (cliente != null) {
            System.out.println("🎧 Atendiendo a: " + cliente);
        } else {
            System.out.println("⚠️ No hay clientes en la cola para atender.");
        }
    }
}