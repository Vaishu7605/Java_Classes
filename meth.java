
class Alld {

    int a;
    int b;

    public void Add() {
        int c = a + b;
        System.out.println("a + b= " + c);
    }

}

public class meth {

    public static void main(String[] args) {
        Alld A1 = new Alld();
        A1.a = 10;
        A1.b = 20;
        A1.Add();
        Alld A2 = new Alld();
        A2.a = 10;
        A2.b = 20;
        A2.Add();

    }
}
