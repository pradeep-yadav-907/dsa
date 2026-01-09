import java.util.ArrayList;

public class revers_arr {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);

        // reverse the ArrayLIst
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.print(arr.get(i) + " ");
            
        }
        System.out.println();
    }

}
