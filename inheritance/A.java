package inheritance;

public class A {
    void m1() {
        System.out.println("A method");
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.m1();
    }
}
class B extends A {
    void m1() {
        System.out.println("B method - overridden");
    }
}

// if i write main in class B i have to compile the file but should ran java B because main is in class B as main tell starting point of code
// class A {
//     void m1() {
//         System.out.println("A");
//     }
// }

// class B extends A {
//     void m1() {
//         System.out.println("B");
//     }
//     public static void main(String[] args) {
//         B obj = new B();
//         obj.m1();
//     }
// }