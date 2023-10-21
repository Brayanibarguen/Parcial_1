package src;

import org.jetbrains.annotations.NotNull;

public interface Juguete {
        void setId(int id);
        int getId();
        Juguete clonar();
    }

    public class Main {
        public static void main(String[] args) {
            Menu menu = Menu.getInstance();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                menu.mostrarMenu();
                int opcion = scanner.nextInt();
                scanner.nextLine();  // Consumir la nueva línea después de la entrada numérica

                switch (opcion) {
                    case 1:
                        // Crear juguete
                        crearJuguete(menu, scanner);
                        break;
                    case 2:
                        // Clonar juguete
                        clonarJuguete(menu, scanner);
                        break;
                    case 3:
                        // Eliminar juguete por ID
                        eliminarJuguete(menu, scanner);
                        break;
                    case 4:
                        // Ver juguetes actuales
                        verJuguetes(menu);
                        break;
                    case 5:
                        // Salir
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            }
        }

        private static void crearJuguete(Menu menu, @NotNull Scanner scanner) {
            System.out.println("Seleccione el tipo de juguete a crear:");
            System.out.println("1. Peluche");
            System.out.println("2. Carrito");

            int opcionCrear = scanner.nextInt();
            scanner.nextLine();  // Consumir la nueva línea después de la entrada numérica

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

        private static void crearPeluche(Menu menu, Scanner scanner) {
            System.out.println("Ingrese el material exterior del peluche:");
            String materialExterior = scanner.nextLine();

            System.out.println("Ingrese el relleno del peluche:");
            String relleno = scanner.nextLine();

            System.out.println("Ingrese el color del peluche:");
            String color = scanner.nextLine();

        }
    }
