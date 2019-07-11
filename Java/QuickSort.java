class QuickSort {
    int q;

    int[] quickSort(int arr[], int p, int r) {
        if (p < r) {
            q = partition(arr, p, r);
            quickSort(arr, p, q - 1);
            quickSort(arr, q + 1, r);
        }
        return arr;
    }

    int partition(int arr[], int p, int r) {
        int x = arr[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (arr[j] <= x) {
                i = i + 1;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[r];
        arr[r] = temp;
        return (i + 1);
    }

    public static void main(String[] args) {
        int Arr[] = { 9, 5, 6, 3, 7, 25, 1 };
        QuickSort qs = new QuickSort();
        Arr = qs.quickSort(Arr, 0, Arr.length - 1);
        for (int var : Arr) {
            System.out.print(var + " ");
        }
    }
}