public class Cancion{
private String nombrecancion;
private String artista;
private String Genero;
private double duracion;
public Cancion(String nombrecancion, String artista,String Genero,double duracion) {
    this.nombrecancion=nombrecancion;
    this.artista=artista;
    this.Genero=Genero;
    this.duracion=duracion;
} 
public String getnombrecancion(){
    return nombrecancion;
}
public void setnombrecancion(String nombrecancion){
    this.nombrecancion = nombrecancion;
}
public String getartista(){
    return artista;
}
public void setartista(String artista){
    this.artista = artista;
}
public String getGenero(){
    return Genero;
}
public void setGenero(String Genero){
    this.Genero = Genero;
}
public double getduracion(){
    return duracion;
}
public void setduracion(double duracion){
    this.duracion = duracion;
}
public void mostrarInfo(){
    System.out.println("cancion:" + nombrecancion);
    System.out.println("Artista:" + artista);
    System.out.println("genero:" + Genero);
    System.out.println("Duracion:" + duracion);
}

}