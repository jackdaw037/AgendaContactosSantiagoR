import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Contacto> contactos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int menuOpcion;
        boolean opcion = true;

            while (opcion) {

                System.out.println("\n1. Añadir contacto");
                System.out.println("2. Mostrar contactos");
                System.out.println("3. Buscar contacto");
                System.out.println("4. Editar contacto");
                System.out.println("0. Salir");
                System.out.print("Seleccione una opcion: ");

                try {
                    menuOpcion = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Debes de elegir una opcion numeriaca");
                    sc.nextLine();
                    continue;
                }


                switch (menuOpcion) {

                    case 1:
                        agregarContacto();
                        break;

                    case 2:
                        mostrarContacto();
                        break;

                    case 3:
                        buscarContacto();
                        break;

                    case 4:
                        editarContacto();
                        break;

                    case 0:
                        System.out.println("Saliendo...");
                        opcion = false;
                        break;

                    default:
                        System.out.println("Opción inválida");
                }
            }
    }


    ///-- AGREGAR CONTACTO --

    static void agregarContacto() {

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Telefono: ");
        String telefono = sc.nextLine();

        System.out.print("Correo: ");
        String correo = sc.nextLine();

        Contacto nuevo = new Contacto(nombre, telefono, correo);
        contactos.add(nuevo);

        System.out.println("Contacto agregado correctamente.");
    }

    ///--MOSTRAR CONTACTO--

    static void mostrarContacto() {

        if (contactos.isEmpty()) {
            System.out.println("La agenda esta vaciaa");
            return;
        }

        for (int i = 0; i < contactos.size(); i++) {
            Contacto contac = contactos.get(i);
            System.out.println((i + 1) + ". " +
                    contac.getNombre() + " --- " +
                    contac.getTelefono() + " --- " +
                    contac.getCorreo());
        }
    }

    /// -- BUSCAR CONTACTO --


    static void buscarContacto() {

        System.out.print("Ingrese nombre a buscar: ");
        String nombreBuscar = sc.nextLine();

        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombreBuscar)) {
                System.out.println("Encontrado:");
                System.out.println(c.getNombre() + " - " +
                        c.getTelefono() + " - " +
                        c.getCorreo());
                return;
            }
        }

        System.out.println("Contcto no encontrado.");
    }


    /// -- EDITAR CONTACTO --

    static void editarContacto() {

        mostrarContacto();

        if (contactos.isEmpty()) return;

        System.out.print("Seleccione numero de contacto para editar: ");
        int indice = sc.nextInt() - 1;
        sc.nextLine();

        if (indice >= 0 && indice < contactos.size()) {

            Contacto cntNuevo = contactos.get(indice);

            System.out.print("Nuevo telefono: ");
            cntNuevo.setTelefono(sc.nextLine());

            System.out.print("Nuevo correo: ");
            cntNuevo.setCorreo(sc.nextLine());

            System.out.println("Contacto actulizado.");

        } else {
            System.out.println("Indice invalido.");
        }
    }
}
