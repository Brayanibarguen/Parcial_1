package src;

 public class Peluche extends Juguete {
    private final String materialExterior;
    private final String relleno;
    private final String color;

    public Peluche(String materialExterior, String relleno, String color) {
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;
    }

     @Override
    public void imprimir() {
        System.out.println("Peluche #" + id);
        System.out.println("Material Exterior: " + materialExterior);
        System.out.println("Relleno: " + relleno);
        System.out.println("Color: " + color);
    }
}

