public class MethodCurrier {
    public void setValue (int i) {
        System.out.println(i+" jest typu int");
    }
    public void setValue (float f) {
        System.out.println(f+" jest typu float");
    }

    public void setValue (Number number) {
        System.out.println(number);
    }
}
