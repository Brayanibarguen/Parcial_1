package src;

import java.util.List;

interface juguete {
    static Builder builder() {
        return new Builder();
    }

    Carrito realizarAccion();

    default Carrito realizarAccion(List<juguete> juguetes) {
        return null;
    }



    juguete clonar();

    abstract void imprimir();

    default int getId() {
        return 0;
    }

    void clonar(String relleno, String color);

    class Builder {
        private final Carrito carrito;

        private Builder() {
            try {
                carrito = new Carrito() {
                    @Override
                    public Carrito realizarAccion() {
                        return null;
                    }
                };
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }

        public Builder color(String color) {
            carrito.setColor(color);
            return this;
        }

        public Builder marca(String marca) {
            carrito.setColor(marca);
            return this;
        }

        public Builder numeroPuertas(int numeroPuertas) {
            carrito.setNumeroPuertas(numeroPuertas);
            return this;
        }

        public Carrito build() {
            return carrito;
        }
    }
}
