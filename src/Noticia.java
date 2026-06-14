import java.time.LocalDateTime;

/**
 * Clase que representa una noticia con su título, detalle, fecha y autor
 * @author Moyano Bustos, Darrull, Moncada, Zalazar
 * @version 1.1
 */
public class Noticia {
    
    private String titulo;
    private String detalle;
    private LocalDateTime fecha;
    private Autor autor;

    /**
     * Constructor completo para crear una instancia de Noticia.
     * *@param titulo  El título que tendrá la noticia.
     * @param detalle El contenido o cuerpo de la noticia.
     * @param fecha   La fecha y hora de creación/publicación.
     * @param autor   El objeto Autor asociado a la noticia.
     */
    public Noticia(String titulo, String detalle, LocalDateTime fecha, Autor autor) {
        this.titulo = titulo;
        this.detalle = detalle;
        this.fecha = fecha;
        this.autor = autor;
    }
    
    /**
     * Obtiene el título de la noticia.
     * @return El título de la noticia.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Obtiene el detalle o cuerpo de la noticia.
     * @return El detalle de la noticia.
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * Obtiene la fecha y hora de la noticia.
     * @return Un objeto con la fecha de la noticia.
     */
    public LocalDateTime getFecha() {
        return fecha;
    }

    /**
     * Obtiene el autor de la noticia.
     * @return El autor de la noticia.
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * Modifica el título de la noticia.
     * @param titulo El nuevo título para la noticia.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Modifica el detalle o cuerpo de la noticia.
     * @param detalle El nuevo detalle para la noticia.
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /**
     * Modifica la fecha y hora de la noticia.
     * @param fecha fecha y hora de noticia.
     */
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

   /**
     * Modifica el autor de la noticia.
     * @param autor El autor de la noticia.
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
