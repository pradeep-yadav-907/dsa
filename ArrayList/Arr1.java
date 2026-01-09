import java.util.ArrayList;

public class Arr1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<Boolean> arr2 = new ArrayList<>();

        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(18);

        System.err.println("Integer ArrayList:" + arr);

        // get operation
        int num = arr.get(3);
        System.err.println("Element at index 3: " + num);

        // Delete operation
        int removedElement = arr.remove(3);
        System.err.println("Removed element: " + removedElement);
        System.err.println("Integer ArrayList:" + arr);

        // add operation
        int newElement = 20;
        arr.add(25);
        System.out.println("added element: " + newElement);
        System.err.println("Integer ArrayList:" + arr);

    }
};
