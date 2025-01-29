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
                switch (opcion) {
                    /*  1 -> función altalibro que utilice el método agregarlibro;*/
                    case 2: menuBusquedaLibro();
                        break;
                    /*case 3 -> sout + metodo de busquedaporestatus + Libro[].toString;
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
                switch (opcion) {
                    case 1 -> menuBusquedaLibro();
                    /*case 2 -> sout + metodo de busquedaporestatus + Libro[].toString;
                //PENDIENTE DE IMPLEMENTACIÓN EN CLASES
                    case 3 -> préstamo;
                    case 4 -> devolver;
                    case 0 -> System.out.println("Saliendo del programa...");
                              noadmin = false;
                    default: -> System.out.println("Valor introducido no válido. Prueba de nuevo.");*/
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
            System.out.println("|      a) Por título.                                |");
            System.out.println("|      b) Por autor.                                 |");
            System.out.println("|      c) Por categoría.                             |");
            System.out.println("|                                                    |");
            System.out.println("|------------ Pulsa 0 para volver al menú -----------|");    
            System.out.println("|____________________________________________________|"); 

            int opcion = Integer.parseInt(sc.nextLine());

            //Switch para elección de opciones, búsqueda de libro por filtro.
                switch (opcion) {
                    case 'a' : buscarLibroporTitulo();
                    break;
                    case 'b' : buscarLibroporAutor();
                    break;
                    case 'c' : buscarLibroporCategoria();
                    break;
                    case '0' : System.out.println("Saliendo del programa...");
                                filtrolibro = false;                
        }while(filtrolibro);
    
    }
}
    public void buscarLibroporTitulo() {
        GestorLibro gestor = new GestorLibro();
        System.out.println("Introduce el título del libro a buscar:");
        Libro resultado=gestor.buscarLibro(sc.nextLine());
        if (resultado != null) {
            System.out.println("Libro encontrado:" + resultado);
        } else {
            System.out.println("No se encontró ningún libro con el título indicado");
        }
    }
    

    public void buscarLibroporAutor() {
        GestorLibro gestor = new GestorLibro();
        System.out.println("Introduce el autor del libro a buscar:");
        String autor = sc.nextLine();
        Libro[]resultado=gestor.buscarporAutor(autor);
        if (resultado.length == 0){
            System.out.println("No se encontraron libros del autor: " + autor);
        }else{
            System.out.println("Libros encontrados de " + autor + ":");
        }for(Libro libro : resultado){
            System.out.println(libro);
        }
    }
/*No se como hacerla porque la salida que espera es un enum */
    public void buscarLibroporCategoria() {
        GestorLibro gestor = new GestorLibro();
        System.out.println("Introduce la categoría del libro a buscar:");
        String categoria = sc.nextLine();
        Libro[]resultado=gestor.buscarporCategoria(categoria);
    }

    public void eliminarLibroporAutor() {
        GestorLibro gestor = new GestorLibro();
        System.out.println("Introduce el autor del libro que desea eliminar:");
        String autor = sc.nextLine();
        boolean eliminado = gestor.eliminarLibro(autor);
        
        if (eliminado) {
            System.out.println("Los libros del autor '" + autor + "' han sido eliminados.");
        } else {
            System.out.println("No se encontraron libros de ese autor.");
        }
    }
}

/*Menú para búsqueda de usuario por filtro.*/
    public static void menuBusquedaUsuario(){
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
            System.out.println("|------------ Pulsa 0 para volver al menú -----------|");  
            System.out.println("|____________________________________________________|"); 

            int opcion = Integer.parseInt(sc.nextLine());

            //Switch para elección de opciones, búsqueda de información de usuarios por filtro, para administradores.
                switch (opcion) {
                    case 'a': buscaApellido();
                        break;
                    case 'b': buscaAlias();
                        break;
                    case 'c': buscaMail();
                        break;
                    case 'd': buscaTipo();
                        break;
                    case 'e': actualizaUsuario();
                        break;
                    case 'f': borraUsuario();
                        break;
                    case '0': System.out.println("Volviendo al menú...");
                              filtroUser=false;    
                        break;
                    default: System.out.println("Valor introducido no válido. Prueba de nuevo.");
                        break;
                }
        }while(filtroUser);
    }
//CASE a
    public static void buscaApellido(){
        System.out.println("Introduce el apellido del usuario: ");
        GestorUsers apellidos = new GestorUsers();
        User[] usuarios = apellidos.searchbyApellido(sc.nextLine());
        if(usuarios != null && usuarios.length > 0){ //Comprobación extra: el array no es nulo y tiene al menos un elemento.
            System.out.println("Usuarios encontrados: \n" + GestorUsers.toString(usuarios));
        }else{
            System.out.println("No hay coincidencias para esta búsqueda.");
        }
    }
//CASE b --> Lo hacemos boolean para poder manipular el éxito o no de la operación en la función actualizaUsuario.
    public static Boolean buscaAlias(){
        System.out.println("Introduce el nombre de usuario del afiliado: ");
        GestorUsers alias = new GestorUsers();
        User encontrado = alias.searchbyAlias(sc.nextLine());
        if(encontrado != null){ 
            System.out.println("Usuario encontrado: \n" + encontrado.toString());
            return true;
        }else{
            System.out.println("No hay coincidencias para esta búsqueda.");
            return false;
        }
    }
