import java.util.ArrayList;

public class pair_sum_pointer {
    public static boolean pairSum(ArrayList<Integer> arr, int target) {

        // Two pointer approach
        int lp = 0;
        int rp = arr.size() - 1;
        while (lp != rp) {
            // check if the sum of the two elements is equal to the target
            if (arr.get(lp) + arr.get(rp) == target) {
                return true;
            }
            // case2
            if (arr.get(lp) + arr.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        int target = 5;
        System.out.println("is pair sum " + target + " " + pairSum(arr, target));
    }
}