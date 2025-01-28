import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    
//*Menú para usuarios Administradores */   
boolean admin = true;    

do{
    System.out.println(".____________________________________________________. ");
    System.out.println("|           BIENVENIDO A TU MENÚ PERSONAL            | "); //User.getNombre().
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
    System.out.println("|      7) Devolver un préstamo.                      |");
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
    
    //Switch con formato case: / break; para poder introducir varias líneas de código en caso de ser necesario.
    switch (opcion) {
        case :
            
            break;
    
        default:
            break;
    }
}while(admin);


}