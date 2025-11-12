import java.util.Scanner;

public class Primero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menuOpcion = 0;
        boolean con = true;

        while (con == true) {

            System.out.println("1. Añadir contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contactos");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            menuOpcion = sc.nextInt();


            switch (menuOpcion) {
                case 1:
                    System.out.println("Usted ha elegido la opción 1");
                    System.out.println("Añadir contacto");
                    break;

                case 2:
                    System.out.println("Usted ha elegido la opción 2");
                    System.out.println("Mostrar contactos");
                    break;

                case 3:
                    System.out.println("Usted ha elegido la opción 3");
                    System.out.println("Buscar contactos");
                    break;

                case 4:
                    System.out.println("Usted ha elegido la opción 4");
                    System.out.println("Salir del programa...");
                    con = false;
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }

        }
        sc.close();

    }
}