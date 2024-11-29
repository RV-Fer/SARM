package consola;

import util.Validacion;

import java.util.ArrayList;
import java.util.Scanner;

public class SubMenuLugarAdopcion {
    private ArrayList<String> lugares = new ArrayList<>();
    public void mostrarSubMenu() {
        System.out.println("**********************************************");
        System.out.println("---- Gestión de Lugar de Adopcion ----");
        System.out.println("**********************************************");
        System.out.println("1. Crear lugar de adopcion");
        System.out.println("2. Modificar lugar de adopcion");
        System.out.println("3. Buscar lugar de adopcion");
        System.out.println("4. Eliminar lugar de adopcion");
        System.out.println("6. Regresar al menu principal");
    }
    public void seleccionarOpcion(int opcion) {
        Scanner scanner = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese Datos del Lugar de Adopcion:");
                System.out.println("----------------------------------");

                // Validar ID del lugar de adopción
                String idlugaradopcion;
                do {
                    System.out.print("Id lugar adopcion: ");
                    idlugaradopcion = scanner.nextLine();
                    if (!Validacion.esIdLugarAdopcionValido(idlugaradopcion)) {
                        System.out.println("El ID del lugar de adopción debe contener hasta 4 números. Intenta nuevamente.");
                    }
                } while (!Validacion.esIdLugarAdopcionValido(idlugaradopcion));  // Repetir hasta que sea válido

                // Validar nombre del lugar (solo letras)
                String nombrelugar;
                do {
                    System.out.print("Nombre: ");
                    nombrelugar = scanner.nextLine();
                    if (!Validacion.soloLetras(nombrelugar)) {
                        System.out.println("El nombre debe contener solo letras. Intenta nuevamente.");
                    }
                } while (!Validacion.soloLetras(nombrelugar));  // Repetir hasta que sea válido

                // Validar fecha de creación (dd/mm/aaaa)
                String fechacreacion;
                do {
                    System.out.print("Fecha creacion: ");
                    fechacreacion = scanner.nextLine();
                    if (!Validacion.esFechaValida(fechacreacion)) {
                        System.out.println("La fecha debe estar en formato dd/mm/aaaa. Intenta nuevamente.");
                    }
                } while (!Validacion.esFechaValida(fechacreacion));  // Repetir hasta que sea válida

                // Validar capacidad (mayor a 10)
                String capacidad;
                do {
                    System.out.print("Capacidad: ");
                    capacidad = scanner.nextLine();
                    if (!Validacion.esCapacidadValida(capacidad)) {
                        System.out.println("La capacidad debe ser mayor a 10. Intenta nuevamente.");
                    }
                } while (!Validacion.esCapacidadValida(capacidad));  // Repetir hasta que sea válida

                // Validar dirección (al menos un número)
                String direccionlugar;
                do {
                    System.out.print("Dirección: ");
                    direccionlugar = scanner.nextLine();
                    if (!Validacion.contieneNumero(direccionlugar)) {
                        System.out.println("La dirección debe contener al menos un número (por ejemplo, número de lote). Intenta nuevamente.");
                    }
                } while (!Validacion.contieneNumero(direccionlugar));  // Repetir hasta que sea válida
                lugares.add(nombrelugar);
                System.out.println(" Lugar de Adopcion Creado ");
                System.out.println("Id lugar adopcion : " + idlugaradopcion);
                System.out.println("Nombre: " + nombrelugar);
                System.out.println("Fecha de creación : " + fechacreacion);
                System.out.println("Dirección: " + direccionlugar);
                System.out.println("Capacidad: " + capacidad);
                System.out.println("_________________________________________");
                System.out.println(" Lugar de Adopcion Creado con exito ");
                System.out.println("________________________________________");

                break;
            case 2:
                System.out.println("Modificar Lugar de Adopcion:");
                System.out.print("Ingrese el lugar de adopción a modificar: ");
                String lugarActual = scanner.nextLine();
                if (lugares.contains(lugarActual)) {
                    System.out.print("Ingrese el nuevo nombre del lugar: ");
                    String nuevoLugar = scanner.nextLine();
                    int index = lugares.indexOf(lugarActual);
                    lugares.set(index, nuevoLugar);
                    System.out.println("Lugar de Adopcion modificado: " + nuevoLugar);
                } else {
                    System.out.println("El lugar de adopción no existe.");
                }
                break;
            case 3:
                System.out.println("Buscar Lugar de Adopcion:");
                System.out.print("Ingrese el nombre del lugar a buscar: ");
                String lugarBusqueda = scanner.nextLine();
                if (lugares.contains(lugarBusqueda)) {
                    System.out.println("Lugar de Adopción encontrado: " + lugarBusqueda);
                } else {
                    System.out.println("El lugar de adopción no existe.");
                }
                break;
            case 4:
                System.out.println("Eliminar Lugar de Adopcion:");
                System.out.print("Ingrese el lugar de adopción a eliminar: ");
                String lugarEliminar = scanner.nextLine();
                if (lugares.remove(lugarEliminar)) {
                    System.out.println("Lugar de Adopcion eliminado: " + lugarEliminar);
                } else {
                    System.out.println("El lugar de adopción no existe.");
                }
                break;
            case 6:
                System.out.println("Regresando al menu principal");
                break;
            default:
                System.out.println("Opcion Invalida.");
        }
    }
}
