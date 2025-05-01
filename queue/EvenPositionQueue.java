import java.util.*;
public class EvenPositionQueue {
    static Queue<Integer> que;
    static Queue<Integer> newQue;

    static void keepEvenPositions() {
        newQue = new LinkedList<>();
        while (!que.isEmpty()) {
            que.remove();  // remove element at odd position
            if (!que.isEmpty()) {
                newQue.add(que.remove());  // keep element at even position
            }
        }
        que = newQue;
    }

    public static void main(String[] args) {
        que = new LinkedList<>();
        que.add(10);
        que.add(20);
        que.add(40);
        que.add(430);
        que.add(120);
        System.out.println("Original queue: " + que);
        keepEvenPositions();
        System.out.println("After keeping even positions: " + que);
    }
}
