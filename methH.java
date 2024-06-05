
class Student {

    static String name;

    public static void show() {
        // System.out.println(name);
        System.out.println(cits.name);
        System.out.println("this is static method");
    }
}

public class methH {

    public static void main(String[] args) {
        Student adit = new Student();
        adit.name = "Vaishnavi";
        Student cits = new Student();
        cits.name = "Navi";
        // adit.show();
        cits.show();
    }
}
