package src;

public class Carrito {

        private int id;
        private String color;
        private String marca;
        private int numeroPuertas;

    Builder
    private Carrito() {}

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Carrito carrito;

        private Builder() {
            carrito = new Carrito();
        }

        public Builder color(String color) {
            carrito.color = color;
            return this;
        }

        public Builder marca(String marca) {
            carrito.marca = marca;
            return this;
        }

        public Builder numeroPuertas(int numeroPuertas) {
            carrito.numeroPuertas = numeroPuertas;
            return this;
        }

        public Carrito build() {
            return carrito;
        }
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public Juguete clonar() {
        Carrito nuevoCarrito = builder()
                .color(this.color)
                .marca(this.marca)
                .numeroPuertas(this.numeroPuertas)
                .build();
        return nuevoCarrito;
    }

    @Override
    public String toString() {
        return "Carrito - ID: " + id + ", Color: " + color + ", Marca: " + marca + ", Número de Puertas: " + numeroPuertas;
    }
}
