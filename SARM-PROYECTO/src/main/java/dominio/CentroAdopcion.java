package dominio;

public class CentroAdopcion {
    /**
     * Atributos
      */

    private String direccion;
    private String horario;
    private int capacidadMaxima;

    /**
     * Constructor por defecto
     */
    public CentroAdopcion() {
        this.direccion = "calle 10 de Agosto";
        this.horario = " Lunes a viernes 8 am - 6 pm ";
        this.capacidadMaxima = 10;
    }

    /**
    *Constructor con parámetros
    */
    public CentroAdopcion(String direccion, String horario, int capacidadMaxima) {
        this.direccion = direccion;
        this.horario = horario;
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Setters
     */
    public void setDireccion(String direccion) {
        if (direccion == null || direccion.isEmpty()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía.");
        }
        this.direccion = direccion;
    }

    public void setHorario(String horario) {
        if (horario == null || horario.isEmpty()) {
            throw new IllegalArgumentException("El horario no puede estar vacío.");
        }
        this.horario = horario;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima <= 0) {
            throw new IllegalArgumentException("La capacidad máxima debe ser mayor a 0.");
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    /**
     * Getters
     */
    public String getDireccion() {
        return direccion;
    }
    public String getHorario() {
        return horario;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }
    // Método adicional: mostrar detalles

    public String getDetalle() {
        return "Centro de Adopción: " +
                "\nDirección: " + direccion +
                "\nHorario: " + horario +
                "\nCapacidad Máxima: " + capacidadMaxima;
    }
}