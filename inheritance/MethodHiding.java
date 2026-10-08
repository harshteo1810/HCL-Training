package inheritance;

//static method hiding
// no-static method overriding
// method hiding happens when a child class defines a static method with the same name and signature as a static method in the parent class.
public class MethodHiding {
    static void m1() {
        int x = 1;
        System.out.println(x);
    }
    public static void main(String[] args) {
        MethodHiding obj = new MethodHiding();
        obj.m1();
    }
}

class Child extends MethodHiding {
    static void m1() {
        int x = 2;
        System.out.println(x);
    }
}
