package src;


public class NotNull {
    private final ThreadLocal<@org.jetbrains.annotations.NotNull String> nombre = new ThreadLocal<String>();

    public NotNull(String nombre) {
        this.nombre.set(nombre);
    }

    public String getNombre() {
        return nombre.get();
    }

    public static void main(String[] args) {
        NotNull persona = new NotNull(null); // Esto generará una excepción de validación
    }
}