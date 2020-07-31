public class Kwadrat {
    private double bok;
    public void Kwadrat(double bok) {
        this.bok = bok;
    }
    public void area(Kwadrat kw) {
        System.out.println(kw.bok * kw.bok);
    }
    public void volume(Kwadrat kw) {
        System.out.println(kw.bok * kw.bok * kw.bok);
    }
}
