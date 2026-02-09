import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<String> nombres = new ArrayList<>();
    static ArrayList<String> telefonos = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int menuOpcion;
        boolean con = true;

        while (con) {

            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contactos");
            System.out.println("4. Editar contacto");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            menuOpcion = sc.nextInt();
            sc.nextLine();

            switch (menuOpcion) {

                case 1:
                    agregarContacto();
                    break;

                case 2:
                    mostrarContacto();
                    break;

                case 3:
                    System.out.println("Buscar contactos");
                    break;

                case 4:
                    System.out.println("Editar contacto");
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    con = false;
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    static void agregarContacto() {

        System.out.print("Inserte nombre: ");
        String nuevoNombre = sc.nextLine();

        System.out.print("Inserte telefono: ");
        String nuevoTelefono = sc.nextLine();

        nombres.add(nuevoNombre);
        telefonos.add(nuevoTelefono);

        System.out.println("El contacto se ha agregado correctamente");
    }

    static void mostrarContacto() {
        if (nombres.isEmpty()) {    
            System.out.println("La agenda esta vacia");
            return;
        }

        System.out.println("Lista de contactos:");
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println((i + 1) + ". " + nombres.get(i) + " - " + telefonos.get(i));
        }
    }
}
