package constructor;

public class Cons {
    
    // when you don't create constructor compiler does it automatically for you with default access
    // user defined + no argument + default access constructor
    // deafult type constructor are not inherited
    Cons(){
        System.out.println("I am a constructor");
    }
    public static void main(String[] args) {
        Cons obj = new Cons();
    }
}
