import java.util.Arrays;

public class median {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] merged = new int[n1 + n2];

        int index = 0;
        for (int x : nums1) {
            merged[index++] = x;
        }
        for (int x : nums2) {
            merged[index++] = x;
        }
        Arrays.sort(merged);
        int n = merged.length;
        if (n % 2 == 0) {
            return (merged[n / 2] + merged[merged.length / 2]) / 2.0;
        } else {
            return merged[n / 2];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 4 };
        int[] nums2 = { 12, 22, 33, 44 };

        double median = findMedianSortedArrays(nums1, nums2);
        System.out.println(median);
    }
}
