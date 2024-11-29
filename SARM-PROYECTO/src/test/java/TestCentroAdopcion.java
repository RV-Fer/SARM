import dominio.CentroAdopcion;

public class TestCentroAdopcion {
    public static void main(String[] args) {

        CentroAdopcion centro1 = new CentroAdopcion();
        System.out.println("constructor por defecto:");
        System.out.println(centro1.getDetalle());


        CentroAdopcion centro2 = new CentroAdopcion("Av. Guayasamin 742", "Lunes a Viernes: 8 AM - 6 PM", 25);
        System.out.println("\nCentro de Adopción creado con constructor con parámetros:");
        System.out.println(centro2.getDetalle());


        centro2.setDireccion("Av. Principal 123");
        System.out.println("\nDirección actualizada del centro:");
        System.out.println("Nueva dirección: " + centro2.getDireccion());

        centro2.setHorario("Sábado y Domingo: 9 AM - 5 PM");
        System.out.println("Nuevo horario: " + centro2.getHorario());

        centro2.setCapacidadMaxima(30);
        System.out.println("Nueva capacidad máxima: " + centro2.getCapacidadMaxima());




    }
}

