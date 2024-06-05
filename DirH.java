
class Student {

    String name;
    int age;

    public void show() {
        System.out.println(name + ":" + age);
    }
}

public class DirH {

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Vaishnavi";
        s1.name = "Vaishu";
        Student s2 = new Student();
        Student s3 = new Student();
        Student s4 = new Student();
        Student s5 = new Student();
        s2.name = "Navi";
        s3.name = "Janu";
        s4.name = "Qween";
        s5.name = "Tanu";
        s1.show();
        s2.show();
        s3.show();
        s4.show();
        s5.show();

    }
}
