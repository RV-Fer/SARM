package dominio;

public class LugarAdopcion {
    // Atributos
    private String nombre;
    private String direccion;
    private int capacidad;
    private String fecha;
    private int id;

    // Constructor por defecto
    public LugarAdopcion() {
        this.nombre = "Refugio de Animales";
        this.direccion = "Av. Siempre Viva 123";
        this.capacidad = 50;
        this.fecha = "09/10/2020";
        this.id =01;
    }

    // Constructor con parámetros
    public LugarAdopcion(String nombre, String direccion, int capacidad, String fecha, int id) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.capacidad = capacidad;
        this.fecha= fecha;
        this.id= id;
    }
    /**
     *MÉTODOS SETTER
     */
    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("Por favor llenar Campo Obligatorio: Nombre.");
        }
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isEmpty()) {
            throw new IllegalArgumentException("Por favor llenar Campo Obligatorio: Dirección.");
        }
        this.direccion = direccion;
    }

    public void setCapacidad(int capacidad) {
        if (capacidad <= 0) {
            throw new IllegalArgumentException("Por favor llenar Campo Obligatorio: Capacidad debe ser mayor a 0.");
        }
        this.capacidad = capacidad;
    }

    public void setFecha(String fecha) {
        if (fecha == null || fecha.isEmpty()) {
            throw new IllegalArgumentException("Por favor llenar Campo Obligatorio: Fecha.");
        }
        this.fecha = fecha;
    }

    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("ID debe ser mayor a 0.");
        }
        this.id = id;
    }

    /**
     *MÉTODOS GETTER
     */
    public String getNombre() {

        return nombre;
    }
    public String getDireccion() {

        return direccion;
    }
    public int getCapacidad() {

        return capacidad;
    }
    public String getFecha() {

        return fecha;
    }
    public int getId() {

        return id;
    }



    // Método adicional

    public String getDetalle() {
        return "Lugar de Adopción: " +
                "\nNombre: " + nombre +
                "\nDirección: " + direccion +
                "\nCapacidad: " + capacidad+
                "\nFecha: " + fecha+
                "\nId: " + id;
    }
}