package src;

import java.util.Scanner;

public abstract class Creacion<List> implements EstrategiaAccion {
    public void realizarAccion(List juguetes) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese material del peluche:");
        String materialExterior = scanner.nextLine();
        System.out.println("Ingrese relleno del peluche:");
        String relleno = scanner.nextLine();
        System.out.println("Ingrese color del peluche:");
        String color = scanner.nextLine();

        Implementacion peluche = new Implementacion(materialExterior, relleno, color) {

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
        try {
            juguetes.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Peluche creado con éxito.");
    }
}
