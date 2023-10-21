package src;


import org.jetbrains.annotations.NotNull;

public class Persona {
    private final ThreadLocal<@NotNull String> nombre = new ThreadLocal<String>();

    public Persona(String nombre) {
        this.nombre.set(nombre);
    }

    public String getNombre() {
        return nombre.get();
    }

    public static void main(String[] args) {
        Persona persona = new Persona(null); // Esto generará una excepción de validación
    }
}