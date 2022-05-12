package tareas.Chocolates;

public class CarlosVChocoL {
    public static void main(String[] args) {
        Varieties chocoleche = new Varieties();
        chocoleche.chocoType = "Clásico";
        chocoleche.size = "Negro";
        chocoleche.sugar = true;
        chocoleche.extra = "Leche";

        System.out.println(chocoleche.printState());
    }
}
