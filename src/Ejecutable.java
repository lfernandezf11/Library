import java.util.Scanner;
import java.util.Arrays;

public class Ejecutable {
    public static Scanner sc = new Scanner(System.in); /*ESTABLECER PARA TODO EL MAIN!!!!!*/
    public static void main(String[] args) throws Exception {
//LUCÍA.
/*IMPLEMENTAR MENÚ LOGIN, 5 INTENTOS, FIN DEL PROGRAMA.
 * MÉTODO IF USER.GETALIAS.EQUALS(ALIAS) && USER.GETPASSWORD.EQUALS(PASSWORD) == LOGIN: TRUE.
*/


/*Menú para usuarios Administradores */  
        boolean admin = true;    

        do{
            System.out.println(".____________________________________________________.");
            System.out.println("|            BIENVENIDO A TU MENÚ PERSONAL           |"); //User.getNombre().
            System.out.println("|------- Elige qué operación quieres realizar: ------|");
            System.out.println("|                                                    |");
            System.out.println("| __LIBRERÍA:                                        |");
            System.out.println("|      1) Agregar un libro nuevo.                    |");
            System.out.println("|      2) Buscar un libro.                           |");
            System.out.println("|      3) Mostrar los libros disponibles.            |");
            System.out.println("|      4) Eliminar un libro.                         |");
            System.out.println("|                                                    |");
            System.out.println("| __USUARIOS:                                        |");
            System.out.println("|      5) Dar de alta un nuevo usuario.              |");
            System.out.println("|      6) Consultar datos de usuario existente.      |");
            System.out.println("|                                                    |");
            System.out.println("| __PRÉSTAMOS:                                       |");
            System.out.println("|      7) Solicitar un préstamo.                     |");
            System.out.println("|      8) Devolver un libro prestado.                |");
            System.out.println("|                                                    |");
            System.out.println("| __ESTADÍSTICAS E INFORMES:                         |");   
            System.out.println("|      9) N. de préstamos totales.                   |");     
            System.out.println("|     10) N. de préstamos activos.                   |");  
            System.out.println("|     11) Libros más populares.                      |");   
            System.out.println("|     12) Usuario con más préstamos activos.         |"); 
            System.out.println("|                                                    |");
            System.out.println("|---------- Pulsa 0 para salir del programa ---------|");  
            System.out.println("|____________________________________________________|"); 
    
            int opcion = Integer.parseInt(sc.nextLine());
    
            //Switch para elección de opciones, usuario administrador.
                /*switch (opcion) {
                    case 1 -> función altalibro que utilice el método agregarlibro;
                    case 2 -> funcion busquedalibro que utilice despliegue un menú tipo de búsqueda y utilice los metodos buscar por titulo, autor, categoria.;
                    case 3 -> sout + metodo de busquedaporestatus + Libro[].toString;
                    case 4 -> sout + metodoeliminarlibro.
                    case 5 -> //LUCIA. ALTA USUARIO.
                    case 6 -> //LUCÍA. BÚSQUEDA USUARIO. MENÚ TIPO BUSQUEDA.
                //PENDIENTE DE IMPLEMENTACIÓN EN CLASES
                    case 7 -> préstamo;
                    case 8 -> devolver;
                    case 9 -> préstamostotales;
                    case 10 -> préstamosactivos;
                    case 11 -> másprestados;
                    case 12 -> usuarioconmáspréstamos.
                    case 0 -> System.out.println("Saliendo del programa...");
                              admin = false;
                    default: -> System.out.println("Valor introducido no válido. Prueba de nuevo.");
        }*/
        
        }while(admin);
    }

/*Menú para usuarios no administradores*/  
    public void menuNoAdmin(){
        boolean noadmin = true;    

        do{
            System.out.println(".____________________________________________________.");
            System.out.println("|            BIENVENIDO A TU MENÚ PERSONAL           |"); //User.getNombre().
            System.out.println("|------- Elige qué operación quieres realizar: ------|");
            System.out.println("|                                                    |");
            System.out.println("| __LIBRERÍA:                                        |");
            System.out.println("|      1) Buscar un libro.                           |");
            System.out.println("|      2) Mostrar los libros disponibles.            |");
            System.out.println("|                                                    |");
            System.out.println("| __PRÉSTAMOS:                                       |");
            System.out.println("|      3) Solicitar un préstamo.                     |");
            System.out.println("|      4) Devolver un libro prestado.                |");
            System.out.println("|                                                    |");
            System.out.println("|---------- Pulsa 0 para salir del programa ---------|");  
            System.out.println("|____________________________________________________|"); 

            int opcion = Integer.parseInt(sc.nextLine());

            //Switch para elección de opciones, usuario no administrador.
                /*switch (opcion) {
                    case 1 -> funcion busquedalibro que utilice despliegue un menú tipo de búsqueda y utilice los metodos buscar por titulo, autor, categoria.;
                    case 2 -> sout + metodo de busquedaporestatus + Libro[].toString;
                //PENDIENTE DE IMPLEMENTACIÓN EN CLASES
                    case 3 -> préstamo;
                    case 4 -> devolver;
                    case 0 -> System.out.println("Saliendo del programa...");
                              noadmin = false;
                    default: -> System.out.println("Valor introducido no válido. Prueba de nuevo.");
        }*/
    
        }while(noadmin);
    }

/*Menú para búsqueda de libro por filtro.*/
//TERESA
    public void menuBusquedaLibro(){
        boolean filtrolibro = true;    

        do{
            System.out.println(".____________________________________________________.");
            System.out.println("|                  BUSCAR UN LIBRO                   |");
            System.out.println("|----------- ¿Cómo deseas buscar tu libro? ----------|");
            System.out.println("|                                                    |");
            System.out.println("|      a) Por título.                                |");
            System.out.println("|      b) Por autor.                                 |");
            System.out.println("|      c) Por categoría.                             |");
            System.out.println("|                                                    |");
            System.out.println("|---------- Pulsa 0 para salir del programa ---------|");  
            System.out.println("|------ Pulsa 1 para volver al menú principal -------|");  
            System.out.println("|____________________________________________________|"); 

            int opcion = Integer.parseInt(sc.nextLine());

            //Switch para elección de opciones, búsqueda de libro por filtro.
                /*switch (opcion) {
                    case 'a' -> sout + busquedaportitulo.
                    case 'b' -> sout + busquedaporautor.
                    case 'c' -> sout + busquedaporcategoria.
                    case '0' -> System.out.println("Saliendo del programa...");
                                filtrolibro = false;    
                    case '1' -> if admin menuadmin else menunoadmin           CÓMO LO HAGO????*/ 
        }while(filtrolibro);
    }

/*Menú para búsqueda de usuario por filtro.*/
//LUCÍA
    public void menuBusquedaUsuario(){
        boolean filtroUser = true;    

        do{
            System.out.println(".____________________________________________________.");
            System.out.println("|          CONSULTAR INFORMACIÓN DE USUARIOS         |");
            System.out.println("|---------- ¿Qué operación deseas realizar? ---------|");
            System.out.println("|                                                    |");
            System.out.println("|      a) Búsqueda por apellido.                     |");
            System.out.println("|      b) Búsqueda por nombre de usuario.            |");
            System.out.println("|      c) Búsqueda por dirección email.              |");
            System.out.println("|      d) Búsqueda por tipo de usuario.              |");
            System.out.println("|      e) Actualización de datos de usuario.         |");
            System.out.println("|      f) Borrado de usuario.                        |");
            System.out.println("|                                                    |");
            System.out.println("|---------- Pulsa 0 para salir del programa ---------|");  
            System.out.println("|------ Pulsa 1 para volver al menú principal -------|");  
            System.out.println("|____________________________________________________|"); 

            int opcion = Integer.parseInt(sc.nextLine());

            //Switch para elección de opciones, búsqueda de información de usuarios por filtro, para administradores.
                /*switch (opcion) {
                    case 'a' -> sout + busquedaporapellido.
                    case 'b' -> sout + busquedaporalias.
                    case 'c' -> sout + busquedapormail.
                    case 'd' -> sout + uptadeuser.
                    case 'e' -> sout + update user.
                    case 'f' -> sout + delete user.
                    case '0' -> System.out.println("Saliendo del programa...");
                                filtroUser = false;    
                    case '1' -> if admin menuadmin else menunoadmin           CÓMO LO HAGO????*/ 
        }while(filtroUser);
    }

