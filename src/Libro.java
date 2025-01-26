public class Libro {
    private String titulo;
    private String autor;
    private Categorialibro categoria;
    private int idLibro;
    private int fechapubli;

    public Libro(String titulo, String autor, Categorialibro categoria, int idLibro, int fechapubli){
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
    public void setCategorialibro(Categorialibro categoria){
        this.categoria=categoria;
    }
    public void setidLibro(int idLibro){
        this.idLibro=idLibro;
    }
    public void setfechapubli(int fechapubli){
        this.fechapubli=fechapubli;
    }
    public String gettitulo(){
        return this.titulo;
    }
    public String getautor(){
        return this.autor;
    }
    public Categorialibro getCategorialibro(){
        return this.categoria;
    }
    public int getidLibro(){
        return this.idLibro;
    }
    public int getfechapubli(){
        return this.fechapubli;
    }
    public String toString(){
        return "{" +
                " titulo='" + gettitulo() + "'" +
                ", autor='" + getautor() + "'" +
                ", categoria='" + getCategorialibro() + "'" +
                "}";
    }
}



