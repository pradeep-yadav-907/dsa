import java.util.ArrayList;

public class arr2D {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr2D = new ArrayList<>();
        // initializing the 2D ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(5);
        list.add(8);

        arr2D.add(list);
        // adding another list to the 2D ArrayList
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(13);

        arr2D.add(list2);
        // list2.remove(2);

        // printing the 2D ArrayList
        for (int i = 0; i < arr2D.size(); i++) { // iterate through each raw
            ArrayList<Integer> currentList = arr2D.get(i); // get the curreent raw
            // iterate through each column of the current raw
            for (int j = 0; j < currentList.size(); j++) {
                System.out.print(currentList.get(j) + " ");
            }
            System.out.println();
        }
        // printing the 2D ArrayList using for each
        System.out.println(arr2D);
        
    }
}
