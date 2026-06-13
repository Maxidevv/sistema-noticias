import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDateTime;

/**
 * Clase Sitio que gestiona noticias, autores, lectores y comentarios
 * @author Moyano Bustos, Darrull, Zalazar, Moncada
 * @version 5.0
 */
public class Sitio {
    private ArrayList <Autor> autores;       
    private ArrayList <Lector> lectores;
    private ArrayList <Comentario> comentarios;
    private ArrayList <Noticia> noticias;

    /**
     * Constructor de la clase Sitio
     * Inicializa los ArrayLists de autores, lectores, comentarios y noticias
     */
    public Sitio() 
    {
        this.autores = new ArrayList<Autor>();
        this.lectores = new ArrayList<Lector>();
        this.comentarios = new ArrayList<Comentario>();
        this.noticias = new ArrayList<Noticia>();
    }

    // Getters
    /**
     * @return lista de autores
     */
    public ArrayList<Autor> getAutores() {
        return autores;
    }

    /**
     * @return lista de lectores
     */
    public ArrayList<Lector> getLectores() {
        return lectores;
    }

    /**
     * @return lista de comentarios
     */
    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    /**
     * @return lista de noticias
     */
    public ArrayList<Noticia> getNoticias() {
        return noticias;
    }

    // Setters
    /**
     * @param autores lista de autores
     */
    public void setAutores(ArrayList<Autor> autores) {
        this.autores = autores;
    }

    /**
     * @param lectores lista de lectores
     */
    public void setLectores(ArrayList<Lector> lectores) {
        this.lectores = lectores;
    }

    /**
     * @param comentarios lista de comentarios
     */
    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    /**
     * @param noticias lista de noticias
     */
    public void setNoticias(ArrayList<Noticia> noticias) {
        this.noticias = noticias;
    }

    // Metodos de gestion
    /**
     * Lista todas las noticias agrupadas por año
     */
    public void listarNoticiasAño() {
        if (noticias.isEmpty()) {
            System.out.println("No hay noticias registradas.");
            return;
        }

        System.out.println("\n═════════════════════════════════════════");
        System.out.println("        NOTICIAS AGRUPADAS POR AÑO         ");
        System.out.println("═════════════════════════════════════════\n");

        ArrayList<Integer> años = new ArrayList<>();
        for (Noticia noticia : noticias) {
            int año = noticia.getFecha().getYear();
            if (!años.contains(año)) {
                años.add(año);
            }
        }

        for (Integer año : años) {
            System.out.println("| AÑO " + año);
            for (Noticia noticia : noticias) {
                if (noticia.getFecha().getYear() == año) {
                    System.out.println("│  ├─ " + noticia.getTitulo());
                    System.out.println("│  │  Autor: " + noticia.getAutor().getNombre());
                    System.out.println("│  │  Fecha: " + noticia.getFecha());
                }
            }
            System.out.println("│\n");
        }
    }

