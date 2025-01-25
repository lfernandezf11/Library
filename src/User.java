/**
 * @author: Lucía Fernández Florencio
 */

/** En lugar de importar java.util.Date, utilizamos la API java.time, que maneja mejor y de forma más intuitiva datos de hora y fecha.
 * Sus clases son inmutables, se establecen con la creación del objeto y no cambian.
 * .LocalDate -> Fecha.
 * .LocalTime -> Hora.
 * .LocalDateTime -> Fecha y Hora.
 * */
 import java.time.LocalDate; 

/**
 * Atributos de usuario:
 * @param userID    identificador numérico único, Primary Key.
 * @param nombre    nombre de pila
 * @param apellido  primer apellido
 * @param alias     nombre de usuario. Como norma, se genera con la primera sílaba del nombre, la primera del apellido y el ID.
 * @param password  contraseña
 * @param esAdmin   indica si el usuario es administrador o no
 * @param fechaAlta fecha de inscripción en el sistema
 * @param email     email de contacto
 * */
public class User {
    private int userID;
    private String nombre;
    private String apellido;
    private String alias; 
    private String password;
    private Boolean esAdmin;
    private LocalDate fechaAlta;
    private String email;


    /**
     * Constructor por defecto del objeto Usuario. Necesario para crear un objeto "vacío" Usuario que sobreescribir con la info de un
     * objeto único resultado de una búsqueda.
     * Ej.: para usar el método searchbyAlias de la clase GestorUsers.
     */
    /*public User() {
        this.userID=0;
        this.nombre="Usuario";
        this.apellido="No registrado";
        this.alias="usno00";
        this.password="Usuario.00";
        this.esAdmin=false;
        this.fechaAlta=LocalDate.now();
        this.email="bibliotecaLock_Stock@gmail.com";
     }
    /**
     * Constructor para generar un objeto Usuario parametrizado, los valores los ingresa el user Admin, excepto la fecha, que se asigna con la
     * clase LocalDate.
     */

    //IMPLEMENTAR UN ID AUTOINCREMENTAL QUE NO REPITA VALORES!!!
    public User(int userID, String nombre, String apellido, String alias, String password, Boolean esAdmin, String email) {
       this.userID=userID;
       this.nombre=nombre;
       this.apellido=apellido;
       this.alias=alias;
       this.password=password;
       this.esAdmin=esAdmin;
       this.fechaAlta=LocalDate.now();
       this.email=email;
    }

    /**
     * Getters para cada atributo. 
     * @return el valor del atributo al que se refiere. 
     */
    public int getUserID() {
        return this.userID;
    }
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
    public LocalDate getFechaAlta(){
        return this.fechaAlta;
    }
    public String getEmail(){
        return this.email;
    }

    /*ESTABLECER AQUÍ VALIDADORES DE ENTRADA DE DATOS!!!*/
    
    /**
     * Setters para cada atributo, excepto para UserID y fechaAlta, que se mantienen desde la creación.
     * Establece el valor para cada atributo del objeto recibido por parámetro.
     */
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setAlias(String alias){
        this.alias=alias;
    }
    public void setPassword(String password){
        this.password=password;
    }
    public void setEsAdmin(Boolean esAdmin){
        this.esAdmin=esAdmin;
    }
    public void setEmail(String email){
        this.email=email;
    }

    /**
     * Método de salida de información para cada objeto.
     * @override sobreescribe el método toString() preestablecido para Java.
     */
    @Override
    public String toString(){
        return "[Usuario " + getUserID() + ": " +
                getNombre() + " " + getApellido() + 
                ". Nombre de usuario: " + getAlias() +
                "; contraseña: " + getPassword() +
                "; fecha de alta en el sistema: " + getFechaAlta().toString() +
                "; email de contacto: " + getEmail() +
                ". ¿Es administrador? " + getEsAdmin() + "]";
    }
}

