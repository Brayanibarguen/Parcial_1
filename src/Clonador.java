package src;

import java.util.List;
import java.util.Scanner;

public abstract class Clonador implements EstrategiaAccion {
    @Override
    public void realizarAccion(List<juguete> juguetes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el ID del juguete que desea clonar:");
        int idAClonar = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese la cantidad de clones que desea:");
        int cantidadClones = Integer.parseInt(scanner.nextLine());

        for (src.juguete juguete : juguetes) {
            if (juguete.getId() == idAClonar) {
                for (int i = 0; i < cantidadClones; i++) {
                    src.juguete clon;
                    clon = juguete.clonar();
                    juguetes.add(clon);
                }
                System.out.println("Clonación exitosa.");
                return;
            }
        }
        System.out.println("No se encontró ningún juguete con ese ID.");
    }
}
