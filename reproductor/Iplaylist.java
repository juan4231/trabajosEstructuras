public interface Iplaylist{
    void agregarCancion(Cancion insertCancion);
    void eliminarCancion(String titulo);
    Cancion reproducirlasigiente();
    void vaciarLista();
    int obtenerCantidaddecanciones();    
}