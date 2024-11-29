package dominio;

public class Mascota {

    // Atributos
    private String nombre;
    private String especie;
    private int edad;
    private String sexo;

    // Constructor por defecto
    public Mascota(String bobby, String perro) {
        this.nombre = "Firulais";
        this.especie = "Perro";
        this.edad = 3;
        this.sexo = "Macho";
    }

    // Constructor con parámetros
    public Mascota(String nombre, String especie, int edad, String sexo) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.sexo = sexo;
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

    public void setEspecie(String especie) {
        if (especie == null || especie.isEmpty()) {
            throw new IllegalArgumentException("Por favor llenar Campo Obligatorio: Especie.");
        }
        this.especie = especie;
    }

    public void setEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException(" Edad debe ser mayor a 0.");
        }
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        if (sexo == null || sexo.isEmpty()) {
            throw new IllegalArgumentException("Por favor llenar Campo Obligatorio: Sexo.");
        }
        this.sexo = sexo;
    }

    /**
     *MÉTODOS GETTER
     */
    public String getNombre() {
        return nombre;
    }
    public String getEspecie() {
        return especie;
    }
    public int getEdad() {
        return edad;
    }
    public String getSexo() {
        return sexo;
    }


    // Método adicional

    public String getDetalle() {
        return "Mascota: " +
                "\nNombre: " + nombre +
                "\nEspecie: " + especie +
                "\nEdad: " + edad +
                "\nSexo: " + sexo;
    }
}

