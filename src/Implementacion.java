package src;

 public abstract class Implementacion implements juguete {
    private final String materialExterior;
    private final String relleno;
    private final String color;
     private long id;

     public Implementacion(String materialExterior, String relleno, String color) {
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

     public void setId(int id) {
         this.id = id;
     }

     @Override
     public int getId() {
         return (int) id;
     }
 }

