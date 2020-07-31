public class Dzem {
    private String smak;
    private double waga;

    public void Dzem(String smak, double waga) {
        this.smak = smak;
        this.waga = waga;
    }

    public void Dzem(double waga) {
        this.Dzem("No name",waga);
    }

    public void Dzem(String smak) {
        this.Dzem(smak,100.0);
    }

    public void show(Dzem dz) {
        System.out.println("Smak: " + dz.smak + " waga: " + dz.waga);
    }
}
