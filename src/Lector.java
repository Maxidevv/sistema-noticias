/**
 * Clase Lector que representa a un lector de noticias. Esta clase hereda de Usuario e implementa la interfaz Comentarista.
 * @author Moyano Bustos, Darrull, Zalazar, Moncada
 * @version 1.1
 */
public class Lector extends Usuario implements Comentarista {
    private int edad;
 
    /**
     * Constructor de la clase Lector
      * @param edad La edad del lector
      * @param dni El DNI del lector
      * @param nombre El nombre del lector
     */
    public Lector(int edad, String dni, String nombre) {
        super(dni, nombre);
        this.edad = edad;
    }

    /**
     * Obtiene la edad del lector
      * @return edad del lector
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Metodo para settear la edad del lector
      * @param edad La edad del lector
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    /** 
     * Metodo para comentar una noticia que implementa la interfaz Comentarista
    */
    public void comentarNoticia() 
    {
        System.out.println(" El lector " + getNombre() + " comento la noticia");

    }
}
