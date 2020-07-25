import java.util.Scanner;

public class cw_30_11_19 {
    public static void main(String[] args) {
        //zadanie nr 1
        metoda1(4,'x');
        //zadanie nr 2
        char[][] tab2 = new char[5][5];
        for (int i = 0; i < tab2.length; i++) {
            for (int j = 0; j < tab2[i].length; j++) {
                tab2[i][j] = (char) (Math.random()*('z' - 'a')+'a');
                System.out.print(tab2[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(metoda2(tab2));
        //zadanie nr 3
        int[] tab3 = new int[10];
        for (int i = 0; i < tab3.length; i++) {
            tab3[i] = (int) (Math.random()*100);
            System.out.print(tab3[i]+" ");
        }
        System.out.println();
        metoda3(tab3);
        System.out.println();
        //zadanie nr 4
        showCircleArea();
        System.out.println();
        //zadanie nr 5
        convertToHEX(255);

    }
    public static void metoda1 (int a, char b) {
        if (b == 'x') {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0)
                            System.out.print("x");
                        else
                            System.out.print("o");
                    }
                    else if (i % 2 == 1) {
                        if (j % 2 == 0)
                            System.out.print("o");
                        else
                            System.out.print("x");
                    }
                }
                System.out.println();
            }
        }
        if (b == 'o') {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    if (i % 2 == 0) {
                        if (j % 2 == 0)
                            System.out.print("o");
                        else
                            System.out.print("x");
                    }
                    else if (i % 2 == 1) {
                        if (j % 2 == 0)
                            System.out.print("x");
                        else
                            System.out.print("o");
                    }
                }
                System.out.println();
            }
        }
    }
    public static boolean metoda2 (char[][] tab) {
        int counter = 0;
        for (int i = 0; i < tab.length-1; i++) {
            for (int j = i; j < tab[i].length-1; j++) {
                if (tab[i+1][j+1] > tab[i][j]) {
                    counter++;
                } else
                    counter--;
                if (tab[tab.length-i-2][tab.length-i-2] > tab[tab.length-i-1][tab.length-i-1]) {
                    counter++;
                }else
                    counter--;
            }
        }
        if (counter >= 3)
            return true;
        return false;
    }
    public static void metoda3 (int[] tab) {
        int srednia = 0;
        int counter = 0;
        for (int i = 0; i < tab.length; i++) {
            srednia += tab[i];
        }
        srednia /= tab.length;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]>srednia)
                counter++;
        }
        int j = 0;
        int[] tab2 = new int[counter];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i]>srednia) {
                tab2[j] = tab[i];
                j++;
            }
        }
        System.out.println("Srednia wynosi: " + srednia);
        for (int i = 0; i < tab2.length; i++) {
            System.out.print(tab2[i]+" ");
        }
    }
    public static double get1Sizes () {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj promień kołą: ");
        double promien = in.nextDouble();
        return promien;
    }
    public static void showCircleArea () {
        double promien = get1Sizes();
        System.out.println("Pole koła wynosi: " + (Math.PI*Math.pow(promien,2)));
    }
    public static void convertToHEX (int a) {
        char[] tab = new char[10];
        char[] tab2 = {0,1,2,3,4,5,6,7,8,9,'a','b','c','d','e','f'};
        for (int i = 0; i < 10; i++) {
            if (a > 1) {
                tab[i] = tab2[a%16];
                a /= 16;
                System.out.print(tab[i]);
            }

        }
    }
}
