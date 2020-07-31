public class Osiol {
    private double masa;
    private Balon[] balon = new Balon[1];

    public void dodajBalon (Balon b) {

        this.balon[0] = b;

        Balon[] wiecejBalonow = new Balon[this.balon.length+1];
        wiecejBalonow[wiecejBalonow.length-1] = b;

    }
    public boolean czyLata(double masa, Balon[] balony) {
        this.masa = masa;
        this.balon = balony;
        double counter = 0;
        int i = 0;
        while (balony.length > i) {
            counter += balon[i].podajUdzwig();
            i++;
        }
        if (masa * 1000 <= counter ) {
            return true;
        } else {
            return false;
        }

    }
    public void show() {
        if (czyLata(masa,balon)) {
            System.out.println("Ja latam!!!");
        }
    }
}
