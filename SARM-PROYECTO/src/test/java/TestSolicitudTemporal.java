import dominio.SolicitudTemporal;

public class TestSolicitudTemporal {
    public static void main(String[] args) {

        // Crear una solicitud temporal usando el constructor por defecto
        SolicitudTemporal solicitud1 = new SolicitudTemporal();
        System.out.println("Constructor por defecto:");
        System.out.println(solicitud1.getDetalle());

        // Crear una solicitud temporal con parámetros
        SolicitudTemporal solicitud2 = SolicitudTemporal.crearSolicitud(14, "Mudanza pronta", "2024-12-30");
        System.out.println("\nConstructor con parámetros:");
        System.out.println(solicitud2.getDetalle());

        // Mostrar los detalles de la solicitud usando el método de consulta
        System.out.println("\nConsulta de datos de solicitud2:");
        System.out.println(solicitud2.consultarSolicitud());
    }
}