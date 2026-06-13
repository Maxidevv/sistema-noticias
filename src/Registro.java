import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Clase Registro para guardar noticias en archivo de texto
 * @author Moyano Bustos, Darrull, Zalazar, Moncada
 * @version 3.0
 */
public class Registro {
    private static final String ARCHIVO_DEFECTO = "datos.txt";

    /**
     * Metodo privado para guardar en archivo de texto
     * @param nombreArchivo nombre del archivo a guardar
     * @param nombre nombre del autor
     * @param medio medio de publicación
     * @param titulo titulo de la noticia
     * @param detalle detalle de la noticia
     * @param fecha fecha de la noticia
     */
    private void guardarTxT(String nombreArchivo, String nombre, String medio, String titulo, String detalle, LocalDateTime fecha){
        boolean archivo = new File(nombreArchivo).exists();
        try {
            FileWriter writer = new FileWriter(nombreArchivo, true);
            if (!archivo) {
                writer.write("====================\n\n");
                writer.write("REGISTRO DE NOTICIAS\n");
                writer.write("====================\n\n");
            }
            writer.write("Autor: " + nombre + "\n");
            writer.write("Medio: " + medio + "\n");
            writer.write("Titulo: " + titulo + "\n");
            writer.write("Detalle: " + detalle + "\n");
            writer.write("Fecha: " + fecha + "\n");
            writer.write("--------------------\n\n");
            writer.close();
            System.out.println("Noticia registrada exitosamente en " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }

    /**
     * Metodo publico para guardar noticia en datos.txt
     * @param nombre nombre del autor
     * @param medio medio de publicación
     * @param titulo titulo de la noticia
     * @param detalle detalle de la noticia
     * @param fecha fecha de la noticia
     */
    public void registrarNoticia(String nombre, String medio, String titulo, String detalle, LocalDateTime fecha) {
        guardarTxT(ARCHIVO_DEFECTO, nombre, medio, titulo, detalle, fecha);
    }
}