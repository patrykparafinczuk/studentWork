public class Main {
    public static void main(String[] args) {

        System.out.println("=-=-=-=-=Zad1-=-=-=-=-=-");

        Kwadrat kw = new Kwadrat();
        kw.Kwadrat(5);
        kw.area(kw);
        kw.volume(kw);

        System.out.println("=-=-=-=-=Zad2-=-=-=-=-=-");

        Cypher cp = new Cypher();
        char[] tab2 = {'a','b','c'};
        cp.Cypher(1);
        cp.encode(cp,tab2);
        cp.decode(cp,tab2);

        System.out.println("=-=-=-=-=Zad3-=-=-=-=-=-");

        Dzem dz1 = new Dzem();
        Dzem dz2 = new Dzem();
        Dzem dz3 = new Dzem();
        dz1.Dzem("Malinowy",10);
        dz2.Dzem("Truskawkowy");
        dz3.Dzem(20);
        dz1.show(dz1);
        dz2.show(dz2);
        dz3.show(dz3);

        System.out.println("=-=-=-=-=Zad4-=-=-=-=-=-");

        Balon b = new Balon();
        b.Balon();

        Osiol os = new Osiol();
        os.dodajBalon(b);
        os.czyLata(100,);
        os.show();
    }
}
