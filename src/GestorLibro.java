import java.util.Arrays;

public class GestorLibro {
    private Libro[]libros;
    private int lleno;
    private static final int TAM = 100;
    /*Creamos un array con los nuevos libros */
    public GestorLibro(){
        libros = new Libro[TAM];
        lleno=0;
    }
    /*Agregar Libro */
    public void agregarLibro(Libro l){
        if(lleno<TAM){
            libros[lleno] = l;/*Añadimos el libro al array*/
            lleno++;
        }else{
            System.out.println("No se puede agregar el libro, la biblioteca está llena.");
        }
    }
    /*Buscar Libro por Autor*/
    public Libro[] buscarporAutor(String autor){
        Libro[] resultado = new Libro[TAM];/*Creamos un array temporal para guardar los resultados */
        int autorLleno = 0;
        for (int i = 0; i < lleno; i++){
            if (libros[i].getautor().equals(autor)){
                resultado[autorLleno] = libros[i];
                autorLleno++;
            }
        }
        return Arrays.copyOf(resultado, autorLleno);
    }
    /*Buscar el índice del Libro por Título */
    private int buscarIndiceLibro(String titulo){
        int buscar = -1;
        for(int i = 0; i < lleno && buscar == -1; i++){
            if (libros[i].gettitulo().equals(titulo)){
                buscar = i;
            }
        }return buscar;
    }
    /*Busca un Libro por título */
    public Libro buscarLibro(String titulo){
        Libro buscar = null;
        int indice = buscarIndiceLibro(titulo);
        if(indice != -1){
            buscar = libros[indice];
        }return buscar;
    }
    /*Eliminar Libro por título */
    public boolean eliminarLibro(String titulo){
        int indice = buscarIndiceLibro(titulo);
        if(indice != -1){
            /*Movemos los libros para eliminar el libro en el índice */
            for(int i = indice; i < lleno -1; i++){
                libros[i] = libros[i + 1];
            }
            libros[--lleno] = null;/*Reducimos el tamaño del array y ponemos null en la última posición */
            return true;
        }else{
            return false;
        }
    }
    /*Buscar Libros por categoría */
    public Libro[] buscarporCategoria(Categorialibro categorialibro){
        Libro[]resultado=new Libro[TAM];
        int categoriaLlena = 0;
        for(int i = 0; i < lleno; i++){
            if(libros[i].getCategorialibro().equals(categorialibro)){
                resultado[categoriaLlena] = libros[i];
                categoriaLlena++;
            }
        }return Arrays.copyOf(resultado, categoriaLlena);
    }
    /*Mostrar todos los libros (si no hay libros almacenados en el sistema lo indica) */
    public void mostrarLibros(){
        if(lleno == 0){
            System.out.println("No hay libros disponibles");
        }else{
            for(int i = 0; i < lleno; i++){
                System.out.println(libros[i]);
            }
        }
    }
    /*Devolver los libros como String */
    public String toString(){
        String stringLibro = "";
        for(int i = 0; i < lleno; i++){
            stringLibro += libros[i].toString() + "\n";
        }return stringLibro;
    }

/*Devuelve un array de libros como String */
public static String toString(Libro[]arrayLibro){
    String stringLibro = "";
    for(Libro libro : arrayLibro){
        stringLibro += libro.toString() + "\n";
    }return stringLibro;
}

    /*public void menu(){
        int opcion=0;
        do{
            System.out.println("GESTOR DE LIBROS");
            System.out.println("----------------");
            System.out.println("1.Agregar libro");
            System.out.println("2.Buscar Libro");
            System.out.println("3.Eliminar Libro");
            System.out.println("4.Mostrar libro");
            
        }while(opcion != 0);*/
}

