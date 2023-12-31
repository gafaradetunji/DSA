public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 10, 25, 18, 93, 20, 50 };
        int n = arr.length;

        sortAscendingly(arr, n);
        System.out.println("Ascending Order: ");
        ShowArray(arr, n);

        sortDescendingly(arr, n);
        System.out.println("Descending Order: ");
        ShowArray(arr, n);
    }

    public static void ShowArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                System.out.print(arr[i]);
                break;
            }
            System.out.print(arr[i] + " , ");
        }
        System.out.println();
    }

    // Bubble Sort Algorithm in Ascending Order
    public static void sortAscendingly(int arr[], int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
            }
        }
    }

    // Bubble Sort Algorithm in Descending Order
    public static void sortDescendingly(int arr[], int n) {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int min = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = min;
                }
            }
        }
    }
}