    /**
     * Lista noticias de un mes y año especifico
     */
    public void listarNoticiasMes() {
        if (noticias.isEmpty()) {
            System.out.println("No hay noticias registradas.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el mes (1-12): ");
        int mes = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();

        System.out.println("\n═════════════════════════════════════════");
        System.out.println("    NOTICIAS DEL MES " + mes + " DEL AÑO " + año);
        System.out.println("═════════════════════════════════════════\n");

        boolean encontrado = false;
        for (Noticia noticia : noticias) {
            if (noticia.getFecha().getMonthValue() == mes && noticia.getFecha().getYear() == año) {
                System.out.println("├─ " + noticia.getTitulo());
                System.out.println("│  Autor: " + noticia.getAutor().getNombre());
                System.out.println("│  Fecha: " + noticia.getFecha());
                System.out.println("│  Detalle: " + noticia.getDetalle());
                System.out.println("│\n");
                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay noticias en ese mes y año.");
        }
    }

    /**
     * Muestra el detalle completo de una noticia seleccionada
     */
    public void mostrarNoticia() {
        if (noticias.isEmpty()) {
            System.out.println("No hay noticias registradas.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n═════════════════════════════════════════");
        System.out.println("        LISTA DE NOTICIAS");
        System.out.println("═════════════════════════════════════════\n");

        for (int i = 0; i < noticias.size(); i++) {
            System.out.println((i + 1) + ". " + noticias.get(i).getTitulo());
        }

        System.out.print("\nSeleccione el numero de la noticia: ");
        int opcion = scanner.nextInt();

        if (opcion > 0 && opcion <= noticias.size()) {
            Noticia noticia = noticias.get(opcion - 1);
            System.out.println("\n═════════════════════════════════════════");
            System.out.println("        DETALLE DE LA NOTICIA");
            System.out.println("═════════════════════════════════════════\n");
            System.out.println("Titulo: " + noticia.getTitulo());
            System.out.println("Autor: " + noticia.getAutor().getNombre());
            System.out.println("Medio: " + noticia.getAutor().getMedio());
            System.out.println("Fecha: " + noticia.getFecha());
            System.out.println("Detalle: " + noticia.getDetalle());
            System.out.println("\n─────────────────────────────────────────");

            ArrayList<Comentario> comentariosNoticia = new ArrayList<>();
            for (Comentario comentario : comentarios) {
                // Se asume que el comentario esta asociado a la noticia por el lector
                comentariosNoticia.add(comentario);
            }

            if (!comentariosNoticia.isEmpty()) {
                System.out.println("COMENTARIOS:");
                for (Comentario c : comentariosNoticia) {
                    System.out.println("  - " + c.getLector().getNombre() + ": " + c.getTexto());
                }
            } else {
                System.out.println("No hay comentarios en esta noticia.");
            }
            System.out.println("");
        } else {
            System.out.println("Opcion no valida.");
        }
    }

    /**
     * Busca y lista todas las noticias de un autor especifico
     */
    public void buscarPorAutor() {
        if (autores.isEmpty()) {
            System.out.println("No hay autores registrados.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n═════════════════════════════════════════");
        System.out.println("        LISTA DE AUTORES");
        System.out.println("═════════════════════════════════════════\n");

        for (int i = 0; i < autores.size(); i++) {
            System.out.println((i + 1) + ". " + autores.get(i).getNombre());
        }

        System.out.print("\nSeleccione el numero del autor: ");
        int opcion = scanner.nextInt();

        if (opcion > 0 && opcion <= autores.size()) {
            Autor autorSeleccionado = autores.get(opcion - 1);
            System.out.println("\n═════════════════════════════════════════");
            System.out.println("    NOTICIAS DE " + autorSeleccionado.getNombre().toUpperCase());
            System.out.println("═════════════════════════════════════════\n");

            boolean encontrado = false;
            for (Noticia noticia : noticias) {
                if (noticia.getAutor().getDni().equals(autorSeleccionado.getDni())) {
                    System.out.println("├─ " + noticia.getTitulo());
                    System.out.println("│  Fecha: " + noticia.getFecha());
                    System.out.println("│  Detalle: " + noticia.getDetalle());
                    System.out.println("│\n");
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("Este autor no tiene noticias registradas.");
            }
            System.out.println("");
        } else {
            System.out.println("Opcion no valida.");
        }
    }

    /**
     * Registra un nuevo comentario de un lector en una noticia
     */
    public void registrarComentario() {
        if (lectores.isEmpty()) {
            System.out.println("No hay lectores registrados.");
            return;
        }

        if (noticias.isEmpty()) {
            System.out.println("No hay noticias registradas.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n═════════════════════════════════════════");
        System.out.println("        REGISTRAR COMENTARIO");
        System.out.println("═════════════════════════════════════════\n");

        System.out.println("Seleccione el lector:");
        for (int i = 0; i < lectores.size(); i++) {
            System.out.println((i + 1) + ". " + lectores.get(i).getNombre());
        }

        System.out.print("Numero del lector: ");
        int opcionLector = scanner.nextInt();
        scanner.nextLine();

        if (opcionLector > 0 && opcionLector <= lectores.size()) {
            Lector lector = lectores.get(opcionLector - 1);

            System.out.println("\nSeleccione la noticia:");
            for (int i = 0; i < noticias.size(); i++) {
                System.out.println((i + 1) + ". " + noticias.get(i).getTitulo());
            }

            System.out.print("Numero de la noticia: ");
            int opcionNoticia = scanner.nextInt();
            scanner.nextLine();

            if (opcionNoticia > 0 && opcionNoticia <= noticias.size()) {
                System.out.print("Ingrese el comentario: ");
                String texto = scanner.nextLine();

                Comentario nuevoComentario = new Comentario(texto, lector);
                comentarios.add(nuevoComentario);

                System.out.println("\n Comentario registrado exitosamente.");
                System.out.println("");
            } else {
                System.out.println("Opcion de noticia no valida.");
            }
        } else {
            System.out.println("Opcion de lector no valida.");
        }
    }

    /**
     * Registra un nuevo autor en el sistema
     */
    public void registrarAutor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n═════════════════════════════════════════");
        System.out.println("        REGISTRAR NUEVO AUTOR              ");
        System.out.println("═════════════════════════════════════════\n");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Medio: ");
        String medio = scanner.nextLine();

        Autor nuevoAutor = new Autor(nombre, dni, medio);
        autores.add(nuevoAutor);

        System.out.println("\n Autor registrado exitosamente.");
        System.out.println("");
    }

    /**
     * Registra un nuevo lector en el sistema
     */
    public void registrarLector() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n═════════════════════════════════════════");
        System.out.println("        REGISTRAR NUEVO LECTOR"             );
        System.out.println("═════════════════════════════════════════\n");

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("DNI: ");
        String dni = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        Lector nuevoLector = new Lector(edad, dni, nombre);
        lectores.add(nuevoLector);

        System.out.println("\n Lector registrado exitosamente.");
        System.out.println("");
    }

    /**
     * Registra una nueva noticia en el sistema
     */
    public void registrarNoticia() {
        if (autores.isEmpty()) {
            System.out.println("No hay autores registrados. Debe registrar un autor primero.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("\n═════════════════════════════════════════");
        System.out.println("        REGISTRAR NUEVA NOTICIA");
        System.out.println("═════════════════════════════════════════\n");

        System.out.println("Seleccione el autor:");
        for (int i = 0; i < autores.size(); i++) {
            System.out.println((i + 1) + ". " + autores.get(i).getNombre());
        }

        System.out.print("Numero del autor: ");
        int opcionAutor = scanner.nextInt();
        scanner.nextLine();

        if (opcionAutor > 0 && opcionAutor <= autores.size()) {
            Autor autor = autores.get(opcionAutor - 1);

            System.out.print("Titulo: ");
            String titulo = scanner.nextLine();

            System.out.print("Detalle: ");
            String detalle = scanner.nextLine();

            System.out.print("Año: ");
            int año = scanner.nextInt();
            System.out.print("Mes: ");
            int mes = scanner.nextInt();
            System.out.print("Dia: ");
            int dia = scanner.nextInt();
            System.out.print("Hora: ");
            int hora = scanner.nextInt();
            System.out.print("Minuto: ");
            int minuto = scanner.nextInt();

            LocalDateTime fecha = LocalDateTime.of(año, mes, dia, hora, minuto);
            Noticia nuevaNoticia = new Noticia(titulo, detalle, fecha, autor);
            noticias.add(nuevaNoticia);

            System.out.println("\n Noticia registrada exitosamente.");
            System.out.println("");

        } else {
            System.out.println("Opcion de autor no valida.");
        }
    }

    /**
     * Metodo principal que ejecuta el menu interactivo del sistema
     * @param args argumentos de linea de comandos
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sitio sitio = new Sitio();
        int opcion;

        System.out.println("╔═════════════════════════╗");
        System.out.println("║   SISTEMA DE NOTICIAS   ║");
        System.out.println("╚═════════════════════════╝");
        System.out.println("");

        do {
            System.out.println("══════[MENU PRINCIPAL]══════");
            System.out.println("");
            System.out.println("1. | Listar noticias por año.");
            System.out.println("2. | Listar noticias por mes.");
            System.out.println("3. | Mostrar noticia.");
            System.out.println("4. | Buscar por autor.");
            System.out.println("5. | Registrar comentario.");
            System.out.println("6. | Registrar autor.");
            System.out.println("7. | Registrar lector.");
            System.out.println("8. | Registrar noticia.");
            System.out.println("9. | Salir.");
            System.out.println("");
            System.out.println("═════════════════════════════");
            System.out.println("");

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    sitio.listarNoticiasAño();
                    break;
                case 2:
                    sitio.listarNoticiasMes();
                    break;
                case 3:
                    sitio.mostrarNoticia();
                    break;
                case 4:
                    sitio.buscarPorAutor();
                    break;
                case 5:
                    sitio.registrarComentario();
                    break;
                case 6:
                    sitio.registrarAutor();
                    break;
                case 7:
                    sitio.registrarLector();
                    break;
                case 8:
                    sitio.registrarNoticia();
                    break;
                case 9:
                    System.out.println("\nGracias por usar el sistema de noticia.");
                    break;
                default:
                    System.out.println("Opcion no valida, ingrese una opcion del 1 al 9.");
                    break;
            }
        } while(opcion != 9);
        
        scanner.close();
    }
}