public class Wiesinger_Instanzen {

    public static void main(String[] args) {
        Auto auto1 = new Auto("rot", 4);
        Auto auto2 = new Auto("schwarz", 8);
        Auto auto3 = new Auto("grau", 5);
        Auto auto4 = new Auto("gelb", 5);
        Auto auto5 = new Auto("grün", 4);

        System.out.println("Instanzen: " + Auto.instancen);
    }
}
