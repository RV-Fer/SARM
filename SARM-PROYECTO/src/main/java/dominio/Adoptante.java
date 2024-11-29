package dominio;

/**
 * Clase Adoptante que gestiona solicitudes de adopción.
 */
public class Adoptante {
    /**
     * Atributos
     */
    private String nombre;
    private String id;
    private SolicitudAdopcion[] solicitudes;
    private int numeroDeSolicitudes;

    /**
     * Constructores
     */
    public Adoptante(String nombre, String id, String s) {
        this.nombre = nombre;
        this.id = id;
        this.solicitudes = new SolicitudAdopcion[3];
        this.numeroDeSolicitudes = 0;
    }

    public Adoptante(String nombre, String id, int capacidadMaximaSolicitudes) {
        this.nombre = nombre;
        this.id = id;
        this.solicitudes = new SolicitudAdopcion[capacidadMaximaSolicitudes];
        this.numeroDeSolicitudes = 0;
    }

    public Adoptante() {
        this.nombre = "Sin nombre";
        this.id = "Sin ID";
        this.solicitudes = new SolicitudAdopcion[3];
        this.numeroDeSolicitudes = 0;
    }

    /**
     * Setters con validaciones
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("El ID no puede estar vacío.");
        }
        this.id = id;
    }

    /**
     * Getters
     */
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public SolicitudAdopcion[] getSolicitudes() {
        return solicitudes;
    }

    public int getNumeroDeSolicitudes() {
        return numeroDeSolicitudes;
    }

    public void setSolicitudes(SolicitudAdopcion[] solicitudes) {
        this.solicitudes = solicitudes;
    }

    public void setNumeroDeSolicitudes(int numeroDeSolicitudes) {
        this.numeroDeSolicitudes = numeroDeSolicitudes;
    }

    /**
     * Método toString() que representa el objeto Adoptante mostrando sus atributos.
     */
    @Override
    public String toString() {
        return "Adoptante{id='" + id + "', nombre='" + nombre + "', numeroDeSolicitudes=" + numeroDeSolicitudes + "}";
    }

    /**
     * Método para consultar todas las solicitudes registradas.
     */
    public String consultarSolicitudes() {
        String texto = "";
        for (int i = 0; i < numeroDeSolicitudes; i++) {
            texto += solicitudes[i] + "\n";
        }
        return texto;
    }

    /**
     * Método para buscar una solicitud por su posición.
     */
    public SolicitudAdopcion buscarSolicitud(int pos) {
        return solicitudes[pos];
    }

    /**
     * Método para agregar una solicitud al arreglo.
     */
    public void agregarSolicitud(String idSolicitud, String fecha, String estado) {
        solicitudes[numeroDeSolicitudes] = new SolicitudAdopcion();
        numeroDeSolicitudes++;
    }
}


