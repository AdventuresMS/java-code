import java.util.*;
import java.util.Collections;

public class ReverseArray {

    public static void main(String[] args) {
    List<Integer>list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    Collections.reverse(list);
    System.out.println("Reversed list"+list);
    }
}