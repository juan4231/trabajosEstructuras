package sticks;
import java.util.Queue;
import java.util.LinkedList;

public class SistemaTicketsSoporte {

    public static void main(String[] args) {

        Queue<String> colaSoporte = new LinkedList<>();

        colaSoporte.offer("Cliente A");
        colaSoporte.offer("Cliente B");
        colaSoporte.offer("Cliente C");

        System.out.println(" Llegadas registradas.");
        System.out.println();

        if (colaSoporte.peek() != null) {
            System.out.println(" Próximo en la fila: " + colaSoporte.peek());
        } else {
            System.out.println(" No hay clientes en espera.");
        }

        System.out.println();

        atenderCliente(colaSoporte);
        atenderCliente(colaSoporte);
        atenderCliente(colaSoporte);

        System.out.println();

        atenderCliente(colaSoporte);
    }

    public static void atenderCliente(Queue<String> cola) {
        String cliente = cola.poll(); 

        if (cliente != null) {
            System.out.println(" Atendiendo a: " + cliente);
        } else {
            System.out.println(" No hay clientes en la cola para atender.");
        }
    }
}