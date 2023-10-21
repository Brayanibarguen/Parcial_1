package src;

import java.util.ArrayList;
import java.util.List;

class Menu {
    private static final Menu instance = new Menu();
    private List<juguete> juguetes = new ArrayList<>();

    private Menu() {
        juguetes = new ArrayList<>();
    }

    public static Menu getInstance() {
        return instance;
    }

    public void ejecutarAccion(StrategicAction estrategia) throws CloneNotSupportedException {
        try {
            estrategia.realizarAccion(juguetes);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public List<juguete> getJuguetes() {
        return juguetes;
    }

    public void mostrarMenu() {
    }
}

// Interfaz para el patrón Strategy
interface EstrategiaAccion {

    void realizarAccion(List<juguete> juguetes);


}

