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
public String setnombrecancion(String nombrecancion){
    this.nombrecancion = nombrecancion;
    

}

}