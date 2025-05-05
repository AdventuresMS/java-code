import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseFirstKelementsInQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        // use an auxiliary stack
        Stack<Integer> st = new Stack<>();
        int n = q.size() - k;

        // pop first k elements from queue and push into stack
        while (k-- > 0) {
            int a = q.peek();
            q.poll();
            st.push(a);
        }

        // while stack is not empty, push elements back into the queue
        while (!st.isEmpty()) {
            int a = st.peek();
            st.pop();  // fix: pop from stack, not queue
            q.add(a);
        }

        // move the remaining elements (n) to the back to maintain order
        for (int i = 0; i < n; i++) {
            int a = q.peek();
            q.poll();
            q.add(a);
        }
        return q;
    }

    public static void main(String[] args) {
        ReverseFirstKelementsInQueue rev = new ReverseFirstKelementsInQueue();
        Queue<Integer> que = new LinkedList<>();
        que.add(1);
        que.add(34);
        que.add(3);
        que.add(54);
        que.add(56);
        Queue<Integer> newq = rev.modifyQueue(que, 3);
        System.out.println(newq);
    }
}
