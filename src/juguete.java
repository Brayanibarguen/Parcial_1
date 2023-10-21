package src;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

interface Juguete {
    default void setId(int id) {

    }

    default int getId() {
        return 0;
    }

    default juguete clonar(String relleno, String color) {
        String materialExterior = null;
        return new Implementacion(null, relleno, color) {
            @Override
            public Carrito realizarAccion() {
                return null;
            }

            @Override
            public juguete clonar() {
                return null;
            }

            @Override
            public void clonar(String relleno, String color) {

            }
        };
   }




        private static void crearJuguete(Menu menu, @NotNull Scanner scanner) {
            System.out.println("Seleccione el tipo de juguete a crear:");
            System.out.println("1. Peluche");
            System.out.println("2. Carrito");

            int opcionCrear = scanner.nextInt();
            scanner.nextLine();

            switch (opcionCrear) {
                case 1:
                    // Crear Peluche
                    crearPeluche(menu, scanner);
                    break;
                case 2:
                    // Crear Carrito
                    crearCarrito(menu, scanner);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

    static void crearCarrito(Menu menu, Scanner scanner) {

    }

    private static void crearPeluche(Menu menu, Scanner scanner) {
            System.out.println("Ingrese el material exterior del peluche:");
            String materialExterior = scanner.nextLine();

            System.out.println("Ingrese el relleno del peluche:");
            String relleno = scanner.nextLine();

            System.out.println("Ingrese el color del peluche:");
            String color = scanner.nextLine();

        }

    void imprimir();
}
