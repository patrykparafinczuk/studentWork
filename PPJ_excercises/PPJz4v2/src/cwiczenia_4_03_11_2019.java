import java.util.Scanner;

public class cwiczenia_4_03_11_2019 {
    public static void main(String[] args) {
        //zadanie nr 1
        int [] tab = new int [10];
        for (int i = 0; i < tab.length; i++){
            System.out.print(tab[i]+",");
        }
        System.out.println();
        int i = 0;
        while(i<10) {
            tab[i] = (int) (Math.random() * 2);
            System.out.print(tab[i]+",");
            i++;
        }
        System.out.println();
        i = 0;
        int zero = 0;
        int jeden = 0;
        do {
            if(tab[i]==0)
                zero += 1;
            else
                jeden += 1;
            i++;
        }while(i<10);
        System.out.print("Jest "+jeden+" jedynek i "+zero+" zer");
        System.out.println();
        //zadanie nr 2
        double [] tab1 = new double [10];
        for (i = 0; i < tab1.length; i++){
            tab1[i] = (int) (Math.random()*(25+1));
            System.out.print(tab1[i]+",");
        }
        System.out.println();
        for (i = 0; i < tab1.length; i+=2){
                System.out.print(tab1[i]+",");
        }
        System.out.println();
        for (i = 0; i < tab1.length; i++){
            if ((int)tab1[i]%2==1)
                System.out.print(tab1[i]+",");
        }
        System.out.println();
        //zadanie nr 3
        char [] tab2 = new char [];
        char a ;
        for (i = 0; i < 3; i++){
            tab2[i] = (char) (Math.random()*('z' - 'a' + 1) + 'a');
            if (tab[i]>char)
                char = tab2[i];
        }
        //zadanie nr 6
        Scanner in = new Scanner(System.in);
        char[] tab6 = new char[5];

        for (int i = 0; i < tab6.length; i++){
            tab6[i] = (char) (Math.random()*('Z' - 'A' + 1) + 'A');
            System.out.print(tab6[i]+",");
        }
        System.out.println();
        int size = 0;
        while (size<tab6.length){
            char c = in.next().charAt(0);

            int licznik = 0;
            for (i = 0; i<tab6.length; i++) {
                if (tab6[i] == c) {
                    licznik++;
                    tab6[i] = 0;
                }
            }
            System.out.println("Znak " + c + " wystąpił " + licznik + " razy");
            size += licznik;
        }
    }
}
