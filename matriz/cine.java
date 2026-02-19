
public class cine {
    static int[][] sala = new int[8][10];

    public static void main(String[] args) {
        inicializarSala();
        System.out.println("estado inical de la sala");
        mostrarSala();
        reservarAsiento(2, 5);
        reservarAsiento(2, 6);
        reservarAsiento(2, 7);

        reservarAsiento(2, 5);
        buscarAsientosContiguos(2);
        System.out.println("estado final de la sala");
        mostrarSala();
    }

public static void inicializarSala(){
    for (int i= 0;i < sala.length; i++){
       for (int j= 0;j < sala[i].length; j++){ 
        sala[i][j] = 0;
          } 
       }
    }
    public static void reservarAsiento(int fila, int col ){
        if(fila >=0 && fila < 8 && col >= 0 && col < 10 ){
            if(sala[fila][col] == 0){
            sala[fila][col] = 1;
            System.out.println("Asiento reservado en fila " + fila + ", columna " + col);
        }else{
            System.out.println("el asiento ya esta ocupado");
        }
         }else{
          System.out.println("fuera del rango");
        }
    }   
     public static void buscarAsientosContiguos(int fila ){
        if(fila < 0 || fila > 0){
            System.out.println("Fila fuera de rango.");
            return;
        }
        for (int j= 0;j < 9; j++){ 
            if(sala[fila][j] == 0 && sala[fila][j + 1] == 0);
            System.out.println("Hay dos asientos contiguos libres en fila "+ fila + " en columnas " + j + " y " +(j + 1));
             return;
        }
    } 
      public static void mostrarSala(){
        for (int i= 0;i < sala.length; i++){
       for (int j= 0;j < sala[i].length; j++){ 
            System.out.println(sala[i][j]);
          } 
       }
        
      }
}