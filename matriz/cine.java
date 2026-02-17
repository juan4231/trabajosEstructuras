public class cine{
    static int[][] sala = new int [8][10];
    public static void main(String[] args) {
        inicializarSala();
        System.out.println("estado inical de la sala");
        mostrarSala();
        reservarAsiento(2 , 5);
        reservarAsiento(2 , 6);
        reservarAsiento(2 , 7); 
        
        reservarAsiento(2 , 5);
        

}
}