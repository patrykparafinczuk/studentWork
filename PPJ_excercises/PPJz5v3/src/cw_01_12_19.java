import java.lang.reflect.Method;

public class cw_01_12_19 {
    public static void main(String[] args) {
        //zadanie nr 1
        MethodCurrier kurier = new MethodCurrier();
        kurier.setValue(5);
        kurier.setValue(3.14F);
        kurier.setValue('a');
        kurier.setValue((byte)15);
        //zadanie nr 2
        Number number = new Number();
        number.setValue(5);
        number.showValue();
        //zadanie nr 3
        Osoba osoba = new Osoba();
        osoba.imie = "Jan";
        osoba.nazwisko = "Kowalski";
        osoba.rokUrodzenia = 1999;
        osoba.show();
        Osoba o2 = new Osoba("Adam","Nowak",1999);
        o2.show();
    }
}
