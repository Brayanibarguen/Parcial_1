package src;

    class Peluche implements Juguete {
        private int id;
        private String materialExterior;
        private String relleno;
        private String color;

        private Peluche() {
        }

        public static Builder builder() {
            return new Builder();
        }
        public static class Builder {
            private Peluche peluche;

            private Builder() {
                peluche = new Peluche();
            } public Builder materialExterior(String materialExterior) {
                peluche.materialExterior = materialExterior;
                return this;
            }

            public Builder relleno(String relleno) {
                peluche.relleno = relleno;
                return this;
            }

            public Builder color(String color) {
                peluche.color = color;
                return this;
            }

            public Peluche build() {
                return peluche;
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
            Peluche nuevoPeluche = builder()
                    .materialExterior(this.materialExterior)
                    .relleno(this.relleno)
                    .color(this.color)
                    .build();
            return nuevoPeluche;
        }

        @Override
        public String toString() {
            return "Peluche - ID: " + id + ", Material Exterior: " + materialExterior + ", Relleno: " + relleno + ", Color: " + color;
        }
    }
}