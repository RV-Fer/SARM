package consola;

import util.Validacion;  // Asegúrate de importar correctamente la clase Validador
import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuMascotas {
    private ArrayList<String> mascotas = new ArrayList<>();

    public void mostrarSubMenu() {
        System.out.println("**********************************************");
        System.out.println("---- Gestión de Mascotas ----");
        System.out.println("**********************************************");
        System.out.println("1. Agregar Mascota");
        System.out.println("2. Modificar Mascota");
        System.out.println("3. Buscar Mascota");
        System.out.println("4. Eliminar Mascota");
        System.out.println("6. Regresar al menu principal");
    }

    public void seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);

        switch (opcion) {
            case 1: // Agregar Mascota
                System.out.println("Ingrese los Datos de la Mascota:");
                System.out.println("..................................");

                // Validar nombre de la mascota (solo letras)
                String nombreMascota;
                do {
                    System.out.print("Nombre de la Mascota: ");
                    nombreMascota = scanner.nextLine();
                    if (!Validacion.soloLetras(nombreMascota)) {
                        System.out.println("El nombre de la mascota debe contener solo letras. Intenta nuevamente.");
                    }
                } while (!Validacion.soloLetras(nombreMascota));

                // Validar especie (solo letras)
                String especie;
                do {
                    System.out.print("Especie: ");
                    especie = scanner.nextLine();
                    if (!Validacion.soloLetras(especie)) {
                        System.out.println("La especie debe contener solo letras. Intenta nuevamente.");
                    }
                } while (!Validacion.soloLetras(especie));

                // Validar edad (mayor o igual a 1)
                String edad;
                do {
                    System.out.print("Edad: ");
                    edad = scanner.nextLine();
                    if (!Validacion.esEdadValida(edad)) {
                        System.out.println("La edad debe ser un número mayor o igual a 1. Intenta nuevamente.");
                    }
                } while (!Validacion.esEdadValida(edad));

                // Validar sexo (solo hembra o macho)
                String sexo;
                do {
                    System.out.print("Sexo: ");
                    sexo = scanner.nextLine();
                    if (!Validacion.esSexoValido(sexo)) {
                        System.out.println("El sexo debe ser 'hembra' o 'macho'. Intenta nuevamente.");
                    }
                } while (!Validacion.esSexoValido(sexo));

                // Agregar mascota a la lista (por simplicidad solo almacenamos el nombre)
                mascotas.add(nombreMascota);
                System.out.println("Mascota creada:");
                System.out.println("Nombre de la mascota: " + nombreMascota);
                System.out.println("Especie: " + especie);
                System.out.println("Edad: " + edad);
                System.out.println("Sexo: " + sexo);
                System.out.println("_________________________________________");
                System.out.println("Mascota Creada con exito");
                System.out.println("________________________________________");

                break;

            case 2: // Modificar Mascota
                System.out.println("Modificar Mascota:");
                System.out.print("Ingrese el nombre de la mascota a modificar: ");
                String nombreActual = scanner.nextLine();
                if (mascotas.contains(nombreActual)) {
                    System.out.print("Ingrese el nuevo nombre de la mascota: ");
                    String nuevoNombre = scanner.nextLine();
                    int index = mascotas.indexOf(nombreActual);
                    mascotas.set(index, nuevoNombre);
                    System.out.println("Mascota modificada: " + nuevoNombre);
                } else {
                    System.out.println("La mascota no existe.");
                }
                break;

            case 3: // Buscar Mascota
                System.out.println("Buscar Mascota:");
                System.out.print("Ingrese el nombre de la mascota a buscar: ");
                String nombreBusqueda = scanner.nextLine();
                if (mascotas.contains(nombreBusqueda)) {
                    System.out.println("Mascota encontrada: " + nombreBusqueda);
                } else {
                    System.out.println("La mascota no existe.");
                }
                break;

            case 4: // Eliminar Mascota
                System.out.println("Eliminar Mascota:");
                System.out.print("Ingrese el nombre de la mascota a eliminar: ");
                String nombreEliminar = scanner.nextLine();
                if (mascotas.remove(nombreEliminar)) {
                    System.out.println("Mascota eliminada: " + nombreEliminar);
                } else {
                    System.out.println("La mascota no existe.");
                }
                break;

            case 6: // Regresar al menú principal
                System.out.println("Regresando al menú principal...");
                break;

            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
        }
    }
}

