/**
 * Define el contrato para un comentarista de noticias.
 * Un comentarista es responsable de realizar comentarios sobre una noticia.
 * @author Moyano Bustos, Darrull , Zalazar, Moncada
 * @version 1.0
 */
public interface Comentarista {

    /**
     * Realiza las acciones necesarias para agregar un comentario a una noticia.
     * Las clases que implementen esta interfaz definirán la lógica específica
     * de cómo y dónde se registra dicho comentario.
     */
    void comentarNoticia();    
}
