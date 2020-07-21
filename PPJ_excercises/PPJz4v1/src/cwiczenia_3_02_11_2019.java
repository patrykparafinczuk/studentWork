import java.util.Scanner;

public class cwiczenia_3_02_11_2019 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //zadanie nr 1

        System.out.print("Podaj prędkość wiatru w kilometrach na godzinę: ");
        double predkosc_wiatru = scan.nextDouble();
        double skala_B = (((predkosc_wiatru/1.852)+10)/6);
        if(skala_B>12)
            skala_B=12;
        if(predkosc_wiatru>0 && predkosc_wiatru<6)
            skala_B=1;

        System.out.println(skala_B);
        switch ((int) skala_B){
            case 0:
                System.out.println("Cisza, flauta");
                break;
            case 1:
                System.out.println("Powiew");
                break;
            case 2:
                System.out.println("Słaby wiatr");
                break;
            case 3:
                System.out.println("Łagodny wiatr");
                break;
            case 4:
                System.out.println("Umiarkowany wiatr");
                break;
            case 5:
                System.out.println("Dość silny wiatr");
                break;
            case 6:
                System.out.println("Silny wiatr");
                break;
            case 7:
                System.out.println("Bardzo silny wiatr");
                break;
            case 8:
                System.out.println("Sztorm/wicher");
                break;
            case 9:
                System.out.println("Silny sztorm");
                break;
            case 10:
                System.out.println("Bardzo silny sztorm");
                break;
            case 11:
                System.out.println("Gwałtowny sztorm");
                break;
            case 12:
                System.out.println("Huragan");
                break;
             default:
                 System.out.println("Prędkość wiatru wykracza poza skalę!!!");
        }

        //zadanie nr 2

        System.out.print("Podaj liczbę całkowitą: ");
        int a = scan.nextInt();
        int b = a^8;
        b = b|a;
        System.out.println(b);


        //zadanie nr 3
        /*
        System.out.print("Podaj miesiąc: ");
        int m = scan.nextInt();
        System.out.print("Podaj dzień: ");
        int d = scan.nextInt();
        int pora_roku = 0;
        if(m>=9 && m<=11 && d>=1 && d<=30)
            pora_roku = 1;
        if(m==12 || m>=1 && m<=2 && d>=1 && d<=28)
            pora_roku = 2;
        if(m>=3 && m<=5 && d>=1 && d<=31)
            pora_roku = 3;
        if (m>=6 && m<=8 && d>=1 && d<=31)
            pora_roku = 4;

        switch (m){
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;

        }
        */
        //zadanie nr 4
        /*
        System.out.println("Podaj rozmiar: ");
        int size = scan.nextInt();
        for(int i=0;i<(2*size+1);i++){
            for (int j=0;j<(2*size+1);j++){
                if (j!=i && i>j){
                    System.out.print(".");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

         */


    }
}
