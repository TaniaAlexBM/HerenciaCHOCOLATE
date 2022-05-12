package tareas.Chocolates;

public class Varieties extends CarlosV {
    String extra;

    @Override
    public String printState() {
        return super.printState() + "\nExtras: " + extra;
    }
}
