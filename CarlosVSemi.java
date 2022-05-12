package tareas.Chocolates;

public class CarlosVSemi {
    public static void main(String[] args) {
        CarlosV semiamargo = new CarlosV();
        semiamargo.size = "Clásico";
        semiamargo.chocoType = "Semiamargo";
        semiamargo.sugar = true;

        System.out.println(semiamargo.printState());
    }

}
