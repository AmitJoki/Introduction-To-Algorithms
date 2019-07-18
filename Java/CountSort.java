class CountSort {
    int[] countSort(int A[], int B[], int k) {

        int c[] = new int[k + 1];
        for (int i = 0; i < k - 1; i++) {
            c[i] = 0;

        }
        for (int j = 0; j < A.length; j++) {
            c[A[j]] = c[A[j]] + 1;
        }
        for (int i = 1; i <= k; i++) {
            c[i] = c[i - 1] + c[i];
        }
        
        for (int j = A.length - 1; j >= 0; j--) {
            B[c[A[j]] - 1] = A[j];
            c[A[j]] = c[A[j]] - 1;
        }
        return B;
    }
    public static void main(String[] args) {
        int A[] = { 2, 5, 3, 0, 2, 3, 0, 3 };
        CountSort cs = new CountSort();
        int B[] = new int[A.length];
        B = cs.countSort(A, B, 5);
        for (int var : B) {
            System.out.print(var + " ");
        }
    }
}
