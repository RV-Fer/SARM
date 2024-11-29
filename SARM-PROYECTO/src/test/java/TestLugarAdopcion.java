import dominio.LugarAdopcion;

public class TestLugarAdopcion {
    public static void main(String[] args) {


        LugarAdopcion lugar1 = new LugarAdopcion();
        System.out.println(" constructor por defecto:");
        System.out.println(lugar1.getDetalle());


        LugarAdopcion lugar2 = new LugarAdopcion("Hogar Animal", "Calle Libertad 456", 30, "02/12/2022",02);
        System.out.println("\nconstructor con parámetros:");
        System.out.println(lugar2.getDetalle());


        System.out.println("\nconstructor con parámetros:");
        System.out.println(lugar2.getDetalle());
        lugar2.setFecha("18/05/2023");
        lugar2.setId( 03 );


        System.out.println("\nModificar datos");
        lugar2.setNombre(" Huellitas");
        lugar2.setDireccion(" La mena ");
        lugar2.setCapacidad(40);


        System.out.println("ID: " + lugar2.getId());
        System.out.println("Nombre: " + lugar2.getNombre());
        System.out.println("Direccion: " + lugar2.getDireccion());
        System.out.println("Capacidad: " + lugar2.getCapacidad());
        System.out.println("Fecha: " + lugar2.getFecha());


    }
}

