
class HeapSort {
    public int[] A;
    public int heapSize; // mostly will give the index of last element in heap
    // constructor

    void Heap(int[] array)
    {
        A = array;
        heapSize = array.length-1 ;
    }

    // returns left child's index
    public int ChildL(int parent) {
        return parent * 2 ;
    }

    // returns right child's index
    public int ChildR(int parent) {
        return (parent * 2 + 1);
    }

    // swaps two index values in an array
    public void Swap(int i, int j) {
        if (i <= heapSize && j <= heapSize && i != j) {
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }

    void maxHeapify(int i) {
        int left = ChildL(i);
        int right = ChildR(i);
        int largest = i;
        if ((left <= heapSize && (A[left] >A[largest]))) {
            largest = left;
        }
        if ((right<=heapSize) && (A[right] > A[largest])) {
            largest = right;
        }
        if ((largest<=heapSize) && (largest != i)) {
            Swap(largest, i);
            maxHeapify(largest);
        }
    }

    void buildMaxHeap() {
        for (int i = A.length / 2; i >= 0; i--) {
            maxHeapify( i);
        }
    }

    int[] heapSort(int A[]) {
        buildMaxHeap();
        for (int i = heapSize; i > 0; i--) {
            Swap(i,0);
            heapSize--;
            maxHeapify(0);
        }
        return A;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 63, 122, 674, 3, 7, 8433, 66, 32, 46, 7, 2, 234, 4};
        HeapSort heap=new HeapSort();
        heap.Heap(arr);
        int sorted[]=heap.heapSort(arr);
        for (int var : sorted) {
            System.out.print(var+" ");            
        }                  
    }
}