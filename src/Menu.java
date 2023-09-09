package src;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Menu {
        private static Menu instance;
        private List<Juguete> juguetes;
        private int idCounter = 1;

        private Menu() {
            juguetes = new ArrayList<>();
        }

        public static Menu getInstance() {
            if (instance == null) {
                instance = new Menu();
            }
            return instance;
        }

        public void mostrarMenu() {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Crear juguete");
            System.out.println("2. Clonar juguete");
            System.out.println("3. Eliminar juguete por ID");
            System.out.println("4. Ver juguetes actuales");
            System.out.println("5. Salir");
        }

        public void ejecutarAccion(EstrategiaAccion estrategia) {
            estrategia.realizarAccion(juguetes);
        }

        public void agregarJuguete(Juguete juguete) {
            juguete.setId(idCounter++);
            juguetes.add(juguete);
        }

        public void eliminarJuguete(int id) {
            juguetes.removeIf(juguete -> juguete.getId() == id);
        }

        public List<Juguete> getJuguetes() {
            return juguetes;
        }
    }

