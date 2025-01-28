import java.util.Arrays;
import java.util.Scanner;

public class Libromain {
    public static void main(String[] args) throws Exception {
    
    public void repositoriolibro(){ 
        GestorLibro gestor = new GestorLibro();
    gestor.agregarLibro(new Libro("El niño con el pijama de rayas", "John Boyne", Categorialibro.JUVENIL, 1, 2006));
    gestor.agregarLibro(new Libro("Dune", "Frank Herbert", Categorialibro.CIENCIASFICCION, 2, 1965));
    gestor.agregarLibro(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", Categorialibro.FANTASIA, 3, 1954));
    gestor.agregarLibro(new Libro("Meditaciones", "Marco Aurelio", Categorialibro.ENSAYO, 4, 1800));
    gestor.agregarLibro(new Libro("El diario de Ana Frank", "Ana Frank", Categorialibro.BIOGRAFIA, 5, 1947));
    gestor.agregarLibro(new Libro("Maus", "Art Spiegelman", Categorialibro.NOVELAGRAFICA, 6, 1980));
    gestor.agregarLibro(new Libro("La chica del tren", "Paula Hawkins", Categorialibro.THRILLER, 7, 2015));
    gestor.agregarLibro(new Libro("Cien sonetos de amor", "Pablo Neruda", Categorialibro.POESIA, 8, 1959));
    gestor.agregarLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", Categorialibro.INFANTIL, 9, 1997));
    gestor.agregarLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", Categorialibro.CLASICO, 10, 1605));
    gestor.agregarLibro(new Libro("Historia de la Segunda Guerra Mundial", "Winston Churchill", Categorialibro.HISTORIA, 11, 1948));
    gestor.agregarLibro(new Libro("El código Da Vinci", "Dan Brown", Categorialibro.MISTERIO, 12, 2003));
    gestor.agregarLibro(new Libro("Orgullo y prejuicio", "Jane Austen", Categorialibro.ROMANCE, 13, 1813));
    gestor.agregarLibro(new Libro("El último deseo", "Andrzej Sapkowski", Categorialibro.JUVENIL, 14, 1993));
    gestor.agregarLibro(new Libro("Fahrenheit 451", "Ray Bradbury", Categorialibro.CIENCIASFICCION, 15, 1953));
    gestor.agregarLibro(new Libro("La espada de la verdad", "Terry Goodkind", Categorialibro.FANTASIA, 16, 1994));
    }
     
    Scanner sc = new Scanner(System.in);
    public void buscarLibroporTitulo() {
        System.out.println("Introduce el título del libro a buscar:");
        String titulo = sc.nextLine();
        System.out.println(GestorLibro.toString(gestor.buscarLibro(titulo)));
    }

    public void buscarLibroporAutor() {
        System.out.println("Introduce el autor del libro a buscar:");
        String autor = sc.nextLine();
        System.out.println(GestorLibro.toString(gestor.buscarLibro(autor)));
    }

    public void buscarLibroporCategoria() {
        System.out.println("Introduce la categoría del libro a buscar:");
        String categoria = sc.nextLine();
        System.out.println(Arrays.toString(gestor.buscarporCategoria(categoria)));
    }

    public void eliminarLibroporAutor() {
        System.out.println("Introduce el autor del libro que desea eliminar:");
        String autor = sc.nextLine();
        boolean eliminado = gestor.eliminarLibroPorAutor(autor);
        
        if (eliminado) {
            System.out.println("Los libros del autor '" + autor + "' han sido eliminados.");
        } else {
            System.out.println("No se encontraron libros de ese autor.");
        }
    }
}
    }





