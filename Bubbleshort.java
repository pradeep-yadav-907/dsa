public class Bubbleshort {

    public static void bubbleshort(int arr[]) {

        for (int turn = 0; turn < arr.length - 1; turn++) { // 0 to 3
            for (int j = 0; j < arr.length - 1 - turn; j++) { // यह भीतरी लूप है जो हर पास में सबसे बड़ा तत्व (largest
                                                              // element) सरणी के अंत में लाता है।
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2,  };

        bubbleshort(arr);
        printArr(arr);
    }

}
