/**
 * @author: Lucía Fernández Florencio
 */

import java.util.Date;

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
    private Date fechaAlta;
    private String email;


    /**
     * Constructor para generar un objeto Usuario. Únicamente parametrizado, los valores los ingresa el user Admin.
     */
    public User(int userID, String nombre, String apellido, String alias, String password, Boolean esAdmin, Date fechaAlta, String email) {
       this.userID=userID;
       this.nombre=nombre;
       this.apellido=apellido;
       this.alias=alias;
       this.password=password;
       this.esAdmin=esAdmin;
       this.fechaAlta=fechaAlta;
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
    public Date getFechaAlta(){
        return this.fechaAlta;
    }
    public String getEmail(){
        return this.email;
    }

    /*ESTABLECER AQUÍ VALIDADORES DE ENTRADA DE DATOS!!!*/
    
    /**
     * Setters para cada atributo.
     * Establece el valor para cada atributo del objeto recibido por parámetro.
     */
    public void setUserID(int userID){
        this.userID=userID;
    }
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
    public void setFechaAlta(Date fechaAlta){
        this.fechaAlta=fechaAlta;
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

