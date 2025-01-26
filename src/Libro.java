public class Libro {
    private String titulo;
    private String autor;
    private String categoria;
    private int idLibro;
    private int fechapubli;

    public Libro(String titulo, String autor, String categoria, int idLibro, int fechapubli){
        this.titulo=titulo;
        this.autor=autor;
        this.categoria=categoria;
        this.idLibro = idLibro;
        this.fechapubli=fechapubli;
    }
    public void settitulo(String titulo){
        this.titulo=titulo;
    }
    public void setautor(String autor){
        this.autor=autor;
    }
    public void setgenero(String categoria){
        this.categoria=categoria;
    }
    public void setidLibro(int idLibro){
        this.idLibro=idLibro;
    }
    public void setfechapubli(int fechapubli){
        this.fechapubli=fechapubli;
    }
    public String gettitulo(){
        return titulo;
    }
    public String getautor(){
        return autor;
    }
    public String getcategoria(){
        return categoria;
    }
    public int getidLibro(){
        return idLibro;
    }
    public int getfechapubli(){
        return fechapubli;
    }
    public String toString(){
        return "{" +
                " titulo='" + gettitulo() + "'" +
                ", autor='" + getautor() + "'" +
                ", genero='" + getcategoria() + "'" +
                "}";
    }
}



