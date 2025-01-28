import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in); /*ESTABLECER PARA TODO EL MAIN!!!!!*/
    

/*Menú para usuarios Administradores */  
    public void menuAdmin(){
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
            System.out.println("|                                                    |");
            System.out.println("| __USUARIOS:                                        |");
            System.out.println("|      4) Dar de alta un nuevo usuario.              |");
            System.out.println("|      5) Consultar datos de usuario existente.      |");
            System.out.println("|                                                    |");
            System.out.println("| __PRÉSTAMOS:                                       |");
            System.out.println("|      6) Solicitar un préstamo.                     |");
            System.out.println("|      7) Devolver un libro prestado.                |");
            System.out.println("|                                                    |");
            System.out.println("| __ESTADÍSTICAS E INFORMES:                         |");   
            System.out.println("|      8) N. de préstamos totales.                   |");     
            System.out.println("|      9) N. de préstamos activos.                   |");  
            System.out.println("|     10) Libros más populares.                      |");   
            System.out.println("|     11) Usuario con más préstamos activos.         |"); 
            System.out.println("|                                                    |");
            System.out.println("|---------- Pulsa 0 para salir del programa ---------|");  
            System.out.println("|____________________________________________________|"); 
    
            int opcion = Integer.parseInt(sc.nextLine());
    
            //Switch para elección de opciones, usuario administrador.
                /*switch (opcion) {
                    case 1 -> función altalibro que utilice el método agregarlibro;
                    case 2 -> funcion busquedalibro que utilice despliegue un menú tipo de búsqueda y utilice los metodos buscar por titulo, autor, categoria.;
                    case 3 -> sout + metodo de busquedaporestatus + Libro[].toString;
                    case 4 -> //LUCIA. ALTA USUARIO.
                    case 5 -> //LUCÍA. BÚSQUEDA USUARIO. MENÚ TIPO BUSQUEDA.
                //PENDIENTE DE IMPLEMENTACIÓN EN CLASES
                    case 6 -> préstamo;
                    case 7 -> devolver;
                    case 8 -> préstamostotales;
                    case 9 -> préstamosactivos;
                    case 10 -> másprestados;
                    case 11 -> usuarioconmáspréstamos.
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
                              admin = false;
                    default: -> System.out.println("Valor introducido no válido. Prueba de nuevo.");
        }*/
    
        }while(noadmin);
    }

/*Menú para búsqueda de libro por filtro.*/
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
            System.out.println("|      d) Por año de publicación.                    |");
            System.out.println("|                                                    |");
            System.out.println("|---------- Pulsa 0 para salir del programa ---------|");  
            System.out.println("|------ Pulsa 1 para volver al menú principal -------|");  
            System.out.println("|____________________________________________________|"); 

            int opcion = Integer.parseInt(sc.nextLine());

            //Switch para elección de opciones, usuario no administrador.
                /*switch (opcion) {
                    case 1 -> funcion busquedalibro que utilice despliegue un menú tipo de búsqueda y utilice los metodos buscar por titulo, autor, categoria.;
                    case 2 -> sout + metodo de busquedaporestatus + Libro[].toString;*/
    }while(filtrolibro);
    }
}