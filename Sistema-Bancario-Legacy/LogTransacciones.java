 import java.util.Vector;
public class LogTransacciones{
    private Vector<String> transacciones;
  public LogTransacciones(){
       transacciones = new Vector<>();
  }  
public void agregarTransaccion(String mensaje){
    transacciones.add(mensaje);
} 
public void mostrarTransacciones(){
System.out.println("log de transacciones");
for (String t: transacciones){
  System.out.println("-" + t);
}
}    
}