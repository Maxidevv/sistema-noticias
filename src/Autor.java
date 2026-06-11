public class Autor extends Usuario implements Publicador {
    private String medio;

    public Autor(String nombre, String dni, String medio) {
        super(nombre, dni);
        this.medio = medio;
    }

    public String getMedio() {return medio;}

    public void setMedio(String medio){this.medio = medio;}

    public void publicarNoticia() 
    {
        System.out.println("El autor " + getNombre() + "publico una noticia en " + medio);
    }
}
