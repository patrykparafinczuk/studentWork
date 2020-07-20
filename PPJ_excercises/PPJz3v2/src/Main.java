import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //zadanie nr 2
        int wrt = -4;

        if((wrt>-15 && wrt <=-10) || (wrt >-5 && wrt<0) || (wrt>5 && wrt<10))
            if(wrt<=-13 || (wrt>-8 && wrt<-3))
                if(wrt>=-4)
                    System.out.println(wrt + " Należy do części wspólnej");

        //zadanie nr 5
        Scanner in = new Scanner(System.in);

        int miesiac = in.nextInt();

        switch (miesiac) {
            case 1:
                System.out.println("Styczeń");
                break;
            case 2:
                System.out.println("Luty");
                break;
            case 3:
                System.out.println("Marzec");
                break;
            case 4:
                System.out.println("Kwiecień");
                break;
            case 5:
                System.out.println("Maj");
                break;
            case 6:
                System.out.println("Czerwiec");
                break;
            case 7:
                System.out.println("Lipiec");
                break;
            case 8:
                System.out.println("Sierpień");
                break;
            case 9:
                System.out.println("Wrzesień");
                break;
            case 10:
                System.out.println("Październik");
                break;
            case 11:
                System.out.println("Listopad");
                break;
            case 12:
                System.out.println("Grudzień");
                break;
            default:
                System.out.println("Błędna wartość miesiąca.");
        }

        //zadanie nr 12

        double suma = 0;
        for (int i=0; i<10; i++) {
            suma += 1/Math.pow(2, i);
            System.out.println(suma);
        }

        //zadanie nr 3

        if(wrt>-15 && wrt<-10) {
            System.out.println(wrt + " należy do zbioru A.");
        } else if (wrt<-13) {
            System.out.println(wrt + " należy do zbioru B.");
        } else {
            System.out.println(wrt + " nie należy do żadnego zbioru.");
        }

        //zadanie nr 4

        System.out.println("Podaj wartość w procentach oceny: ");
        float ocena = in.nextFloat();
        if (ocena>87.5 && ocena<=100) {
            System.out.println("Dostałeś/aś piątkę");
        } else if(ocena>81.25 && ocena<=87.4) {
            System.out.println("Dostałeś/aś czwórkę+");
        } else if(ocena>75 && ocena<=81.24) {
            System.out.println("Dostałeś/aś czwórkę");
        } else if(ocena>62.6 && ocena<=74.9) {
            System.out.println("Dostałeś/aś trójkę+");
        } else if(ocena>=50 && ocena<=62.5) {
            System.out.println("Dostałeś/aś trójkę");
        } else if(ocena<50) {
            System.out.println("Nie zdałeś/aś");
        }

        //zadanie nr 1

        boolean czyPada = true;
        System.out.println((czyPada==true)?"Weź parasol":"Nie musisz brać parasola");

        //zadanie nr 7
        for (int i=1; i<11; i++) {
            System.out.println(i);
        }

        //zadanie nr 8

        System.out.print("Tabliczka matematyczna od 1 do :");
        int tabliczka = in.nextInt();
        for (int i=1; i<=tabliczka; i++) {
            System.out.print(i+" ");
            for (int j=2; j<=tabliczka; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        //zadanie nr 6

        System.out.print("Wprowadź miesiąc: ");
        int miesiac_6 = in.nextInt();
        System.out.print("Wprowadź rok: ");
        int rok = in.nextInt();
        switch (miesiac_6) {
            case 1:
                System.out.println("Ten miesiąc ma 31 dni");
                break;
            case 2:
                if(rok%4==0 && rok%100==0 || rok%400==0) {
                    System.out.println("Ten miesiąc ma 29 dni");
                }
                else {
                    System.out.println("Ten miesiąc ma 28 dni");
                }
                break;
            case 3:
                System.out.println("Ten miesiąc ma 31 dni");
                break;
            case 4:
                System.out.println("Ten miesiąc ma 30 dni");
                break;
            case 5:
                System.out.println("Ten miesiąc ma 31 dni");
                break;
            case 6:
                System.out.println("Ten miesiąc ma 30 dni");
                break;
            case 7:
                System.out.println("Ten miesiąc ma 31 dni");
                break;
            case 8:
                System.out.println("Ten miesiąc ma 31 dni");
                break;
            case 9:
                System.out.println("Ten miesiąc ma 30 dni");
                break;
            case 10:
                System.out.println("Ten miesiąc ma 31 dni");
                break;
            case 11:
                System.out.println("Ten miesiąc ma 30 dni");
                break;
            case 12:
                System.out.println("Ten miesiąc ma 31 dni");
                break;
            default:
                System.out.println("Błędna wartość miesiąca.");
        }

        //zadanie nr 9
        System.out.print("Wprowadź wartość liczbową: ");
        byte wrt1 = in.nextByte();
        int y = 64;
        while(y!=0){
            if(wrt1 >= y){
                System.out.print(y+" ");
                wrt1 -= y;
            }
            else{
                System.out.print(0+" ");
            }
            y/=2;
        }
        System.out.println();
        //zadanie nr 13
        int n = 1;
        char gwiazdka = '*';
        for(int i=0;i<5;i++){
            for (int j=0;j<n;j++){
                System.out.print(gwiazdka);
            }
            n+=2;
            System.out.println();
        }

        //zadanie nr 11
        int x = 10;
        do {
            System.out.println(x);
        }
        while(x!=10);
        while(x!=10){
            System.out.println(x);
        }

        //zadanie nr 10
        System.out.print("Wprowadź wartość liczbową: ");
        int wrt2 = in.nextInt();
        int m = wrt2;
        int n1 = 8;
        if(wrt2>127){
            n1 = 1;
            for(int i=1; i<m;){
                m/=2;
                n1++;
            }
        }
        m = (int) Math.pow(2,n1-1);
        for(int i=0;i<n1;i++){
            if(wrt2 >= m){
                System.out.print(m+" ");
                wrt2 -= m;
            }
            else{
                System.out.print(0+" ");
            }
            m/=2;
        }

    }

}
