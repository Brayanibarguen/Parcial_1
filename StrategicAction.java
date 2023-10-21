import src.Carrito;

import java.util.Scanner;

import static java.lang.System.*;

public interface StrategicAction<List> {
    default void realizarAccion(List juguetes) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(in);
        out.println("Ingrese color del carrito:");
        String color = scanner.nextLine();
        out.println("Ingrese marca del carrito:");
        String marca = scanner.nextLine();
        out.println("Ingrese número de puertas del carrito:");
        int numeroPuertas = Integer.parseInt(scanner.nextLine());

        Carrito carrito = new Carrito() {
            @Override
            public Carrito realizarAccion() {
                return null;
            }
        };
        juguetes.getClass();
        out.println("Carrito creado con éxito.");
    }
}

