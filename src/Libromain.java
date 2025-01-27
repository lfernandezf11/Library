import java.util.Arrays;

public class Libromain {
    public static void main(String[] args) throws Exception {
        GestorLibro gestor = new GestorLibro();
    gestor.agregarLibro(new Libro("El niño con el pijama de rayas", "John Boyne", Categorialibro.JUVENIL, 1, 2006));
    gestor.agregarLibro(new Libro("Dune", "Frank Herbert", Categorialibro.CIENCIASFICCION, 2, 1965));
    gestor.agregarLibro(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", Categorialibro.FANTASIA, 3, 1954));
    gestor.agregarLibro(new Libro("Meditaciones", "Marco Aurelio", Categorialibro.ENSAYO, 4, 180));
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

        /*Todos los libros */
        System.out.println("Todos los libros:");
        System.out.println(gestor);
        /*Buscar libros por título */
        System.out.println("Buscar libro por autor: " + gestor.buscarLibro("titulo del libro") + "\n");
        /*Buscar libros por autor */
        System.out.println("Libros de (el autor que sea):\n" + GestorLibro.toString(gestor.buscarporAutor("autor que buscar")) + "\n");
        /*Buscar canciones por categoría */
        System.out.println("Libros de (categoria que sea):" + Arrays.toString(gestor.buscarporCategoria(Categorialibro."categoria")) + "\n");
        /*Eliminar un libro por autor*/
        gestor.eliminarLibro("el libro a eliminar");
        System.out.println("Libros después de eliminar:\n" + GestorLibro.toString(gestor.buscarporAutor("autor que buscar")) + "\n");
        /*Todas los libros para ver los cambios */
        System.out.println("Todos los libros:\n" + gestor.toString() + "\n");
    }
}
