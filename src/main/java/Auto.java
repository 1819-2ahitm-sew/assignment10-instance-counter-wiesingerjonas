public class Auto {
    private String farbe;
    private int anzahlSitze;
    static int instancen = 0;

    Auto(String farbe, int anzahlSitze){
        this.farbe = farbe;
        this.anzahlSitze = anzahlSitze;

        instancen++;
    }
}
