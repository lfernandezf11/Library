public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int fecha;

    public Libro(String titulo, String autor, String genero, int fecha){
        this.titulo=titulo;
        this.autor=autor;
        this.genero=genero;
        this.fecha=fecha;
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
    public void setfecha(int fecha){
        this.fecha=fecha;
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
    public int getfecha(){
        return fecha;
    }
    public String toString(){
        return "{" +
                " titulo='" + gettitulo() + "'" +
                ", autor='" + getautor() + "'" +
                ", genero='" + getgenero() + "'" +
                ", fechapublicación='" + getfecha() + "'" +
                "}";
    }
}



