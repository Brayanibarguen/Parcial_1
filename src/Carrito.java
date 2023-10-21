package src;

import java.io.Serializable;
import java.util.List;
import java.util.Scanner;

// Interfaz para el patrón Strategy
interface StrategicAction {
    void realizarAccion(List<juguete> juguetes) throws CloneNotSupportedException;
}

// Clase para los Carritos
public abstract class Carrito implements juguete {

    private int numeroPuertas;
    private Serializable color;

    // Constructor para crear un Carrito
    public Carrito() throws CloneNotSupportedException {
        Object marca = new Object();
        Object numeroPuertas;
        numeroPuertas = null;
        Object color = new Object();
        clone();
    }

    @Override
    public juguete clonar() {

        return null;
    }

    @Override
    public void imprimir() {
        System.out.println("Carrito #" + getId());
        String color = "";
        System.out.println("Color: " + color);
        String marca = "";
        System.out.println("Marca: " + marca);
        String numeroPuertas = "";
        System.out.println("Número de Puertas: " + numeroPuertas);
    }

    @Override
    public void clonar(String relleno, String color) {

    }

    public Serializable getColor() {
        return color;
    }

    public void setColor(Serializable color) {
        this.color = color;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}

// Clase que implementa la estrategia de creación de Carritos
class CrearCarrito implements StrategicAction {
    @Override
    public void realizarAccion(List<juguete> juguetes) throws CloneNotSupportedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese color del carrito:");
        String color = scanner.nextLine();
        System.out.println("Ingrese marca del carrito:");
        String marca = scanner.nextLine();
        System.out.println("Ingrese número de puertas del carrito:");
        int numeroPuertas = Integer.parseInt(scanner.nextLine());

        Carrito carrito = new Carrito() {
            @Override
            public Carrito realizarAccion() {
                return null;
            }

            @Override
            public Carrito realizarAccion(List<juguete> juguetes) {
                return super.realizarAccion(juguetes);
            }

            @Override
            public int getId() {
                return super.getId();
            }
        };
        juguetes.add(carrito);

        System.out.println("Carrito creado con éxito.");
    }
}
