package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu.mostrarMenu();
            int opcion = scanner.nextInt();
            final var s = scanner.nextLine();

            switch (opcion) {
                case 1:
                    main(menu, scanner);
                    break;
                case 2:
                    clonarJuguete(menu, scanner);
                    break;
                case 3:
                    eliminarJuguete(menu, scanner);
                    break;
                case 4:
                    verJuguetes(menu);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    private static void verJuguetes(Menu menu) {
    }

    private static void eliminarJuguete(Menu menu, Scanner scanner) {
        
    }

    private static void clonarJuguete(Menu menu, Scanner scanner) {
        
    }

    private static void main(Menu menu, Scanner scanner) {
        
    }
}
