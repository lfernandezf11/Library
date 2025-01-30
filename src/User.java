/**
 * @author: Lucía Fernández Florencio
 * @author: María Teresa Calvo Peña
 */

/** VER IMPLEMENTACIÓN FUTURA. 
 * En lugar de importar java.util.Date, utilizamos la API java.time, que maneja mejor y de forma más intuitiva datos de hora y fecha.
 * Sus clases son inmutables, se establecen con la creación del objeto y no cambian.
 * .LocalDate -> Fecha.
 * .LocalTime -> Hora.
 * .LocalDateTime -> Fecha y Hora.
 * */
 

/**
 * Atributos de usuario:
 * @param nombre    nombre de pila
 * @param apellido  primer apellido
 * @param alias     nombre de usuario. Como norma, se genera con la primera sílaba del nombre, la primera del apellido y el ID.
 * @param password  contraseña
 * @param esAdmin   indica si el usuario es administrador o no
 * @param anioAlta  año de inscripción en el sistema
 * @param email     email de contacto
 * @param prestamosactivos  préstamos en activo del usuario
 * */
public class User {
    private String nombre;
    private String apellido;
    private String alias; 
    private String password;
    private Boolean esAdmin;
    private int anioAlta;
    private String email;
    private int prestamosactivos;
    
    /**
     * Constructor por defecto para llamarlo sin declarar parámetros en el main, para el método addUser (GestorUsers class)
     * y la función actualizaUsuario (Ejecutable Main) que llama al método mencionado.
     */
    public User() {
        this.nombre="";
        this.apellido="";
        this.alias="";
        this.password="";
        this.esAdmin=false;
        this.anioAlta=2000;
        this.email="";
        this.prestamosactivos=0;
    }
    /**
     * Constructor para generar un objeto Usuario parametrizado. Lo utilizaremos para crear el repositorio inicial de forma más rápida.
     * En el main, no obstante, construiremos objetos mediante SETTERS, a través de los cuales se validan los inputs (podría hacerse aquí tb). 
     */

    public User(String nombre, String apellido, String alias, String password, Boolean esAdmin, int anioAlta, String email, int prestamosactivos) {
       this.nombre=nombre;
       this.apellido=apellido;
       this.alias=alias;
       this.password=password;
       this.esAdmin=esAdmin;
       this.anioAlta=anioAlta;
       this.email=email;
       this.prestamosactivos=prestamosactivos;
    }

    /**
     * Getters para cada atributo. 
     * @return el valor del atributo al que se refiere. 
     */
    
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getAlias(){
        return this.alias;
    }
    public String getPassword(){
        return this.password;
    }
    public Boolean getEsAdmin(){
        return this.esAdmin;
    }
    public int getAnioAlta(){
        return this.anioAlta;
    }
    public String getEmail(){
        return this.email;
    }
    public int getPrestamosActivos(){
        return this.prestamosactivos;
    }
    
    /**
     * Setters para cada atributo, excepto para anioAlta, que se mantiene desde la creación.
     * Establece el valor para cada atributo del objeto recibido por parámetro. Validamos la entrada de datos y devolvemos un boolean
     * para saber si la operación ha tenido éxito. En caso contrario, podremos establecer un bucle que pida el valor de nuevo.
     */
    /* Para setNombre y setApellido aplicamos una REGEX que coteje que el valor introducido comienza por al menos tres letras,
     * tras lo cual puede seguirse de cero o más ocurrencias de una segunda cadena de letras, incluyendo espacios.
     */
     public Boolean setNombre(String nombre){
        if (nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]{3}[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s-]*$")) {
            this.nombre = nombre;
            return true;
        }else{
            return false;
        }
    }
    public Boolean setApellido(String apellido){
        if (apellido.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ]{3}[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s-]*$")) {
            this.apellido = apellido;
            return true;
        }else{
            return false;
        }
    }
    /* Para setAlias sólo admitiremos inputs alfanuméricos en minúscula, excluyendo acentos, espacios o símbolos especiales, con una longitud
     * mínima de 6 caracteres (que es lo que presuponemos que ocupan dos sílabas y dos números) y máximo 12.
     */
    public Boolean setAlias(String alias){
        if (alias.matches("^(?=.{6,12})[a-z0-9]*$")) {
            this.alias = alias;
            return true;
        }else{
            return false;
        }
    }
    /* setPassword acepta inputs alfanuméricos, tanto mayúscula como minúscula, y algunos símbolos especiales - _ . excluyendo espacios y acentos.
     * Longitud mínima de 6 caracteres y máxima de 8. 
     */
    public Boolean setPassword(String password){
        if (password.matches("^(?=.{6,8})[a-z0-9_.-]*$")) {
            this.password = password;
            return true;
        }else{
            return false;
        }
    }
    /* setAnioAlta acepta valores de año limitados, con 4 dígitos.*/
    public Boolean setAnioAlta(int anioAlta){
        if(anioAlta >= 1900 && anioAlta <2026){
            this.anioAlta=anioAlta;
            return true;
        }else{
            return false;
        }

    }
    
    public void setEsAdmin(Boolean esAdmin){ //No necesita retorno, por defecto el valor es true.
        this.esAdmin=esAdmin;
    }
    /* setMail establece como formato de input, siempre en minúscula:
     * - Dominio local: alfanuméricos y caracteres -_+&*. 
     * - Arroba.
     * - Dominio: alfanuméricos y guion
     * - Extensión de dominio: inicio en punto, al menos 2 letras, máximo 6.
     */
    public Boolean setEmail(String email){
        if (email.matches("^[a-z0-9_+&*-.]+@[a-z0-9-]+\\.[a-z]{2,6}$")) {
            this.email = email;
            return true;
        }else{
            return false;
        }
    }
    public Boolean setPrestamosActivos(int prestamosactivos){
        if(prestamosactivos>=0){
            return true;
        }else{
            return false;
        }
    }
    /**
     * Método de salida de información para cada objeto.
     * @override sobreescribe el método toString() preestablecido para Java.
     */
    @Override
    public String toString(){
        return "[Usuario " +
                getNombre() + " " + getApellido() + 
                ". Nombre de usuario: " + getAlias() +
                "; contraseña: " + getPassword() +
                "; año de alta en el sistema: " + getAnioAlta() +
                "; email de contacto: " + getEmail() +
                ". ¿Es administrador? " + getEsAdmin() +
                ". Préstamos activos:" + getPrestamosActivos() + "]";
    }
}




