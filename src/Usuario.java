public abstract class Usuario {
    protected String nombre;
    protected String dni;

    public Usuario(String nombre, String dni)
    {
        this.nombre = nombre;
        this.dni = dni;
    }
    //Getters
    public String getNombre() {return nombre;}
    public String getDni() {return dni;}
    //Setters

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDni(String dni) {this.dni = dni;}
}
