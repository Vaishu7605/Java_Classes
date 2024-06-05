
public class buffer {

    public static void main(String[] args) {
        // ---JVM: java virtual machine(16 bits)--------//
        StringBuffer a = new StringBuffer("Vaishnavi ");
        // -----------insert---------//
        a.append(" Kesherwani");
        a.insert(10, "Kesherwani ");
        System.out.println(a);
        // ----------deleteCharAt------//
        // a.deleteCharAt(3);
        // System.out.println(a);
        // -------capacity----------//
        // System.out.println(a.capacity());
        // StringBuffer a = new StringBuffer("Vaishu");
        // System.out.println(a.capacity());
        // StringBuffer a = new StringBuffer("India ");
        // System.out.println(a.capacity());
        // -------append-------//
        // a.append("is great.");
        // System.out.println(a);
        // a.append("Long Live India.");
        // System.out.println(a);

    }
}
