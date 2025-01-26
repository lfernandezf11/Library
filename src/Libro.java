public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int idLibro;

    public Libro(String titulo, String autor, String genero, int idLibro){
        this.titulo=titulo;
        this.autor=autor;
        this.genero=genero;
        this.idLibro = idLibro;
    }
    public void settitulo(String titulo){
        this.titulo=titulo;
    }
    public void setautor(String autor){
        this.autor=autor;
    }
    public void setgenero(String genero){
        this.genero=genero;
    }
    public void setidLibro(int idLibro){
        this.idLibro=idLibro;
    }
    public String gettitulo(){
        return titulo;
    }
    public String getautor(){
        return autor;
    }
    public String getgenero(){
        return genero;
    }
    public int getidLibro(){
        return idLibro;
    }
    public String toString(){
        return "{" +
                " titulo='" + gettitulo() + "'" +
                ", autor='" + getautor() + "'" +
                ", genero='" + getgenero() + "'" +
                "}";
    }
}



