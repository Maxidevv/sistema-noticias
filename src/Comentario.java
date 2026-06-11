public class Comentario {
    private String texto;
    private int numero;
    private Lector lector;

    public Comentario(String texto, int dni, Lector lector) 
    {
        this.texto = texto;
        this.numero= numero;
        this.lector = lector;
    }

    public String getTexto() {return texto;}

    public int getNumero() {return numero;}

    public Lector getLector() {return lector;}

    public void setTexto(String texto) {this.texto = texto;}
    public void setNumero(int numero) {this.numero = numero;}
    public void setLector(Lector lector) {this.lector = lector;}
}
