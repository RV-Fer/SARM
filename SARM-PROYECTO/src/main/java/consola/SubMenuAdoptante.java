package consola;

import util.Validacion;
import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuAdoptante {
    private ArrayList<String> adoptantes = new ArrayList<>();

    public void mostrarSubMenu() {
        System.out.println("**********************************************");
        System.out.println("---- Gestión de Adoptante ----");
        System.out.println("**********************************************");
        System.out.println("1. Crear adoptante");
        System.out.println("2. Editar adoptante");
        System.out.println("3. Consultar adoptante");
        System.out.println("4. Eliminar adoptante");
        System.out.println("6. Regresar al menu principal");
    }

    public void seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1: // Crear adoptante
                System.out.println("Ingrese los Datos del Adoptante:");
                System.out.println("----------------------------------");

                String id; // Variable para almacenar
                // Usamos do-while para repetir la solicitud hasta que sea válido
                do {
                    System.out.print("Id Adoptante: ");
                    id = scanner.nextLine();
                    // Validar que el ID tenga exactamente 10 dígitos
                    if (!Validacion.esIdValido(id)) {
                        System.out.println("El ID debe contener exactamente 10 números. Intenta nuevamente.");
                    }
                } while (!Validacion.esIdValido(id));  // Condición de validación

                System.out.println("ID Adoptante registrado correctamente: " + id);

                String nombre;
                do {
                    System.out.print("Nombre: ");
                    nombre = scanner.nextLine();
                    // Validar que solo se ingresen letras
                    if (!Validacion.soloLetras(nombre)) {
                        System.out.println("El nombre debe contener solo letras. Intenta nuevamente.");
                    }
                } while (!Validacion.soloLetras(nombre));  // Condición de validación
                System.out.println("Nombre registrado correctamente: " + nombre);

                String edad;
                do {
                    System.out.print("Edad: ");
                    edad = scanner.nextLine();
                    // Validar que la edad sea un número válido y mayor o igual a 18
                    if (!Validacion.esMayorDeEdad(edad)) {
                        System.out.println("La edad debe ser mayor o igual a 18. Intenta nuevamente.");
                    }
                } while (!Validacion.esMayorDeEdad(edad));
                System.out.println("Edad registrada correctamente: " + edad);

                String direccion;
                do {
                    System.out.print("Dirección: ");
                    direccion = scanner.nextLine();
                    // Validar que la dirección contenga al menos un número (número de casa)
                    if (!Validacion.contieneNumero(direccion)) {
                        System.out.println("La dirección debe contener al menos un número (por ejemplo, número de lote). Intenta nuevamente.");
                    }
                } while (!Validacion.contieneNumero(direccion));  // Repetir hasta que contenga un número
                System.out.println("Dirección registrada correctamente: " + direccion);

                String telefono;
                do {
                    System.out.print("Telefono: ");
                    telefono = scanner.nextLine();
                    // Validar que el teléfono tenga exactamente 10 dígitos
                    if (!Validacion.esTelefonoValido(telefono)) {
                        System.out.println("El teléfono debe contener exactamente 10 dígitos. Intenta nuevamente.");
                    }
                } while (!Validacion.esTelefonoValido(telefono));  // Repetir hasta que tenga 10 dígitos
                System.out.println("Teléfono registrado correctamente: " + telefono);

                String ocupacion;
                do {
                    System.out.print("Ocupación: ");
                    ocupacion = scanner.nextLine();
                    // Validar que la ocupación contenga solo letras
                    if (!Validacion.soloLetras(ocupacion)) {
                        System.out.println("La ocupación debe contener solo letras. Intenta nuevamente.");
                    }
                } while (!Validacion.soloLetras(ocupacion));
                System.out.println("Ocupación registrada correctamente: " + ocupacion);

                String email;
                do {
                    System.out.print("Email: ");
                    email = scanner.nextLine();
                    // Validar que el email contenga '@' y termine en '.com'
                    if (!Validacion.esEmailValido(email)) {
                        System.out.println("El email debe contener '@' y terminar con '.com'. Intenta nuevamente.");
                    }
                } while (!Validacion.esEmailValido(email));
                System.out.println("Email registrado correctamente: " + email);

                // Agregar los datos del adoptante a la lista
                adoptantes.add(nombre);
                System.out.println("Perfil adoptante Creado ");
                System.out.println("Id Adoptante: " + id);
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                System.out.println("Dirección: " + direccion);
                System.out.println("Teléfono: " + telefono);
                System.out.println("Ocupación: " + ocupacion);
                System.out.println("Email: " + email);
                System.out.println("_________________________________________");
                System.out.println("Perfil Adoptante Creado con éxito");
                System.out.println("________________________________________");

                break;

            case 2: // Modificar adoptante
                System.out.println("Modificar adoptante:");
                System.out.print("Ingrese el nombre del adoptante a modificar: ");
                String nombreActual = scanner.nextLine();
                if (adoptantes.contains(nombreActual)) {
                    System.out.print("Ingrese el nuevo nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    int index = adoptantes.indexOf(nombreActual);
                    adoptantes.set(index, nuevoNombre);
                    System.out.println("Adoptante modificado: " + nuevoNombre);
                } else {
                    System.out.println("El adoptante no existe.");
                }
                break;

            case 3: // Consultar adoptante
                System.out.println("Consultar adoptante:");
                System.out.print("Ingrese el nombre del adoptante a consultar: ");
                String nombreConsulta = scanner.nextLine();
                if (adoptantes.contains(nombreConsulta)) {
                    System.out.println("Adoptante encontrado: " + nombreConsulta);
                } else {
                    System.out.println("El adoptante no existe.");
                }
                break;

            case 4: // Eliminar adoptante
                System.out.println("Eliminar adoptante:");
                System.out.print("Ingrese el nombre del adoptante a eliminar: ");
                String nombreEliminar = scanner.nextLine();
                if (adoptantes.remove(nombreEliminar)) {
                    System.out.println("Adoptante eliminado: " + nombreEliminar);
                } else {
                    System.out.println("El adoptante no existe.");
                }
                break;

            case 6: // Salir
                System.out.println("Regresando al menu principal");
                break;

            default: // Opción inválida
                System.out.println("Opción Inválida.");
        }
    }
}

