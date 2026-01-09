public class compare_two_arr {
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3 };
        int arr2[] = { 1, 8, 3 };

        boolean isEqual = java.util.Arrays.equals(arr1, arr2);

        if (isEqual) {
            System.out.println("Arr is equal");
        } else {
            System.out.println("arr is not equal");
        }
    }

}
