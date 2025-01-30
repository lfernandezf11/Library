/**
 * @author: Lucía Fernández Florencio
 * @author: María Teresa Calvo Peña
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
        int tipoFilled = 0;
        for(int i=0; i<tipoFilled; i++){
            if(usuarios[i].getEsAdmin().equals(esAdmin)){
                resultado[tipoFilled]=usuarios[i];
                tipoFilled++;
            }
        }return Arrays.copyOf(resultado, filled);
    }

    /** updateUser actualiza la información de un Usuario, excepto userID y fechaAlta, que se establecen en el momento de creación.
     * Para asegurar que se conservan estos dos campos, asignamos al objeto ya creado los parámetros del objeto actualizado mediante Setters,
     * y excluimos ID y fecha.
     * @param actualizado objeto con info actualizada.
     * @return estado de la actualización. False si no se encuentra el alias coincidente.
    */
    public Boolean updateUser(User actualizado){
        for(int i=0; i<filled; i++){
            if(usuarios[i].getAlias().equals(actualizado.getAlias())){}
                usuarios[i].setNombre(actualizado.getNombre());
                usuarios[i].setApellido(actualizado.getApellido());
                usuarios[i].setPassword(actualizado.getPassword());
                usuarios[i].setEsAdmin(actualizado.getEsAdmin());
                usuarios[i].setEmail(actualizado.getEmail());
                return true;
        }
        return false;
    }

    /** deleteUser elimina un objeto del array usuarios introduciendo su alias.
     * @param alias alias del usuario.
     * @return booleano true/false que controla que la operación se ha realizado con éxito.
    */
    public Boolean deleteUser(String alias) {
        for(int i=0; i<filled; i++){
            if(usuarios[i].getAlias().equals(alias)){ 
            /*Encontrado el alias coincidente, iniciamos bucle para desplazar a la posición anterior los objetos que le suceden, 
            accediendo como última posición válida a filled-1 (puesto que la posición filled quedará vacía).*/
                for (int j=i; j<filled-1; j++){
                    usuarios[j]=usuarios[j+1];
                }
                usuarios[--filled] = null; //Vaciamos la posición final, marcándola nula.
                return true;
            }
        }
        return false;
    }

    /** usuarioConMasPrestamos recorre el array usuario y guarda la info del usuario con más préstamos comparando con el objeto anterior. */
    public User usuarioConMasPrestamos() {
        User usuarioMaxPrestamos = null;
        int maxPrestamos = -1;

        for (int i = 0; i < filled; i++) {
            User actual = usuarios[i];
            if (actual != null && actual.getPrestamosActivos() > maxPrestamos) {
                maxPrestamos = actual.getPrestamosActivos();
                usuarioMaxPrestamos = actual;
            }
        }
        return usuarioMaxPrestamos;
    }
       /** String toString devuelve un array de usuarios en una cadena.
     * Apreciaciones: 
     * - Cuando un método es estático (vs. de instancia) puede manejar arrays externos a la clase sin necesidad de crear una instancia GestorUsers.
     * - En el bucle que recorre el array, no podemos utilizar como condición de salida i < filled, porque filled es un campo no estático.
     *   Lo sustituimos por la longitud del array, asegurando que no se imprimen los objetos nulos.  
     * - Utilizamos el método toString ya establecido en la clase User para cada objeto del array. 
     *   Como este método ya está sobreescrito, no hace falta hacer aquí un @Override.
     * @param arrayUsuarios array de Usuarios para convertir a String.
     * @return Una cadena con la información de cada objeto String, separados por un salto de línea.
     * */
    public static String toString(User [] arrayUsuarios) {
    String stringUsuarios = "";
    for (int i = 0; i < arrayUsuarios.length; i++) {
        if(arrayUsuarios[i] != null){
            stringUsuarios += arrayUsuarios[i].toString() + "\n";
        } 
    }
    return stringUsuarios;
}
}
    

