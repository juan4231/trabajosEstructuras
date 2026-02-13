


public class Principal {
    public static void main(String[] args) {

        Cancion cancion = new Cancion("mountain top","rio kosta", "pop", 180 );

        System.out.println("Canción: " + cancion.getnombrecancion());
        System.out.println("Artista: " + cancion.getartista());
        System.out.println("Género: " + cancion.getGenero());
        System.out.println("Duración: " + cancion.getduracion());
    }
}
