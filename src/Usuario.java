/**
 * Clase abstracta que representa un usuario del sistema.
 * Contiene los datos básicos de un usuario como nombre y DNI.
 *
 * @author Moyano Bustos, Darrull, Moncada, Zalazar
 * @version 1.0
 */
public abstract class Usuario {
    protected String nombre;
    protected String dni;

    /**
     * Constructor de Usuario
     * @param nombre nombre del usuario
     * @param dni DNI del usuario
    */
    public Usuario(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
     /**
      * Obtiene el nombre del usuario.
      * @return nombre del usuario
     */
    public String getNombre() {return nombre;}

    /**
     * Obtiene el DNI del usuario.
     *
     * @return DNI del usuario
    */
    public String getDni() {return dni;}
    
    /**
     * Modifica el nombre del usuario.
     * @param nombre nuevo nombre del usuario
    */
    public void setNombre(String nombre) {this.nombre = nombre;}

    /**
     * Modifica el DNI del usuario.
     * @param dni nuevo DNI del usuario
     */
    public void setDni(String dni) {this.dni = dni;}
}
