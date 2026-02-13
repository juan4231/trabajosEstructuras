
public class main{
    public static void main(String[] args) {
        LogTransacciones Log = new LogTransacciones();
        Runnable tarea = () ->{
            for (int i = 0;i < 5; i++){
                Log.agregarTransaccion(
                    Thread.currentThread().getName()+"1 - transaccion" + 1
                );
            }

        }; 
        Thread h1 = new Thread(tarea, "hilo 1");
        Thread h2 = new Thread(tarea, "hilo 2");
        h1.start();
        h2.start();
        try {
            h1.join();
            h2.join();
        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        Log.mostrarTransacciones();
    }
}


