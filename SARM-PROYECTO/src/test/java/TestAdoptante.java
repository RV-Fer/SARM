import dominio.Adoptante;
import dominio.SolicitudAdopcion;

public class TestAdoptante {
        private static Adoptante adoptante;

        public static void main(String[] args) {
                testConstructorPorDefecto();
                testConstructorConParametros();
                testAgregarSolicitudes();
                testConsultarSolicitudes();
                testBuscarSolicitudValida();
                testBuscarSolicitudInvalida();
                testSetNombreValido();
                testSetNombreInvalido();
                testSetIdValido();
                testSetIdInvalido();
        }

        // Prueba del constructor por defecto
        public static void testConstructorPorDefecto() {
                adoptante = new Adoptante();
                System.out.println("Adoptante creado con constructor por defecto:");
                System.out.println(adoptante.toString());
        }

        // Prueba del constructor con parámetros
        public static void testConstructorConParametros() {
                adoptante = new Adoptante("Carlos", "ID123", "555-1111");
                System.out.println("Adoptante creado con constructor con parámetros:");
                System.out.println(adoptante.toString());
        }

        // Prueba para agregar solicitudes
        public static void testAgregarSolicitudes() {
                adoptante.agregarSolicitud("S001", "2024-11-27", "Pendiente");
                adoptante.agregarSolicitud("S002", "2024-11-28", "Aprobada");
                System.out.println("Solicitudes agregadas exitosamente.");
        }

        // Prueba para consultar todas las solicitudes
        public static void testConsultarSolicitudes() {
                System.out.println("Solicitudes registradas:");
                System.out.println(adoptante.consultarSolicitudes());
        }

        // Prueba para buscar una solicitud válida
        public static void testBuscarSolicitudValida() {
                try {
                        SolicitudAdopcion solicitud = adoptante.buscarSolicitud(0);
                        System.out.println("Solicitud encontrada: " + solicitud.toString());
                } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error: Posición fuera de los límites.");
                }
        }

        // Prueba para buscar una solicitud inválida
        public static void testBuscarSolicitudInvalida() {
                try {
                        SolicitudAdopcion solicitud = adoptante.buscarSolicitud(5);
                        System.out.println("Solicitud encontrada: " + solicitud.toString());
                } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.println("Error esperado al buscar solicitud: Posición fuera de los límites.");
                }
        }

        // Prueba para setNombre válido
        public static void testSetNombreValido() {
                try {
                        adoptante.setNombre("María");
                        System.out.println("Nombre del adoptante cambiado exitosamente a: " + adoptante.getNombre());
                } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                }
        }

        // Prueba para setNombre inválido
        public static void testSetNombreInvalido() {
                try {
                        adoptante.setNombre("");
                        System.out.println("Nombre del adoptante cambiado exitosamente.");
                } catch (IllegalArgumentException e) {
                        System.out.println("Error esperado: " + e.getMessage());
                }
        }

        // Prueba para setId válido
        public static void testSetIdValido() {
                try {
                        adoptante.setId("ID456");
                        System.out.println("ID del adoptante cambiado exitosamente a: " + adoptante.getId());
                } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                }
        }

        // Prueba para setId inválido
        public static void testSetIdInvalido() {
                try {
                        adoptante.setId("");
                        System.out.println("ID del adoptante cambiado exitosamente.");
                } catch (IllegalArgumentException e) {
                        System.out.println("Error esperado: " + e.getMessage());
                }
        }
}
