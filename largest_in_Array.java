public class largest_in_Array {

    public static int GetLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (largest < numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 5, 6, 100 };
        System.out.println("largest value is : " + GetLargest(numbers));
    }
}
