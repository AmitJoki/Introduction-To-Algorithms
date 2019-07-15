
class HeapSort {

    public int childL(int parent) {
        return parent * 2;
    }

    public int childR(int parent) {
        return (parent * 2 + 1);
    }

    public void swap(int A[], int i, int j) {
        if (i <= (A.length - 1) && j <= (A.length - 1) && i != j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    void maxHeapify(int A[], int n, int i) {
        int left = childL(i);
        int right = childR(i);
        int largest = i;
        if ((left <= n - 1 && (A[left] > A[largest]))) {
            largest = left;
        }
        if ((right <= n - 1) && (A[right] > A[largest])) {
            largest = right;
        }
        if ((largest <= n - 1) && (largest != i)) {
            swap(A, largest, i);
            maxHeapify(A, n, largest);
        }
    }

    void buildMaxHeap(int A[]) {
        for (int i = A.length / 2; i >= 0; i--) {
            maxHeapify(A, A.length, i);
        }
    }

    int[] heapSort(int A[]) {
        buildMaxHeap(A);
        for (int i = (A.length); i > 0; i--) {
            swap(A, i, 0);
            maxHeapify(A, i, 0);
        }
        return A;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 63, 122, 674, 3, 7, 8433, 66, 32, 46, 7, 2, 234, 4 };
        HeapSort heap = new HeapSort();
        int sorted[] = heap.heapSort(arr);
        for (int var : sorted) {
            System.out.print(var + " ");
        }
    }
}