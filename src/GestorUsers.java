/**
 * @author: Lucía Fernández Florencio
 */
import java.util.Arrays;

public class GestorUsers {
    private User[] usuarios;
    private int filled; //Posiciones llenas
    private static final int tam = 100;

    /**
     * Constructor por defecto, para inicializar el array con el tamaño final elegido en la posición 0, y trabajar sobre él.
     */
    public GestorUsers() {
        usuarios = new User[tam];
        filled = 0;
    }

/* MÉTODOS: para el manejo encapsulado de datos, CRUD: 
 - Create: añadir, crear nuevo objeto al array. Como norma, los nombraremos add.
 - Read: buscar, extraer info de un objeto del array. Como norma: searchby.
 - Update: actualizar, modificar el estado de alguno de los objetos del array. Como norma: update.
 - Delete: borrar, eliminar un objeto del array. Como norma: delete. */

    /** addUser añade un nuevo objeto User al Array gestor usuarios[].
     * Cada vez que entra un User, se actualiza la última posición llena (filled).
     * No necesita return, no estamos extrayendo info para mostrarla.     
     * @param u el usuario nuevo. 
     */
    public void addUser(User u) {
        if (filled<tam){
            usuarios[filled] = u;
            filled++;
        }
    }

    /** searchbyApellido busca un usuario por su apellido.
     * @param apellido el apellido del usuario. 
     * @return un array User[], ya que varios usuarios pueden tener el mismo apellido.
     */
     public User[] searchbyApellido(String apellido) {
        User[] apellidos = new User[tam]; //Inicializamos un nuevo array User para guardar los objetos coincidentes con la búsqueda.
        int apFilled = 0;                 //apFilled es el contador para el array return, i es el contador para el array de usuarios.
        for (int i = 0; i < filled; i++) {
            if (usuarios[i].getApellido().equals(apellido)) {
                apellidos[apFilled]=usuarios[i];
                apFilled++;
            }
        }
        return Arrays.copyOf(apellidos, apFilled);
    }
    /** searchbyAlias busca un usuario por su alias/nombre de usuario.
     * @param alias el nombre de usuario.
     * @return un objeto User, ya que cada alias es único. Requiere retorno null si no encuentra objeto coincidente.
     */
    public User searchbyAlias(String alias) {                 
        for (int i = 0; i < filled; i++) {
            if (usuarios[i].getAlias().equals(alias)) {
                return usuarios[i];
            } 
        }return null; 
    }
    /** searchbyEmail busca un usuario por email.
     * @param email el nombre de usuario.
     * @return un objeto User, ya que cada email es único. Igualmente requiere retorno null.
     */
    public User searchbyEmail(String email) {                 
        for (int i = 0; i < filled; i++) {
            if (usuarios[i].getEmail().equals(email)) {
                return usuarios[i];
            }
        }return null; 
    }
    /** searchbyType (usuarios, admins) busca por tipo de usario.
     * @param esAdmin el estado del boolean (admin, no admin);
     * @return un array User con los objetos que coinciden con el criterio de búsqueda.
    */
    public User[] searchbyAdminNoAdmin(Boolean esAdmin){
        User[] resultado = new User[tam];
        int filled = 0;
        for(int i=0; i<filled; i++){
            if(usuarios[i].getEsAdmin().equals(esAdmin)){
                resultado[filled]=usuarios[i];
                filled++;
            }
        }return Arrays.copyOf(resultado, filled);
    }
    
    /** updateUser actualiza la información de un Usuario, excepto userID y fechaAlta, que se establecen en el momento de creación.*/
    public Boolean UserActualizado()

    }
    

