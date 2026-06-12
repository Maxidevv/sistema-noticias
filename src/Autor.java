/**
    Clase autor que hereda de usuario y implemente interfaz Publicador
    Clase autor tiene el atributo medio y hereda de usuario
    * @author Moyano Bustos, Darrull , Zalazar, Moncada
    * @version 1.2
    * @see Usuario
    * @see Lector
*/

public class Autor extends Usuario implements Publicador {
    private String medio;
    
    /**
     * Constructor de la clase Autor
     * @param nombre el nombre del autor
     * @param dni el dni del autor
     * @param medio el medio en el que publica el autor
     */
    public Autor(String nombre, String dni, String medio) {
        super(nombre, dni);
        this.medio = medio;
    }

    /**
     * Metodo getter para obtener el medio en el que publica el autor
     * @return el medio en el que publica el autor
     */
    public String getMedio() {return medio;}

    /**
     * Metodo setter para settear el medio en el que publica el autor
     * @param medio el medio en el que publica el autor
     */
    public void setMedio(String medio){this.medio = medio;}

    /**
     * Metodo para publicar una noticia, imprime un mensaje indicando que el autor publico una noticia en el medio correspondiente
     */
    public void publicarNoticia() 
    {
        System.out.println("El autor " + getNombre() + "publico una noticia en " + medio);
    }
}
