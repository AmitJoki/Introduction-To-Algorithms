class BubbleSort {
    int[] bubbleSort(int A[]) {
        for (int i = 1; i < A.length; i++) {
            for (int j = A.length - 1; j > 0; j--) {
                if (A[j] > A[j - 1]) {
                    int temp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int A[] = { 4, 3, 1, 2 };
        A = bs.bubbleSort(A);
        for (int var : A) {
            System.out.print(var + " ");
        }
    }
}