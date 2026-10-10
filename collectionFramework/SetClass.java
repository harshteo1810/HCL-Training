package collectionFramework;
import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);        
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(5);
        s.add(5);
        System.out.println(s);
        s.remove(5);
        System.out.println(s);
    }
}