    public static void buscaApellido(){
        System.out.println("Introduce el apellido del usuario: ");
        GestorUsers apellidos = new GestorUsers();
        User[] usuarios = apellidos.searchbyApellido(sc.nextLine());
        if(usuarios != null && usuarios.length > 0){ //Comprobación extra: el array no es nulo y tiene al menos un elemento.
            System.out.println(GestorUsers.toString(usuarios));
        }else{
            System.out.println("No hay coincidencias para esta búsqueda.");
        }
    }



       
    public void repositoriolibro(){ 
        GestorLibro gestor = new GestorLibro();
    gestor.agregarLibro(new Libro("El niño con el pijama de rayas", "John Boyne", Categorialibro.JUVENIL, 1, 2006, true));
    gestor.agregarLibro(new Libro("Dune", "Frank Herbert", Categorialibro.CIENCIASFICCION, 2, 1965, true));
    gestor.agregarLibro(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", Categorialibro.FANTASIA, 3, 1954, false));
    gestor.agregarLibro(new Libro("Meditaciones", "Marco Aurelio", Categorialibro.ENSAYO, 4, 1800, true));
    gestor.agregarLibro(new Libro("El diario de Ana Frank", "Ana Frank", Categorialibro.BIOGRAFIA, 5, 1947, true));
    gestor.agregarLibro(new Libro("Maus", "Art Spiegelman", Categorialibro.NOVELAGRAFICA, 6, 1980, true));
    gestor.agregarLibro(new Libro("La chica del tren", "Paula Hawkins", Categorialibro.THRILLER, 7, 2015, true));
    gestor.agregarLibro(new Libro("Cien sonetos de amor", "Pablo Neruda", Categorialibro.POESIA, 8, 1959, true));
    gestor.agregarLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", Categorialibro.INFANTIL, 9, 1997, true));
    gestor.agregarLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", Categorialibro.CLASICO, 10, 1605, false));
    gestor.agregarLibro(new Libro("Historia de la Segunda Guerra Mundial", "Winston Churchill", Categorialibro.HISTORIA, 11, 1948, false));
    gestor.agregarLibro(new Libro("El código Da Vinci", "Dan Brown", Categorialibro.MISTERIO, 12, 2003, false));
    gestor.agregarLibro(new Libro("Orgullo y prejuicio", "Jane Austen", Categorialibro.ROMANCE, 13, 1813, true));
    gestor.agregarLibro(new Libro("El último deseo", "Andrzej Sapkowski", Categorialibro.JUVENIL, 14, 1993, true));
    gestor.agregarLibro(new Libro("Fahrenheit 451", "Ray Bradbury", Categorialibro.CIENCIASFICCION, 15, 1953, false));
    gestor.agregarLibro(new Libro("La espada de la verdad", "Terry Goodkind", Categorialibro.FANTASIA, 16, 1994, false));
    }
     
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

}



