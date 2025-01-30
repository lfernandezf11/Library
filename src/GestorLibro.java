/**
 * @author: Lucía Fernández Florencio
 * @author: María Teresa Calvo Peña
 */
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
            System.out.println("Libro agregado: " + l);
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
            System.out.println("Libro no encontrado");
            return false;
        }
    }
    /*Buscar Libros por categoría */
    public Libro[] buscarporCategoria(Categorialibro categoria){
        Libro[]resultado=new Libro[TAM];
        int categoriaLlena = 0;
        for(int i = 0; i < lleno; i++){
            if(libros[i].getCategorialibro().equals(categoria)){
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

    public Libro[] getLibrosDisponibles() {
        Libro[] disponibles = new Libro[TAM];
        int contDisponible = 0;
    
        for (int i = 0; i < lleno; i++) {
            if (libros[i].getisdisponible()) {
                disponibles[contDisponible] = libros[i];
                contDisponible++;
            }
        }
    
        return Arrays.copyOf(disponibles, contDisponible); 
    }
    /*La misma lógica que para el getLibrosDisponibles. Los prestados son un array de los libros no disponibles.*/
    public Libro[] getLibrosPrestados() {
        Libro[] prestados = new Libro[TAM];
        int contprestados = 0;
    
        for (int i = 0; i < lleno; i++) {
            if (libros[i].getisdisponible() == false) {
                prestados[contprestados] = libros[i];
                contprestados++;
            }
        }
    
        return Arrays.copyOf(prestados, contprestados); 
    }

    public int getTotalPrestamos(){
        int prestamosTot = 0;
        for(int i=0; i<lleno; i++){
            prestamosTot += libros[i].getVecesPrestado();
        }
        return prestamosTot;
    }
    
    public Libro[] dosMasPrestados() {
        if (lleno == 0) {
            return new Libro[0];
        }
    
        Libro[] masPrestados = new Libro[2];
        masPrestados[0] = libros[0];
        masPrestados[1] = null;
    
        for (int i = 1; i < lleno; i++) {
            if (libros[i].getVecesPrestado() > masPrestados[0].getVecesPrestado()) {
                masPrestados[1] = masPrestados[0];
                masPrestados[0] = libros[i];
            } else if (masPrestados[1] == null || libros[i].getVecesPrestado() > masPrestados[1].getVecesPrestado()) {
                masPrestados[1] = libros[i];
            }
        }return masPrestados;
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
}

