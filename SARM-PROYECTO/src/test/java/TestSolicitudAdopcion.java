import dominio.SolicitudAdopcion;
import dominio.Mascota;  // Importamos la clase Mascota
import dominio.Adoptante; // Importamos la clase Adoptante

public class TestSolicitudAdopcion {
    public static void main(String[] args) {

        // Crear un adoptante y una mascota
        Adoptante adoptante1 = new Adoptante("María Pérez", "Calle Ejemplo 123", "555-1111");
        Mascota mascota1 = new Mascota("Bobby", "Perro");

        // Crear una nueva solicitud con el constructor por defecto
        SolicitudAdopcion solicitud1 = new SolicitudAdopcion();
        System.out.println("constructor por defecto:");
        System.out.println(solicitud1.getDetalle());

        // Crear una nueva solicitud con el constructor con parámetros (con mascota)
        SolicitudAdopcion solicitud2 = new SolicitudAdopcion("2024-12-01", adoptante1, 2, mascota1);
        System.out.println("\nconstructor con parámetros:");
        System.out.println(solicitud2.getDetalle());

        // Crear una solicitud con relación de agregación a Mascota y Adoptante
        Mascota mascota2 = new Mascota("Simba", "Gato");
        Adoptante adoptante2 = new Adoptante("Carlos Ruiz", "Calle Ficticia 456", "555-2222");
        SolicitudAdopcion solicitud3 = new SolicitudAdopcion("2024-12-10", adoptante2, 3, mascota2);
        System.out.println("\nSolicitud con relación a Mascota y Adoptante:");
        System.out.println(solicitud3.getDetalle());

        // Consultar la solicitud2
        System.out.println("\nConsulta de solicitud2:");
        System.out.println(solicitud2.leerSolicitud());

        // Crear una nueva solicitud a través del método estático
        SolicitudAdopcion nuevaSolicitud = SolicitudAdopcion.crearSolicitud("2024-12-15", adoptante1, 4, mascota2);
        System.out.println("\nNueva solicitud creada:");
        System.out.println(nuevaSolicitud.getDetalle());
    }
}
