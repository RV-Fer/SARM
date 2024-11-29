import dominio.Mascota;

public class TestMascota {
    public static void main(String[] args) {

        Mascota mascota1 = new Mascota("Bobby", "Perro");
        System.out.println("Constructor por defecto:");
        System.out.println(mascota1.getDetalle());

        Mascota mascota2 = new Mascota("Zeus", "Gato", 2, "Hembra");
        System.out.println("\nconstructor con parámetros:");
        System.out.println(mascota2.getDetalle());

        System.out.println("\nDatos modificados");
        mascota2.setNombre("Coco");
        mascota2.setEspecie("Gato");
        mascota2.setEdad(3);
        mascota2.setSexo("Hembra");

        System.out.println("Nombre: " + mascota2.getNombre());
        System.out.println("Especie: " + mascota2.getEspecie());
        System.out.println("Edad: " + mascota2.getEdad());
        System.out.println("Sexo: " +  mascota2.getSexo());
    }
}

