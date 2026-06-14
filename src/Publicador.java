/** Define el contrato para un comentarista de noticias
 * Un comentarista es responsable de realizar comentarios sobre una noticia
 * Este contrato establece el método que debe implementarse para publicar una noticia.
 * @author Moyano Bustos, Darrul, Moncada, Zalazar
 * @version 1.1
**/
public interface Publicador {

    /**
     * Realiza las acciones necesarias para publicar una noticia.
     * Las clases que implementen esta interfaz definirán el destino 
     * o medio de la publicación de una noticia
     */
    void publicarNoticia(); 
    
}
