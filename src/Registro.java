import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Registro {

    private void guardarTxT(String nombre,String medio,String titulo,String detalle, LocalDateTime fecha){
        boolean archivo = new File(nombre).exists();
    }
}