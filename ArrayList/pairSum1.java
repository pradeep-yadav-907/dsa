import java.util.ArrayList;

public class pairSum1 {

    public static boolean pairSum1(ArrayList<Integer> arr, int target) {
        // brute force approach
        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                // check if the sum of the two elements is equal to the target
                if (arr.get(i) + arr.get(j) == target) {
                    return true; // if found return true
                }
            }
        }
        return false; // if not found return false
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
       
        int target = 3; // target sum
        System.out.println("Is there a pair with sum " + target + " ? " + pairSum1(arr, target));
    }
}
