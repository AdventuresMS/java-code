import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(17);
        st.push(15);
        st.push(19);
        System.out.println(st);
        System.out.println(st.peek());
 System.out.println(st.pop());
 System.out.println(st.pop());
 System.out.println(st.size());
 System.out.println((st));
        while(st.size() > 1)
{
        st.pop();
}
System.out.println(st.peek());
    }
}