//CASE c
    public static void buscaMail(){
        System.out.println("Introduce la dirección email del usuario: ");
        GestorUsers mail = new GestorUsers();
        User coincide = mail.searchbyEmail(sc.nextLine());
        if(coincide != null){ 
            System.out.println("Usuario encontrado: \n" + coincide.toString());
        }else{
            System.out.println("No hay coincidencias para esta búsqueda.");
        }
    }
//CASE d
    public static void buscaTipo(){
        System.out.println("Introduce 'admin' para listar a los administradores, 'no admin' para listar el resto de usuarios:");
        GestorUsers type = new GestorUsers();
        User [] arraytype;
        String entrada = sc.nextLine();
        while (entrada != "admin" && entrada != "no admin"){
            System.out.println("Input no válido. Escribe 'admin' o 'no admin' (sin comillas):");
            entrada=sc.nextLine();
        }
        if(entrada == "admin"){
            arraytype = type.searchbyAdminNoAdmin(true);
            System.out.println("Listado de administradores: \n" + GestorUsers.toString(arraytype));
        }else{
            arraytype = type.searchbyAdminNoAdmin(false);
            System.out.println("Listado de usuarios no administradores: \n" + GestorUsers.toString(arraytype));
        } 
    }
//CASE e 
    public static void actualizaUsuario(){
        GestorUsers updated = new GestorUsers();
        if(buscaAlias()){
            System.out.println("Ahora introduce los datos actualizados del usuario:");
            User actualizado = new User();
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
                System.out.println("El alias sólo puede contener caracteres alfanuméricos en minúscula y sin espacios. Introdúcelo de nuevo: ")
                alias=sc.nextLine();
            }
            System.out.println("¿Es administrador?: y/n ");
            String administra = sc.nextLine();
            while(administra != "y" && administra != "n"){
                System.out.println("Pulsa 'y' para sí o 'n' para no.");
                administra=sc.nextLine();
            }
            if(administra == "y"){
                actualizado.setEsAdmin(true);
            }else{
                actualizado.setEsAdmin(false);
            }
            System.out.println("Email: ");
            String email = sc.nextLine();
            while(actualizado.setEmail(email)==false){
                System.out.println("El mail ha de tener un formato correcto. Introdúcelo de nuevo: ");
                email=sc.nextLine();
            }
            //Validados todos los inputs, introducimos el User actualizado en updateUser.
            Boolean exito = updated.updateUser(actualizado);
            if(exito){
                System.out.println("Usuario correctamente actualizado.");
            }else{
                System.out.println("No se ha podido actualizar el usuario.");
            }
        }

    }

//CASE f
    public static void borraUsuario(){
        System.out.println("Introduce el nombre de usuario del usuario que deseas eliminar:");
        GestorUsers borrado = new GestorUsers();
        String aliasinput = sc.nextLine();
        if (borrado.deleteUser(aliasinput)){
            System.out.println("El usuario ha sido eliminado con éxito.");
        }else{
            System.out.println("Usuario no encontrado. No se ha podido realizar el borrado.");
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
    public void repositoriouser(){
    GestorUsers gestor = new GestorUsers();
    gestor.addUser(new User(1, "Carlos", "Gomez", "carlitos", "pass123", true, "carlos@gmail.com"));
    gestor.addUser(new User(numID++, "Maria", "Lopez", "mari_lo", "mypass", false, "maria@hotmail.com"));
    gestor.addUser(new User(numID++, "Juan", "Perez", "juancho", "securePass", true, "juanp@mail.com"));
    gestor.addUser(new User(numID++, "Lucia", "Fernandez", "lucy", "lucyPass", false, "luciaf@yahoo.com"));
    gestor.addUser(new User(numID++, "Miguel", "Gomez", "mike", "mikepass", false, "miguel_gomez@gmail.com"));
    gestor.addUser(new User(numID++, "Elena", "Rodriguez", "ele_rod", "elena123", true, "elena.rod@mail.com"));
    gestor.addUser(new User(numID++, "Andres", "Lopez", "andyL", "andy456", false, "andres.lopez@yahoo.com"));
    gestor.addUser(new User(numID++, "Sofia", "Martinez", "sofmart", "sofiaPass", true, "sofia.mtz@gmail.com"));
    gestor.addUser(new User(numID++, "Raul", "Fernandez", "raulito", "raulpass", false, "raul_fernandez@gmail.com"));
    gestor.addUser(new User(numID++, "Isabel", "Perez", "isaP", "isabel789", false, "isabel.perez@mail.com"));
    gestor.addUser(new User(numID++, "Pedro", "Gutierrez", "pedrito", "pedroPass", true, "pedro.gtz@gmail.com"));
    gestor.addUser(new User(numID++, "Ana", "Ramirez", "anaR", "anaPass", false, "ana.ramirez@mail.com"));
    gestor.addUser(new User(numID++, "Luis", "Torres", "luisT", "luisPass", true, "luis.torres@gmail.com"));
    gestor.addUser(new User(numID++, "Mariana", "Gomez", "marianG", "marianaPass", false, "mariana.gomez@yahoo.com"));
    gestor.addUser(new User(numID++, "Fernando", "Lopez", "ferLo", "ferPass", false, "fernando.lopez@gmail.com"));
    gestor.addUser(new User(numID++, "Patricia", "Martinez", "patM", "patricia123", true, "patricia.mtz@mail.com"));
    }
    }


    



