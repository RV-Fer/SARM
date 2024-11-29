package dominio;

public class SolicitudAdopcion {

    // Atributos
    private String fecha;
    private Adoptante adoptante;  // Ahora es un objeto Adoptante
    private int Id;
    private Mascota mascota;  // Relación con la clase Mascota (agregación)

    // Constructor por defecto
    public SolicitudAdopcion() {
        this.fecha = "2024-11-22";
        this.adoptante = null;
        this.Id = 1;
        this.mascota = null;  // No se asigna una mascota por defecto
    }

    // Constructor con parámetros
    public SolicitudAdopcion(String fecha, Adoptante adoptante, int Id, Mascota mascota) {
        this.fecha = fecha;
        this.adoptante = adoptante;
        this.Id = Id;
        this.mascota = mascota;
    }

    /**
     * MÉTODOS SETTER
     */
    public void setFecha(String fecha) {
        if (fecha == null || fecha.isEmpty()) {
            throw new IllegalArgumentException("Por favor llenar Campo Obligatorio: Fecha.");
        }
        this.fecha = fecha;
    }

    public void setAdoptante(Adoptante adoptante) {
        this.adoptante = adoptante;
    }

    public void setId(int Id) {
        if (Id <= 0) {
            throw new IllegalArgumentException("El Id debe ser mayor que 0.");
        }
        this.Id = Id;
    }

    // Relación con la clase Mascota
    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    /**
     * MÉTODOS GETTER
     */
    public String getFecha() {
        return fecha;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public int getId() {
        return Id;
    }

    public Mascota getMascota() {
        return mascota;
    }

    // Método adicional para obtener el detalle de la solicitud
    public String getDetalle() {
        return "Solicitud de Adopción: " +
                "\nFecha: " + fecha +
                "\nAdoptante: " + (adoptante != null ? adoptante.getNombre() : "No asignado") +
                "\nId: " + Id +
                (mascota != null ? "\nMascota: " + mascota.getNombre() : "\nNo se ha asignado mascota");
    }

    // Método toString para representar el objeto como texto (sin @Override)
    public String toString() {
        return "SolicitudAdopcion{" +
                "fecha='" + fecha + '\'' +
                ", adoptante=" + adoptante +
                ", Id=" + Id +
                (mascota != null ? ", mascota=" + mascota : "") +
                '}';
    }

    // Métodos CRUD

    // Crear Solicitud de Adopción
    public static SolicitudAdopcion crearSolicitud(String fecha, Adoptante adoptante, int Id, Mascota mascota) {
        return new SolicitudAdopcion(fecha, adoptante, Id, mascota);
    }

    // Leer Solicitud de Adopción (consulta)
    public String leerSolicitud() {
        return getDetalle();
    }
}