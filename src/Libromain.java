public class Libromain {
    public static void main(String[] args) throws Exception {
        GestorLibro gestor = new GestorLibro();
    gestor.agregarLibro(new Libro("El niño con el pijama de rayas", "John Boyne", Categorialibro.JUVENIL, 1));
    gestor.agregarLibro(new Libro("Dune", "Frank Herbert", Categorialibro.CIENCIASFICCION, 2));
    gestor.agregarLibro(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", Categorialibro.FANTASIA, 3));
    gestor.agregarLibro(new Libro("Meditaciones", "Marco Aurelio", Categorialibro.ENSAYO, 4));
    gestor.agregarLibro(new Libro("El diario de Ana Frank", "Ana Frank", Categorialibro.BIOGRAFIA, 5));
    gestor.agregarLibro(new Libro("Maus", "Art Spiegelman", Categorialibro.NOVELAGRAFICA, 6));
    gestor.agregarLibro(new Libro("La chica del tren", "Paula Hawkins", Categorialibro.THRILLER, 7));
    gestor.agregarLibro(new Libro("Cien sonetos de amor", "Pablo Neruda", Categorialibro.POESIA, 8));
    gestor.agregarLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", Categorialibro.INFANTIL, 9));
    gestor.agregarLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", Categorialibro.CLASICO, 10));
    gestor.agregarLibro(new Libro("Historia de la Segunda Guerra Mundial", "Winston Churchill", Categorialibro.HISTORIA, 11));
    gestor.agregarLibro(new Libro("El código Da Vinci", "Dan Brown", Categorialibro.MISTERIO, 12));
    gestor.agregarLibro(new Libro("Orgullo y prejuicio", "Jane Austen", Categorialibro.ROMANCE, 13));
    gestor.agregarLibro(new Libro("El último deseo", "Andrzej Sapkowski", Categorialibro.JUVENIL, 14));
    gestor.agregarLibro(new Libro("Fahrenheit 451", "Ray Bradbury", Categorialibro.CIENCIASFICCION, 15));
    gestor.agregarLibro(new Libro("La espada de la verdad", "Terry Goodkind", Categorialibro.FANTASIA, 16));

        /*Todos los libros */
        System.out.println("Todos los libros:");
        System.out.println(gestor);
        /*Buscar libros por título */
        System.out.println("Buscar libro por autor: " + gestor.buscarLibro() + "\n");
        /*Buscar libros por autor */
        System.out.println("Libros de (el autor que sea):\n" + GestorLibro.toString(gestor.buscarporAutor("autor que buscar")) + "\n");
        /*Buscar canciones por categoría */
        System.out.println("Libros de (categoria que sea):" + GestorLibro.toString(gestor.buscarporCategoria("categoria que sea")) + "\n");
        /*Eliminar un libro por autor*/
        gestor.eliminarLibro("el libro a eliminar");
        System.out.println("Libros después de eliminar:\n" + GestorLibro.toString(gestor.buscarporAutor("autor que buscar")) + "\n");
        /*Todas los libros para ver los cambios */
        System.out.println("Todos los libros:\n" + gestor.toString() + "\n");
    }
}
