package divide_and_conquar;

public class marge_short {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.err.println();

    }

    public static void margeSort(int arr[], int si, int ei) {

        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        margeSort(arr, si, mid); // left part
        margeSort(arr, mid + 1, ei); // right part
        marge(arr, si, mid, ei); // marge both parts
    }

    public static void marge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si; // starting index of left part
        int j = mid + 1; // starting index of right part
        int k = 0; // starting index of temp array

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // if left part is remaing
        while (i <= mid) {
            temp[k] = arr[i++];
        }
        while (j <= ei) {
            temp[k] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 4, 9, 5, 2, 1 };
        margeSort(arr, 0, arr.length - 1);
        printArr(arr);

    }
}
