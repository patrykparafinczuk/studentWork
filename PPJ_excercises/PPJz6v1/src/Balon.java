public class Balon {

    private double hel;

    public void Balon () {
        this.hel = (Math.random() * 0.005) + 0.004;
    }

    public double podajUdzwig () {
        double maksUdzwig = (hel/0.007)*6;
        return maksUdzwig;
    }
}
