/**
 * @author: Lucía Fernández Florencio
 * @author: María Teresa Calvo Peña
 */
import java.util.Scanner;

public class Ejecutable {
    public static Scanner sc = new Scanner(System.in); 
    public static GestorUsers gestor = new GestorUsers();
    public static GestorLibro gestorL = new GestorLibro();
    
    static{
            gestor.addUser(new User("Juan", "Pérez", "juanp", "pass123", true, 2019, "juan.perez@gmail.com", 2));
            gestor.addUser(new User("María", "González", "mariag", "securepass", false, 2021, "maria.gonzalez@hotmail.com", 1));
            gestor.addUser(new User("Carlos", "López", "carlosl", "carlospass", true, 2020, "carlos.lopez@outlook.es", 0));
            gestor.addUser(new User("Ana María", "Pérez", "anap189", "ana1234", false, 2022, "ana.perez@yahoo.com", 3));
            gestor.addUser(new User("Luis", "Martínez", "luism5", "luispass", true, 2023, "luis.martinez@gmail.com", 1));
            gestor.addUser(new User("Elena", "González", "elenag", "elenapass", false, 2021, "elena.gonzalez@hotmail.com", 2));
            gestor.addUser(new User("Sofía", "Pérez", "sofiap", "sofia123", true, 2020, "sofia.perez@outlook.es", 0));
            gestor.addUser(new User("Diego", "López", "diego2l", "diegopass", false, 2025, "diego.lopez@yahoo.com", 1));
            gestor.addUser(new User("Laura", "Martínez", "lauramm", "laurapass", true, 2022, "laura.martinez@gmail.com", 2));
            gestor.addUser(new User("Pedro", "García", "pedrog7", "pedropass", false, 2021, "pedro.garcia@hotmail.com", 0));
            gestor.addUser(new User("Clara", "García", "clarag19", "clarapass", false, 2025, "clara.garcia@outlook.es", 1));
            gestor.addUser(new User("Jorge", "Pérez", "jorgep7", "jorgepass", true, 2019, "jorge.perez@yahoo.com", 4));
            gestor.addUser(new User("Lucía", "González", "lucia12g", "luciapass", false, 2023, "lucia.gonzalez@gmail.com", 0));
            gestor.addUser(new User("Raúl", "López", "raulop", "raulpass", true, 2022, "raul.lopez@hotmail.com", 1));
            gestor.addUser(new User("Marta", "Martínez", "martam21", "martapass", false, 2021, "marta.martinez@outlook.es", 2));

            gestorL.agregarLibro(new Libro("El niño con el pijama de rayas", "John Boyne", Categorialibro.JUVENIL, 1, 2006, true, 0));
            gestorL.agregarLibro(new Libro("Dune", "Frank Herbert", Categorialibro.CIENCIASFICCION, 2, 1965, true, 5));
            gestorL.agregarLibro(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", Categorialibro.FANTASIA, 3, 1954, false, 3));
            gestorL.agregarLibro(new Libro("Meditaciones", "Marco Aurelio", Categorialibro.ENSAYO, 4, 1800, true, 2));
            gestorL.agregarLibro(new Libro("El diario de Ana Frank", "Ana Frank", Categorialibro.BIOGRAFIA, 5, 1947, true, 0));
            gestorL.agregarLibro(new Libro("Maus", "Art Spiegelman", Categorialibro.NOVELAGRAFICA, 6, 1980, true, 4));
            gestorL.agregarLibro(new Libro("La chica del tren", "Paula Hawkins", Categorialibro.THRILLER, 7, 2015, true, 7));
            gestorL.agregarLibro(new Libro("Cien sonetos de amor", "Pablo Neruda", Categorialibro.POESIA, 8, 1959, true, 3));
            gestorL.agregarLibro(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", Categorialibro.INFANTIL, 9, 1997, true, 2));
            gestorL.agregarLibro(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", Categorialibro.CLASICO, 10, 1605, false, 1));
            gestorL.agregarLibro(new Libro("Historia de la Segunda Guerra Mundial", "Winston Churchill", Categorialibro.HISTORIA, 11, 1948, false, 5));
            gestorL.agregarLibro(new Libro("El código Da Vinci", "Dan Brown", Categorialibro.MISTERIO, 12, 2003, false, 2));
            gestorL.agregarLibro(new Libro("Orgullo y prejuicio", "Jane Austen", Categorialibro.ROMANCE, 13, 1813, true, 4));
            gestorL.agregarLibro(new Libro("El último deseo", "Andrzej Sapkowski", Categorialibro.JUVENIL, 14, 1993, true, 8));
            gestorL.agregarLibro(new Libro("Fahrenheit 451", "Ray Bradbury", Categorialibro.CIENCIASFICCION, 15, 1953, false, 0));
            gestorL.agregarLibro(new Libro("La espada de la verdad", "Terry Goodkind", Categorialibro.FANTASIA, 16, 1994, false, 0));
    }
   

    /*Menú login con un máximo de 5 intentos, que maneja tanto casos de usuario nulo como de usuario correcto pero contraseña incorrecta. */    
    public static void main(String[] args) throws Exception {
        boolean login = false;    
        int intentos = 4;

        do{
            System.out.println(".____________________________________________________.");
            System.out.println("|          BIENVENIDO A LOCK & STOCK LIBRARY         |"); //User.getNombre().
            System.out.println("|------- Para iniciar sesión, ingrese su usuario     |");
            System.out.println("|        y contraseña:                               |");
            System.out.println("|____________________________________________________|"); 
            System.out.println("Usuario: ");
            String alias = sc.nextLine();
            System.out.println("Contraseña: ");
            String password = sc.nextLine();

            User userlogin = gestor.searchbyAlias(alias);
            while(intentos>0){
                if(userlogin == null  || (!userlogin.equals(null) && !userlogin.getPassword().equals(password))){
                    System.out.println("Usuario o contraseña incorrectos. Inténtelo de nuevo . Le quedan " + intentos + " intentos.");
                    System.out.println("Usuario: ");
                    alias = sc.nextLine();
                    System.out.println("Contraseña: ");
                    password = sc.nextLine();
                    intentos--;
                }else if(userlogin != null && userlogin.getAlias().equals(alias) && userlogin.getPassword().equals(password)){
                    login = true;
                    System.out.println("Inicio de sesión correcto. Bienvenido, " + userlogin.getNombre() + ".");
                    if(userlogin.getEsAdmin()){
                        menuAdmin();
                    }else{
                        menuNoAdmin();
                    }
                }
        }System.out.println("Número de intentos agotados. Incapaz de ingresar. ");
    }while (!login && intentos >0);
}



/*Menú para usuarios Administradores */  
public static void menuAdmin(){
    boolean admin = true;  
     

        do{
            System.out.println(".____________________________________________________.");
            System.out.println("|            BIENVENIDO A TU MENÚ PERSONAL           |"); 
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
                switch (opcion) {
                    case 1 : anadirlibro();
                    break;
                    case 2: menuBusquedaLibro();
                        break;
                    case 3: mostrarLibrosDisponibles();
                        break;
                    case 4: eliminarLibro();
                        break;
                    case 5: agregaUsuario();
                        break;
                    case 6: menuBusquedaUsuario();
                        break;
                    case 7: gestionaPrestamo();
                        break;
                    case 8: devuelveLibro();
                        break;
                    case 9: muestraPrestamosTot();
                        break;
                    case 10: muestraPrestamosAct();
                        break;
                    case 11 : gestorL.dosMasPrestados().toString();                        
                    break;
                    case 12: UserMaxPrestamos();
                        break;
                    case 0: admin = false;
                    System.out.println("Saliendo del programa...");       
                        break;
                    default: System.out.println("Valor introducido no válido. Prueba de nuevo.");
                        break;
        }
        
        }while(admin);
    }
    public static void anadirlibro(){
        System.out.println("Introduce el título del libro:");
                String titulo = sc.nextLine();
                
                System.out.println("Introduce el autor del libro:");
                String autor = sc.nextLine();

                System.out.println("Introduce el ID del libro:");
                int idLibro = Integer.parseInt(sc.nextLine());

                System.out.println("Introduce el año de publicación del libro:");
                int fechapubli = Integer.parseInt(sc.nextLine());

                System.out.println("¿Está el libro disponible? (true/false):");
                boolean disponible = Boolean.parseBoolean(sc.nextLine());
                
                System.out.println("Introduce la categoría del libro (JUVENIL, CIENCIASFICCION, FANTASIA, ENSAYO, BIOGRAFIA, NOVELAGRAFICA, THRILLER, POESIA, INFANTIL, CLASICO, HISTORIA, MISTERIO, ROMANCE):");
                String categoria = sc.nextLine();

                System.out.println("Introduce el número de veces que el libro ha sido prestado: ");
                int vecesPrestado = Integer.parseInt(sc.nextLine());
                
             
                Categorialibro categoriaEnum = null;

                // Comprobamos la categoría ingresada 
                if (categoria.equals("JUVENIL")) {
                    categoriaEnum = Categorialibro.JUVENIL;
                } else if (categoria.equals("CIENCIASFICCION")) {
                    categoriaEnum = Categorialibro.CIENCIASFICCION;
                } else if (categoria.equals("FANTASIA")) {
                    categoriaEnum = Categorialibro.FANTASIA;
                } else if (categoria.equals("ENSAYO")) {
                    categoriaEnum = Categorialibro.ENSAYO;
                } else if (categoria.equals("BIOGRAFIA")) {
                    categoriaEnum = Categorialibro.BIOGRAFIA;
                } else if (categoria.equals("NOVELAGRAFICA")) {
                    categoriaEnum = Categorialibro.NOVELAGRAFICA;
                } else if (categoria.equals("THRILLER")) {
                    categoriaEnum = Categorialibro.THRILLER;
                } else if (categoria.equals("POESIA")) {
                    categoriaEnum = Categorialibro.POESIA;
                } else if (categoria.equals("INFANTIL")) {
                    categoriaEnum = Categorialibro.INFANTIL;
                } else if (categoria.equals("CLASICO")) {
                    categoriaEnum = Categorialibro.CLASICO;
                } else if (categoria.equals("HISTORIA")) {
                    categoriaEnum = Categorialibro.HISTORIA;
                } else if (categoria.equals("MISTERIO")) {
                    categoriaEnum = Categorialibro.MISTERIO;
                } else if (categoria.equals("ROMANCE")) {
                    categoriaEnum = Categorialibro.ROMANCE;
                }

                // Si la categoría es válida, creamos el libro y lo agregamos.
                if (categoriaEnum != null) {
                    Libro libro = new Libro(titulo, autor, categoriaEnum, idLibro, fechapubli, disponible, vecesPrestado);
                    gestorL.agregarLibro(libro);
                } else {
                    System.out.println("Categoría no válida. El libro no puede ser agregado.");
                }
    }
    public static void mostrarLibrosDisponibles() {
        Libro[] librosDisponibles = gestorL.getLibrosDisponibles(); 
    
        if (librosDisponibles.length == 0) {
            System.out.println("No hay libros disponibles.");
        } else {
            System.out.println("Libros disponibles:" + librosDisponibles.toString());
            for (Libro libro : librosDisponibles) {
                System.out.println(libro);  // Aquí muestra el libro con su método toString()
            }
        }
    }
    public static void eliminarLibro() {
        System.out.println("Introduce el título del libro a eliminar:");
        String titulo = sc.nextLine(); 
        
        boolean eliminado = gestorL.eliminarLibro(titulo); 
    
        if (eliminado) {
            System.out.println("El libro '" + titulo + "' ha sido eliminado.");
        } else {
            System.out.println("No se pudo eliminar el libro '" + titulo + "'. Verifica que el título sea correcto.");
        }
    }
/*Menú para usuarios no administradores*/  
    public static void menuNoAdmin(){
        boolean noadmin = true;    

        do{
            System.out.println(".____________________________________________________.");
            System.out.println("|            BIENVENIDO A TU MENÚ PERSONAL           |"); 
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
                switch (opcion) {
                    case 1: menuBusquedaLibro();
                        break;
                    case 2: mostrarLibrosDisponibles();
                        break;
                    case 3: gestionaPrestamo();
                        break;
                    case 4: devuelveLibro();
                    case 0: System.out.println("Saliendo del programa...");
                            noadmin = false;
                        break;  
                    default: System.out.println("Valor introducido no válido. Prueba de nuevo.");
                        break;
        }
    
        }while(noadmin);
    }

/*Menú para búsqueda de libro por filtro.*/
//TERESA
    public static void menuBusquedaLibro(){
        boolean filtrolibro = true;    

        do{
            System.out.println(".____________________________________________________.");
            System.out.println("|                  BUSCAR UN LIBRO                   |");
            System.out.println("|----------- ¿Cómo deseas buscar tu libro? ----------|");
            System.out.println("|                                                    |");
            System.out.println("|      1) Por título.                                |");
            System.out.println("|      2) Por autor.                                 |");
            System.out.println("|      3) Por categoría.                             |");
            System.out.println("|                                                    |");
            System.out.println("|------------ Pulsa 0 para volver al menú -----------|");    
            System.out.println("|____________________________________________________|"); 

            int opcion = Integer.parseInt(sc.nextLine());

            //Switch para elección de opciones, búsqueda de libro por filtro.
                switch (opcion) {
                    case 1: buscarLibroporTitulo();
                    break;
                    case 2: buscarLibroporAutor();
                    break;
                    case 3: buscarLibroporCategoria();
                    break;
                    case 0: System.out.println("Saliendo del programa...");
                              filtrolibro = false;

                    break;
                    default: System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
                }                
        }while(filtrolibro);
    }
    public static void buscarLibroporTitulo() {
        System.out.println("Introduce el título del libro a buscar:");
        Libro resultado=gestorL.buscarLibro(sc.nextLine());
        if (resultado != null) {
            System.out.println("Libro encontrado:" + resultado);
        } else {
            System.out.println("No se encontró ningún libro con el título indicado");
        }
    }
    

    public static void buscarLibroporAutor() {
        System.out.println("Introduce el autor del libro a buscar:");
        String autor = sc.nextLine();
        Libro[]resultado=gestorL.buscarporAutor(autor);
        if (resultado.length == 0){
            System.out.println("No se encontraron libros del autor: " + autor);
        }else{
            System.out.println("Libros encontrados de " + autor + ":");
        }for(Libro libro : resultado){
            System.out.println(libro);
        }
    }
    public static void buscarLibroporCategoria() {
        System.out.println("Introduce la categoría del libro a buscar:");
        String categoria = sc.nextLine().toUpperCase(); // Convertir a mayúsculas para evitar problemas de mayúsculas/minúsculas
        
        Categorialibro categoriaEnum = null;
        
            // Comprobación manual para asignar el valor del enum
        if (categoria.equals("JUVENIL")) {
                categoriaEnum = Categorialibro.JUVENIL;
        } else if (categoria.equals("CIENCIASFICCION")) {
            categoriaEnum = Categorialibro.CIENCIASFICCION;
        } else if (categoria.equals("FANTASIA")) {
            categoriaEnum = Categorialibro.FANTASIA;
        } else if (categoria.equals("ENSAYO")) {
            categoriaEnum = Categorialibro.ENSAYO;
        } else if (categoria.equals("BIOGRAFIA")) {
            categoriaEnum = Categorialibro.BIOGRAFIA;
        } else if (categoria.equals("NOVELAGRAFICA")) {
            categoriaEnum = Categorialibro.NOVELAGRAFICA;
        } else if (categoria.equals("THRILLER")) {
            categoriaEnum = Categorialibro.THRILLER;
        } else if (categoria.equals("POESIA")) {
            categoriaEnum = Categorialibro.POESIA;
        } else if (categoria.equals("INFANTIL")) {
            categoriaEnum = Categorialibro.INFANTIL;
        } else if (categoria.equals("CLASICO")) {
            categoriaEnum = Categorialibro.CLASICO;
        } else if (categoria.equals("HISTORIA")) {
            categoriaEnum = Categorialibro.HISTORIA;
        } else if (categoria.equals("MISTERIO")) {
            categoriaEnum = Categorialibro.MISTERIO;
        } else if (categoria.equals("ROMANCE")) {
            categoriaEnum = Categorialibro.ROMANCE;
        }
        
            // Si se encontró la categoría correspondiente
        if (categoriaEnum != null) {
            Libro[] resultado = gestorL.buscarporCategoria(categoriaEnum);
            if (resultado.length == 0) {
                System.out.println("No se encontraron libros en la categoría " + categoriaEnum);
            } else {
                System.out.println("Libros encontrados en la categoría " + categoriaEnum + ":");
                for (Libro libro : resultado) {
                    System.out.println(libro);
                }
            }
        } else {
            System.out.println("Categoría no válida. Por favor, introduce una categoría correcta.");
        }
    }
    public void eliminarLibroporAutor() {
        System.out.println("Introduce el autor del libro que desea eliminar:");
        String autor = sc.nextLine();
        boolean eliminado = gestorL.eliminarLibro(autor);
        
        if (eliminado) {
            System.out.println("Los libros del autor '" + autor + "' han sido eliminados.");
        } else {
            System.out.println("No se encontraron libros de ese autor.");
        }
    }
    public static void menuCategoriaLibro(){
        boolean filtrocategoria = true;
    do{
            System.out.println(".____________________________________________________.");
            System.out.println("|                 CATEGORÍA DE LIBROS                |"); //User.getNombre().
            System.out.println("|------ ¿Qué categoría de libro quieres añadir? -----|");
            System.out.println("|                                                    |");
            System.out.println("|      1) Juvenil                                    |");
            System.out.println("|      2) CienciasFicción                            |");
            System.out.println("|      3) Fantasía                                   |");
            System.out.println("|      4) Ensayo                                     |"); 
            System.out.println("|      5) Biografía                                  |");
            System.out.println("|      6) NovelaGráfica                              |");
            System.out.println("|      7) Thriller                                   |");
            System.out.println("|      8) Poesía                                     |");
            System.out.println("|      9) Infantil                                   |");
            System.out.println("|      10) Clásico                                   |");
            System.out.println("|      11) Historia                                  |");
            System.out.println("|      12) Misterio                                  |"); 
            System.out.println("|      13) Romance                                   |");
            System.out.println("|                                                    |");
            System.out.println("|---------- Pulsa 0 para salir del programa ---------|");  
            System.out.println("|____________________________________________________|");
           
           int opcion = Integer.parseInt(sc.nextLine());
            switch (opcion) {
                    case 1:
                gestorL.buscarporCategoria(Categorialibro.JUVENIL);
                    break;
                    case 2:
                gestorL.buscarporCategoria(Categorialibro.CIENCIASFICCION);
                    break;
                    case 3:
                gestorL.buscarporCategoria(Categorialibro.FANTASIA);
                    break;
                    case 4:
                gestorL.buscarporCategoria(Categorialibro.ENSAYO);
                    break;
                    case 5:
                gestorL.buscarporCategoria(Categorialibro.BIOGRAFIA);
                    break;
                    case 6:
                gestorL.buscarporCategoria(Categorialibro.NOVELAGRAFICA);
                    break;
                    case 7:
                gestorL.buscarporCategoria(Categorialibro.THRILLER);
                    break;
                    case 8:
                gestorL.buscarporCategoria(Categorialibro.POESIA);
                    break;
                    case 9:
                gestorL.buscarporCategoria(Categorialibro.INFANTIL);
                    break;
                    case 10:
                gestorL.buscarporCategoria(Categorialibro.CLASICO);
                    break;
                    case 11:
                gestorL.buscarporCategoria(Categorialibro.HISTORIA);
                    break;
                    case 12:
                gestorL.buscarporCategoria(Categorialibro.MISTERIO);
                    break;
                    case 13:
                gestorL.buscarporCategoria(Categorialibro.ROMANCE);
                    break;
                    case 0: System.out.println("Volviendo al menú principal...");
                        filtrocategoria = false;
                    break;
                default:
                System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }while (filtrocategoria);
    }
    


/*Menú para búsqueda de usuario por filtro.*/
//LUCÍA
    public static void menuBusquedaUsuario(){
        boolean filtroUser = true;    

        do{
            System.out.println(".____________________________________________________.");
            System.out.println("|          CONSULTAR INFORMACIÓN DE USUARIOS         |");
            System.out.println("|---------- ¿Qué operación deseas realizar? ---------|");
            System.out.println("|                                                    |");
            System.out.println("|      1) Búsqueda por apellido.                     |");
            System.out.println("|      2) Búsqueda por nombre de usuario.            |");
            System.out.println("|      3) Búsqueda por dirección email.              |");
            System.out.println("|      4) Búsqueda por tipo de usuario.              |");
            System.out.println("|      5) Actualización de datos de usuario.         |");
            System.out.println("|      6) Borrado de usuario.                        |");
            System.out.println("|                                                    |");
            System.out.println("|------------ Pulsa 0 para volver al menú -----------|");  
            System.out.println("|____________________________________________________|"); 

            int opcion = Integer.parseInt(sc.nextLine());

            //Switch para elección de opciones, búsqueda de información de usuarios por filtro, para administradores.
                switch (opcion) {
                    case 1: buscaApellido();
                        break;
                    case 2: buscaAlias();
                        break;
                    case 3: buscaMail();
                        break;
                    case 4: buscaTipo();
                        break;
                    case 5: actualizaUsuario();
                        break;
                    case 6: borraUsuario();
                        break;
                    case 0: System.out.println("Volviendo al menú...");
                              filtroUser=false;    
                        break;
                    default: System.out.println("Valor introducido no válido. Prueba de nuevo.");
                        break;
                }
        }while(filtroUser);
    }

/*MÉTODOS LUCÍA*/
//CASE 1
    public static void buscaApellido(){
        System.out.println("Introduce el apellido del usuario: ");
        User[] usuarios = gestor.searchbyApellido(sc.nextLine());
        if(usuarios != null && usuarios.length > 0){ //Comprobación extra: el array no es nulo y tiene al menos un elemento.
            System.out.println("Usuarios encontrados: \n" + GestorUsers.toString(usuarios));
        }else{
            System.out.println("No hay coincidencias para esta búsqueda.");
        }
    }
//CASE 2 --> Lo hacemos boolean para poder manipular el éxito o no de la operación en la función actualizaUsuario.
    public static Boolean buscaAlias(){
        System.out.println("Introduce el nombre de usuario del afiliado: ");
        User encontrado = gestor.searchbyAlias(sc.nextLine());
        if(encontrado != null){ 
            System.out.println("Usuario encontrado: \n" + encontrado.toString());
            return true;
        }else{
            System.out.println("No hay coincidencias para esta búsqueda.");
            return false;
        }
    }
//CASE 3
    public static void buscaMail(){
        System.out.println("Introduce la dirección email del usuario: ");
        User coincide = gestor.searchbyEmail(sc.nextLine());
        if(coincide != null){ 
            System.out.println("Usuario encontrado: \n" + coincide.toString());
        }else{
            System.out.println("No hay coincidencias para esta búsqueda.");
        }
    }
//CASE 4
    public static void buscaTipo(){
        System.out.println("Introduce 'admin' para listar a los administradores, 'no admin' para listar el resto de usuarios:");
        User [] arraytype;
        String entrada = sc.nextLine();
        while (entrada != "admin" && entrada != "no admin"){
            System.out.println("Input no válido. Escribe 'admin' o 'no admin' (sin comillas):");
            entrada=sc.nextLine();
        }
        if(entrada == "admin"){
            arraytype = gestor.searchbyAdminNoAdmin(true);
            System.out.println("Listado de administradores: \n" + GestorUsers.toString(arraytype));
        }else{
            arraytype = gestor.searchbyAdminNoAdmin(false);
            System.out.println("Listado de usuarios no administradores: \n" + GestorUsers.toString(arraytype));
        } 
    }
//CASE 5 
    public static void actualizaUsuario(){
        User actualizado = new User();
        if(buscaAlias()){
            System.out.println("Ahora introduce los datos actualizados del usuario:");
            //En cada setter hacemos un bucle de validación para asegurar que el método retorna true.
            System.out.println("Nombre: "); 
            String nombre = sc.nextLine();
            while(actualizado.setNombre(nombre)== false){
                System.out.println("El nombre ha de comenzar por al menos tres letras. Introdúcelo de nuevo: ");
                nombre=sc.nextLine();
            }
            System.out.println("Apellido: ");
            String apellido = sc.nextLine();
            while(actualizado.setApellido(apellido)== false){
                System.out.println("El apellido ha de comenzar por al menos tres letras. Introdúcelo de nuevo: ");
                apellido=sc.nextLine();
            } 
            System.out.println("Nombre de Usuario: ");
            String alias = sc.nextLine();
            while(actualizado.setAlias(alias)== false){
                System.out.println("El alias sólo puede contener caracteres alfanuméricos en minúscula y sin espacios. Introdúcelo de nuevo: ");
                alias=sc.nextLine();
            }
            System.out.println("Contraseña: ");
            String password = sc.nextLine();
            while(actualizado.setPassword(password)== false){
                System.out.println("La contraseña ha de contener entre 6 y 8 caracteres alfa-numéricos, sin espacios ni acentos.\n Acepta punto, guion y guion bajo. Inténtalo de nuevo: ");
                password=sc.nextLine();
            }
            System.out.println("¿Es administrador?: y/n ");
            String administra = sc.nextLine();
            while(!administra.equals("y") && !administra.equals("n")){
                System.out.println("Pulsa 'y' para sí o 'n' para no.");
                administra=sc.nextLine();
            }
            if(administra.equals("y")){
                actualizado.setEsAdmin(true);
            }else{
                actualizado.setEsAdmin(false);
            }
            System.out.println("Año de alta: ");
            int anioAlta = Integer.parseInt(sc.nextLine());
            while(actualizado.setAnioAlta(anioAlta)==false){
                System.out.println("El año se expresa en formato YYYY, a partir del 1900. Introdúcelo de nuevo: ");
                anioAlta=Integer.parseInt(sc.nextLine());
            }
            System.out.println("Email: ");
            String email = sc.nextLine();
            while(actualizado.setEmail(email)==false){
                System.out.println("El mail ha de tener un formato correcto. Introdúcelo de nuevo: ");
                email=sc.nextLine(); 
            }
        }
        //Verificados todos los input, llamamos al método updateUser.
        if(gestor.updateUser(actualizado) == false){
            System.out.println("No se pudo actualizar el usuario.");
        }else{
            System.out.println("Usuario actualizado correctamente.");
        }
    }

//CASE 6
    public static void borraUsuario(){
        System.out.println("Introduce el nombre de usuario del usuario que deseas eliminar:");
        String aliasinput = sc.nextLine();
        if (gestor.deleteUser(aliasinput)){
            System.out.println("El usuario ha sido eliminado con éxito.");
        }else{
            System.out.println("Usuario no encontrado. No se ha podido realizar el borrado.");
        }
    }

//AÑADIR USUARIO ADDUSER (ADMINISTRADORES)
    public static void agregaUsuario(){
        System.out.println("Ingresa los datos del nuevo usuario:");
        User nuevo = new User();
    
            //En cada setter hacemos un bucle de validación para asegurar que el método retorna true.
            System.out.println("Nombre: "); 
            String nombre = sc.nextLine();
            while(nuevo.setNombre(nombre)== false){
                System.out.println("El nombre ha de comenzar por al menos tres letras. Introdúcelo de nuevo: ");
                nombre=sc.nextLine();
            }
            System.out.println("Apellido: ");
            String apellido = sc.nextLine();
            while(nuevo.setApellido(apellido)== false){
                System.out.println("El apellido ha de comenzar por al menos tres letras. Introdúcelo de nuevo: ");
                apellido=sc.nextLine();
            } 
            System.out.println("Nombre de Usuario: ");
            String alias = sc.nextLine();
            while(nuevo.setAlias(alias)== false){
                System.out.println("El alias sólo puede contener caracteres alfanuméricos en minúscula y sin espacios. Introdúcelo de nuevo: ");
                alias=sc.nextLine();
            }
            System.out.println("Contraseña: ");
            String password = sc.nextLine();
            while(nuevo.setPassword(password)== false){
                System.out.println("La contraseña ha de contener entre 6 y 8 caracteres alfa-numéricos, sin espacios ni acentos.\n Acepta punto, guion y guion bajo. Inténtalo de nuevo: ");
                password=sc.nextLine();
            }
            System.out.println("¿Es administrador?: y/n ");
            String administra = sc.nextLine();
            while(!administra.equals("y") && !administra.equals("n")){
                System.out.println("Pulsa 'y' para sí o 'n' para no.");
                administra=sc.nextLine();
            }
            if(administra.equals("y")){
                nuevo.setEsAdmin(true);
            }else{
                nuevo.setEsAdmin(false);
            }
            System.out.println("Año de alta: ");
            int anioAlta = Integer.parseInt(sc.nextLine());
            while(nuevo.setAnioAlta(anioAlta)==false){
                System.out.println("El año se expresa en formato YYYY, a partir del 1900. Introdúcelo de nuevo: ");
                anioAlta=Integer.parseInt(sc.nextLine());
            }
            System.out.println("Email: ");
            String email = sc.nextLine();
            while(nuevo.setEmail(email)==false){
                System.out.println("El mail ha de tener un formato correcto. Introdúcelo de nuevo: ");
                email=sc.nextLine(); 
            }
            //Validados todos los input, implementamos el método addUser.
            gestor.addUser(nuevo);
            System.out.println("Usuario registrado.");
    }
//Mostrar préstamos activos (ADMIN)
    public static void muestraPrestamosAct(){
        Libro [] prestadoAct = gestorL.getLibrosPrestados();
        if (prestadoAct.length == 0) {
            System.out.println("No hay préstamos activos.");
        } else {
            System.out.println("Libros prestados actualmente: \n" + prestadoAct.toString());
        }
    }
//Mostrar préstamos totales (ADMIN)
    public static void muestraPrestamosTot(){
        int total = gestorL.getTotalPrestamos();
        System.out.println("El número total de préstamos es " + total);
    }
//Solicitar préstamo de libro (TODOS)
    public static void gestionaPrestamo() {
    
        System.out.println("Introduce el título del libro cuyo préstamo solicitas:");
        String titulo = sc.nextLine();
        Libro libro = gestorL.buscarLibro(titulo);
        if (libro == null || !libro.getisdisponible()) {
            System.out.println("El libro no está disponible para préstamo.");
        }
    
        System.out.println("Verifica la petición introduciendo tu alias:");
        String alias = sc.nextLine();
        User usuario = gestor.searchbyAlias(alias);
        if (usuario == null) {
            System.out.println("Usuario no encontrado.");
        }
    
        libro.setdisponible(false);
        libro.setVecesPrestado(libro.getVecesPrestado() + 1);
        usuario.setPrestamosActivos(usuario.getPrestamosActivos() + 1);
    
        System.out.println("Préstamo realizado con éxito. Libro: " + libro.gettitulo());
    }


//Solicitar devolución de libro (TODOS)
    public static void devuelveLibro() {

        System.out.println("Introduce el título del libro que deseas devolver:");
        String titulo = sc.nextLine();
        Libro libro = gestorL.buscarLibro(titulo);
        if (libro == null || libro.getisdisponible()) {
            System.out.println("El libro no está registrado como prestado.");
        }

        System.out.println("Verifica la devolución introduciendo tu alias:");
        String alias = sc.nextLine();
        User usuario = gestor.searchbyAlias(alias);
        if (usuario == null || usuario.getPrestamosActivos() <= 0) {
            System.out.println("Usuario no encontrado o sin préstamos activos.");
        }

        libro.setdisponible(true);
        libro.setVecesPrestado(libro.getVecesPrestado());
        usuario.setPrestamosActivos(usuario.getPrestamosActivos() - 1);

    System.out.println("Devolución realizada con éxito. Libro: " + libro.gettitulo());
    }

    
    

    //Usuario con más préstamos (ADMIN)
    public static void UserMaxPrestamos(){
        User maxUser = gestor.usuarioConMasPrestamos();
        System.out.println("El usuario con más préstamos activos es:\n " + maxUser.toString());
    }

    }
    

    
    

    


    



