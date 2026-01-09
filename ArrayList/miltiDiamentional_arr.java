import java.util.ArrayList;

public class miltiDiamentional_arr {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr3 = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            arr1.add(i * 1);
            arr2.add(i * 2);
            arr3.add(i * 3);
        }
        arr.add(arr1);
        arr.add(arr2);
        arr.add(arr3);

        for (int i = 0; i < arr.size(); i++) {
            ArrayList<Integer> current = arr.get(i);
            for (int j = 0; j < current.size(); j++) {
                System.out.print(current.get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(arr);
    }
}
