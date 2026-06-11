public class Lector extends Usuario implements Comentarista {
    private int edad;

    public Lector(int edad, String dni, String nombre) {
        super(dni, nombre);
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comentarNoticia() 
    {
        System.out.println(" El lector " + getNombre() + " comento la noticia");

    }

}
