package consola;

import util.Validacion;  // Asegúrate de importar la clase Validador
import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuSolicitudAdopcion {
    private ArrayList<String> solicitudes = new ArrayList<>(); // Lista para almacenar solicitudes de adopción

    public void mostrarSubMenu() {
        System.out.println("**********************************************");
        System.out.println("---- Gestión de Solicitud de Adopción ----");
        System.out.println("**********************************************");
        System.out.println("1. Agregar Solicitud de Adopción");
        System.out.println("2. Modificar Solicitud de Adopción");
        System.out.println("3. Buscar Solicitud de Adopción");
        System.out.println("4. Cancelar Solicitud de Adopción");
        System.out.println("5. Eliminar Solicitud de Adopción");
        System.out.println("6. Regresar al menú principal");
    }

    public void seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1: // Agregar Solicitud de Adopción
                System.out.println("Agregar Solicitud de Adopción:");
                System.out.println("----------------------------------");

                // Validar ID de adoptante (10 dígitos)
                String idad;
                do {
                    System.out.print("Id Adoptante: ");
                    idad = scanner.nextLine();
                    if (!Validacion.esIdUsuarioValido(idad)) {
                        System.out.println("El ID debe contener exactamente 10 dígitos. Intenta nuevamente.");
                    }
                } while (!Validacion.esIdUsuarioValido(idad));

                // Validar nombre del adoptante (solo letras)
                String nombread;
                do {
                    System.out.print("Nombre Adoptante: ");
                    nombread = scanner.nextLine();
                    if (!Validacion.soloLetras(nombread)) {
                        System.out.println("El nombre debe contener solo letras. Intenta nuevamente.");
                    }
                } while (!Validacion.soloLetras(nombread));

                // Validar fecha (dd/mm/aaaa)
                String fechaad;
                do {
                    System.out.print("Fecha: ");
                    fechaad = scanner.nextLine();
                    if (!Validacion.esFechaValida(fechaad)) {
                        System.out.println("La fecha debe estar en formato dd/mm/aaaa. Intenta nuevamente.");
                    }
                } while (!Validacion.esFechaValida(fechaad));

                // Agregar solicitud a la lista (por simplicidad solo almacenamos el nombre)
                solicitudes.add(nombread);
                System.out.println("Solicitud de Adopción Creada:");
                System.out.println("Id Adoptante: " + idad);
                System.out.println("Nombre Adoptante: " + nombread);
                System.out.println("Fecha de solicitud: " + fechaad);
                System.out.println("_________________________________________");
                System.out.println("Solicitud de Adopción Creada con éxito");
                System.out.println("________________________________________");

                break;

            case 2: // Modificar Solicitud de Adopción
                System.out.println("Modificar Solicitud de Adopción:");
                System.out.print("Ingrese la solicitud a modificar: ");
                String solicitudActual = scanner.nextLine();
                if (solicitudes.contains(solicitudActual)) {
                    System.out.print("Ingrese la nueva descripción: ");
                    String nuevaDescripcion = scanner.nextLine();
                    int index = solicitudes.indexOf(solicitudActual);
                    solicitudes.set(index, nuevaDescripcion);
                    System.out.println("Solicitud modificada exitosamente.");
                } else {
                    System.out.println("La solicitud no existe.");
                }
                break;

            case 3: // Buscar Solicitud de Adopción
                System.out.println("Buscar Solicitud de Adopción:");
                System.out.print("Ingrese la solicitud a buscar: ");
                String solicitudBuscar = scanner.nextLine();
                if (solicitudes.contains(solicitudBuscar)) {
                    System.out.println("Solicitud encontrada: " + solicitudBuscar);
                } else {
                    System.out.println("La solicitud no existe.");
                }
                break;

            case 4: // Cancelar Solicitud de Adopción
                System.out.println("Cancelar Solicitud de Adopción:");
                System.out.print("Ingrese la solicitud a cancelar: ");
                String solicitudCancelar = scanner.nextLine();
                if (solicitudes.contains(solicitudCancelar)) {
                    System.out.println("Solicitud cancelada: " + solicitudCancelar);
                } else {
                    System.out.println("La solicitud no existe.");
                }
                break;

            case 5: // Eliminar Solicitud de Adopción
                System.out.println("Eliminar Solicitud de Adopción:");
                System.out.print("Ingrese la solicitud a eliminar: ");
                String solicitudEliminar = scanner.nextLine();
                if (solicitudes.remove(solicitudEliminar)) {
                    System.out.println("Solicitud eliminada: " + solicitudEliminar);
                } else {
                    System.out.println("La solicitud no existe.");
                }
                break;

            case 6: // Regresar al menú principal
                System.out.println("Regresando al menú principal...");
                break;

            default: // Opción inválida
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }
}
