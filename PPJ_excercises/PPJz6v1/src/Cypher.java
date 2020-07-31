public class Cypher {
    private double key;
    public void Cypher(double key) {
        this.key = key;
    }

    public void encode (Cypher cp, char[] tab) {
        char[] tab2 = new char[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = (char)((double)tab[i] + cp.key);
            System.out.print(tab2[i]+"");
        }
        System.out.println();
    }

    public void decode (Cypher cp, char[] tab) {
        char[] tab2 = new char[tab.length];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = (char)((double)tab[i] - cp.key);
            System.out.print(tab2[i]+"");
        }
        System.out.println();
    }

}
