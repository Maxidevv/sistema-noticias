import java.time.LocalDateTime;

public class Noticia {
    
    private String titulo;
    private String detalle;
    private LocalDateTime fecha;
    private Autor autor;

    public Noticia(String titulo, String detalle, LocalDateTime fecha, Autor autor) {
        this.titulo = titulo;
        this.detalle = detalle;
        this.fecha = fecha;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDetalle() {
        return detalle;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
