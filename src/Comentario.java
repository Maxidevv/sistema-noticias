/**
 * Comentario es una clase que representa un comentario realizado por un lector
 * Contiene el texto del comentario, un número que podría representar la calificación o el orden del comentario, y una referencia al lector que hizo el comentario
 * @author Moyano Bustos, Darrull , Zalazar, Moncada
 * @version 1.1
 */

public class Comentario {
    private String texto;
    private Lector lector;
    
    /**
     * Constructor de la clase Comentario
     * @param texto texto del comentario
     * @param numero numero del comentario
     * @param lector lector que hizo el comentario
     */
    public Comentario(String texto, Lector lector) 
    {
        this.texto = texto;
        this.lector = lector;
    }

    /**
     * Metodo getter para obtener el texto del comentario
     * @return texto del comentario
     */
    public String getTexto() {return texto;}

    /**
     * Metodo getter para obtener el lector que hizo el comentario
     * @return lector que hizo el comentario
     */
    public Lector getLector() {return lector;}

    /**
     * Metodo para settear el texto del comentario
     * @param texto nuevo texto del comentario
     */
    public void setTexto(String texto) {this.texto = texto;}

    /**
     * Metodo para settear el texto del comentario
     * @param lector nuevo lector del comentario
     */
    public void setLector(Lector lector) {this.lector = lector;}
}
