import java.util.ArrayList;
import java.util.Collections;

public class sorting_order {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(56);
        list.add(9);
        list.add(7);
        list.add(11);
        System.out.println(list);
        Collections.sort(list); // acending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder()); // desending order
        System.out.println(list);

    }
}
