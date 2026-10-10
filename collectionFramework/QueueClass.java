package collectionFramework;
import java.util.*;
public class QueueClass {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);
        q.offer(6);
        System.out.println(q);
        // output[1,2,3,4,5,6]
        System.out.println(q.poll()); //remove 1
        q.offer(1);
        System.out.println(q);
        Deque<Integer> dq = new LinkedList<>();
        dq.offer(1);
        dq.addFirst(2);
        dq.offer(3);
        dq.addLast(4);
        dq.offer(5);
        dq.offer(6);
        System.out.print("Deque:");
        System.out.println(dq);
        // System.out.println(dq.poll());
    }
}
