public class Cancion{
private String nombrecancion;
private String artista;
private String Genero;
public Cancion(String nombrecancion, String artista,String Genero) {
    this.nombrecancion=nombrecancion;
    this.artista=artista;
    this.Genero=Genero;
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


}