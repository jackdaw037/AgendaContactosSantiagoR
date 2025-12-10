import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menuOpcion = 0;
        boolean con = true;
        
        String[] list = new String[100];

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
                    System.out.println("Usted ha elegido la opcion 1");
                    System.out.println("Añadir contacto");

                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Ingrese numero de telefono: ");
                    String telefono = sc.nextLine(); 

                    String contacto = "Nombre: " + nombre + " | Telefono: " + telefono;

                    boolean agregado = false;

                    for (int i = 0; i < list.length; i++) {
                        if (list[i] == null) {
                            list[i] = contacto;   
                            agregado = true;
                            break;
                        }
                    }

                    if (agregado) {
                        System.out.println("Contacto agregado correctamente.");
                    } else {
                        System.out.println("La agenda esta llena.");
                    }

                    break;
                    
                case 2:
                    System.out.println("Usted ha elegido la opcion 2");
                    System.out.println("Mostrar contactos");

                    boolean vacio = true;

                    for (String c : list) {
                        if (c != null) {
                            System.out.println(c);
                            vacio = false;
                        }
                    }

                    if (vacio) {
                        System.out.println("No hay contactos guardados.");
                    }

                    break;
                    
                case 3:
                    System.out.println("Usted ha elegido la opción 3");
                    System.out.println("Buscar contactos");
                    break;

                    
                case 4:
                    System.out.println("Usted ha elegido la opción 4");
                    System.out.println("Editar contacto");
                    break;

                    
                case 0:
                    System.out.println("Saliendo del programa...");
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
